<%@page import="com.javarevolutions.jsps.servlets.vo.VOLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p style = "font-weight: bolt; font-size: 20px; ">
BIENVENIDO A MI PRIMER PROGRAMA: <%=((VOLogin) session.getAttribute("usuariologeado")).getNombre() %>
</p>

<a href="usuarios/usuarios.jsp">Administracion de usuarios</a>


</body>
</html>