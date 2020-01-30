package com.exp;

<html>
	<body>
		<jsp:useBean id="sampleBean" class="com.exp" scope="session">
        <%-- intialize bean properties --%>
        	<jsp:setProperty name="sampleBean" property="p1" value="value1" />
    	</jsp:useBean>
  		
  		Sample Bean: <%= sampleBean.calexp() %>

    	 P1: <jsp:getProperty name="sampleBean" property="p1" />
	</body>
</html>