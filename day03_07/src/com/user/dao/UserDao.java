package com.user.dao;

public class UserDao implements IUserDao{

	@Override
	public boolean checkUser(String userName,String password) {
		// TODO Auto-generated method stub
	   if("wangmin".equals(userName.trim())&&"000000".equals(password.trim()))
	   {
		    return true;
	   }
	   else {
		   return false;
	   }
		   
		

	}

}
