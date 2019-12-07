package com.zhiyou.mapper;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;

import com.zhiyou.model.Course;
import com.zhiyou.model.Subject;

public interface CourseMapper {

	List<Course> selectAllCourse(int number, int page);

	List<Subject> selectAllSubject();

	void addCourse(Course course);

	void updateCourse(Course course);

	// 查询单个Course
	Course selectById(int id);

	int deleteAll(@Param("list") List<Integer> list, HttpServletResponse resp);

	// 查询视频总条数
	int selectCourseCounts();

	// 删除单条
	void deleteById(int id);
}
