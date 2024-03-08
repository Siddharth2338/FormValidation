package in.sp.Backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		if(myemail.equals("sid@gmail.com") &&  mypass.equals("sid123"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("/Index.html");
			rd.forward(req, resp);
		}
	}
}
