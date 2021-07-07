<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.List, br.com.gerenciador.modelo.Empresa"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Empresas</title>
</head>
<body>
	<!-- Link para voltar a página de início -->
	<c:url value="/entrada" var="home">
		<c:param name="action" value="Home"/>
	</c:url>
	<h1>
		<a href="${home}">Home</a>
	</h1>
	____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
	<!-- Se um cadastro for removido msg=true -->
	<c:if test="${msg}">
		<h2>Cadastro excluído com sucesso!</h2>
	</c:if>
	<!-- 	Esse if serve para garantir que o texto somente seja exibido se houver um cadastro novo/alterado ou uma exclusão de cadastro -->
	<c:if test="${not empty empresa.nome and not empty empresa.cnpj}">
		<!-- 		Os dois ifs abaixo alteram o texto que é mostrado  -->
		<c:if test="${edited}">
			<h2>Informações alteradas!</h2>
		</c:if>
		<c:if test="${!edited}">
			<h2>Empresa cadastrada com sucesso!</h2>
		</c:if>
		<h4>Informações da Empresa:</h4>
		<p>Nome: ${empresa.nome}</p>
		<p>CNPJ: ${empresa.cnpj}</p>
		<p>
			Data de Abertura:
			<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />
		</p>
	</c:if>

	<h4>Lista de empresas</h4>

	<ul>
		<!-- 	Itera sobre listaEmpresa que foi passada como parâmetro em listarEmpresasServlet para mostrar uma lista de todas as empresas cadastradas -->
		<c:forEach items="${listaEmpresa}" var="empresa">
			<!-- FORMATAÇÕES -->
			<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"
				var="dataAberturaFMT" />
			<!-- LINKS -->
			<c:url value="/entrada" var="editEmpresa">
				<c:param name="empresaId" value="${empresa.id}" />
				<c:param name="action" value="FormEdit" />
			</c:url>
			<c:url value="/entrada" var="removeEmpresa">
				<c:param name="empresaId" value="${empresa.id}" />
				<c:param name="action" value="RemoveEmpresas" />
			</c:url>
			<!-- Mostra informações de cada empresa da iteração -->
			<li><b>Nome: </b>${empresa.nome} - <b>Data de Abertura: </b>${dataAberturaFMT}
				<b>ID:</b> ${empresa.id} <a href="${editEmpresa}">Editar</a> <a
				href="${removeEmpresa}">Remover</a> <br> <br></li>
		</c:forEach>
	</ul>
	<!-- Link para a página de cadastro -->
	<c:url value="/entrada" var="formularioCadastro">
		<c:param name="action" value="FormCadastro" />
	</c:url>
	<h4>
		<a href="${formularioCadastro}">Cadastrar uma nova empresa</a>
	</h4>
</body>
</html>
