package com;

import java.io.IOException;

import javax.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int firstNumber = Integer.parseInt(req.getParameter("first"));
		int secondNumber = Integer.parseInt(req.getParameter("second"));

		int result = firstNumber + secondNumber;

		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Sum of the two numbers: " + result + "</h1>");
	}
}
