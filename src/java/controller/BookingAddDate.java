/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAO;
import entity.DichVu;
import entity.KhachHang;
import entity.NgayDaDatPhong;
import entity.NgayThangNam;
import entity.Phong;
import java.io.IOException;
import java.io.PrintWriter;
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
public class BookingAddDate extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BookingAddDate</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BookingAddDate at " + request.getContextPath() + "</h1>");
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
        try {
            //            String checkIn = request.getParameter("checkInDate");
//            Date dateCheckIn=new SimpleDateFormat("yyyy-MM-dd").parse(checkIn);
//            
//            String checkOut = request.getParameter("checkOutDate");
//            Date dateCheckOut=new SimpleDateFormat("yyyy-MM-dd").parse(checkOut);

            HttpSession session = request.getSession();
            DAO dao = new DAO();
            String ngayNhanPhongMoi = request.getParameter("checkInDate");
            Date dateCheckInMoi = new SimpleDateFormat("yyyy-MM-dd").parse(ngayNhanPhongMoi);
            String ngayTraPhongMoi = request.getParameter("checkOutDate");
            Date dateCheckOutMoi = new SimpleDateFormat("yyyy-MM-dd").parse(ngayTraPhongMoi);
            String soLuongNguoiLon = request.getParameter("Adult");
            String soLuongTreEm = request.getParameter("Child");
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm::ss");
            List<Phong> list = dao.getAllRoom();
            List<Phong> list1 = new ArrayList<>(list);
            List<NgayDaDatPhong> listNDDP = dao.getAllNgayDaDatPhong();
            SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
            String ngayNhanPhongCu = (String) session.getAttribute("oldCheckIn");
            String ngayTraPhongCu = (String) session.getAttribute("oldCheckOut");
            String iDChiTietThuePhong = (String) session.getAttribute("iDChiTietThuePhong");
            String iDNgayDaDatPhong = (String) session.getAttribute("iDNgayDaDatPhong");
            Date dateCheckInCu =  new SimpleDateFormat("yyyy-MM-dd").parse(ngayNhanPhongCu);
            Date dateCheckOutCu =  new SimpleDateFormat("yyyy-MM-dd").parse(ngayTraPhongCu);
            String roomID = (String) session.getAttribute("roomID");
            if (dateCheckInMoi.compareTo(dateCheckOutMoi) > 0) {
                request.getRequestDispatcher("fail.jsp").forward(request, response);
            } else {
                if(dateCheckInMoi.compareTo(dateCheckOutCu) == 0){
                    for (NgayDaDatPhong date : dao.getDateNgayDaDatPhongByIDPhong(roomID)) {
                    if (dateCheckInMoi.compareTo(sdformat.parse(date.getNgayNhanPhong())) > 0 && dateCheckInMoi.compareTo(sdformat.parse(date.getNgayTraPhong())) < 0) {
                        request.getRequestDispatcher("faildate.jsp").forward(request, response);
                        break;
                        } else if (dateCheckOutMoi.compareTo(sdformat.parse(date.getNgayNhanPhong())) > 0 && dateCheckOutMoi.compareTo(sdformat.parse(date.getNgayTraPhong())) < 0) {
                        request.getRequestDispatcher("faildate.jsp").forward(request, response);
                        break;
                    } else if (dateCheckInMoi.compareTo(sdformat.parse(date.getNgayNhanPhong())) == 0 && dateCheckOutMoi.compareTo(sdformat.parse(date.getNgayTraPhong())) == 0) {
                        request.getRequestDispatcher("faildate.jsp").forward(request, response);
                        break;
                    }  else if(dateCheckInMoi.compareTo(sdformat.parse(date.getNgayNhanPhong())) == 0){
                        request.getRequestDispatcher("faildate.jsp").forward(request, response);
                        break;
                    }else if(sdformat.parse(date.getNgayNhanPhong()).compareTo(dateCheckInMoi) > 0 && sdformat.parse(date.getNgayNhanPhong()).compareTo(dateCheckOutMoi)<0){
                        request.getRequestDispatcher("faildate.jsp").forward(request, response);
                        break;
                        
                    }
                }
                    dao.updateDateChiTietThuePhong(ngayTraPhongMoi, iDChiTietThuePhong);
                    dao.updateDateNgayDaDatPhong(ngayTraPhongMoi, iDNgayDaDatPhong);
                    response.sendRedirect("ListRoominUser");
                    
                    
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(ConfirmControl.class.getName()).log(Level.SEVERE, null, ex);
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
