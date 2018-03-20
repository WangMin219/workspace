package com.my.mapper;

import com.my.vo.User;

public interface UserMapper {
	
	public void saveUser(User user);
	
    public User selectUserById(Integer id);
}
