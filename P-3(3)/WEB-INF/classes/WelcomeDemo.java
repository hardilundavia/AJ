import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeDemo extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException
    {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		String n=req.getParameter("un");
    	out.print("Welcome "+n);
		out.close();
    }
}