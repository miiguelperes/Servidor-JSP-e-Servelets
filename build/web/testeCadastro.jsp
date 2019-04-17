
<%@page import="com.code.model.Contato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Contato contato = (Contato)request.getAttribute("contato");
            if (contato == null) {
                out.println("Ocorreu um erro no cadastro!");
            } else {
                out.println("Usuario " + contato.getNome() + " cadastrado com sucesso!<br>");
            }
        %>
    </body>
</html>
