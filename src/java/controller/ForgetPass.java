/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAO;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class ForgetPass extends HttpServlet {

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
            out.println("<title>Servlet ForgetPass</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ForgetPass at " + request.getContextPath() + "</h1>");
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
      String usernamee =request.getParameter("user");
        RequestDispatcher dispatcher = null;
        int otpvalue = 0;
        HttpSession mySession = request.getSession();
        DAO dao = new DAO();
        List<Account> listAccount = dao.checkAccountAndEmailExistByList(usernamee,email);
//   List<Account> listAccount = dao.checkAccountByEmail(email);
        if (listAccount.isEmpty()) {
         
            request.setAttribute("mess", "Invalid email or Account ,Try Again!!!");
           
            request.getRequestDispatcher("ForgetPasswordd.jsp").forward(request, response);
        } 
        
        for (Account account : listAccount) {
            if (email != null || !email.equals("")) {
                // sendiang otpa
                String z = account.getUser();
                HttpSession sessionn = request.getSession();
                sessionn.setAttribute("user", account.getUser());
                Random rand = new Random();
                otpvalue = rand.nextInt(1255650);

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
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(email));// change accordingly
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                    message.setSubject("Hello");
                    
              

         // Tạo nội dung email với HTML và CSS
//         String body = "<html>\n" +
//"<head>\n" +
//"	<title>My Form</title>\n" +
//"	<style>\n" +
//"		form {\n" +
//"			max-width: 500px;\n" +
//"			margin: 0 auto;\n" +
//"			padding: 20px;\n" +
//"			background-color: #f9f9f9;\n" +
//"			border: 1px solid #ccc;\n" +
//"			border-radius: 5px;\n" +
//"		}\n" +
//"		label {\n" +
//"			display: block;\n" +
//"			margin-bottom: 10px;\n" +
//"			font-weight: bold;\n" +
//"		}\n" +
//"		input[type=\"text\"], textarea {\n" +
//"			width: 100%;\n" +
//"			padding: 10px;\n" +
//"			border: 1px solid #ccc;\n" +
//"			border-radius: 5px;\n" +
//"			margin-bottom: 20px;\n" +
//"		}\n" +
//"		input[type=\"submit\"] {\n" +
//"			background-color: #4CAF50;\n" +
//"			color: white;\n" +
//"			padding: 10px 20px;\n" +
//"			border: none;\n" +
//"			border-radius: 5px;\n" +
//"			cursor: pointer;\n" +
//"		}\n" +
//"		input[type=\"submit\"]:hover {\n" +
//"			background-color: #45a049;\n" +
//"		}\n" +
//"	</style>\n" +
//"</head>\n" +
//"<body>\n" +
//"	<form>\n" +
//"		<label for=\"name\">Name:</label>\n" +
//"		<input type=\"text\" id=\"name\" name=\"name\" required>\n" +
//"\n" +
//"		<label for=\"email\">Email:</label>\n" +
//"		<input type=\"text\" id=\"email\" name=\"email\" required>\n" +
//"\n" +
//"		<label for=\"message\">Message:</label>\n" +
//"		<textarea id=\"message\" name=\"message\" rows=\"5\" required></textarea>\n" +
//"\n" +
//"		<input type=\"submit\" value=\"Submit\">\n" +
//"	</form>\n" +
//"</body>\n" +
//"</html>";
//         message.setContent(body, "text/html; charset=utf-8");

//         // Gửi email
//         Transport.send(message);
//         System.out.println("Email đã được gửi thành công.");

                    message.setText("Your OTP is: " + otpvalue);
                    // send message

                    // Create a multipart message
                    MimeMultipart multipart = new MimeMultipart();

                    // Create the text part
                    MimeBodyPart textPart = new MimeBodyPart();
                    textPart.setText("Your OTP is: " + otpvalue);

//                    // Add the text part to the multipart
//                    multipart.addBodyPart(textPart);
//
//                    // Create the image part
//                    MimeBodyPart imagePart = new MimeBodyPart();
//                    DataSource fds = new FileDataSource("C:\\Users\\Admin\\Pictures\\Camera Roll\\test.jpg");
//                    imagePart.setDataHandler(new DataHandler(fds));
//                    imagePart.setHeader("Content-ID", "<image>");
//
//                    // Add the image part to the multipart
//                    multipart.addBodyPart(imagePart);
//
//                    // Set the content of the message
//                    message.setContent(multipart);
//
                    // Send the message
                    Transport.send(message);
                    System.out.println("message sent successfully");
                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }
                dispatcher = request.getRequestDispatcher("EnterOtp.jsp");
                request.setAttribute("message", "OTP is sent to your email id");
                mySession.setAttribute("otp", otpvalue);
                mySession.setAttribute("email", email);
                dispatcher.forward(request, response);

//            
            } else {

            }
        }
    }

//    }
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
