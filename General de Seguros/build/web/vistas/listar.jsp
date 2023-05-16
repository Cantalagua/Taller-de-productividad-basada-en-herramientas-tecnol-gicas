<%-- 
    Document   : listar
    Created on : May 12, 2023, 1:29:19 AM
    Author     : Alexis Murillo
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Persona"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1> General de Seguros </h1>
            <h2>Clientes registrados</h2>
            <a href="Controlador?accion=add">Registrar cliente nuevo</a>
<table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">Numero</th>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Email</th>
                        <th class="text-center">Tipo</th>
                        <th class="text-center">Suma</th>
                        <th class="text-center">Inicio</th>
                        
                    </tr>
                </thead>
                <%
                    PersonaDAO dao=new PersonaDAO();
                    List<Persona>list=dao.listar();
                    Iterator<Persona>iter=list.iterator();
                    Persona per=null;
                    while(iter.hasNext()){
                        per=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= per.getNumero()%></td>
                        <td class="text-center"><%= per.getNombre()%></td>
                        <td class="text-center"><%= per.getEmail()%></td>
                        <td class="text-center"><%= per.getPoliza()%></td>
                        <td class="text-center"><%= per.getSuma()%></td>
                        <td class="text-center"><%= per.getFecha()%></td>
                        <td class="text-center">
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>


        </div>
    </body>
</html>
