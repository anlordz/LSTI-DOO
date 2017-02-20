/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.controllers;


import week5.models.User;
import week5.models.Authentication;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrea
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet{

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
      
        RequestDispatcher dispatcher = null;
        
        String txtUsuario=request.getParameter("txt-username");  
        String txtContraseña=request.getParameter("txt-password");
        
        boolean isValidUser =  Authentication.authenticate(txtUsuario, txtContraseña);

    if(isValidUser) {

        //Construye instancia del modelo User
        User user = new User(txtUsuario, txtContraseña);

        //Construye parámetro para enviar a la vista success.jsp
        request.setAttribute("username", user.getUsername());

        //Se define a donde se enviará el objeto request y response.
        request.getRequestDispatcher("success.jsp").forward(request, response);
    }
    else {
        //Si el usuario es inválido, reedireccionamos la petición hacia error.jsp
        response.sendRedirect("error.jsp");
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
