package com.zhiyou.service.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.VideoMapper;
import com.zhiyou.model.Course;
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

	@Override
	public List<Course> selectAllCourse() {
		return mapper.selectAllCourse();
	}

	@Override
	public void addVideo(Video video) {
		mapper.addVideo(video);
	}

	@Override
	public void deleteVideoById(int id) {
		mapper.deleteVideoById(id);
	}

	@Override
	public Video selectVideoById(int id) {
		return mapper.selectVideoById(id);
	}

	@Override
	public void deleteAllVideo(List<Integer> list, HttpServletResponse resp) {
		int all = mapper.deleteAllVideo(list, resp);
		if (all == list.size()) {
			try {
				resp.getWriter().write("success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateVideo(Video video) {
		mapper.updateVideo(video);
	}

}
