 <%-- 
    Document   : login
    Created on : 19/02/2017, 12:13:30 PM
    Author     : Andrea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión</title>
    </head>
    <body>
        <h1>Bienvedido</h1>
        <form action="LoginController" method="post">  
            <label>Usuario:</label>
            <input type="text" name="txt-username"><br>  
            <label>Contraseña:</label>
            <input type="password" name="txt-password"><br>  
            <input type="submit" value="Iniciar Sesión">  
        </form>  
    </body>
</html>
