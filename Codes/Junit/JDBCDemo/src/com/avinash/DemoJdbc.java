package com.avinash;
import java.sql.*;
/*
 * 1. import
 * 2. load and register the driver
 * 3. Create connection
 * 4. create a statement
 * 5. execute the query
 * 6. process the result
 * 7. close
 */
//class Pqr
//{
//	static
//	{
//		System.out.println("In Static");
//	}
//	
//	{
//		System.out.println("In instance");
//	}
//}
public class DemoJdbc{
	public static void main(String args[]) throws Exception
	{
//		Pqr obj = new Pqr();
		//Class.forName("Pqr");
		Class.forName("com.mysql.jdbc.Driver"); // this line and below line are same
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		
	}
}
//public class DemoJdbc {
//	public static void main(String args[]) throws Exception
//	{
//		String url = "jdbc:mysql://localhost:3306/aliens";
//		String uname = "root";
//		String pass = "1999";
//		//String query = "select Name from Students where id=3";
//		//String query = "select * from Students";
//		//String query = "insert into Students values(4, 'suresh');";
//		String query = "insert into Students values(?,?)";
//		//Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url,uname,pass);
//		//Statement st = con.createStatement();
//		PreparedStatement st = con.prepareStatement(query);
//		int id = 5;
//		String studentname = "sanju";
//		st.setInt(1, id);
//		st.setString(2, studentname);
//		//ResultSet rs = st.executeQuery(query); //for DQL
//		int result = st.executeUpdate();//for DML
//		System.out.println("Count of row(s) affected: " + result);
//		//String userData = "";
//		//while(rs.next())	
//		//{
//			//userData = rs.getInt(1) + " : " + rs.getString(2);
//			//System.out.println(userData);
//		//}
//		//rs.next();
//		//String name = rs.getString("Name");
//		//System.out.println(name);
//		st.close();
//		con.close();
//	}
//}