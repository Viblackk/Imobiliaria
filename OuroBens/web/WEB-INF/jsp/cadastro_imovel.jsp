<%-- 
    Document   : cadastro_ourobens
    Created on : 05/07/2018, 18:49:48
    Author     : Genocide
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de imovél</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <h1 class="text-center my-5">Tela de cadastro</h1>
        <div class="container col-md-6">
            <form name="cadastro_imovel" action="olaMundo" method="POST">
                <div class="form-group">
                    Nome:
                    <input type="text" name="nomeImovel" id="nomeImovel" required="" class="form-control">
                </div>
                <div class="form-group">
                    Descrição:
                    <input type="text" name="descricaoImovel" id="descricaoImovel" required="" class="form-control">
                </div>
                <div class="form-group">
                    Preço:
                    <input type="text" name="precoImovel" id="precoImovel" required="" class="form-control">
                </div>
                <div class="form-group">
                    Endereço:
                    <input type="text" name="enderecoImovel" id="enderecoImovel" required="" class="form-control">
                </div>
                <div class="form-group">
                    <input type="submit" id="btn_enviar" value="Cadastrar" class="btn btn-primary">
                </div>
                <div class="alert alert-sucess" role="alert">
                    Imovel cadastrado com sucesso, Sr. ${retorno}
                </div>
            </form>
        </div>
    </body>
</html>
