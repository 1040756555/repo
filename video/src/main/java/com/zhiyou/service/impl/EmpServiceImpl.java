package com.zhiyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.EmpMapper;
import com.zhiyou.model.Emp;
import com.zhiyou.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpMapper mapper;
	
	@Override
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		mapper.addEmp(emp);
	}

}
