<%@page import="com.code.model.Contato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <%
            Contato contato = (Contato) request.getAttribute("contato");
            String frase = (String) request.getAttribute("frase");
        %>

        <form method="POST" action="Controller">
            <input type="text" name="id" placeholder="Id" value="<%=contato.getId()%>" readonly="true"/><br>
            <input type="text" name="nome" placeholder="Nome" value="<%=contato.getNome()%>"/><br>
            <input type="text" name="telefone" placeholder="Telefone" value="<%=contato.getTelefone()%>"/><br>
            <input type="text" name="email" placeholder="E-mail" value="<%=contato.getEmail()%>"/><br>
            <input type="text" name="nascimento" placeholder="Nascimento" value="<%=contato.getNascimento()%>"/><br>
            <input type="text" name="endereco" placeholder="Endereço" value="<%=contato.getEndereco()%>"/><br>
            <input type="submit"/>
        </form>

        <%
            if (frase != null) {
                out.print(frase);
            }
        %>
    </body>
</html>
