package com.yhq.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

	/**
	 * 在请求之前执行
	 * 
	 * @param request
	 * @param response
	 * @param handler
	 *            表示被拦截的请求目标
	 * @return false:拦截请求,终止请求 true:继续执行请求
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// 业务逻辑代码编写...(如:解决乱码,权限验证)
		System.out.println("在请求之前执行");
		request.setCharacterEncoding("utf-8");
		return true;
	}

	/**
	 * @param modelAndView
	 *            可以对视图进行操作
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		// 业务逻辑代码编写...(如:操作日志记录,更改视图信息)
		System.out.println("ss 可以对视图进行操作");
		if (modelAndView != null) {
			modelAndView.addObject("fuck", "fuck");
			System.out.println(modelAndView);
		}
	}

	/**
	 * @param ex
	 *            异常
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		// 业务逻辑代码编写...(如:,资源销毁,异常处理)
		System.out.println("请求发生之后");
	}
}
