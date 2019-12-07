package com.zhiyou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.Speaker;
import com.zhiyou.model.Video;
import com.zhiyou.service.VideoService;

@Controller
public class VideoController {

	@Autowired
	VideoService service;

	@RequestMapping("videoShow")
	public String videoShow(String page, HttpServletRequest req, HttpServletResponse resp) {
		int ipage = page == "" || page == null ? 1 : Integer.valueOf(page);
		int counts = service.selectVideoCounts();
		List<Video> videoList = service.selectAllVideo((ipage - 1) * 5, 5);
		List<Speaker> speakerList = service.selectAllSpeaker();
		req.setAttribute("speakerList", speakerList);
		req.setAttribute("videoList", videoList);
		req.setAttribute("counts", counts);
		return "backstage/video/show";
	}
}
