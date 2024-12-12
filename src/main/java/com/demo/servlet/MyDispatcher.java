package com.demo.servlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.*;
public class MyDispatcher extends DispatcherServlet
{
	@Override
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(String.format("Request : %s",request.getRequestURL()));
		super.doDispatch(request, response);
	}
}
