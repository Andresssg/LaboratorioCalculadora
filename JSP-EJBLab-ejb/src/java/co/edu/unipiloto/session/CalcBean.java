/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package co.edu.unipiloto.session;

import javax.ejb.Stateless;

/**
 *
 * @author Andres
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

    @Override
    public int modulo(int a, int b) {
        return a % b;
    }

    @Override
    public int cuadrado(int a) {
        return a * a;
    }

    

}
