package com.wh.service;

import com.wh.bean.Log_in;

public interface LoginService {

	// 用户登录
	public Log_in Login(Log_in logIn);

	public void updataPassword(Log_in logIn);


}
