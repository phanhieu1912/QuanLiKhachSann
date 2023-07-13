/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAO;
import entity.ChiTietThuePhong;
import entity.KhachHang;
import entity.NgayDaDatPhong;
import entity.Phong;
import entity.ThuePhong;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class ListRoominUser extends HttpServlet {

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
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        DAO dao = new DAO();
        List<ChiTietThuePhong> listTP = dao.getAllChiTietThuePhongDaDuocThue();
        List<ChiTietThuePhong> list1 = new ArrayList<>();
        List<NgayDaDatPhong> listNDDP = dao.getAllNgayDaDatPhong();
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        
        for (ChiTietThuePhong cttp : listTP) {
                for (NgayDaDatPhong nddp : listNDDP) {
                    String idPhong = cttp.getiDPhong();
                    String idPhong2 = nddp.getiDPhong();
                    if (idPhong.equals(idPhong2)) {
                        if(sdformat.parse(cttp.getNgayNhanPhong()).compareTo(sdformat.parse(nddp.getNgayNhanPhong())) == 0 && sdformat.parse(cttp.getNgayTraPhong()).compareTo(sdformat.parse(nddp.getNgayTraPhong())) == 0 && cttp.getTinhTrangChiTietThuePhong() == 1){
                            list1.add(cttp);
                        }
                    }

                }
            }
        request.setAttribute("listCTTP", list1);
        request.getRequestDispatcher("RoominUser.jsp").forward(request, response);
       
        
         
        
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
         try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ListRoominUser.class.getName()).log(Level.SEVERE, null, ex);
        }
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
      
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ListRoominUser.class.getName()).log(Level.SEVERE, null, ex);
        }
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
