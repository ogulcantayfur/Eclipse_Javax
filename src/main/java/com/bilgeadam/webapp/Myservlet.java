package com.bilgeadam.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String res = dbgetall();
		resp.getWriter().append(res);
	}

	private String dbgetall()
	{
		return "merhaba abuziddin";
	}
}
