package com.dao;
@Repository("userDao") 
public class UserDaoImp implements IUserDao{
	   public void save(){
			  System.out.println("userdao...save...");
		   }

}
