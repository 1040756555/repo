package com.zhiyou.frontController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zhiyou.Util.FTPUtil;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
//	@RequestMapping("show")
//	public String show(HttpServletRequest req,HttpServletResponse rep) {
//		req.setAttribute("list",service.selectAll());
//		return "show";
//	}
//	
//	@RequestMapping("add")
//	public String add(User user,HttpServletRequest req,HttpServletResponse rep) {
//		service.add(user);
//		return "redirect:show";
//	}
//	
//	@RequestMapping("delete")
//	public String add(int id,HttpServletRequest req,HttpServletResponse rep) {
//		service.delete(id);
//		return "redirect:show";
//	}
//	
//	
//	@RequestMapping("update")
//	public String update(User user,HttpServletRequest req,HttpServletResponse rep) {
//		service.update(user);
//		return "redirect:show";
//	}
//	
//	@RequestMapping("deleteAll")
//	public String deleteAll(int [] ids,HttpServletRequest req,HttpServletResponse rep) {
//		service.deleteAll(ids);
//		return "redirect:show";
//		
//	}
	// 用户登陆
		@RequestMapping("/userlogin")
		public void login3(String accounts,String password,User user,HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {	
			
			user = service.selectByEmail(accounts);
			if (user!=null) {
				// 用户存在
				if (user.getPassword().equals(password)) {
					
					req.getRequestDispatcher("/index2.jsp").forward(req, resp);	
					return;
				}else {
					System.out.println("邮箱或密码错误");	
				}
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			}
		}
		
		// 用户注册
		@ResponseBody
		@RequestMapping(value = "/signin", method = RequestMethod.POST)
		public String signin(User user,HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
			service.add(user);
			return "index";
		}
		
		// 注册的邮箱是否存在
		@ResponseBody
		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public String email(String accounts,HttpServletRequest req,HttpServletResponse resp) {

			User user = service.selectByUsername(accounts);
			if (user != null) {
				return "error";
			} else {
				return "success";
			}
		}
		
		// 修改个人中心的资料	// 修改密码
		@RequestMapping("/updatedata")
		public String update(User user,HttpServletRequest req,HttpServletResponse rep) {
			
			service.update(user);
			req.getSession().setAttribute("user",user);
			return "center";
		}
		
		// 头像上传到服务器
		@RequestMapping("/uploadhead")
		public String upload2(MultipartFile file123, HttpServletRequest req, HttpServletResponse resp) throws IOException {
			
			System.out.println(FTPUtil.upload(file123.getInputStream(), file123.getOriginalFilename()));

			return "center";
		}
		
		// 修改密码
		@RequestMapping("/updatepassword")
		public String updatePassword(User user,HttpServletRequest req,HttpServletResponse rep) {
			
			
			service.update(user);
			req.getSession().setAttribute("user",user);
			System.out.println("修改密码2");
			
			return "jsp/success";
		}
		
		// 查询原密码是否正确
		@RequestMapping("/User222")
		public void User222(int id,String password,HttpServletRequest req,HttpServletResponse resp) throws IOException {
						
			System.out.println("password:" + password);
			boolean b = service.selectByPassword(id, password);
		
			resp.getWriter().write(b+"");
		}
			
		// 两次密码输入是否一致
		@RequestMapping("/User111")
		public void User111(User user,String password1,String password2,HttpServletRequest req,HttpServletResponse resp) throws IOException {
			
			if (!password1.equals(password2)  ) {
				boolean b = false;
//				System.out.println("返回false");
				resp.getWriter().write(b+"");
			}else {
				boolean b = true;
//				System.out.println("返回true");
				resp.getWriter().write(b+"");
			}
		}
	
	
}
