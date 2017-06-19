<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/index.css">
</head><body>
	<div align="center">

		<h2>Login</h2>
	</div>

	<div align="center">
	


		<form action="login" method="POST">
			<table>
				<tr>
					<td class="grassetto">Username:</td>
					<td><input required type="text" name="user" size="10"></td>

				</tr>
				<tr>
					<td class="grassetto">Password:</td>
					<td><input required type="password" name="password" size="10">
					</td>
				</tr>
			</table>
			<br /> <input type="submit" name="login" value="Login">
		</form>
		<br/>
		<% if(session.getAttribute("error")=="error")
{%>
	<h2>Username o Password Errata</h2>
<% }	
	%>
		</div>

</body>
</html>