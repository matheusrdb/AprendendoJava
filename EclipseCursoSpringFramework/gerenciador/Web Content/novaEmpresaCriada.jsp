<% 
//SCRITPLET
String nomeEmpresa = "Alura";
System.out.println(nomeEmpresa);
%>

<html>
<meta CHARSET = UTF-8>
<title>Empresa cadastrada!</title>
<body>

<!-- FORMA 1 -->
<center><h2>Empresa <% out.println(nomeEmpresa); %> cadastrada com sucesso!</h2></center>
<!-- FORMA 2 -->
<center><h2>Empresa <%= nomeEmpresa %> cadastrada com sucesso!</h2></center>

</body>
</html>