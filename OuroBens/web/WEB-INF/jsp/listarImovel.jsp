<%-- 
    Document   : listarImovel
    Created on : 09/07/2018, 04:06:09
    Author     : Genocide
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de imoveis</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <table class="table">
                <thead>
                    <tr>
                        <th>Nome Imovel</th>
                        <th>Descrição Imovel</th>
                        <th>Preço Imovel</th>
                        <th>Endereço Imovel</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${lista}" var="atributo">
                        
                        <tr>
                            <td>${atributo.nomeImovel}</td>
                            <td>${atributo.descricaoImovel}</td>
                            <td>${atributo.precoImovel}</td>
                            <td>${atributo.enderecoImovel}</td>
                        </tr>
                        
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
