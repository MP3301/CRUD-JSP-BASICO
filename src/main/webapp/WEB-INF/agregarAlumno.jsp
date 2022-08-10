
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar alumno</title>
    </head>
    <body>
        <h1>Agregar alumno</h1>
        <form action="${pageContext.request.contextPath}/ServletAgregar" method="post">
            Nombre: <input type="text" name="nombre"> </input>
            <br/>
            Apellido: <input type="text" name="apellido"> </input>
            <br/>
            <br/>
            <br/>
            <br/>
            Datos domicilio:
            <br/>
            Calle: <input type="text" name="calle"> </input>
            
            <br/>
            No Calle: <input type="text" name="noCalle"> </input>
            <br/>
            Pais: <input type="text" name="pais"> </input>
            
            <br/>
            <br/>
            Datos de contacto:
            
            <br/>
            <br/>
            <br/>
            Email <input type="email" name="email"> </input>
            
            <br/>
            Telefono: <input type="tel" name="telefono"> </input>
            
            <input type="submit" name="Agregar" value="Agregar"> </input>
        </form>
    </body>
</html>
