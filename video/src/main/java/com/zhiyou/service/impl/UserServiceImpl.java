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
	// 用户登录
			public User selectByEmail(String accounts) {
				
				return mapper.selectByEmail(accounts);
			}

			// 用户注册
			public void add(User user) {
				
				 mapper.add(user);
				
			}

			// 注册的邮箱是否存在
			public User selectByUsername(String accounts) {
				
				return mapper.selectByEmail(accounts);
				
			}

			// 修改个人中心资料		// 修改密码
			public void update(User user) {
				
				mapper.update(user);
			}
		@Override
		public boolean selectByPassword(int id, String password) {
			// TODO Auto-generated method stub
			List<User> list = mapper.selectByPassword(id,password);
			System.out.println("list.size() : "+list.size());
				if (list.size()==0) {
					return false;
				}else {
					return true;
				}
			}

		@Override
		public User selectById(int id) {
			// TODO Auto-generated method stub
			return mapper.selectById(id);
		}
		
		
//	@Override
//	public void add(User user) {
//		// TODO Auto-generated method stub
//		mapper.add(user);
//	}
//
//	@Override
//	public void update(User user) {
//		// TODO Auto-generated method stub
//		mapper.update(user);
//	}
//
//	@Override
//	public void delete(int id) {
//		// TODO Auto-generated method stub
//		mapper.delete(id);
//	}
//
//	@Override
//	public List<User> selectAll() {
//		// TODO Auto-generated method stub
//		return mapper.selectAll();
//	}
//
//	@Override
//	public User selectByLogin(String accounts, String password) {
//		// TODO Auto-generated method stub
//		return mapper.selectByLogin(accounts, password);
//	}
//
//	@Override
//	public void deleteAll(int[] ids) {
//		// TODO Auto-generated method stub
//		mapper.deleteAll(ids);
//	}

	
	
	}

	
	


