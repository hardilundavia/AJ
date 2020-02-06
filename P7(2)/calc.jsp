<html>
<body>
<% 
	
	String no1=request.getParameter("n1");
	String no2=request.getParameter("n2");
	String opr=request.getParameter("op");
//	String re="";Integer.parseInt(
	int ans;
	if(no1.equals("") || no2.equals("") || opr.equals(""))
	{
		out.println("All fields are rquire");
	}
	else
	{
		if(opr.equals("+"))
		{
			ans=Integer.parseInt(no1)+Integer.parseInt(no2);
			out.print(ans);
		}
		else if(opr.equals("-"))
		{
			ans=Integer.parseInt(no1)-Integer.parseInt(no2);
			out.print(ans);
		}
		else if(opr.equals("*"))
		{
			ans=Integer.parseInt(no1)*Integer.parseInt(no2);
			out.print(ans);
		}
		else if(opr.equals("/"))
		{
			ans=Integer.parseInt(no1)/Integer.parseInt(no2);
			out.print(ans);
		}

	}


%>

<body>
<html>