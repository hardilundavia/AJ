<html>
<body>
<% 
	String name=request.getParameter("std_name");
	int rollno=Integer.parseInt(request.getParameter("std_rno"));
	int marks1=Integer.parseInt(request.getParameter("std_marks1"));
	int marks2=Integer.parseInt(request.getParameter("std_marks2"));
	int marks3=Integer.parseInt(request.getParameter("std_marks3"));
	int marks4=Integer.parseInt(request.getParameter("std_marks4"));
	int marks5=Integer.parseInt(request.getParameter("std_marks5"));
	int total=marks1+marks2+marks3+marks4+marks5;
	float per=total/5;
	String result="";
	
%>
<%="Student Name : "+name %><br>
<%="Student Roll No : "+rollno %><br>
<%="Total : "+ total %><br>
<%="Percentage : "+ per %><br>

<%
if(per >=90 && per <=100)
{
	result="First Class with Distiction";
}
else if(per >=70 && per <90)
{
	result="First Class";
}
else if(per >=60 && per <70)
{
	result="Second Class";
}
else if(per >=40 && per <60)
{
	result="Pass Class";
}
else
{
	result="Fail";
}

%>
<%="Result: : "+result %><br>


<body>
<html>