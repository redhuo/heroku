
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><head>
    <title>Web Social</title>
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css">
    <style>
      /* Space out content a bit */
      body {
        padding-top: 20px;
        padding-bottom: 20px;
        background-color:#000;
      }

      dt
      {
      	padding-top: 10px;
      }

      h1
      {
        font-size:35px;
        margin-top:0;
        text-align:center;
        font-family:Arial, sans-serif;
        text-shadow:2px 0 15px #292929;
        letter-spacing:2px;
        text-decoration:none;
        color:#DDD;
      }

      #map_canvas {
        width: 500px;
        height: 400px;
        background-color: #CCC;
      }

      .grid
      {
      	border-radius: 14px;
      	top: 90px;
      	margin-left: 25%;
      	margin-right: 25%;
      	background: white;
      	bottom: auto;
      	padding: 15px;
      }

      /* Everything but the jumbotron gets side spacing for mobile first views */
      .header,
      .marketing,
      .footer {
        padding-left: 15px;
        padding-right: 15px;
      }

      /* Custom page header */
      .header {
        border-bottom: 1px solid #e5e5e5;
      }
      /* Make the masthead heading the same height as the navigation */
      .header h3 {
        margin-top: 0;
        margin-bottom: 0;
        line-height: 40px;
        padding-bottom: 19px;
      }

      /* Custom page footer */
      .footer {
        padding-top: 19px;
        color: #777;
        border-top: 1px solid #e5e5e5;
      }

      /* Customize container */
      @media (min-width: 768px) {
        .container {
          max-width: 730px;
        }
      }

      .container-narrow > hr {
        margin: 30px 0;
      }

      /* Supporting marketing content */
      .marketing {
        margin: 40px 0;
      }

      .marketing p + h4 {
        margin-top: 28px;
      }

      /* Responsive: Portrait tablets and up */
      @media screen and (min-width: 768px) {
        /* Remove the padding we set earlier */
        .header,
        .marketing,
        .footer {
          padding-left: 0;
          padding-right: 0;
        }
        /* Space out the masthead */
        .header {
          margin-bottom: 30px;
        }

        .alert
        {
        	text-align: center;
        	margin-left: 10%;
        	margin-right: 10%;
        }
      }
    </style>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

  </head>


<body>
<h1>Bienvenido a la Red Social Test</h1>
<br>
<form action="Home" method="post" style="text-align: center">
<h2>Login</h2><br>
Username:<br>
<input type="text" name="usuario"/><br>
Password:<br>
<input type="password" name="password"/><br>
<input type="submit" value="Login"/>
</form>
<a href="index2.jsp">Registarse</a>
<a href="perfil.jsp">Perfil</a>
</body>
</html>
