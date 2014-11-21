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
                height: 250px;
                width:10%px;
                float:left;
                padding:5px;	      
            }
            #cont {
                width:350px;
                float:left;
                padding:10px;	 	 
            }
            body {
                background-color: #99CCFF;
            }

            div.title{
                margin-left: 170px;
                margin-top: 0px;
            }

            table{
                width: 50%;
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
            .contenerdor{
                width: 70%;
                max-width: 1000px;
                margin: 0 auto;
                overflow: hidden;
            }

        </style>
    </head>
    <body>
        <div class="contenedor">
            <div id="head">
                <h1 align="center"> Perfil </h1>
            </div>
            <div id="panel">

                <a href="perfil.jsp">Home</a>
                <br>
                <br><a href="perfil.jsp">Lista de amigos</a>
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
                        <th>Información Personal</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Nombre: </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Carreo Electrónico: </td>
                        <td></td>
                    </tr>
                    </tr>
                    <tr>
                        <td>Edad:</td>
                        <td></td>
                    </tr>
                    </tr>
                    <tr>
                        <td>Número de Teléfono: </td>
                        <td></td>
                    </tr>    
                    </tr>
                    <tr>
                        <td>Año de carrera: </td>
                        <td></td>
                    </tr>    
                    <tr>
                        <td>Dirección:</td>
                        <td></td>
                    </tr>                
                </tbody>
            </table>
        </div>
    </body>
</html>