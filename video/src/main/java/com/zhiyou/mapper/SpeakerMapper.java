package com.zhiyou.mapper;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;

import com.zhiyou.model.Speaker;

public interface SpeakerMapper {

	// 查询到所有的speaker
	List<Speaker> selectAllSpesker(int number, int page);

	// 查询单个speaker
	Speaker selectSpeakerById(int id);

	// 添加speaker
	void addSpeaker(Speaker speaker);

	// 删除speaker
	void deleteSpeakerById(int id);

	// 更新speaker
	void updateSpeaker(Speaker speaker);

	// 删除所有选中的speaker
	int deleteAllSpeaker(@Param("list") List<Integer> list, HttpServletResponse resp);

	// 查询总条数
	int selectSpeakerCounts();

}
