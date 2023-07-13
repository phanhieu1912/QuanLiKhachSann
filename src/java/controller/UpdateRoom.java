/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAO;
import entity.DichVu;
import entity.KhachHang;
import entity.NgayDaDatPhong;
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
public class UpdateRoom extends HttpServlet {

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

            DAO dao = new DAO();
            String ngayNhanPhong = request.getParameter("checkIn");
            Date dateCheckIn = new SimpleDateFormat("yyyy-MM-dd").parse(ngayNhanPhong);

            String ngayTraPhong = request.getParameter("checkOut");
            Date dateCheckOut = new SimpleDateFormat("yyyy-MM-dd").parse(ngayTraPhong);
            HttpSession dateeeee = request.getSession();
            dateeeee.setAttribute("ngayNhanPhongg", ngayNhanPhong);
            dateeeee.setAttribute("ngayTraPhongg", ngayTraPhong);
            String soLuongNguoiLon = request.getParameter("adult");
            String soLuongTreEm = request.getParameter("child");
            HttpSession soLuongg = request.getSession();
            soLuongg.setAttribute("soLuongNguoiLonn", soLuongNguoiLon);
            soLuongg.setAttribute("soLuongTreEmm", soLuongTreEm);
             String iDChiTietThuePhong = request.getParameter("pid");
            String iDNgayDaDatPhong = request.getParameter("zid");
            HttpSession iddi = request.getSession();
            iddi.setAttribute("iDNgayDaDatPhong", iDNgayDaDatPhong);
            iddi.setAttribute("iDChiTietThuePhong", iDChiTietThuePhong);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm::ss");
            List<Phong> list = dao.getAllRoom();
            List<Phong> list1 = new ArrayList<>(list);
            List<NgayDaDatPhong> listNDDP = dao.getAllNgayDaDatPhong();
            SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
            List<KhachHang> listKH = dao.getAllKhachHang();
            String idKhachHang = request.getParameter("session");
            KhachHang kh = dao.getKhachHangByID(idKhachHang);
                if(dateCheckIn.compareTo(dateCheckOut) >0){
                request.getRequestDispatcher("fail.jsp").forward(request, response);
            } else{
                
           
            for (Phong phong : list1) {
                for (NgayDaDatPhong cttp : listNDDP) {
                    String idPhong = cttp.getiDPhong();
                    String idPhong2 = phong.iDPhong;
                    if (idPhong.equals(idPhong2)) {
                        if (dateCheckIn.compareTo(sdformat.parse(cttp.getNgayNhanPhong())) > 0 && dateCheckIn.compareTo(sdformat.parse(cttp.getNgayTraPhong())) < 0) {
                        list.remove(phong);
                        break;
                        } else if (dateCheckOut.compareTo(sdformat.parse(cttp.getNgayNhanPhong())) > 0 && dateCheckOut.compareTo(sdformat.parse(cttp.getNgayTraPhong())) < 0) {
                        list.remove(phong);
                        break;
                    } else if (dateCheckIn.compareTo(sdformat.parse(cttp.getNgayNhanPhong())) == 0 && dateCheckOut.compareTo(sdformat.parse(cttp.getNgayTraPhong())) == 0) {
                        list.remove(phong);
                        break;
                    } else if (dateCheckIn.compareTo(sdformat.parse(cttp.getNgayTraPhong())) == 0) {
                        list.remove(phong);
                        break;
                    } else if (dateCheckOut.compareTo(sdformat.parse(cttp.getNgayNhanPhong())) == 0) {
                        list.remove(phong);
                        break;
                    }
                    }

                }
            }
            
            
            List<DichVu> listDV = dao.getAllDichVu();
            
//b2 :set data to jsp
            request.setAttribute("listDV", listDV);
            request.setAttribute("listR", list);
            request.setAttribute("listKH", listKH);
            request.getRequestDispatcher("ChangeRoom.jsp").forward(request, response);
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
