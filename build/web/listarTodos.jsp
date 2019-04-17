<%@page import="java.util.List"%>
<%@page import="com.code.model.Contato"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <label>Aqui está sua lista de contatos</label><br>
    <table  class="table table-dark table-striped">

        <thead>
            <tr>
                <th>Nome</th>
                <th>Email</th> 
                <th>Endereço</th>
                <th>Nascimento</th>
                <th>Telefone</th>
            </tr>
        <thead>
<c:forEach var="contato" items="${contatos}">
        <tbody>      
                <tr>
                    <th>${contato.nome}</th>
                    <th>
                        <c:if test="${not empty contato.email}">
                            <a href="mailto:${contato.email}">${contato.email}</a>
                        </c:if>
                    </th>
                    <th>${contato.endereco}</th>
                    <th>${contato.nascimento}</th>
                    <th>${contato.telefone}</th>
                </tr>
            </c:forEach>
               
        </tbody>
    </table>
         <c:if test="${empty contatos}">
                     <div class="alert alert-info">
                        <strong>Nenhum Contato!</strong> Você não tem nenhum contato cadastrado.
                    </div>
        </c:if>
    </body>
</html>
