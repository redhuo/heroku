<%-- 
    Document   : index
    Created on : Nov 18, 2014, 10:58:16 AM
    Author     : CTPO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Inicio StudentSocialNetwork</title>
        <link rel="styleheet" type="text/css" href="style.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    </head>
    <body>
        
        <h2 align="center"> Registrate</h2>

        <form  action="mostrarDatos" method=get>
            
                <TABLE>
                    <colgroup span=4><col /></colgroup>
                    <TR>
                        <TD>Nombre:</TD>
                        <TD> <input type="text" name="nombre" size=18 maxlength=18> Apellido:
                            <INPUT type="text" name="apellido" size=18 maxlength=18> 
                        </TD>

                    <TR>
                        <TD>Correo Electrónico:</TD>
                        <TD> <input type="text" name="correo" size=34 maxlength=34>
                            Edad: <input type="text" name="edad" size=6 maxlength=6></TD>

                    <TR>
                        <TD>Télefono:  </TD>
                        <TD> <INPUT type="text" name="provincia" size=10 maxlength=10> Año de Carrera: 
                            <INPUT type="text" name="telefono" size=10 maxlength=10></TD>
                    <TR>
                        <TD>Dirección</TD>
                        <TD> <textarea name="direccion" rows=2 cols=53></textarea></TD>

                    <tr>
                        <td>Elige tu foto de perfil: </td> 
                        <td><input name="uploadedfile" type="file" /></td>

                    <tr>
                        <td></td>
                        <td align="center">
                            <input type="submit" value="Registrarse">
                            <input type="reset" value="Borrar los datos"></td>

                </table> 
            
        </form>
        <form enctype="multipart/form-data"action="archivo.php" method="post">
            Ingrese la foto: <input type="file" name="foto">
        </form>    
    </body>
</html>

