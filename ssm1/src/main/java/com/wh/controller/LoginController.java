package com.wh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wh.bean.Log_in;
import com.wh.service.LoginService;
import com.wh.until.Msg;

import javax.annotation.Resource;

/**
 * Created by sapling on 2017-12-24.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	@Resource
	private LoginService loginService;

	// 登录检测
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	@ResponseBody
	public Msg loginCheck(Log_in logIn) {
		System.out.println("LoginController登录");

		System.out.println(logIn.getEmployeeId() + "," + logIn.getEmmPassword());

		if (logIn.getEmployeeId().equals(null) && logIn.getEmmPassword().equals("")) {
			return Msg.fail();
		} else {
			return Msg.success();
		}

	}

	// 登录
	@RequestMapping(value = "/log", method = RequestMethod.POST)
	@ResponseBody
	public Msg Login(Log_in logIn) {

		Log_in log = loginService.Login(logIn);
		
		
		if (log.getUserId() != null) {
			System.out.println("成功");
			return Msg.success();
		} else {
			System.out.println("失败");
			return Msg.fail();
		}

	}
	
	// 修改密码
	@RequestMapping(value = "/updataPassword", method = RequestMethod.POST)
	@ResponseBody
	public Msg updataPassword(Integer employeeId, String oldpassword, String newpassword) {
		
		System.out.println(employeeId+","+oldpassword+","+newpassword);
		
		Log_in logIn = new Log_in();
		logIn.setEmployeeId(employeeId);
		logIn.setEmmPassword(oldpassword);
		
		if(loginService.Login(logIn) != null) {
			// 修改
			logIn.setEmmPassword(newpassword);
			loginService.updataPassword(logIn);
			
			System.out.println("updataPawword");
			
//			System.out.println(row);
			Log_in log = loginService.Login(logIn);
			
			
			if(log != null) {
				return Msg.success();
			} else {
				return Msg.fail();
			}
		} else {
			Msg msg = new Msg();
			msg.setCode(1);
			return msg;
		}
		
	}

}
