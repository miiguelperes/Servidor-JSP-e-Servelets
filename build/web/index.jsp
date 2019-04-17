

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Contatos</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
         <link href="css/animate.css" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <nav class="center navbar navbar-default navbar-fixed-top">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="mvc?logica=ListarTodos">Contatos</a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                            <li role="user" class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                                    Operações <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu">
                                    <li><a href='mvc?logica=AddContato'>Adicionar novo</a></li>
                                    <li><a href='mvc?logica=BuscaContato'>Buscar Contato</a></li>
                                    <li><a href='mvc?logica=selectLike'>Busca Seletiva</a></li>
                                    <li><a href='mvc?logica=AlteraContato'>Alterar Contato</a></li>
                                    <li><a href='mvc?logica=DeletarContato'>Deletar Contato</a></li>
                                    
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <br><br> <!-- gambiarra ajuste -->
            <br><br>
            <div class="col-md-offset-2 col-md-8 col-md-offset-2">
                <div class="container-fluid">
                    
                    <c:if test="${not empty pagina}">
                        
                        <jsp:include page="${pagina}" />
                        
                    </c:if>
                    <c:if test="${empty pagina}">
                        <h3>Bem vindo a sua agenda!!!</h3>
                    </c:if>,
                    
                </div>
            </div>

            <footer class="navbar navbar-fixed-bottom">
                <div class="text-center copyright"><br>
                    <span>Copyright© AMMS 2017-2018</span>
                </div>
            </footer>

        </div>

        <script src="https://code.jquery.com/jquery.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.5/validator.min.js"></script>
    </body>
</html>
