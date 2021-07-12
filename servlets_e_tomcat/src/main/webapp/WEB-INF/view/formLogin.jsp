<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- LINKS -->
<c:url value="/" var="entrada"/>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Autenticação</title>
</head>
<body>

<h2>Autenticação</h2>

<c:if test="${loginInvalido}">
    <h4>LOGIN OU SENHA INVÁLIDO</h4>
</c:if>

<form action="${entrada}" method="post">

    Login:<input type="text" name="login"/>
    Senha:<input type="password" name="password"/>

    <input type="hidden" name="action" value="Login"/>
    <input type="submit" value="Login"/>

</form>

</body>
</html>