<%@page import="entity.KhachHang"%>
<%@page import="entity.Phong"%>

<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- basic -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- mobile metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <!-- site metas -->
        <title>Blog</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- bootstrap css -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <!-- style css -->
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <!-- Responsive-->
        <link rel="stylesheet" href="css/responsive.css">

        <link rel="stylesheet" href="/a-world-1.0.0/fontawesome-free-6.4.0-web/css/all.min.css">
        <!-- fevicon -->
        <link rel="icon" href="images/fevicon.png" type="image/gif" />
        <!-- Scrollbar Custom CSS -->
        <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
        <!-- Tweaks for older IEs-->
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
        <!-- fonts -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:400,700|Righteous&display=swap" rel="stylesheet">
        <!-- owl stylesheets -->
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css"
              media="screen">
    </head>

    <body><%
            List<KhachHang> listKH = (List<KhachHang>) request.getAttribute("listKH");
            if (listKH == null) {
                response.sendRedirect("UpdateInformationCustomer");
            }
        %>
        <!-- header section start -->
        <div class="header_section">
            <jsp:include page="Navbar.jsp"></jsp:include>
        </div>
                                
        <div class="container-fuild">
            //
       <form action="AddKH" method="post" class="updateCustomer">
           //
          <div class="container-fluid">
            <div class="container">
              <div class="row gutters">
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                  <div class="card h-100">
                    <div class="card-body">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                      <div class="row gutters">
                          <h6 class="mb-2 text-primary title">Add Information Customer</h6>
                        </div>
                           <c:forEach items="${listKH}" var ="s">
                                <c:if test="${s.tenKhachHang == null}">
                                   
                                            
                                         
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">ID Customer</label>
                            <input name="id" type="text" class="form-control" id="user" placeholder="Enter ID Customer" readonly="False" value="${s.idkhachhang}">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Ten Customer</label>
                            <input name="namee" type="text" class="form-control" id="user"
                              placeholder="Enter Ten Customer">
                          </div>
                        </div>
                          <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Address Customer</label>
                            <input name="diaChi" type="text" class="form-control" id="user"
                              placeholder="Enter Ten Customer">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Gioi Tinh</label>
                            <input name="gioitinh" type="text" class="form-control" id="gioitinh"
                              placeholder="Enter Gioi Tinh">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">CMND</label>
                            <input name="cmnd" type="text" class="form-control" id="cmnd"
                              placeholder="Enter CMD Customer">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="eMail">SDT</label>
                            <input name="sdt" type="text" class="form-control" id="password"
                                   placeholder="Enter Phone" readonly="False" value="${sessionScope.phoneUser}">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="eMail">Email</label>
                            <input name="email" type="email" class="form-control" id="password" readonly="False" placeholder="Email" value="${sessionScope.emailUser}">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Quoc Tich</label>
                            <input name="quoctich" type="text" class="form-control" id="user" placeholder="Enter Dia Chi">
                          </div>
                        </div>
                          </c:if>
                          </c:forEach>
                             


                      </div>
                      <div class="row gutters">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="text-right">
                            <button type="submit" id="submit" name="submit" class="btn btn-secondary btn-cancel">Cancel</button>
                            <button type="submit" id="submit" name="submit" class="btn btn-primary">Add</button>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </form>
</div>


        <!-- blog section start -->
        <div class="blog_section layout_padding margin_top_90">
            <div class="container">
                <h1 class="blog_taital">See Our Video</h1>
                <p class="blog_text">many variations of passages of Lorem Ipsum available, but the majority have suffered
                    alteration in some form, by injected humour, or randomised words which</p>
                <div class="play_icon_main">
                    <div class="play_icon"><a href="#"><img src="images/play-icon.png"></a></div>
                </div>
            </div>
        </div>
        <!-- blog section end -->
        <!-- footer section start -->
        <div class="footer_section layout_padding">
            <div class="container">
                <div class="input_btn_main">
                    <input type="text" class="mail_text" placeholder="Enter your email" name="Enter your email">
                    <div class="subscribe_bt"><a href="#">Subscribe</a></div>
                </div>
                <div class="location_main">
                    <div class="call_text"><img src="images/call-icon.png"></div>
                    <div class="call_text"><a href="#">Call +01 1234567890</a></div>
                    <div class="call_text"><img src="images/mail-icon.png"></div>
                    <div class="call_text"><a href="#">demo@gmail.com</a></div>
                </div>
                <div class="social_icon">
                    <ul>
                        <li><a href="#"><img src="images/fb-icon.png"></a></li>
                        <li><a href="#"><img src="images/twitter-icon.png"></a></li>
                        <li><a href="#"><img src="images/linkedin-icon.png"></a></li>
                        <li><a href="#"><img src="images/instagram-icon.png"></a></li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- footer section end -->
        <!-- copyright section start -->
        <div class="copyright_section">
            <div class="container">
                <p class="copyright_text">2020 All Rights Reserved. Design by <a href="https://html.design">Free html
                        Templates</a> Distributed by <a href="https://themewagon.com">ThemeWagon</a></p>
            </div>
        </div>
        <!-- copyright section end -->
        <!-- Javascript files-->
        <!-- <script src="js/jquery.min.js"></script> -->
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="js/jquery-3.0.0.min.js"></script>
        <script src="js/plugin.js"></script>
        <!-- sidebar -->
        <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="js/custom.js"></script>
        <!-- javascript -->
        <script src="js/owl.carousel.js"></script>
        <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
    </body>

</html>