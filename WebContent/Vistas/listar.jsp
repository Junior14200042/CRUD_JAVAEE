<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css" crossorigin="anonymous">
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
	
	<div class="container">
		<h1>BIENVENIDO AL HOLA MUNDO JSP AND SERVLET</h1>
	
		<table class="table">
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
	</div>

	
<script src="js/bootstrap.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
<script src="js/popper.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
</body>
</html>