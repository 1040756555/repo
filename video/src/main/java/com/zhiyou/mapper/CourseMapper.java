package com.zhiyou.mapper;

import java.util.List;

import com.zhiyou.model.Course;
import com.zhiyou.model.Subject;

public interface CourseMapper {

	List<Course> selectAllCourse(int number, int page);

	List<Subject> selectAllSubject();

	void addCourse(Course course);

	void updateCourse(Course course);

	// 查询单个Course
	Course selectById(int id);

	void deleteAll(int[] ids);

	// 查询视频总条数
	int selectCourseCounts();

	// 删除单条
	void deleteById(int id);
}
