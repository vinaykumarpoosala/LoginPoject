

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String name = request.getParameter("firstname").toString();
		String pass = request.getParameter("password").toString();
		String email = request.getParameter("email").toString();
		boolean check = RegisterDao.insert(name , email , pass);
		if(check)
		{
			out.println("successfully registered");
			response.sendRedirect("Login.jsp");
		}
		else
			response.sendRedirect("register.jsp");
			out.println("user name already exists");
	}

	
}
