<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<label>Deletar Usuario</label>
<form method="POST" action="mvc?logica=DeletarContato">
    <input type="text" class="form-control" name="str" placeholder="Nome do usuario" required/><br>
    <input type="submit" class="btn btn-primary"/>
</form>
<br>
<c:if test="${deletado}">
    <div class="alert alert-success">
  <strong>Successo!</strong> O usuário foi deletado com sucesso.
</div>
</c:if>
<c:if test="${noUser}">
    <div class="alert alert-danger">
  <strong>Erro!</strong> Esse usuário não existe.
</div>
</c:if>
