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
            <p>Sumar: a + b</p>
            <label for="paramASuma">a: </label>
            <input type="text" name="aSuma" id="paramASuma"/><br>
            <label for="paramASuma">b: </label>
            <input type="text" name="bSuma" id="paramBSuma"/><br>
            <input type="submit" value="Sumar" />
        </form>
        
        <form action="CalcServlet" method="post">
            <p>Restar a - b</p>
            <label for="paramAResta">a: </label>
            <input type="text" name="aResta" id="paramAResta"/><br>
            <label for="paramBResta">b: </label>
            <input type="text" name="bResta" id="paramBResta"/><br>
            <input type="submit" value="Restar" />
        </form>
        <form action="CalcServlet" method="post">
            <p>Multiplicar: a * b</p>
            <label for="paramAMultiplicacion">a: </label>
            <input type="text" name="aMultiplicacion" id="paramAMultiplicacion"/><br>
            <label for="paramBMultiplicacion">b: </label>
            <input type="text" name="bMultiplicacion" id="paramBMultiplicacion"/><br>
            <input type="submit" value="Multiplicar" />
        </form>
        <form action="CalcServlet" method="post">
            <p>Dividir: a / b</p>
            <label for="paramADivision">a: </label>
            <input type="text" name="aDivision" id="paramADivision"/><br>
            <label for="paramBDivision">b: </label>
            <input type="text" name="bDivision" id="paramBDivision"/><br>
            <input type="submit" value="Dividir" />
        </form>
        <form action="CalcServlet" method="post">
            <p>Modulo: a % b</p>
            <label for="paramAModulo">a: </label>
            <input type="text" name="aModulo" id="paramAModulo"/><br>
            <label for="paramBModulo">b: </label>
            <input type="text" name="bModulo" id="paramBModulo"/><br>
            <input type="submit" value="Sacar Residuo" />
        </form>
        <form action="CalcServlet" method="post">
            <p>Elevar al cuadrado: a<sup>2</sup> </p>
            <label for="paramACuadrado">a: </label>
            <input type="text" name="aCuadrado" id="paramACuadrado"/><br>
            <input type="submit" value="Elevar" />
        </form>
    </body>
</html>
