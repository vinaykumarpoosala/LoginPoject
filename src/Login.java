

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.SendResult;


@WebServlet("/Login")
public class Login extends HttpServlet
{
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		HttpSession session = request.getSession();
		String name = request.getParameter("userName").toString();
		String pass = request.getParameter("password").toString();
		PrintWriter out = response.getWriter();
		
		if(LoginDao.check(name, pass))
		{	
			ResultSet rs = FetchPosts.getResultSet(name);
			
			response.sendRedirect("Welcome.jsp");
			session.setAttribute("uname", name);
			session.setAttribute("rs", rs);
		}
		else
		{
			response.sendRedirect("Login.jsp");	
		}
		
		
		
		
	}

	
}
