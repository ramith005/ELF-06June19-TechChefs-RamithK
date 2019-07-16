package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/generic",
			initParams = {
							@WebInitParam(name="actress",value="basanthi")
						 }
			)
public class MyGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		ServletConfig config = getServletConfig();
		String actressName = config.getInitParameter("actress");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("hello how are you ?");
		out.println("<br /><br />Actress is  "+actressName);
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	public static void main(String[] args) {
		System.out.println("Coool ");
	}
	
}
