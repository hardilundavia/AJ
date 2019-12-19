import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.text.*;
import java.util.*;
public class weldate extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//System.out.println(formatter.format(date));
		//writing html in the stream
		pw.println("<html><body>");
		pw.println("Welcome to servlet\n"+formatter.format(date));
		pw.println("</body></html>");

		pw.close();
	}
}