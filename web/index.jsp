<%-- 
    Document   : index
    Created on : 03/07/2017, 17:59:05
    Author     : gabri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="logstash_converter.PrimeUpLogstashConverterMain" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            PrimeUpLogstashConverterMain main = new PrimeUpLogstashConverterMain();
            out.print(main.execute());
            %></h1>
    </body>
</html>
