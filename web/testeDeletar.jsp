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
            Boolean deletado = (Boolean)request.getAttribute("deletado");
            if (deletado) {
                out.println("Contato deletado da sua agenda!");
            } else {
                out.println("Contato não pode ser deletado da sua agenda!");
            }
        %>
    </body>
</html>
