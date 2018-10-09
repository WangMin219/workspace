package net.wanho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.wanho.dao.UserMapper;
import net.wanho.pojo.User;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User findUser(String username, String password) {
		// TODO Auto-generated method stub
		User u= userMapper.findUser(username, password);
		return u;
	}

}
