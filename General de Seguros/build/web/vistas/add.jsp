<%-- 
    Document   : agregar
    Created on : May 12, 2023, 1:29:28 AM
    Author     : Alexis Murillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <h1> General de Seguros </h1>
                <h2>Registrar cliente</h2>
                <form action="Controlador">
                    Número del cliente:<br>
                    <input class="form-control" type="text" name="txtNum"><br>
                    Nombre del cliente: <br>
                    <input class="form-control" type="text" name="txtNom"><br>
                    Correo electrónico: <br>
                    <input class="form-control" type="text" name="txtEmail" min="100" max="250"><br>
                    Tipo de póliza: <br>
                    <input class="form-control" type="text" name="txtPoliza"><br>
                    Suma asegurada: <br>
                    <input class="form-control" type="text" name="txtSuma"><br>
                    Fecha de inicio de la poliza: <br>
                    <input class="form-control" type="text" name="txtFecha"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
