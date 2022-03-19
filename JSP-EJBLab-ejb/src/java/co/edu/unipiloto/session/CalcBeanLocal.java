/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package co.edu.unipiloto.session;

import javax.ejb.Local;

/**
 *
 * @author Andres
 */
@Local
public interface CalcBeanLocal {

    int suma(int a, int b);

    int resta(int a, int b);
    
    int multiplicacion(int a, int b);
    
    int division(int a, int b);
    
    int modulo(int a, int b);

    int cuadrado(int a);
    
    
    
}
