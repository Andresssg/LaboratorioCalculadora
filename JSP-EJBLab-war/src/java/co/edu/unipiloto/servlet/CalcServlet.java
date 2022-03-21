/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.session.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres
 */
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculadora</title>");
            out.println("</head>");
            out.println("<body>");
            int a = Integer.parseInt(request.getParameter("valorA"));
            int b = Integer.parseInt(request.getParameter("valorB"));
            if (request.getParameter("accion").equals("Sumar")) {
                out.println("<h1>El resultado de la operación Suma es: " + calcBean.suma(a, b) + "</h1>");
            } else if (request.getParameter("accion").equals("Restar")) {
                out.println("<h1>El resultado de la operación Resta es: " + calcBean.resta(a, b) + "</h1>");
            } else if (request.getParameter("accion").equals("Multiplicar")) {
                out.println("<h1>El resultado de la operación Multiplicación es: " + calcBean.multiplicacion(a, b) + "</h1>");
            } else if (request.getParameter("accion").equals("Dividir")) {
                out.println("<h1>El resultado de la operación Division es: " + calcBean.division(a, b) + "</h1>");
            } else if (request.getParameter("accion").equals("Sacar Residuo")) {
                out.println("<h1>El resultado de la operación Modulo es: " + calcBean.modulo(a, b) + "</h1>");
            } else if (request.getParameter("accion").equals("Elevar")) {
                if (a != 0 && b == 0) {
                    out.println("<h1>El resultado de la operación Cuadrado es: " + calcBean.cuadrado(a) + "</h1>");
                } else if (b != 0 && a == 0) {
                    out.println("<h1>El resultado de la operación Cuadrado es: " + calcBean.cuadrado(b) + "</h1>");
                } else if (a != 0 && b != 0) {
                    out.println("<h1>El resultado de la operación para a es: " + calcBean.cuadrado(a) + "</h1>");
                    out.println("<h1>El resultado de la operación para b es: " + calcBean.cuadrado(b) + "</h1>");
                } else{
                    out.println("<h1>El resultado de la operación Cuadrado es: " + calcBean.cuadrado(a) + "</h1>");
                }
            }
            out.println("<a href=CalcJSP.jsp>Regresar a la calculadora</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
