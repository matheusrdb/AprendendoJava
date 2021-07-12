<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- LINKS -->
<c:url value="" var="entrada"/>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gerenciador</title>
</head>
<body>
<div>
    <strong style="font-style: inherit;">Logged as:</strong>
    <cite>${loggedUser.login}</cite> <cite><c:import url="logout-parcial.jsp"/></cite>
    <h1>Home Page</h1>
    <form action="${entrada}" method="post">
        <b><a href="${entrada}?action=ListarEmpresas">Lista de Empresas</a></b>
        <b><a href="${entrada}?action=FormCadastro">Cadastrar Empresa</a></b> <br>
        <div>
            <b>Export lista de empresas</b>
            <b>Formats:</b>
            <cite><a href="${entrada}?action=ExportListEmpresas&Accept=json">JSON, </a></cite>
            <cite><a href="${entrada}?action=ExportListEmpresas&Accept=xml">XML</a></cite>
        </div>
    </form>
</div>
</body>
</html>