<html>
<body>

<%
	String rno=request.getParameter("rno");
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String sper=request.getParameter("ssc_per");
	String hper=request.getParameter("hsc_per");
	String degree=request.getParameter("grad");
	String gper=request.getParameter("gper");
%>

<%= (new java.util.Date()).toLocaleString()%><br>
<%="Rollno : "+rno %><br>
<%="Name : "+name %><br>
<%="Email : "+email %><br>
<%="SSC Percentage : "+sper %><br>
<%="HSC Percentage : "+hper %><br>
<%="Graduation Degree : "+degree %><br>
<%="Graduation Percentage : "+gper %><br>

</body>
</html>
