<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
101 <br>
Avinash<br>
Gautam<br>

<%
String url = "jdbc:mysql://localhost:3306/neon";
String sql = "select * from Students where RollNo = 103";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,"root","1999");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);
	rs.next();
	
%>
	RollNo : <%=rs.getString(1) %> <br>
	Name : <%= rs.getString(2) %> <br>
	Marks : <%= rs.getString(3) %>
</body>
</html>