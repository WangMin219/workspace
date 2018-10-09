package com.springboot.service;

import com.springboot.dao.MenuMapper;
import com.springboot.dataobject.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/10/3 0003.
 */

@Service
public class MenuService {

    @Autowired
    private MenuMapper menuMapper;

    public List<Menu> selectMenuList() {
        return menuMapper.getMenuList();
    }

    public Menu getParentName(Integer parentId) {
        return menuMapper.selectParentMenuName(parentId);
    }

    @Transactional
    public Boolean deleteRelationMenuByPosition_id(Integer position_id) {
        Integer result = menuMapper.deleteOldRelation(position_id);
        if (result != 0) {
            return true;
        }
        return false;
    }

    @Transactional
    public Boolean insertMenuRelation(Integer position_id, List<Integer> menu_idList) {
        return menuMapper.insertRelation(position_id, menu_idList) != 0 ? true : false;
    }

    public Menu selectMenuByName(String menu_name) {
        return menuMapper.selectMenuByName(menu_name);
    }

    public Menu selectMenuById(Integer menu_id) {
        return menuMapper.selectMenuById(menu_id);
    }

    @Transactional
    public Boolean insertMenu(Menu menu) {
        return menuMapper.insertMenu(menu) != 0 ? true : false;
    }

    @Transactional
    public Boolean deleteMenu(Integer menu_id) {
        return menuMapper.deleteMenu(menu_id) != 0 ? true : false;
    }

    @Transactional
    public Boolean updateMenu(Menu menu) {
        return menuMapper.updateMenu(menu) != 0 ? true : false;
    }
}
