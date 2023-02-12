<!-- Para cabeceras necesarias para el uso de c: -->
<%@ include file="/cabeceras.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RESULTADO:</title>
</head>
<body>
<!-- Resultados recogidos en los formularios. -->
	<p>LISTA DE USUARIOS:</p>
	<br>
	<c:forEach items="${miModelo.listaUsuarios}" var="usuario">
		<p>Nombre: </p><c:out value="${usuario}"/>
	</c:forEach>
	<p>${miModelo.mensaje }</p>
	
	<br><br>
	<input type="button" onclick="history.back()" name="volver" value="volver">
</body>
</html>