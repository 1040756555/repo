package com.zhiyou.interceptor;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class FileTypeInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		boolean flag = true;
		//如果是文件上传的请求name请求一定会实现MultipartHttpServletRequest接口
		if (request instanceof MultipartHttpServletRequest) {
			MultipartHttpServletRequest mu = (MultipartHttpServletRequest) request;
			Map<String, MultipartFile> fileMap = mu.getFileMap();
			Iterator<String> iterator = fileMap.keySet().iterator();
			while (iterator.hasNext()) {
				//挨个获得key
				String forKey =  iterator.next();
				//根据key 取出文件
				MultipartFile file = mu.getFile(forKey);
				System.out.println(file.getSize());
				if (file.getSize() > (1024 * 1024)) {
					int number = (int) file.getSize() / 1024;
					System.out.println(number);
					request.setAttribute("msg", "上传文件为" + number + "M,请上传文件大小为1M以内");
					request.getRequestDispatcher("edit.jsp").forward(request, response);
					flag = false;
				}
				String filename = file.getOriginalFilename();
				if (!chenFile(filename)) {
					request.setAttribute("msg", "上传文件类型错误,请上传图片");
					request.getRequestDispatcher("edit.jsp").forward(request, response);
					flag=false;
				}
			}
		}
		return flag;
	}

	public boolean chenFile(String fileName) {
		String suff = "jpg,png,jpeg,gif";
		String suffx = fileName.substring(fileName.lastIndexOf(".")+1,fileName.length());
		System.out.println(suffx);
		if (suff.contains(suffx.trim().toLowerCase())) { //判断suff中是否包含文件后缀去掉空格转成小写
			return true;
		}
		
		return false;
		
	}
	
	
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
