import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class calc extends HttpServlet
{
     public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        int i=Integer.parseInt(req.getParameter("txt1"));
        int j=Integer.parseInt(req.getParameter("txt2"));

        PrintWriter out=res.getWriter();



        if(req.getParameter("add")!=null)
        {
            out.println("Sum is:"+(Integer.parseInt(req.getParameter("txt1"))+Integer.parseInt(req.getParameter("txt2"))));
            RequestDispatcher rd=req.getRequestDispatcher("some");
            rd.forward(req,res);
        }
        else if(req.getParameter("sub")!=null)
        {
            out.println("Sum is:"+(Integer.parseInt(req.getParameter("txt1"))-Integer.parseInt(req.getParameter("txt2"))));

            res.sendRedirect("some");

        }
        else if(req.getParameter("mul")!=null)
        {
            out.println("Sum is:"+(Integer.parseInt(req.getParameter("txt1"))*Integer.parseInt(req.getParameter("txt2"))));
        }
        else if(req.getParameter("div")!=null)
        {
            out.println("Sum is:"+(Integer.parseInt(req.getParameter("txt1"))/Integer.parseInt(req.getParameter("txt2"))));
        }
    }
}