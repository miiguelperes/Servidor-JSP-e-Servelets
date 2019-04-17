<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<label>Adicionar Contato</label><br>

<form method="POST" data-toggle="validator"  action="mvc?logica=AddContato">
    <input type="text" name="str_nome" class="form-control" placeholder="Nome" required/><br>
    <input type="text" name="str_email" class="form-control" placeholder="Email" required/><br>
    <input type="text" name="str_tel" class="form-control" placeholder="Telefone" required/><br>
    <input type="text" name="str_nasc" class="form-control" placeholder="Nascimento" required/><br>
    <input type="text" name="str_end" class="form-control" placeholder="Endereço" required/><br>
    <input type="submit" class="btn btn-primary"/>
    <input type="button" class="btn btn-primary" value="Voltar" onClick="history.go(-1)">
</form>


<c:if test="$_GET['submitted']">
    
<div class="alert alert-success" role="alert">
  Contato cadastrado com sucesso
</div>
</c:if>
