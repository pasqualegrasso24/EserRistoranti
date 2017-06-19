<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ page import="java.util.ArrayList"
	import="com.ristorante.interfacesDAO.impl.PiattoDAOimpl"
	import="com.ristorante.model.PiattoModel"%>

<link rel="stylesheet" type="text/css" href="css/index.css">
<title>Insert title here</title>
<%
	if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
	}
%>
</head>
<body>
	<%@ include file="back.html"%>

	<div align="center">
		<h2>Lista Piatti</h2>
		<ul>
			<%
				ArrayList<PiattoModel> l = (ArrayList<PiattoModel>) session.getAttribute("listaPiatti");
			%>

			<%
				for (PiattoModel a : l) {
			%>

			<li><%=a%></li>
			<%
				}
			%>


		</ul>
	</div>


</body>
</html>