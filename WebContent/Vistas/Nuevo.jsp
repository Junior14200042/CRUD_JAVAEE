<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div class="container">
		<h1>Agregar Nuevo elemento</h1>
		
		<form action="ControllerPersona" method="post">
			<input type="hidden" name="opcion" value="guardar">
			
			<label class="form-label">Nombre:</label>
	 		<input type="text" class="form-control" name="nombre" placeholder="Ingrese su Nombre"><br>
			<label class="form-label">Correo</label>
			<input type="text" class="form-control" name="correo" placeholder="example@hotmail.com"><br>
			<input type="submit" class="btn btn-primary" name="guardar" value="Guardar">
		</form>
	</div>
	
	
	
	
	<script src="js/bootstrap.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
<script src="js/popper.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
</body>
</html>