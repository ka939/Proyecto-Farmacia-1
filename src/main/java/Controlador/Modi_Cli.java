/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Negocio.Neg_Cli;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NARAKU_001
 */
@WebServlet(name = "Modi_Cli", urlPatterns = {"/Modi_Cli"})
public class Modi_Cli extends HttpServlet {

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
            
            
            Modelo.Mod_Cli e=new Modelo.Mod_Cli();
            e.setDni(Integer.parseInt(request.getParameter("txtdni")));
            e.setNombre(request.getParameter("txtnombre"));
            e.setApellido(request.getParameter("txtapellido"));
            e.setTelefono(Integer.parseInt(request.getParameter("txttelefono")));
            e.setCorreo(request.getParameter("txtcorreo"));
   

            Neg_Cli cliente=new Neg_Cli();
            int reg=cliente.modificar(e);
            
            if(reg!=0){
            
       String dire=request.getParameter("direccion");
        response.sendRedirect("Mantenimiento_Cliente.jsp");
         
            }else{
          String dire=request.getParameter("direccion");
        response.sendRedirect("Mantenimiento_Cliente.jsp");
            }
            
             
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
