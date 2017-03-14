<%-- 
    Document   : login
    Created on : 11/03/2017, 06:00:33 PM
    Author     : Andrea
--%>
<%  String username = "";
    if(session.getAttribute("username") != null)
    response.sendRedirect("profile.jsp");
%>
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
            <label>Usuario:</label>
            <input type="text" name="username" />
            <br>
            <label>Password:</label>
            <input type="password" name="password"/>
            
            <br>
            <input type="submit" value="Iniciar Sesión" name="submit"/>

        </form>  
    </body>
</html>
