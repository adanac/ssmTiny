package com.adanac.ssm.service.impl;

import com.adanac.ssm.intf.common.domain.bean.User;
import com.adanac.ssm.intf.dao.UserDao;
import com.adanac.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

	@Override
	public List getUserList() {
		return userDao.getUserList();
	}

	@Override
	public Set getUserRolesSet(String username) {
		return userDao.getUserRolesSet(username);
	}

	@Override
	public Set getRolePermissionsSet(String role_name) {
		return userDao.getRolePermissionsSet(role_name);
	}

	@Override
	public User getUserAnthenticaition(String username, String password) {
		Map map = new HashMap();
		map.put("username",username);
		map.put("password",password);
		return userDao.getUserAnthenticaition(map);
	}

	@Override
	public void add(User user) {
		userDao.addUser(user);
	}

}
