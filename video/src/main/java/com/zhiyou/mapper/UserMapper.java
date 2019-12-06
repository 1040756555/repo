package com.zhiyou.mapper;

import java.util.List;

import com.zhiyou.model.User;

//保持接口的权限定名与mapper中的namespace一致

public interface UserMapper{
    //方法名保持与对应mapper中的id保持一致
	/*关于个人用户的增删改*/
//	void add(User user);	
//	void update(User user);
//	void delete(int id);
//	
//	//查询全部
//	List<User> selectAll();
//	
//	//仅用于登录
//	User selectByLogin(String accounts,String password);
//	
//	//这是批量删除
//	void deleteAll(int [] ids); 
	// 用户登录
		User selectByEmail(String accounts);
		// 用户注册
		void add(User user);
		// 修改数据      // 修改密码
		void update(User user);
	// 查询原密码是否正确
    List<User> selectByPassword(int id, String password);
}
