import java.sql.*;
import java.util.*;
import java.lang.*;
class employee
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/employee_master","root","");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp_detail");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
			con.close();
		}
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
}