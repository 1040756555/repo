package com.zhiyou.service.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.SpeakerMapper;
import com.zhiyou.model.Speaker;
import com.zhiyou.service.SpeakerService;

@Service
public class SpeakerServiceImpl implements SpeakerService {

	@Autowired
	SpeakerMapper mapper;

	@Override
	public List<Speaker> selectAllSpesker(int number, int page) {
		return mapper.selectAllSpesker(number, page);
	}

	@Override
	public Speaker selectSpeakerById(int id) {
		return mapper.selectSpeakerById(id);
	}

	@Override
	public void addSpeaker(Speaker speaker) {
		mapper.addSpeaker(speaker);
	}

	@Override
	public void deleteSpeakerById(int id) {
		mapper.deleteSpeakerById(id);
	}

	@Override
	public void updateSpeaker(Speaker speaker) {
		mapper.updateSpeaker(speaker);
	}

	@Override
	public void deleteAllSpeaker(List<Integer> list, HttpServletResponse resp) {
		int all = mapper.deleteAllSpeaker(list, resp);
		if (list.size() == all) {
			try {
				resp.getWriter().write("success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public int selectSpeakerCounts() {
		return mapper.selectSpeakerCounts();
	}

}
