package in.sp.Backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginJsp")
public class Login2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yt_Demo","root","2338");
			
			PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
			
			ps.setString(1, myemail);
			ps.setString(2, mypass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				RequestDispatcher rd = ((Object) resp).RequestDispatcher("/profile.jsp");
				rd.include(req, resp);
			}
			else
			{
				out.println("<h3 style='color:red'> entered details dident match <h3/>");
				RequestDispatcher rd = getRequestDispatcher("/login.jsp");
				rd.include(req, resp);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			out.println("<h3 style='color:red'> "+ e.getMessage()+" <h3/>");
			RequestDispatcher rd = getRequestDispatcher("/profile.jsp");
			rd.include(req, resp);
			
		}
	}

	private RequestDispatcher getRequestDispatcher(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}