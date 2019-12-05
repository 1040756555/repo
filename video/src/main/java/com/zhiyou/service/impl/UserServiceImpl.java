package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper mapper;

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		mapper.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		mapper.update(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		mapper.delete(id);
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	@Override
	public User selectByLogin(String accounts, String password) {
		// TODO Auto-generated method stub
		return mapper.selectByLogin(accounts, password);
	}

	@Override
	public void deleteAll(int[] ids) {
		// TODO Auto-generated method stub
		mapper.deleteAll(ids);
	}

	
	

}
