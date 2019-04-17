<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<label>Busca Contato</label>
<form method="POST" action="mvc?logica=BuscaContato">
    <input type="text"class="form-control"  name="str"  placeholder="Digite o nome" required/><br>
    <input class="btn btn-primary" type="submit"/>
</form>
<c:if test="${noUser}">
    <div class="alert alert-info">
        <strong>Nenhum Contato!</strong> Esse contato não existe.
    </div>
</c:if>
<c:if test="${not empty contatoAux}">
    
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
        <tbody>       
            <tr>
                <th>${contatoAux.nome}</th>
                <th>
                    <c:if test="${not empty contatoAux.email}">
                        <a href="mailto:${contatoAux.email}">${contatoAux.email}</a>
                    </c:if>
                </th>
                <th>${contatoAux.endereco}</th>
                <th>${contatoAux.nascimento}</th>
                <th>${contatoAux.telefone}</th>
            </tr>          
        </tbody>
    </table>
</c:if>

