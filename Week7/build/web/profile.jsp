<%-- 
    Document   : profile
    Created on : 11/03/2017, 06:01:41 PM
    Author     : Andrea
--%>
<% if(session.getAttribute("username")== null){
    response.sendRedirect("login.jsp");
}

Cookie[] cookies = request.getCookies();
String value="";
for(int i = 0; i<cookies.length; i++){ 
    String name =cookies[i].getName();
  if(name.equals("color")) { 
   value = cookies[i].getValue();
  }
}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesión valido</title>
    </head>
    <body style="background-color: <%=value%>">
          
        <form action="ProfileController"> 
        <h1>Bienvenido,<%= request.getAttribute("username") %> </h1>
        <%= request.getAttribute("name") %>
        <%= request.getAttribute("lastName") %>
        
        <h2>Color:</h2><select  name="color" > 
            <option value="">Seleccionar</option>
            <option value="blue">Blue</option>
            <option value="red">Red</option>
            <option value="green">Green</option>
        </select>
        
            
        <input type="submit" value="Guardar"/>
        
        <br>
        <a href="LongoutController" onClick="document.form.submit();">Cerrar Sesión</a>
        </form>
    </body>
</html>
