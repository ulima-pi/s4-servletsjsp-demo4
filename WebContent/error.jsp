<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String metodo = request.getAttribute("metodo").toString();
%>
<html>
<body>
<h1>Error en el login </h1>
<div>Petición de tipo <% out.print(metodo); %></div>
</body>
</html>