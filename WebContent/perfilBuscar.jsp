<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Perfil</title>
        <meta name ="viewport" content="width-device-width, user-scalable=no, initial-scale=1.0, maximun-scale=1.0, minimun-scale = 1.0">
        <style>
            #head{
                background-color:black;
                color:white;
                text-align:center;
                padding:5px;}

            #panel {
                line-height:30px;
                background-color:#eeeeee;
                height: 260px;
                width:10%;
                float:left;
                padding:5px;
                box-sizing: border-box;
            }

            #pane {
                line-height:30px;
                background-color:#eeeeee;
                height: 60px;
                width:30%;
                float:left;
                padding:5px;
                box-sizing: border-box;
            }
            #pan {
                line-height:30px;
                background-color:#eeeeee;
                height: 60px;
                width:30%;
                float:left;
                padding:5px;
                box-sizing: border-box;
            }
            #cont {
                width:30%;
                float:left;
                padding:11px;	 
                margin: 0 auto;
                overflow: hidden;
                box-sizing: border-box;
            }
            body {
                background-color: #99CCFF;
            }

            div.title{
                margin-left: 170px;
                margin-top: 0px;
                box-sizing: border-box;
            }

            table{
                width: 40%;
                padding: 5px;
                background: #c5e7e0;
                box-sizing: border-box;
            }
            th{ 
                text-align: center;
                border-bottom: 1px solid;
            }

            td{ 
                padding: 7px; 
            }
            .contenedor{
                width: 100%;
                max-width: 1200px;
                margin: 0 auto;
                overflow: hidden;
                box-sizing: border-box;
            }

        </style>
    </head>
    <body>
        <br>
        <br>
        <div class="contenedor">
            <div id="head">
                <h1 align="center"> Perfil </h1>
            </div>
            <br>
            <div id="panel">
                <a href="perfil.jsp">Home</a>
                <br>
          
                <br>
                <br><a href="index.jsp">Salir</a>
            </div>
            <div id="cont">
                <img src="picture000.jpg" WIDTH=300 HEIGHT=250 ALT="Imagen" />
            </div>
            <br>
            <table border="0">
                <thead>
                    <tr>
                        <th>Informaci�n Personal</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Nombre: </td>
                        <td >${name}</td>
                    </tr>
                    <tr>
                        <td>Carreo Electr�nico: </td>
                        <td>${correo}</td>
                    </tr>
                    </tr>
                    <tr>
                        <td>Edad:</td>
                        <td>${edad}</td>
                    </tr>
                    </tr>
                    <tr>
                        <td>N�mero de Tel�fono: </td>
                        <td>${tel}</td>
                    </tr>    
                    </tr>
                    <tr>
                        <td>A�o de carrera: </td>
                        <td>${carreraA}</td>
                    </tr>    
                    <tr>
                        <td>Direcci�n:</td>
                        <td>${direccion}</td>
                    </tr>                
                </tbody>
            </table>
            <br>
            <br>
            
            <br>
            <br>
            <br>
            <br>

            <div id="pan">
                <label for="CaminoMinimo">   Camino m�s corto: 
                <label for="personasCerc" name="camino">*-*-*</label> 
                <br>
            </div>
        </div>
    </body>
</html>