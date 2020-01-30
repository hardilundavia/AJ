package com.exp;
import java.util.*;
import java.lang.*;

public class exp
{
	public String p1;
	public String getCalc()
	{
		return p1;
	}
	public void setCalc(String p1)
	{
		this.p1 = p1;
	}
	public void calexp()
	{
		List<String> operatorList = new ArrayList<String>();
		List<String> operandList = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(p1, "+-*/", true);
		while (st.hasMoreTokens())
		{
			 String token = st.nextToken();

			 if ("+-/*".contains(token))
			 {
			     operatorList.add(token);
			 }
			 else
			 {
			     operandList.add(token);
			 }
		}

		System.out.println("Operators:" + operatorList);
	    System.out.println("Operands:" + operandList);
     }
}