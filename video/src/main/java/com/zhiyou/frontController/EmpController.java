package com.zhiyou.frontController;

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

	@RequestMapping("addEmp")
	public String login(Emp emp, HttpServletResponse resp, HttpServletRequest req) {
		
		service.addEmp(emp);
		return "index";
	}
}
