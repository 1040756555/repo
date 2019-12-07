package com.zhiyou.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.zhiyou.model.Course;
import com.zhiyou.model.Subject;

public interface CourseService {

	List<Course> selectAllCourse(int number, int page);

	List<Subject> selectAllSubject();

	void addCourse(Course course);

	void updateCourse(Course course);

	void deleteAll(List<Integer> list, HttpServletResponse resp);

	// 查询单个Course
	Course selectById(int id);

	// 查询视频总条数
	int selectCourseCounts();

	// 删除单条
	void deleteById(int id);

}
