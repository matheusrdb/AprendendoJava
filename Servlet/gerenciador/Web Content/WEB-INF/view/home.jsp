<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- LINKS -->
<c:url value="/entrada" var="entrada" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gerenciador</title>
</head>
<body>
	<div>
		<h1>Home Page</h1>
		<form action="${entrada}" method="post">
			<b><a href="${entrada}?action=ListarEmpresas">Lista de Empresas</a></b> <b><a
				href="${entrada}?action=FormCadastro">Cadastrar Empresa</a></b>
		</form>
	</div>
</body>
</html>