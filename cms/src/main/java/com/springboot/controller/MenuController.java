package com.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.config.Information;
import com.springboot.dataobject.Menu;
import com.springboot.vo.MsgVO;
import com.springboot.vo.MenuVO;
import com.springboot.vo.RelationMenuVO;
import com.springboot.service.CustormerService;
import com.springboot.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/3 0003.
 */

@Controller
@Slf4j
@RequestMapping("/systemSettings/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @Autowired
    private Information information;

    @Autowired
    private CustormerService custormerService;

    @RequestMapping("/index")
    public ModelAndView toMenuPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        List<RelationMenuVO> relationMenuVOList = new ArrayList<>();
        //每页显示的条数
        PageHelper.startPage(pn, information.getPageNum());
        List<Menu> menuList = menuService.selectMenuList();
        for (Menu menu : menuList) {
            RelationMenuVO relationMenuVO = new RelationMenuVO();
            BeanUtils.copyProperties(menu, relationMenuVO);
            try {
                relationMenuVO.setParent_name(menuService.getParentName(menu.getParent_menu_id()).getMenu_name());
            } catch (NullPointerException e) {
//                log.info("[父级菜单为空]");
            }
            relationMenuVOList.add(relationMenuVO);
        }
        PageInfo pageInfo = new PageInfo(relationMenuVOList, information.getTotalPage());
        Map<String, Object> map = new HashMap<>();
        map.put("pageInfo", pageInfo);
        return new ModelAndView("/systemSettings/menu/index", map);
    }

    @RequestMapping("/searchMenu/{name}")
    @ResponseBody
    public MsgVO searchEmployee(@PathVariable("name") String name) {
        Menu menu = menuService.selectMenuByName(name);
        RelationMenuVO relationMenuVO = new RelationMenuVO();
        BeanUtils.copyProperties(menu, relationMenuVO);
        try {
            relationMenuVO.setParent_name(menuService.getParentName(menu.getParent_menu_id()).getMenu_name());
        } catch (Exception e) {
            log.info("[父级菜单为空]");
        }
        return MsgVO.success().add("relationMenu", relationMenuVO);
    }

    @RequestMapping("/createMenu")
    public ModelAndView createMenu() {
        return new ModelAndView("/systemSettings/menu/create");
    }

    @RequestMapping("/getFatherMenu")
    @ResponseBody
    public MsgVO getFatherMenu(HttpSession session) {
        List<MenuVO> menuVOList = custormerService.getFatherMenu((Integer) session.getAttribute("employeeId"));
        return MsgVO.success().add("menuList", menuVOList);
    }

    @RequestMapping("/addMenu")
    @ResponseBody
    public MsgVO addMenu(@RequestBody Map<String, String> map) {
        String menu_name = map.get("menu_name");
        String menu_url = map.get("menu_url");
        String menu_icon = map.get("menu_icon");
        String menu_parent_id = map.get("menu_parent_id").trim();
        Menu menu = new Menu();
        menu.setMenu_name(menu_name);
        menu.setMenu_url(menu_url);
        menu.setPictures(menu_icon);
        boolean result;
        if (!menu_parent_id.equals("顶级节点")) {
            menu_parent_id = menu_parent_id.substring(2);
            Menu resultMenu = menuService.selectMenuByName(menu_parent_id);
            menu.setParent_menu_id(resultMenu.getMenu_id());
            result = menuService.insertMenu(menu);
            log.info("[插入子菜单]，状态：{}", result);
            if (result) {
                return MsgVO.success();
            }
        } else {
            result = menuService.insertMenu(menu);
            log.info("[插入顶级菜单]，状态：{}", result);
            if (result) {
                return MsgVO.success();
            }
        }
        return MsgVO.fail();
    }

    @RequestMapping("/deleteMenu/{menuId}")
    @ResponseBody
    public MsgVO deleteMenu(@PathVariable("menuId") String menuId) {
        Integer menu_id = Integer.parseInt(menuId);
        boolean result = menuService.deleteMenu(menu_id);
        log.info("[删除菜单]，状态:{}", result);
        if (result) {
            return MsgVO.success();
        }
        return MsgVO.fail();
    }

    @RequestMapping("/updateMenu/{menuId}")
    @ResponseBody
    public ModelAndView updateMenu(@PathVariable("menuId") String menuId) {
        Integer menu_id = Integer.parseInt(menuId);
        Menu menu = menuService.selectMenuById(menu_id);
        Map<String, Object> map = new HashMap<>();
        RelationMenuVO relationMenuVO = new RelationMenuVO();
        BeanUtils.copyProperties(menu, relationMenuVO);
        try {
            relationMenuVO.setParent_name(menuService.getParentName(menu.getParent_menu_id()).getMenu_name());
        } catch (Exception e) {
            log.info("[父级菜单为空]");
        }
        map.put("menu", relationMenuVO);
        return new ModelAndView("/systemSettings/menu/update", map);
    }


    @RequestMapping("/updateMenu")
    @ResponseBody
    public MsgVO deleteMenu(@RequestBody Map<String, String> map) {
        Integer menu_id = Integer.valueOf(map.get("menu_id"));
        String menu_parent_name = map.get("menu_parent_name");
        String menu_name = map.get("menu_name");
        String menu_url = map.get("menu_url");
        String menu_icon = "";
        try {
            menu_icon = map.get("menu_icon");
        } catch (Exception e) {
            log.info("[该菜单图标为空]");
        }

        Menu menu =new Menu();
        if (!menu_parent_name.equals("顶级节点")) {
            menu_parent_name = menu_parent_name.substring(2);
            menu = menuService.selectMenuByName(menu_parent_name);
        }

        Menu menu1 = new Menu();
        menu1.setMenu_id(menu_id);
        menu1.setMenu_name(menu_name);
        menu1.setMenu_url(menu_url);
        menu1.setPictures(menu_icon);
        menu1.setParent_menu_id(menu.getMenu_id());
        boolean result = menuService.updateMenu(menu1);
        log.info("[更新菜单],状态:{}",result);
        if (result){
            return MsgVO.success();
        }
        return MsgVO.fail();
    }
}
