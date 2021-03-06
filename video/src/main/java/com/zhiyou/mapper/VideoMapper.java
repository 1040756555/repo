package com.zhiyou.mapper;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;

import com.zhiyou.model.Course;
import com.zhiyou.model.Speaker;
import com.zhiyou.model.Video;

public interface VideoMapper {

	// 查询到所有的video
	List<Video> selectAllVideo(int number, int page);

	// 查询所有的讲师
	List<Speaker> selectAllSpeaker();

	// 查询所有的讲师
	List<Course> selectAllCourse();

	// 查询video总条数
	int selectVideoCounts();

	// 添加新的video
	void addVideo(Video video);

	// 删除一个video
	void deleteVideoById(int id);

	// 根据id查询到video
	Video selectVideoById(int id);

	// 批量删除
	int deleteAllVideo(@Param("list") List<Integer> list, HttpServletResponse resp);

	// 更新video
	void updateVideo(Video video);

}
