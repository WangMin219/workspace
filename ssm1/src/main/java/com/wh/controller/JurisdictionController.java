package com.wh.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wh.bean.Menu;
import com.wh.service.JurisdictionService;
import com.wh.until.Msg;

@RequestMapping("Jurisdiction")
@Controller
public class JurisdictionController {
	
	@Autowired
	private JurisdictionService jurisdictionService;
	private Map<String, List> map;
	
	@RequestMapping("/getJurisdiction")
	@ResponseBody
	public Msg getJurisdiction(int id,HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("id") != null) {
			id = (int)session.getAttribute("id");
		} else {
			session.setAttribute("id", id);
		}
		
		
		// System.out.println(id+"====================="); 
		List<Menu> list_Pare = jurisdictionService.getJurisdiction_Pare(id);
		List<Menu> list_Son = jurisdictionService.getJurisdiction_Son(id);
		
//		System.out.println(list_Pare.get(0).getMenuName());
//		System.out.println("父集菜单："+list_Pare.size());
//		System.out.println("子集菜单："+list_Son.size());
		map = new HashMap<String, List>();
		
		List<Map> listMap = new ArrayList<Map>();
		List<Menu> listP = new ArrayList<Menu>();// 设置存放父级菜单
		for (int i = 0; i < list_Pare.size(); i++) {
			
			Menu menu_pare = list_Pare.get(i);
			
			listP.add(menu_pare);// 存放父级菜单

			List<Menu> listS = new ArrayList<Menu>();// 存放子菜单
			
			for (int j = 0; j < list_Son.size(); j++) {
				Menu menu_son = list_Son.get(j);
				
				if(menu_pare.getMenuId()==menu_son.getParentMenuId()) {
					listS.add(menu_son);
				}

			}
//			System.out.println("各级父子菜单："+listS.size());
//			System.out.println(menu_pare.getMenuName());
			map.put("pre", listP);
			map.put(menu_pare.getMenuName(), listS);
		}
		
		listMap.add(map);
		
		return Msg.success().add("getJurisdiction", listMap);
		
	}
}
