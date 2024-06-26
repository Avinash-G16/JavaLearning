<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="sql" uri="jakarta.tags.sql" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello World


<br>
<c:set var="str" value="Avinash Gautam is a Java learner"/>

Length : ${fn:length(str)}

<c:forEach items="${fn:split(str,'a')}" var="s">
	<br>
	${s}s
</c:forEach> 

<c:forEach items="${fn:split(str,' ')}" var="s">
	<br>
	${s}
</c:forEach> 

<br>
index : ${fn:indexOf(str,"is" )}

<br>
is there : ${fn:contains(str,"Java") }
<br>
	
	<c:if test="${fn:contains(str, 'Java')}">
		Java is there
	</c:if>

<br>


	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/neon" user="root" password="1999"/>
	
	<sql:query var="rs" dataSource="${db}">
		select * from students;
	</sql:query>
	
	<c:forEach items="${rs.rows}" var="row">
		<c:out value="${row.RollNo}"></c:out> : <c:out value="${row.Name}"></c:out> : <c:out value="${row.Marks}"></c:out><br>
	</c:forEach>
<%-- <%
// 	String name = request.getAttribute("label").toString();
// 	out.println(name);
%> --%>
<%-- 	<c:forEach items="${Studs}" var="item"> --%>
<%-- 		${item.name} : ${item.rollno} --%>
<!-- 		<br> -->
		
<%-- 	</c:forEach> --%>
<%-- ${Student.name} --%>
<br>
<%-- <c:out value="Hello from custom tag : ${Student.name}"/> --%>

</body>
</html>