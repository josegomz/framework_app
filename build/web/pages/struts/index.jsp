<%-- 
    Document   : index
    Created on : 9/12/2019, 01:13:20 PM
    Author     : labtw13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Framework Struts</title>
        <link rel="stylesheet" href="./resources/css/bootstrap.min.css">
        <script type="text/javascript" src="./resources/js/jquery-3.3.1.min.js"></script>
        <script  type="text/javascript" src="./resources/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="page header">
            <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="navbar-brand" href="#">Frameworks </a>
                    </li>
                    <li class="nav-item">
                        <s:a action="actionCrearFramework">
                            <a class="navbar-link" href="actionCrearFramework">Crear </a>
                        </s:a>
                    </li>
                    <li class="nav-item">
                        <s:a action="actionMostrarFramework">
                            <a class="navbar-link" href="actionMostrarFramework">Mostrar </a>
                        </s:a>
                    </li>
                    <li class="nav-item">
                        <s:a action="actionAyudaFramework">
                            <a class="navbar-link" href="actionAyudaFramework">Ayuda </a>
                        </s:a>
                    </li>
                    
                </ul>
            </nav>
        </div>
        <h1>Framework Struts!</h1>
    </body>
</html>
