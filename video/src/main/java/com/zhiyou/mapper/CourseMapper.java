package com.zhiyou.mapper;

import java.util.List;

import com.zhiyou.model.Course;
import com.zhiyou.model.Subject;

public interface CourseMapper {

	List<Course> selectAllCourse(int number, int page);

	List<Subject> selectAllSubject();

	void addCourse(Course course);

	void updateCourse(Course course);

	void deleteAll(int[] ids);

	// 查询视频总条数
	int selectCourseCounts();
}
