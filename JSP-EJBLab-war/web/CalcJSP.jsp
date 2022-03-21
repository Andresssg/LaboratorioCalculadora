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
            <label for="paramASuma">a: </label>
            <input type="text" name="aSuma" id="paramASuma"/><br>
            <label for="paramASuma">b: </label>
            <input type="text" name="bSuma" id="paramBSuma"/><br>
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
