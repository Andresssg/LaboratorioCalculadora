<%-- 
    Document   : CalcJSP
    Created on : 19-mar-2022, 13:24:05
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <form action="CalcServlet" method="post">
            <p>Ingrese los numeros:</p>
            <label for="paramA">a: </label>
            <input type="number" name="valorA" id="paramA" value="0"/><br>
            <label for="paramA">b: </label>
            <input type="number" name="valorB" id="paramB" value="0"/><br>
            <p>Sumar: a + b</p>
            <input type="submit" name="accion" value="Sumar" />

            <p>Restar a - b</p>
            <input type="submit" name="accion" name="accion" value="Restar" />

            <p>Multiplicar: a * b</p>
            <input type="submit" name="accion" value="Multiplicar" />

            <p>Dividir: a / b</p>
            <input type="submit" name="accion" value="Dividir" />

            <p>Modulo: a % b</p>
            <input type="submit" name="accion" value="Sacar Residuo" />

            <p>Elevar al cuadrado: a<sup>2</sup> y/o b<sup>2</sup></p>
            <input type="submit" name="accion" value="Elevar" />
        </form>

    </body>
</html>
