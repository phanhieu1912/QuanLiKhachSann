/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAO;
import entity.Account;
import entity.ChiTietThuePhong;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class SendEmailBooking extends HttpServlet {

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
            out.println("<title>Servlet SendEmailBooking</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SendEmailBooking at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        String email = request.getParameter("email");
        int pid = (Integer) request.getSession().getAttribute("newIDThuePhong");

        RequestDispatcher dispatcher = null;
        int otpvalue = 0;
        HttpSession mySession = request.getSession();
        DAO dao = new DAO();
        List<ChiTietThuePhong> cttps = dao.getInformationThuePhongByIDThuePhong(pid);
//        List<DichVuPhong> dvps = dao.

        if (email != null || !email.equals("")) {
            // sendiang otpa

            String to = email;// change accordingly
            // Get the session object
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("hieutestt22@gmail.com", "hzbfqycwvafathlz");// Put your email
                    // id and
                    // password here
                }
            });

            // compose message
            try {
                for (ChiTietThuePhong cttp : cttps) {
                    
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(email));// change accordingly
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                    message.setSubject("Hello");

                    // Tạo nội dung email với HTML và CSS
                    String body = "<html lang=\"en\">\n"
                            + "<head>\n"
                            + "   <meta charset=\"UTF-8\">\n"
                            + "   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                            + "   <title>Document</title>\n"
                            + "</head>\n"
                            + "<style>\n"
                            + "   table {\n"
                            + "  border-collapse: collapse;\n"
                            + "  width: 100%;\n"
                            + "}\n"
                            + "\n"
                            + "th, td {\n"
                            + "  padding: 10px;\n"
                            + "  border: 1px solid #ddd;\n"
                            + "}\n"
                            + "\n"
                            + "\n"
                            + "\n"
                            + "th {\n"
                            + "  background-color: #f2f2f2;\n"
                            + "}\n"
                            + "\n"
                            + "td:first-child{\n"
                            + "   background-color: #f2f2f2;\n"
                            + "   font-weight: 600;\n"
                            + "}\n"
                            + "\n"
                            + ".title{\n"
                            + "   font-weight: 600;\n"
                            + "   font-size: 30px;\n"
                            + "}\n"
                            + "</style>\n"
                            + "<body>\n"
                            + "   <p>Phòng của bạn đã được đặt thành công.</p>\n"
                            + "   <p class=\"title\">Thông tin phòng:</p>\n"
                            + "   <table>\n"
                            + "      <tbody>\n"
                            + "         <tr>\n"
                            + "            <td>Tên khách hàng</td>\n"
                            + "            <td>" + cttp.getTenKhachHang() + "</td>\n"
                            + "          </tr>\n"
                            + "         <tr>\n"
                            + "            <td>S? Phòng</td>\n"
                            + "            <td>" + cttp.getiDPhong() + "</td>\n"
                            + "          </tr>\n"
                            + "        <tr>\n"
                            + "          <td>Tên phòng</td>\n"
                            + "          <td>" + cttp.getTenLoaiPhong() + "</td>\n"
                            + "        </tr>\n"
                            + "        <tr>\n"
                            + "          <td>Ngày nhận phòng</td>\n"
                            + "          <td>" + cttp.getNgayNhanPhong() + "</td>\n"
                            + "        </tr>\n"
                            + "        <tr>\n"
                            + "          <td>Ngày trả phòng</td>\n"
                            + "          <td>" + cttp.getNgayTraPhong() + "</td>\n"
                            + "        </tr>\n"
                            + "        <tr>\n"
                            + "       </tr>\n"
                            + "       <tr>\n"
                            + "         <td>Số lượng người lớn</td>\n"
                            + "         <td>" + cttp.getSoLuongNguoiLon() + "</td>\n"
                            + "       </tr>\n"
                            + "       <tr>\n"
                            + "         <td>Số lượng trẻ em</td>\n"
                            + "         <td>" + cttp.getSoLuongTreEm() + "</td>\n"
                            + "       </tr>\n"
                            + "      </tbody>\n"
                            + "    </table>\n"
                            + "</body>\n"
                            + "</html>";
                    
                    
                    message.setContent(body, "text/html; charset=utf-8");

                    // Gửi email
//                    Transport.send(message);
//                    System.out.println("Email đã được gửi thành công.");

                    message.setText("Your OTP is: " + otpvalue);
                    // send message

                    // Create a multipart message
                    MimeMultipart multipart = new MimeMultipart();

                    // Create the text part
                    MimeBodyPart textPart = new MimeBodyPart();
                    textPart.setContent(body, "text/html; charset=utf-8");

                    // Add the text part to the multipart
                    multipart.addBodyPart(textPart);

                    // Create the image part
                    MimeBodyPart imagePart = new MimeBodyPart();
                    DataSource fds = new FileDataSource("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Shopping-cart\\web\\images\\deluxeCity.jpg");
                    imagePart.setDataHandler(new DataHandler(fds));
                    imagePart.setHeader("Content-ID", "<image>");

                    // Add the image part to the multipart
                    multipart.addBodyPart(imagePart);

                    // Set the content of the message
                    message.setContent(multipart);

                    // Send the message
                    Transport.send(message);
                    System.out.println("message sent successfully");
                }
                
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
            dispatcher = request.getRequestDispatcher("home.jsp");
            request.setAttribute("message", "OTP is sent to your email id");
            mySession.setAttribute("otp", otpvalue);
            mySession.setAttribute("email", email);
            dispatcher.forward(request, response);

//            
        } else {

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
