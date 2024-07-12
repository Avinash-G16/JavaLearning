<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Insert Title Here</title>
	</head>
	<body>
		Welcome to avinash
		<form action="addAlien" method="post">
<!--			Enter 1st number : <input type="text" name="num1"><br>-->
<!--			Enter 2nd number : <input type="text" name="num2"><br>-->
			Enter your id : <input type="text" name="aid"><br>
			Enter your name : <input type="text" name="aname"><br>
			<input type="submit">
		</form>
		
		<hr>
		<form action="getAlien" method="get">
			Enter your id: <input type="text" name="aid"><br>
			<input type="submit">
			</form>
	</body>
</html>
			