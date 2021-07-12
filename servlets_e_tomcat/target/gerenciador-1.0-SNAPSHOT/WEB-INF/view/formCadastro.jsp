<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- LINKS -->
<c:url value="" var="entrada">
    <c:param name="action" value="CadastrarEmpresa"/>
</c:url>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulário de Inscrição de Empresa</title>
</head>
<body>
<form action="${entrada}" method="post">

    Nome: <input type="text" name="nomeEmpresa"/> <br>
    CNPJ: <input type="text" name="cnpj"/> <br>
    Data: <input type="text" name="date"/> <br>
    <br>
    <input type="submit" value="Registrar"/>

</form>
</body>
</html>