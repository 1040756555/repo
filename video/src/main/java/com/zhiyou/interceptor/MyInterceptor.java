package com.zhiyou.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

	/**
	 * 在请求controller方法前调用
	 * 如果返回true 代表放行
	 * 返回false 代表拦截
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("我的拦截器");
		return true;
	}
    
	/**
	 * controller方法执行完,但视图结合之前调用
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
//		ModelMap map = modelAndView.getModelMap();
//		System.out.println("controller方法执行完,视图结合之前调用"+map);
		
		 
		
	}
    
	/**
	 * 视图结合之后调用
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
		System.out.println("视图结合之后调用");
		
	}
    
}
