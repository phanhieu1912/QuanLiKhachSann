/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAO;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class SignUpConTrol extends HttpServlet {

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
        String user = request.getParameter("user");
        String email = request.getParameter("email");
        String phonenumber = request.getParameter("phone");
        String pass = request.getParameter("pass");
        String re_pass = request.getParameter("repass");

        DAO dao = new DAO();
        Account a = dao.checkAccountExist(user);
        Account e = dao.checkEmailExist(email);
        Account p = dao.checkPhoneExist(phonenumber);
        if (a == null) {
            if (e == null) {
                if (p == null) {
                    if(pass.equals(re_pass)){
                        dao.singup(user, re_pass, email, phonenumber);
                    dao.addIDKhachHang(user);
                    response.sendRedirect("home.jsp");
                    }else{
                        request.setAttribute("mess", "pass is not the same as repass! ");
                    request.getRequestDispatcher("signup.jsp").forward(request, response); 
                    }
                    
                } else {
                    request.setAttribute("mess", "Phone already exist!");
                    request.getRequestDispatcher("signup.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("mess", "Email already exist!");
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            }

        } else {
            request.setAttribute("mess", "Account already exist!");
            request.getRequestDispatcher("signup.jsp").forward(request, response);

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
