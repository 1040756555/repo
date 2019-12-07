package com.zhiyou.service.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.CourseMapper;
import com.zhiyou.model.Course;
import com.zhiyou.model.Subject;
import com.zhiyou.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseMapper mapper;

	public List<Course> selectAllCourse(int number, int page) {

		return mapper.selectAllCourse(number, page);
	}

	public List<Subject> selectAllSubject() {
		return mapper.selectAllSubject();
	}

	public void addCourse(Course course) {
		mapper.addCourse(course);
	}

	public void updateCourse(Course course) {
		mapper.updateCourse(course);
	}

	public void deleteAll(List<Integer> list, HttpServletResponse resp) {
		int all = mapper.deleteAll(list, resp);
		if (list.size() == all) {
			try {
				resp.getWriter().write("success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public int selectCourseCounts() {
		return mapper.selectCourseCounts();
	}

	@Override
	public void deleteById(int id) {
		mapper.deleteById(id);
	}

	@Override
	public Course selectById(int id) {
		return mapper.selectById(id);
	}

}
