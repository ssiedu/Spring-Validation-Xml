package com.ssi;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class MyInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
	
			Calendar c=Calendar.getInstance();
			int day=c.get(Calendar.DAY_OF_WEEK);
			System.out.println(day);
			System.out.println("Interceptor Called "+day);
			System.out.println(request.getSession().getServletContext().getInitParameter("admin"));
			if(day==4){
				response.getWriter().print("Sorry ! We are off today");
				return false;
			}else{
				return true;
			}
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After Completion For : "+request.getRequestURI());
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Post Handler For : "+request.getRequestURI());
	}

}
