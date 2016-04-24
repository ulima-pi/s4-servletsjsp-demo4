<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String usuario = request.getAttribute("usuario").toString();
String metodo = request.getAttribute("metodo").toString();
%>
<html>
<body>
<h1>Login exitoso del usuario <% out.print(usuario); %></h1>
<div>Petición de tipo <% out.print(metodo); %></div>
</body>
</html>