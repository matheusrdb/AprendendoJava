<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List, br.com.gerenciador.servlet.Empresa" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt"%>

<c:url value="/formNovaEmpresa.jsp" var="formNovaEmpresaLink">
	<c:param name=""/>
</c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Empresas</title>
</head>
<body>
	
	<c:if test="${not empty nomeEmpresa and not empty cnpj }">
	
		<c:if test="${edited}">
			<h2>Informações alteradas!</h2>
		</c:if>
		<h2>Empresa cadastrada com sucesso!</h2>
		<h4>Informações da Empresa:</h4>
		<p>Nome: ${nomeEmpresa}</p>
		<p>CNPJ: ${cnpj}</p>
		<p>Data de Abertura:<fmt:formatDate value="${dataAbertura}" pattern="dd/MM/yyyy"/></p>
	
	</c:if>
	
	<h4>Lista de empresas</h4>
	
	<ul>
		<c:forEach items="${listaEmpresa}" var="empresa">
		
			<!-- FORMATAÇÕES -->
			<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" var="dataAberturaFMT"/>
			
			<!-- LINKS -->
			<c:url value="/editEmpresa" var="editEmpresaServlet" >
				<c:param name="empresaId" value="${empresa.id}" />
			</c:url>
			
			<c:url value="/editEmpresa" var="deleteEmpresa">
				<c:param name="empresaId" value="${empresa.id}" />
				<c:param name="willDelete" value="true" />
			</c:url>
			
			<br>
			<li>
							
				<b>Nome: </b>${empresa.nome}	
				<b>Data de Abertura: </b>${dataAberturaFMT} <a href="${editEmpresaServlet}">Editar</a> <a href="${deleteEmpresa}">Remover</a>
			
			</li>
			
		</c:forEach>
	</ul>
	
	
	<h4><a href="/gerenciador/formNovaEmpresa.jsp">Cadastrar uma nova empresa</a></h4>
	
</body>
</html>	