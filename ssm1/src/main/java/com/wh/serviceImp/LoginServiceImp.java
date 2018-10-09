package com.wh.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.bean.Log_in;
import com.wh.dao.Log_inMapper;
import com.wh.service.LoginService;

@Service
public class LoginServiceImp implements LoginService {

	@Autowired
	private Log_inMapper loginMapper;

	// 用户登录
	@Override
	public Log_in Login(Log_in logIn) {
		return loginMapper.selectByPrimaryKey(logIn.getEmployeeId());
	}

	@Override
	public void updataPassword(Log_in logIn) {
		loginMapper.updatePassord(logIn);
	}

}
