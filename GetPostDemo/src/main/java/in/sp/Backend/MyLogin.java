package in.sp.Backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")
public class MyLogin extends HttpServlet
{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{	
		PrintWriter out = resp.getWriter();
		String myemail = (String) req.getParameter("name1");
		String mypass = (String) req.getParameter("pass1");
		
		if(myemail.equals("sid123@gmail.com") && mypass.equals("sid123"))
		{
			out.println("<h3 style ='color:green'> user register succesfully <h3/>");
		}
		else
		{
			out.println("<h3 style ='color:red'> user register failed <h3/>");
		}
			
		
	}
}
