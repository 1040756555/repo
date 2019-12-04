package com.zhiyou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.Emp;
import com.zhiyou.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService service;
	
	@RequestMapping("addEMP")
	public String addEMP(Emp emp,HttpServletRequest req,HttpServletResponse resp) {
		System.out.println("1122");
		System.out.println(emp);
		service.addEmp(emp);
		return "redirect:show";
	}
}
