<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ page import="java.util.ArrayList"
	import="com.ristorante.interfacesDAO.impl.RistoranteDAOimpl"
	import="com.ristorante.model.RistoranteModel"%>

<link rel="stylesheet" type="text/css" href="index.css">
<title>Insert title here</title>
<%
	if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
	}
%>
</head>
<body>

	<%@ include file="logout.html"%>
	<h1>Welcome ${username}</h1>
	<div align="center">
		<h2>Lista Ristoranti</h2>
		<table>
			<tr>
				<td class="grassetto">Nome</td>
				<td class="grassetto">Indirizzo</td>
				<td class="grassetto">Telefono</td>
			</tr>
			<%
				RistoranteDAOimpl rist = (RistoranteDAOimpl) session.getAttribute("ristoranti");
				ArrayList<RistoranteModel> l = rist.getAllRistorante();
			%>

			<%
				for (RistoranteModel a : l) {
			%>

			<tr>
				<td><a href="menuController?id=<%=a.getIdRistorante()%>">
						<%=a.getNome()%>
				</a></td>
				<td><%=a.getIndirizzo()%></td>
				<td><%=a.getTelefono()%></td>
			</tr>
			<%
				}
			%>


		</table>
	</div>


</body>
</html>