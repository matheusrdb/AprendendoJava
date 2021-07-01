<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
 
<!--  LINKS -->
<c:url value="/dataReceiver" var="dataReceiverServlet">
	<c:param name="empresaId" value="${empresaId}"></c:param>
</c:url>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar empresa</title>
</head>
<body>
	
	<h2>Alteração de dados</h2>
	
	<form action="${dataReceiverServlet}" method="post">
		
		Nome:<input type="text" name="paramNewName" />
		CNPJ:<input type="text" name="paramNewCnpj" />
		<input type="submit" value="Alterar" />
		
	</form>
	
</body>
</html>