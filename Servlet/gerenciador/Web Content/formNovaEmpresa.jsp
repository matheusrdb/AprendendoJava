<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!-- LINKS -->
<c:url value="/novaEmpresa" var="novaEmpresaServletLink"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de Inscrição de Empresa</title>
</head>
<body>
	<form action="${novaEmpresaServletLink}" method="post">
	
		Nome: <input type="text" name="nomeEmpresa"/> <br>
		CNPJ: <input type="text" name="cnpj"/> <br>
		Data: <input type="text" name="date" /> <br>
		<br>
		<input type="submit"/>
		
	</form>
</body>
</html>