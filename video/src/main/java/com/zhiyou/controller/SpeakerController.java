package com.zhiyou.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhiyou.model.Speaker;
import com.zhiyou.service.SpeakerService;

@Controller
public class SpeakerController {

	@Autowired
	SpeakerService service;

	@RequestMapping("speakerShow")
	public String show(String page, HttpServletRequest req, HttpServletResponse resp) {
		int counts = service.selectSpeakerCounts();
		int ipage = page == "" || page == null ? 1 : Integer.valueOf(page);
		List<Speaker> list = service.selectAllSpesker((ipage - 1) * 5, 5);
		req.setAttribute("list", list);
		req.setAttribute("counts", counts);
		return "/backstage/speaker/show";
	}

	@RequestMapping("addSpeaker")
	public String addSpeaker(Speaker speaker, HttpServletRequest req, HttpServletResponse resp) {
		service.addSpeaker(speaker);
		return "redirect:speakerShow";
	}

	@RequestMapping("deleteSpeakerById")
	public String deleteSpeakerById(int id, HttpServletRequest req, HttpServletResponse resp) {
		service.deleteSpeakerById(id);
		return "redirect:speakerShow";
	}

	@RequestMapping("updateSpeaker")
	public String updateSpeaker(int id, HttpServletRequest req, HttpServletResponse resp) {
		Speaker speaker = service.selectSpeakerById(id);
		req.setAttribute("speaker", speaker);
		return "/backstage/speaker/update";
	}

	@RequestMapping("updateSpeaker.do")
	public String doUpdateSpeaker(Speaker speaker, HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(speaker);
		service.updateSpeaker(speaker);
		return "redirect:speakerShow";
	}

	@RequestMapping("deleteAllSpeaker")
	public void deleteAllSpeaker(@RequestParam("checkboxs[]") Integer checkboxs[], HttpServletResponse resp) {
		List<Integer> list = Arrays.asList(checkboxs);
		service.deleteAllSpeaker(list, resp);
	}

}
