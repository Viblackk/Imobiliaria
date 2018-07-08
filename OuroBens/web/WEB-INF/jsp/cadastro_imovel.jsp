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
        <link href="<c:url value="../assets/css/estilo.css"/>" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Tela de cadastro</h1>
        <form name="cadastro_imovel" action="olaMundo" method="POST" enctype="multipart/form-data">
            <div>
                Nome:
                <input type="text" name="nomeImovel" id="nomeImovel" required="">
            </div>
            <div>
                Descrição:
                <input type="text" name="descricaoImovel" id="descricaoImovel" required="">
            </div>
            <div>
                Preço:
                <input type="text" name="precoImovel" id="precoImovel" required="">
            </div>
            <div>
                Endereço:
                <input type="text" name="enderecoImovel" id="enderecoImovel" required="">
            </div>
            <div>
                Fotos da residência:
                <input type="file" name="caminhoImagemImovel" id="caminhoImagemImovel" required="">
            </div>
            <div>
                <input type="submit" id="btn_enviar" value="Cadastrar" required="">
            </div>
        </form>
    </body>
</html>
