package com.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.config.Information;
import com.springboot.dataobject.Menu;
import com.springboot.vo.MsgVO;
import com.springboot.dataobject.Position;
import com.springboot.vo.RelationMenuVO;
import com.springboot.service.MenuService;
import com.springboot.service.PositionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 职位管理
 * Created by Administrator on 2018/10/1 0001.
 */

@Controller
@Slf4j
@RequestMapping("/systemSettings/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private Information information;

    @RequestMapping("/index")
    public ModelAndView positionMange(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        Map<String, Object> map = new HashMap<>();
        //每页显示的条数
        PageHelper.startPage(pn, information.getPageNum());
        List<Position> positionList = positionService.selectAllPosition();
        //设置连续显示的页数
        PageInfo pageInfo = new PageInfo(positionList, information.getTotalPage());
        //菜单列表
        List<Menu> menuList = menuService.selectMenuList();
        List<RelationMenuVO> relationMenuVOS = new ArrayList<>();
        for (Menu menu : menuList) {
            RelationMenuVO relationMenuVO = new RelationMenuVO();
            //属性copy
            BeanUtils.copyProperties(menu, relationMenuVO);
            Menu menu1 = menuService.getParentName(menu.getParent_menu_id());
            try {
                relationMenuVO.setParent_name(menu1.getMenu_name());
            } catch (NullPointerException e) {
//                log.info("[父级菜单为空]");
            }
            relationMenuVOS.add(relationMenuVO);
        }
        map.put("pageInfo", pageInfo);
        map.put("relationMenus", relationMenuVOS);
        return new ModelAndView("/systemSettings/position/index", map);
    }

    @RequestMapping("/addPosition")
    public ModelAndView addPosition() {
        return new ModelAndView("/systemSettings/position/create");
    }

    @RequestMapping("/isExistPosition")
    @ResponseBody
    public MsgVO validIsExistPosition(@RequestBody Map<String, String> map) {
        boolean result = positionService.isExistPosition(map.get("positionName"));
        if (result) {
            log.info("[验证职位] 职位名称重复：{}", result);
            return MsgVO.fail();
        }
        return MsgVO.success();
    }

    @RequestMapping(value = "/sureToAddPosition")
    @ResponseBody
    public MsgVO sureToAddPosition(@RequestBody Map<String, String> map) {
        String positionname = map.get("positionName");
        String positionLevel = map.get("positionLevel");
        Position position = new Position();
        position.setPosition_name(positionname);
        position.setPosition_level(positionLevel);
        boolean result = positionService.insertPosition(position);
        if (result) {
            log.info("[添加职位] 添加状态：{}", result);
            return MsgVO.success();
        }
        return MsgVO.fail();
    }

    @RequestMapping("/updatePosition/{positionName}")
    public ModelAndView toUpdatePositionPage(@PathVariable("positionName") String positionName) {
        Position position = positionService.selectPositionByName(positionName);
        log.info("[修改职位] 职位信息回显:{}", position);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("position", position);
        return new ModelAndView("/systemSettings/position/update", resultMap);
    }

    @RequestMapping("/searchPosition/{positionname}")
    @ResponseBody
    public MsgVO searchPosition(@PathVariable("positionname") String positionname) {
        Position position = positionService.selectPositionByName(positionname);
        if (position != null) {
            log.info("[搜索职位] 职位信息：{}", position);
            return MsgVO.success().add("position", position);
        }
        return MsgVO.fail();
    }

    @RequestMapping("/updatePosition")
    @ResponseBody
    public MsgVO updatePosition(@RequestBody Map<String, String> map) {
        String positionName = map.get("positionName").trim();
        String position_level = map.get("position_level").trim();
        Integer positionId = Integer.parseInt(map.get("positionId").trim());
        Position position1 = new Position();
        position1.setPosition_id(positionId);
        position1.setPosition_name(positionName);
        position1.setPosition_level(position_level);
        Position position = positionService.selectPositionByNameAndLevel(position1);
        if (position != null && position.getPosition_id() != position1.getPosition_id()) {
            log.info("[修改职位] 职位信息重复");
            return MsgVO.isSame();
        } else {
            boolean result = positionService.updatePosition(position1);
            log.info("[修改职位] 修改状态：{}", result);
            if (result) {
                return MsgVO.success();
            } else {
                return MsgVO.fail();
            }
        }
    }

    @RequestMapping("/deletePosition/{positionId}")
    @ResponseBody
    public MsgVO deletePosition(@PathVariable("positionId") String positionIdstr) {
        Integer positionId = Integer.parseInt(positionIdstr);
        boolean result = positionService.deletPosition(positionId);
        if (result) {
            log.info("[删除职位],删除状态：{}", result);
            return MsgVO.success();
        }
        return MsgVO.fail();
    }

    @RequestMapping("/updateMenuRelation")
    @ResponseBody
    public MsgVO updateMenuRelation(@RequestBody Map<String, Object> map) {
        Integer position_id = Integer.parseInt((String) map.get("position_id"));
        if (position_id!=null) {
            //删除原有关联
            Boolean result = menuService.deleteRelationMenuByPosition_id(position_id);
            log.info("[删除原有职位菜单关联],状态：{}", result);
        }
        List<Integer> menu_idList = (List<Integer>) map.get("selectList");
        if (menu_idList!=null) {
            //添加新的关联
            Boolean aBoolean = menuService.insertMenuRelation(position_id, menu_idList);
            log.info("[添加菜单关联],状态：{}", aBoolean);
            if (aBoolean) {
                return MsgVO.success();
            }
        }
        return MsgVO.fail();
    }
}
