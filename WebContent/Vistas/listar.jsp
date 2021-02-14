<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>BIENVENIDO AL HOLA MUNDO JSP AND SERVLET</h1>
	
	<table>
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Correo</th>
		</tr>
		<c:forEach var="persona" items="${person}">
		<tr>
			<td><c:out value="${persona.idPersona}"></c:out></td>
			<td><c:out value="${persona.nombre}"></c:out></td>
			<td><c:out value="${persona.correo}"></c:out></td>
			<td><a href="ControllerPersona?action=editar&id=<c:out value='${persona.idPersona}'></c:out>">Editar</a></td>
			<td><a href="ControllerPersona?action=eliminar&id=<c:out value='${persona.idPersona}'></c:out>">Eliminar</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>