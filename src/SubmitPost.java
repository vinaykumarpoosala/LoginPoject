

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SubmitPost")
public class SubmitPost extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		String name = session.getAttribute("uname").toString();
		String post = request.getParameter("paragraph_text");
		String title = request.getParameter("title").toString();
		PostsDao.getResultSet(name, post,title);
		response.sendRedirect("Welcome.jsp");
		
	}

}
