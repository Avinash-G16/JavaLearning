package co.avinash.web.dao;

import java.sql.*;
import com.avinash.web.model.Alien;

public class AlienDao 
{
	public Alien getAlien(int aid)
	{
		Alien a = new Alien();
//		a.setAid(101);
//		a.setAname("avinash");
//		a.setTech("Java");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avinash","root","1999");
			Statement st = con.createStatement();
			ResultSet rs =  st.executeQuery("select * from alien where aid=" + aid);
			if(rs.next()) 
			{
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			};
			st.close();
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		
		
		return a;
	}
}
