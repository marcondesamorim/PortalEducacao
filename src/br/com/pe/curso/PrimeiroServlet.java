package br.com.pe.curso;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PrimeiroServlet extends HttpServlet{

	@Override
	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse resp) 
			throws  ServletException, IOException {
				System.out.println(" Ol� mundo");
	}
}
