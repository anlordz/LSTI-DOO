<%-- 
    Document   : login
    Created on : 11/03/2017, 06:00:33 PM
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
        <h1>Bienvendio</h1>
        <form action="LoginController" method="post">  
            <label>Nombre:</label>
            <input type="text" name="name"><br>
            <label>Apellidos:</label>
            <input type="text" name="lastName"><br>
            <label>Usuario:</label>
            <input type="text" name="txt-username"><br>  
            <label>Contraseña:</label>
            <input type="password" name="txt-password"><br>  
            <input type="submit" value="Iniciar Sesión">  
        </form>  
    </body>
</html>
