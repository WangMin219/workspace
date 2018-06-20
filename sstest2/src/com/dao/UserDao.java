package com.dao;

public class UserDao implements IUserDao{

	@Override
	public boolean checkUser(String userName,String password) {
		// TODO Auto-generated method stub
	   if("admin".equals(userName.trim())&&"123".equals(password.trim()))
	   {
		    return true;
	   }
	   else {
		   return false;
	   }
		   
		

	}

}
