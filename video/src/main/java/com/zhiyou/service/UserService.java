package com.zhiyou.service;



import com.zhiyou.model.User;

public interface UserService {
//
//	 //方法名保持与对应mapper中的id保持一致
//	//参数与mapper中的parameterType保持一致
//	//返回值与mapper中的resultType保持一致	
//		/*关于个人用户的增删改*/
//		void add(User user);	
//		void update(User user);
//		void delete(int id);
//		
//		//查询全部
//		List<User> selectAll();
//		
//		//仅用于登录
//		User selectByLogin(String accounts,String password);
//		
//		//这是批量删除
//		void deleteAll(int [] ids);
	// 用户登陆
		User selectByEmail(String accounts);
		// 用户注册
		void add(User user);
		// 注册的邮箱是否存在
		User selectByUsername(String accounts);
		// 修改个人中心的资料     // 修改密码
		void update(User user);
		// 查询原密码是否正确
	    boolean selectByPassword(int id, String password);
}
