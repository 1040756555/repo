package com.zhiyou.mapper;

import java.util.List;
import java.util.Map;

import com.zhiyou.model.User;

//保持接口的权限定名与mapper中的namespace一致

public interface UserMapper{
    //方法名保持与对应mapper中的id保持一致
	void add(User nickname);
	//参数与mapper中的parameterType保持一致
	void update(User nickname);
	void delete(int id);
	//返回值与mapper中的resultType保持一致
	List<User> selectAll();
	User selectByID(int id);
	//仅用于登录
	User selectByLogin(String accounts,String password);
}
