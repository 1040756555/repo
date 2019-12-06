package com.zhiyou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpeakerController {

	@RequestMapping("speakerShow")
	public String show(HttpServletRequest req, HttpServletResponse resp) {

		return "/backstage/speaker/show";
	}

}
