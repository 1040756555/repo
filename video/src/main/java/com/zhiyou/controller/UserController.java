package com.zhiyou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping("show")
	public String show(HttpServletRequest req,HttpServletResponse rep) {
		req.setAttribute("list",service.selectAll());
		return "show";
	}
	
	@RequestMapping("add")
	public String add(User user,HttpServletRequest req,HttpServletResponse rep) {
		service.add(user);
		return "redirect:show";
	}
	
	@RequestMapping("delete")
	public String add(int id,HttpServletRequest req,HttpServletResponse rep) {
		service.delete(id);
		return "redirect:show";
	}
	
//	@RequestMapping("selectByID")
//	public String selectByID(int id,HttpServletRequest req,HttpServletResponse rep) {
//		req.setAttribute("user",service.selectByID(id));
//		return "update";
//	}
	
	@RequestMapping("update")
	public String update(User user,HttpServletRequest req,HttpServletResponse rep) {
		service.update(user);
		return "redirect:show";
	}
	
	@RequestMapping("deleteAll")
	public String deleteAll(int [] ids,HttpServletRequest req,HttpServletResponse rep) {
		service.deleteAll(ids);
		return "redirect:show";
		
	}
	
}
