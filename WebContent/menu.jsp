<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ page import="java.util.ArrayList"
	import="com.ristorante.interfacesDAO.impl.MenuDAOimpl"
	import="com.ristorante.model.MenuModel"%>

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
		<h2>Lista Menu</h2>
		<table>
			<tr>
				<td class="grassetto">Descrizione</td>
				<td class="grassetto">prezzo</td>
			</tr>
			<%
				ArrayList<MenuModel> l = (ArrayList<MenuModel>) session.getAttribute("listaMenu");
			%>

			<%
				for (MenuModel a : l) {
			%>

			<tr>
				<td><a href="piattoController?id=<%=a.getIdMenu()%>"> <%=a.getDescrizione()%></a></td>
				<td><%=a.getPrezzo()%> EURO</td>
				<%
					}
				%>
			
		</table>
	</div>


</body>
</html>