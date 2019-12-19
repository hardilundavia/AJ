import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class Helloworld extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();

		//writing html in the stream
		pw.println("<html><body>");
		pw.println("Welcome to servlet");
		pw.println("</body></html>");

		pw.close();
	}
}