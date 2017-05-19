package com.yhq.mysql.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.mysql.dao.UserMapper;
import com.yhq.mysql.pojo.User;
import com.yhq.mysql.service.IUserService;
import com.yhq.mysql.service.baseInterface.Impl.BaseInterfaceService;

@Service("userService")
public class UserService extends BaseInterfaceService<User> implements IUserService {
	@Autowired
	private UserMapper userMapper;

	@Autowired
	/**
	 * 
	 */
	public UserService(UserMapper userMapper) {
		setMySqlMapper(userMapper);
	}
}