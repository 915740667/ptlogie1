package com.ptlogie.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class loginIntercepter implements HandlerInterceptor {
	
	private final Log logger = LogFactory.getLog(loginIntercepter.class);
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		logger.debug("afterCompletion");
		System.out.println("afterCompletion");
	}
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		logger.debug("postHandle");
			System.out.println("postHandle");
	}
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		logger.debug("preHandle");
		System.out.println("preHandle");
		HttpSession session=arg0.getSession();
		if(arg0.getRequestURI().indexOf("toLogin")>0){
			return true;
		}
		if(arg0.getRequestURI().indexOf("userLogin")>0){
			return true;
		}
		if(session.getAttribute("loginUser")!=null) {
			return true;
		}
		//登录超时
			arg0.getRequestDispatcher("/WEB-INF/page/museum/login.jsp").forward(arg0, arg1);
			return false;

	}
}
