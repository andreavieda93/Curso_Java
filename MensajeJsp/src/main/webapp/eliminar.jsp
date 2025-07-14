<%-- 
    Document   : eliminar
    Created on : 8/07/2025, 4:24:29 p. m.
    Author     : eliana.londono
--%>
<%@page import="com.oregoom.mensajejsp.MensajeDao"%>
<%@page import="com.oregoom.mensajejsp.Mensaje"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id =request.getParameter("id");
            Mensaje mensaje = new Mensaje(Integer.valueOf(id));
            MensajeDao mensajeDao = new MensajeDao();
            mensajeDao.Eliminar(mensaje);
            request.getRequestDispatcher("Index.jsp").forward(request,response);
        %>
    </body>
</html>
