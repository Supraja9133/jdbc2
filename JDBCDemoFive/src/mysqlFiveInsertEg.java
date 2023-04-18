import java.sql.*;
import java.util.Scanner;
public class mysqlFiveInsertEg {

	public static void main(String[] args)throws ClassNotFoundException {
		// TODO Auto-generated method stub
try {
	Scanner sc=new Scanner(System.in);
	int rollNo;
	String name;
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ABC","root","Supri@91332211");
	Statement st=con.createStatement();
	System.out.println("Enter the RollNo:");
	rollNo=sc.nextInt();
	System.out.println("Enter the Name:");
	name=sc.next();
	st.executeUpdate("INSERT INTO project(rollno,name)VALUES('"+rollNo+"','"+name+"')");
	System.out.println("Data inserted successfully");
	System.out.println();
	ResultSet rs=st.executeQuery("SELECT*FROM project");
	while(rs.next()) {
	System.out.println(rs.getInt(1)+" "+rs.getString(2));
}
	con.close();
	}
	catch(SQLException eeee) 
	{
	System.out.println(eeee);
}
}
}
