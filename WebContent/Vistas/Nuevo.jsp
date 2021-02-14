<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Agregar Nuevo elemento</h1>
	
	<form action="ControllerPersona" method="post">
		<input type="hidden" name="opcion" value="guardar">
		Nombre:
		<input type="text" name="nombre" placeholder="Ingrese su Nombre"><br>
		Correo:
		<input type="text" name="correo" placeholder="example@hotmail.com"><br>
		<input type="submit" name="guardar" value="Guardar">
	
	</form>
	
</body>
</html>