package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.VideoMapper;
import com.zhiyou.model.Speaker;
import com.zhiyou.model.Video;
import com.zhiyou.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	VideoMapper mapper;

	@Override
	public List<Video> selectAllVideo(int number, int page) {
		return mapper.selectAllVideo(number, page);
	}

	@Override
	public List<Speaker> selectAllSpeaker() {
		return mapper.selectAllSpeaker();
	}

	@Override
	public int selectVideoCounts() {
		return mapper.selectVideoCounts();
	}

}
