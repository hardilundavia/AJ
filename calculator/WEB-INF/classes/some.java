import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class some extends HttpServlet
{
     public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {

        PrintWriter out=res.getWriter();
        out.println("Hello....");
    }
}