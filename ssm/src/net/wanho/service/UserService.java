package net.wanho.service;

import net.wanho.pojo.User;

public interface UserService {
	public User findUser(String username,String password );
}
