<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp</title>
</head>
<body>

    <% double num1 = Double.parseDouble(request.getParameter("Valor1"));
       double num2 = Double.parseDouble(request.getParameter("Valor2"));
       String operacao = request.getParameter("operacao");
       double resultado = 0;

       if (operacao.equals("+")) {
           resultado = num1 + num2;
       } else if (operacao.equals("-")) {
           resultado = num1 - num2;
       } else if (operacao.equals("*")) {
           resultado = num1 * num2;
       } else if (operacao.equals("/")) {
           resultado = num1 / num2;
       }%>
    
    <% if (request.getParameter("Valor1") == null || request.getParameter("Valor2") == null) {%>
    	<p>Calculadora vazia</p>
    <% } else { %>
    	<p> O resultado é: <%= resultado %></p>
    <% }%>
      
    <a href="calculadora.html">Limpar</a>

</body>
</html>
