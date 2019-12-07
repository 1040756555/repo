package com.zhiyou.service;

import java.util.List;

import com.zhiyou.model.Speaker;
import com.zhiyou.model.Video;

public interface VideoService {

	// 查询到所有的video
	List<Video> selectAllVideo(int number, int page);

	// 查询所有的讲师
	List<Speaker> selectAllSpeaker();

	// 查询video总条数
	int selectVideoCounts();

}
