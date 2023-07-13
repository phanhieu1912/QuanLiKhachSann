/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAO;
import entity.Account;
import entity.NgayThangNam;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class AddThuePhong extends HttpServlet {

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
            HttpSession session = request.getSession();
            String ngayNhanPhong = request.getParameter("checkIn");
            Date dateCheckIn = new SimpleDateFormat("yyyy-MM-dd").parse(ngayNhanPhong);

            String ngayTraPhong = request.getParameter("checkOut");
            Date dateCheckOut = new SimpleDateFormat("yyyy-MM-dd").parse(ngayTraPhong);

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm::ss");
            String[] iDPhongs = request.getParameterValues("choose");
            int soLuongNguoiLon = Integer.parseInt(request.getParameter("adult"));
            int soLuongTreEm = Integer.parseInt(request.getParameter("child"));
            int soLuongPhong = iDPhongs.length;
//            String soLuongDichVus[] = request.getParameterValues("quantity");
            String IDKhach = ((Account) session.getAttribute("acc")).getUser();
//            String[] iDDichVus = request.getParameterValues("choosee");
            
            DAO dao = new DAO();
            List<Integer> array = new ArrayList<Integer>();
            dao.insertThuePhong(IDKhach);
            int newIDThuePhong = dao.getLast();
            HttpSession sessionIDthuephong = request.getSession();
            sessionIDthuephong.setAttribute("newIDThuePhong", newIDThuePhong);
            for (String iDPhong : iDPhongs) {
                for (NgayThangNam date : dao.getDateThuePhongByID(iDPhong)) {
                    if (dateCheckIn.compareTo(date.getNgayNhanPhong()) > 0 && dateCheckIn.compareTo(date.getNgayTraPhong()) < 0) {
                        request.getRequestDispatcher("fail.jsp").forward(request, response);
                        return;
                    } else if (dateCheckOut.compareTo(date.getNgayNhanPhong()) > 0 && dateCheckOut.compareTo(date.getNgayTraPhong()) < 0) {
                        request.getRequestDispatcher("fail.jsp").forward(request, response);
                        return;
                    } else if (dateCheckIn.compareTo(date.getNgayNhanPhong()) == 0 && dateCheckOut.compareTo(date.getNgayTraPhong()) == 0) {
                        request.getRequestDispatcher("fail.jsp").forward(request, response);
                        return;
                    } else if (dateCheckIn.compareTo(date.getNgayTraPhong()) == 0) {
                        request.getRequestDispatcher("fail.jsp").forward(request, response);
                        return;
                    } else if (dateCheckOut.compareTo(date.getNgayNhanPhong()) == 0) {
                        request.getRequestDispatcher("fail.jsp").forward(request, response);
                        
                    }
                }
                dao.addChiTietThuePhong(newIDThuePhong,iDPhong,dao.getGiaPhong(iDPhong),ngayNhanPhong,ngayTraPhong,soLuongNguoiLon,soLuongTreEm, soLuongPhong);
                int iDChiTietThuePhongThuePhong = dao.getLastChiTietThuePhong();
                array.add(iDChiTietThuePhongThuePhong);
                dao.addNgayDaDatPhong(iDPhong, ngayNhanPhong, ngayTraPhong);
                
            }
//            for (Integer integer : array) {
//                
//                for (int i = 0; i < iDDichVus.length; i++) {
//                    for(String soLuongDichVu : soLuongDichVus){
//                        dao.insertDichVuPhong(iDDichVus[i],newIDThuePhong ,soLuongDichVu,integer);
//                    }
//                    
//                }
//            }
            request.getRequestDispatcher("ListRoomNoService.jsp").forward(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(AddThuePhong.class.getName()).log(Level.SEVERE, null, ex);
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
