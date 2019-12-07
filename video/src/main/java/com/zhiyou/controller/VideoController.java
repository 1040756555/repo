package com.zhiyou.controller;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhiyou.model.Course;
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
		List<Course> courseList = service.selectAllCourse();
		req.setAttribute("courseList", courseList);
		req.setAttribute("speakerList", speakerList);
		req.setAttribute("videoList", videoList);
		req.setAttribute("counts", counts);
		return "backstage/video/show";
	}

	@RequestMapping("addVideo")
	public String addVideo(String page, HttpServletRequest req, HttpServletResponse resp) {
		List<Speaker> speakerList = service.selectAllSpeaker();
		List<Course> courseList = service.selectAllCourse();
		req.setAttribute("courseList", courseList);
		req.setAttribute("speakerList", speakerList);
		return "backstage/video/add";
	}

	@RequestMapping("updateVideo")
	public String updateVideo(int id, String page, HttpServletRequest req, HttpServletResponse resp) {
		Video video = service.selectVideoById(id);
		req.setAttribute("video", video);
		List<Speaker> speakerList = service.selectAllSpeaker();
		List<Course> courseList = service.selectAllCourse();
		req.setAttribute("courseList", courseList);
		req.setAttribute("speakerList", speakerList);
		return "backstage/video/update";
	}

	@RequestMapping("updateVideo.do")
	public String doUpdateVideo(Video video, HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("88888888888888888888888888");
		service.updateVideo(video);
		return "redirect:videoShow";
	}

	@RequestMapping("addVideo.do")
	public String doAddVideo(Video video, HttpServletRequest req, HttpServletResponse resp) {
		service.addVideo(video);
		return "redirect:videoShow";
	}

	@RequestMapping("deleteVideoById")
	public String deleteVideoById(int id, HttpServletRequest req, HttpServletResponse resp) {
		service.deleteVideoById(id);
		return "redirect:videoShow";
	}

	@RequestMapping("deleteAllVideo")
	public void deleteAllVideo(@RequestParam("checkboxs[]") Integer checkboxs[], HttpServletResponse resp)
			throws UnsupportedEncodingException {
		List<Integer> list = Arrays.asList(checkboxs);
		service.deleteAllVideo(list, resp);
	}
}
