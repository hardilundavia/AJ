<html>
<body>
	<%!
		String DisRno(String rno)
		{
			return rno;
		}
		String Disname(String name)
		{
			return name;
		}
		float Display(float m1,float m2,float m3,float m4,float m5)
		{
			return m1+m2+m3+m4+m5;
		}
	%>
	<%
		out.print("Rollno : " +Disname(request.getParameter("rno"))+"<br>");
		out.print("Name : " +Disname(request.getParameter("name"))+"<br>");
		float total=Display(Float.parseFloat(request.getParameter("apt")),
			Float.parseFloat(request.getParameter("java")),
			Float.parseFloat(request.getParameter("dm")),
			Float.parseFloat(request.getParameter("oosd")),
			Float.parseFloat(request.getParameter("adbms")));
		out.print("Total : " + total);
		float per=total/5.0f;
		out.print("<br>Percentage : "+per);
		if(per>=70)
			out.print("<br>Grade : Distinction");
		else if(per>=60 && per<70)
			out.print("<br>Grade : First Class");
		else if(per>=50 && per<60)
			out.print("<br>Grade : Second Class");
		else if(per>=40 && per<50)
			out.print("<br>Grade : Pass");
		else
			out.print("<br>Grade : Fail");
	%>
</body>
</html>