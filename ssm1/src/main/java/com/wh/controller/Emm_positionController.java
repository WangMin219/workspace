package com.wh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wh.bean.Emm_position;
import com.wh.service.Emm_positionService;
import com.wh.until.Msg;

@RequestMapping("emm_position")
@Controller
public class Emm_positionController {

	@Autowired
	private Emm_positionService emm_positionService;
	
	// 查询所有的职位信息
	@RequestMapping("/getAllPosition")
	@ResponseBody
	public Msg getAllPosition() {
		List<Emm_position> list = emm_positionService.getAllPosition();
		return Msg.success().add("Emm_position_list", list);
	}
	
	@RequestMapping("/getPositionInfo")
	@ResponseBody
	public Msg getPositionInfo(int positionId) {
		Emm_position emm_position = emm_positionService.getPositionByID(positionId);
		return Msg.success().add("emm_position", emm_position);
	}
	
	@RequestMapping("/emm_position_update")
	@ResponseBody
	public Msg emm_position_update(Emm_position emm_position) {
		emm_positionService.emm_position_update(emm_position);
		return Msg.success();
	}
	
}
