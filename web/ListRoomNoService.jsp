<%@page import="java.util.List"%>
<%@page import="entity.ChiTietThuePhong"%>
<!DOCTYPE html>
<html lang="en">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <body>
        <%
            List<ChiTietThuePhong> listTP = (List<ChiTietThuePhong>) request.getAttribute("listTP");
            if (listTP == null) {
                response.sendRedirect("ListRoomNoService");
            }
        %>
        <!-- header section start -->
        <div class="header_section">
            <jsp:include page="Navbar.jsp"></jsp:include>
            </div>
            <style>
                .success{
                    float:right;
                    margin-top:50px;
                    margin-right:50px;
                }
                .empty-room {
                    display: flex;
                    border: 1px solid #ccc;
                    align-items: center;
                    margin: 0 20px;
                }

                .empty-room-name {
                    font-size: 30px;
                    font-weight: 600;
                }

                .title {
                    margin-bottom: 50px;
                }

                .empty-room-price {
                    color: black;
                    font-size: 20px;
                }

                .button-room-active {
                    display: flex;
                }

                .empty-room-img{
                    padding: 0;
                }

                .empty-room-img img{
                    padding: 0;
                    /* width: 100%; */
                }

                .empty-room-trang-bi{
                    display:flex;
                    justify-content: space-between;
                }

                .empty-room-date,.empty-room-room-id,.empty-room-trang-bi{
                    font-size: 20px;
                    color:black;
                }

                .button-room-active{
                    margin-top:20px;
                }

                .room-id{
                    text-align: center;
                    font-size:30px;
                    font-weight: 600;
                    border:1px solid #ccc;
                }
            </style>
            <!-- header section end -->
            <div class="container-fluid">


                <div class="row">
                <c:forEach items="${listTP}" var ="o">

                    <div class="col-md-4">
                        <div class="room-id">${o.iDPhong}</div>
                        <div class="room">
                            <img src="${o.imgLoaiPhong}" class="room-img">
                            <div class="room-item">
                                <h2 class="room-name">${o.tenLoaiPhong}</h2>
                                <ul class="room-info">
                                    <li>
                                        <i class="fa-solid fa-bed"></i>
                                        ${o.trangBi}</li>
                                    <li>
                                        <i class="fa-solid fa-person"></i>
                                        ${o.soNguoi} People
                                    </li>
                                </ul>
                                <div class="empty-room-ngayNhanPhong">
                                    <span>Check-in date:</span>
                                    ${o.ngayNhanPhong}</div>
                                <div class="empty-room-ngayTraPhong">
                                    <span>Check-out date:</span>
                                    ${o.ngayTraPhong}</div>
                                <div class="col-3 button-room-active">
                                    <a href="BookingService?pid=${o.iDChiTietThuePhong}" class="btn btn-danger openConfirm">Booking Service</a>
                                </div>

                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <a href="BillThanhToanUser" class="btn btn-success success">Confirm</a>
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
        <script src="js/jquery.min.js"></script>
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