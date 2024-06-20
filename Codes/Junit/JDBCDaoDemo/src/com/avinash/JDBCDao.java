package com.avinash;
import java.sql.*;

public class JDBCDao {

	public static void main(String[] args) 
	{
		StudentDao dao = new StudentDao();
		Student2 s1 = dao.getStudent(12);
		Student2 s2 = new Student2();
		s2.rollno = 15;
		s2.sname = "Archana";
		dao.addStudent(s2);
		System.out.println(s1.sname);
	}
}

class StudentDao
{
	public void addStudent(Student2 s)
	{
		try {
			String query = "insert into student2 values (?,?)";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aliens","root","1999");
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, s.rollno);
			pst.setString(2, s.sname);
			int c = pst.executeUpdate();
			System.out.println(c);
			pst.close();
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	public Student2 getStudent(int rollno)
	{
		try {
			String query = "select sname from student2 where rollno="+rollno;
			Student2 s = new Student2();
			s.rollno = rollno;
			//Class.forName("com.mysql.jdbc.Driver"); depricated
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aliens","root","1999");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			s.sname = name;
			
			st.close();
			con.close();
			return s;
		}
		catch(Exception ex){
			System.out.println(ex);
			return null;
		}
	}
}

class Student2
{
	int rollno;
	String sname;
}
