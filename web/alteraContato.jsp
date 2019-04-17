<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<label>Alterar dados do contato</label>
<form method="POST" action="mvc?logica=AlteraContato">
    <input type="text"class="form-control"  name="str"  placeholder="Digite o nome" required/><br>
    <input class="btn btn-primary" type="submit" value="Buscar"/>
</form>
<c:if test="${noUser}">
    <div class="alert alert-info">
        <strong>Nenhum Contato!</strong> Esse contato não existe.
    </div>
</c:if>
<form method="POST" action="mvc?logica=AlteraContatoAux">
<c:if test="${not empty contatoAux}">
    <table  class="table table-dark table-striped">
        <thead>
            <tr>
                <th>Nome</th>
                 <th><input type="text" class="form-control"  name="str_nome"  placeholder="${contatoAux.nome}" /></th>
            </tr><tr>
                <th>Email</th> 
                <th><input type="text"class="form-control"  name="str_email"  placeholder="${contatoAux.email}" /></th>
            </tr><tr>
                <th>Endereço</th>
                <th><input type="text"class="form-control"  name="str_end"  placeholder="${contatoAux.endereco}" /></th>
            </tr><tr>
                <th>Nascimento</th>
                <th><input type="text"class="form-control"  name="str_nasc"  placeholder="${contatoAux.nascimento}" /></th>
            </tr><tr>    
                <th>Telefone</th>
                                <th><input type="text"class="form-control"  name="str_tel"  placeholder="${contatoAux.telefone}" /></th>
            </tr>
        <thead>
    </table>
    <input class="btn btn-primary" type="submit" value="Salvar"/>
</c:if>
    
    </form>

