<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<label>Busca seletiva</label>
<form method="POST" action="mvc?logica=selectLike">
    <input type="text" class="form-control" name="str" maxlength="3" placeholder="Digite 3 Caracteres" required/><br>
    <input type="submit" class="btn btn-primary"/>
</form>
    
<c:if test="${noUser}">
    <div class="alert alert-info">
        <strong>Nenhum Contato!</strong> Nenhum contato foi encontrado.
    </div>
</c:if>
<c:if test="${not empty contatos}">
    <br>
    <label>Contatos encontrados:</label><br>
    <table  class="table table-dark table-striped">
        <thead>
            <tr>
                <th>Nome</th>
                <th>Email</th> 
                <th>Endereço</th>
                <th>Nascimento</th>
            </tr>
        <thead>
        <tbody>
            <c:forEach var="contato" items="${contatos}">
                <tr>
                    <th>${contato.nome}</th>
                    <th>
                        <c:if test="${not empty contato.email}">
                            <a href="mailto:${contato.email}">${contato.email}</a>
                        </c:if>
                    </th>
                    <th>${contato.endereco}</th>
                    <th>${contato.nascimento}</th>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>
