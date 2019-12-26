import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginDemo extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException
        {

    		res.setContentType("text/html");
    		PrintWriter out = res.getWriter();

    		String n=req.getParameter("un");
    		String p=req.getParameter("pw");

    		if(n.equals("admin") && p.equals("admin"))
    		{
    	    	RequestDispatcher rd=req.getRequestDispatcher("welcome");
        		rd.forward(req,res);
    		}
    		else
    		{
        		res.sendRedirect("index.html");
    			//out.print("username or password is incorrect");
    		}
			out.close();
    	}
}