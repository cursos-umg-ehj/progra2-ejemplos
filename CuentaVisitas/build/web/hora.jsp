<%-- 
    Document   : hora
    Created on : 25/09/2015, 12:24:49 AM
    Author     : enrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

// para hacer los imports de las librerias java se hace así
<%@page import="java.time.LocalDateTime"%>
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>La hora</title>
    </head>
    <body>
        <%-- Esto es un comentario, aqui solo obtengo la hora --%>
        <h1>La hora es: <%=LocalDateTime.now()%></h1>
    </body>
</html>
