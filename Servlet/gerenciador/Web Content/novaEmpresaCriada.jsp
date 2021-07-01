<%@page import="br.com.gerenciador.servlet.ListarEmpresasServlet"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- LINKS -->
<c:url value="/listarEmpresas" var="listarEmpresasServletLink"/>

<!-- FORMATAÇÕES -->
<fmt:formatDate value="${dataAbertura}" pattern="dd/MM/yyyy" var="dataAberturaFMT"/>

<html>
<meta CHARSET = UTF-8>
<title>Empresa cadastrada!</title>
<body>
	<c:if test="${not empty nomeEmpresa and not empty cnpj }">
	
		<h2>Empresa cadastrada com sucesso!</h2>
		<h4>Informações da Empresa:</h4>
		<p>Nome: ${nomeEmpresa}</p>
		<p>CNPJ: ${cnpj}</p>
		<p>Data de Abertura: ${dataAbertura}</p>
	
	</c:if>
	
	<c:if test="${empty nomeEmpresa or empty cnpj}">
	
		<h2>Cnpj ou nome inválidos!</h2>
	
	</c:if>
	
	<form action="${listarEmpresasServletLink}" method="post">
	
		<button name="action">Listar Empresas</button>
	
	</form>

</body>
</html>