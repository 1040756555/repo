package com.zhiyou.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.Course;
import com.zhiyou.model.Subject;
import com.zhiyou.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	CourseService service;

	@RequestMapping("showCourse")
	public String showCourse(String page, HttpServletRequest req, HttpServletResponse resp) {
		int counts = service.selectCourseCounts();
		/*int page = req.getParameter("page") == null || req.getParameter("page") == "" ? 1
				: Integer.valueOf(req.getParameter("page"));*/
		int ipage = page == "" || page == null ? 1 : Integer.valueOf(page);
		List<Course> list = service.selectAllCourse((ipage - 1) * 5, 5);
		req.setAttribute("list", list);
		req.setAttribute("counts", counts);
		return "backstage/course/show";
	}

	@RequestMapping("addCourse")
	public String addCourse(HttpServletRequest req, HttpServletResponse resp) {
		List<Subject> subjectList = service.selectAllSubject();
		req.setAttribute("subjectList", subjectList);
		return "backstage/course/add";
	}

	@RequestMapping("addCourse.do")
	public String doAddCourse(Course course, HttpServletRequest req, HttpServletResponse resp)
			throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset= UTF-8");
		service.addCourse(course);
		return "redirect:showCourse";
	}

	@RequestMapping("updateCourse")
	public String updateCourse(Course course, HttpServletRequest req, HttpServletResponse resp)
			throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset= UTF-8");
		service.addCourse(course);
		return "redirect:showCourse";
	}

	@RequestMapping("updateCourse.do")
	public String doUpdateCourse(Course course, HttpServletRequest req, HttpServletResponse resp)
			throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset= UTF-8");
		service.addCourse(course);
		return "redirect:showCourse";
	}
}
