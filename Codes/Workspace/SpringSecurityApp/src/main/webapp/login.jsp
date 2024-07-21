<%@ page contentType="text/html; charset-UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Insert Title Here</title>
	</head>
	<body>
		<h1>Login</h1>
		${SPRING_SECURITY_LAST_EXCEPTION.message}
		
		<form action="login" method='POST'>
			<table>
				<tr>
					<td>
						User:
					</td>
					<td>
						<input type='text' name='username' value=''>
					</td>
				</tr>
				<tr>
					<td>
						Password:
					</td>
					<td>
						<input type='password' name='password' value=''>
					</td>
				</tr>
				<tr>
					<td>
						<input name="submit" type="submit" value="submit"/>
					</td>
				</tr>
			</table>
			</form>
			</body>
</html>