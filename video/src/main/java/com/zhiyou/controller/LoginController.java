package com.zhiyou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.Admin;
import com.zhiyou.service.AdminService;

@Controller
public class LoginController {

	@Autowired
	AdminService service;

	@RequestMapping("login")
	public String login(String accounts, String password, HttpServletResponse resp, HttpServletRequest req) {
		System.out.println("进了loginController");
		Admin admin = service.selectByAccounts(accounts);
		if (admin == null) {
			req.setAttribute("msg", "账号不存在");
			return "login";
		} else if (!admin.getPassword().equals(password)) {
			req.setAttribute("msg", "密码错误");
			return "login";
		}
		req.getSession().setAttribute("admin", admin);
		return "redirect:showCourse";
	}
}
