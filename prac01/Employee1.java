import java.sql.*;
import java.util.*;
import java.lang.*;
class Employee1
{
	Employee1()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/emloyee_master","root","");
			Statement st=con.createStatement();
			int ch=1;
			while(ch!=0)
			{
				System.out.println("\n1.Insert");
				System.out.println("\n2.Display");
				System.out.println("\n3.Delete");
				System.out.println("\n0.exit\n");
				Scanner sc=new Scanner(System.in);

				System.out.println("Enter your choice : ");
				ch=sc.nextInt();

				switch(ch)
				{
					case 1:
							System.out.println("Enter Employee id : ");
							int id=sc.nextInt();

							System.out.println("Enter Employee fname : ");
							String fname=sc.next();

							System.out.println("Enter Employee mname : ");
							String mname=sc.next();

							System.out.println("Enter Employee lname : ");
							String lname=sc.next();

							System.out.println("Enter Employee code : ");
							int code=sc.nextInt();

							System.out.println("Enter Employee address : ");
							String addr=sc.next();

							System.out.println("Enter Employee pincode : ");
							int pincode=sc.nextInt();

							System.out.println("Enter Employee phonenumber : ");
							String phn=sc.next();

							System.out.println("Enter Employee gender : ");
							String gender=sc.next();

							st.executeUpdate("insert into emp_detail(emp_id,emp_fname,emp_mname,emp_lname,emp_code,emp_address,emp_pincode,emp_phone,emp_gender)values("+id+",'"+fname+"','"+mname+"','"+lname+"',"+code+",'"+addr+"',"+pincode+",'"+phn+"','"+gender+"')");
							System.out.println("Data Inserted Successfully");
							break;

					case 2:
							ResultSet rs=st.executeQuery("select * from emp_detail");
							System.out.println("\nEmpid    Fname      Mname      Lname       Code       Address       Pincode       Phone       Gender\n");
							while(rs.next())
							{
								System.out.println(rs.getInt(1)+" |---| "+rs.getString(2) +" |---| "+rs.getString(3)+" |---| "+rs.getString(4)+" |---| "+rs.getInt(5)+" |---| "+rs.getString(6)+" |---| "+rs.getInt(7)+" |---| "+rs.getString(8)+" |---| "+rs.getString(9));
							}
							con.close();
							break;

					case 3:
							System.out.println("Enter emp_id : ");
							int i=sc.nextInt();
							st.executeUpdate("delete from emp_detail where emp_id="+i+"");
							System.out.println("deleted Successfully");
							con.close();
							break;
					case 0:break;
				}

			}
		}
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		Employee1 e=new Employee1();
	}
}