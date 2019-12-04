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
	public void add(User nickname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User nickname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public User selectByLogin(String accounts, String password) {
		// TODO Auto-generated method stub
		return mapper.selectByLogin(accounts, password);
	}
	
//	public void add(User nickname) {
//		mapper.add(nickname);
//	}
//
//	public void update(User nickname) {
//		mapper.update(nickname);
//	}
//
//	public void delete(int id) {
//		mapper.delete(id);
//	}
//
//	public List<User> selectAll() {
//		// TODO Auto-generated method stub
//		return mapper.selectAll();
//	}
//
//	public User selectByID(int id) {
//		// TODO Auto-generated method stub
//		return mapper.selectByID(id);
//	}

	

}
