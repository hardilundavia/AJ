import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class DemoServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        res.setContentType("text/html");//setting the content type
        PrintWriter pw=res.getWriter();//get the stream to write the data
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        String s1="sandy";
        String s2="s123";
        if(s1.equals(email))
        {
            RequestDispatcher rs = req.getRequestDispatcher("Welcome");
            rs.forward(req, res);
            pw.println("Welcome user");
        }
        else
        {
            pw.println("wrong user");
        }

//writing html in the stream


        pw.close();//closing the stream
    }
}