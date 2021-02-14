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

	<h1>Editar elemento:</h1>
	
	<form action="ControllerPersona" method="post">
	<c:set var="persona" value="${per}"></c:set>
		<input type="hidden" name="opcion" value="actualizar">
		<input type="hidden" name="id" value="${persona.idPersona}">
		Nombre:
		<input type="text" name="nombre" placeholder="Ingrese su Nombre" value="${persona.nombre}"><br>
		Correo:
		<input type="text" name="correo" placeholder="example@hotmail.com" value="${persona.correo}"><br>
		<input type="submit" name="guardar" value="Guardar">
	
	</form>
</body>
</html>