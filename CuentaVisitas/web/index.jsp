<%-- 
    Document   : index
    Created on : 25/09/2015, 12:12:08 AM
    Author     : enrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.apache.tomcat.util.http.ServerCookies"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contador de Cookies</title>
    </head>
    <body>
        <% 
            int contador=0;
            Cookie[] cookie = request.getCookies();
            //Verificamos si la cookie de contadorVisitas ya fue creada
            if(cookie!=null){
                for(Cookie c :cookie){
                    if(c.getName().equals("contadorVisitas")){
                    //Obtenemos el valor de la cookie en caso de que si se aya creado
                        contador=Integer.parseInt(c.getValue());


                    }

                }
            }
            //Incrementamos el contador
            contador++;
            //Creamos la cookie y le agregamos el tiempo y el valor que tendra
            Cookie con= new Cookie("contadorVisitas",Integer.toString(contador));
            // expira en una hora
            con.setMaxAge(1*60*60); 
            //Agregamos la cookie
            response.addCookie(con);            
        %>

        <h1>Contador de Visitas: <%=contador %></h1>
    </body>
</html>
