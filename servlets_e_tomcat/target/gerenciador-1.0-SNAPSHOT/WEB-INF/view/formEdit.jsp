<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- LINKS -->
<c:url value="" var="entrada">
    <c:param name="action" value="EditEmpresa"/>
</c:url>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar empresa</title>
</head>
<body>

<h2>Alteração de dados</h2>

<form action="${entrada}" method="post">

    Nome:<input type="text" value="${empresa.nome}" name="paramNewName"/>
    CNPJ:<input type="text" value="${empresa.cnpj}" name="paramNewCnpj"/>
    ID: ${empresa.id}
    <input type="hidden" value="${empresa.id}" name="empresaId"/>
    <input type="submit" value="Alterar"/>

</form>

</body>
</html>