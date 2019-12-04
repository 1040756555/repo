package com.zhiyou.service;

import java.util.List;

import com.zhiyou.model.User;

public interface UserService {

	 //方法名保持与对应mapper中的id保持一致
		void add(User nickname);
		//参数与mapper中的parameterType保持一致
		void update(User nickname);
		void delete(int id);
		//返回值与mapper中的resultType保持一致
		List<User> selectAll();
		User selectByID(int id);
		//仅适用于登陆
		User selectByLogin(String accounts,String password);
}
