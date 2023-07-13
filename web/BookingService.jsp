<%@page import="entity.ChiTietThuePhong"%>
<%@page import="entity.DichVu"%>
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
       
        <!-- header section start -->
        <div class="header_section">
            <jsp:include page="Navbar.jsp"></jsp:include>
            </div>
            <style>
                .td-hidden{
                    display:none;
                }
                .booking-main {
                    padding-top: 250px;
                }

                #book_room {
                    font-size: 15px;
                }

                #book_room .form-control {
                    height: 34px;
                }

                #book_room [name="Request"] {
                    height: auto;
                }

                .book-img {
                    position: relative;
                    margin-bottom: 15px;
                }

                .book-img::before {
                    content: "";
                    position: absolute;
                    left: 0;
                    top: 0;
                    right: 0;
                    bottom: 0;
                    background: rgba(0, 0, 0, 0.151);
                    z-index: 1;
                }

                .room-slected {
                    position: absolute;
                    bottom: 10px;
                    left: 50%;
                    transform: translateX(-50%);
                    width: 100%;
                    text-align: center;
                    z-index: 5;
                }

                .room-slected span {
                    display: inline-block;
                    color: #fff;
                    background-color: #1490ac;
                    font-size: 15px;
                    text-transform: uppercase;
                    padding: 5px 15px;
                    border-radius: 3px;
                }

                .book-img img {
                    height: 246px;
                    border-radius: 5px;
                }

                .book_info-left {
                    display: flex;
                    flex-wrap: wrap;
                    align-items: center;
                    justify-content: space-between;
                    padding: 30px 15px;
                    border-radius: 5px;
                    background-color: #14404a;
                    position: relative;
                    z-index: 1;
                }

                .group-left {
                    width: 48%;
                    text-align: center;
                    background-color: #1490ac;
                    color: #fff;
                    padding: 15px 0px;
                    border-radius: 5px;
                    margin-bottom: 15px;
                    position: relative;
                    cursor: pointer;
                }

                .b-info-title {
                    text-transform: uppercase;
                    font-size: 15px;
                    font-weight: 500;
                }

                .b-info-number {
                    position: relative;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                }

                .b-info-number select {
                    background: #1490ac;
                    color: #fff;
                    font-size: 22px;
                    width: 80px;
                    font-weight: 500;
                    position: absolute;
                    top: 0;
                    bottom: 0;
                    left: 50%;
                    opacity: 0;
                    transform: translateX(-50%);
                }

                [name="CheckIn"] {
                    opacity: 0;
                    position: absolute;
                    bottom: 10px;
                }

                [name="CheckOut"] {
                    opacity: 0;
                    position: absolute;
                    bottom: 10px;
                }

                .b-number {
                    font-size: 40px;
                    font-weight: 500;
                }

                .b-date {
                    font-size: 40px;
                    font-weight: 500;
                }

                .arow-select {
                    font-size: 18px;
                    margin-left: 6px;
                }

                .hidden-arow {
                    -o-appearance: none;
                    -ms-appearance: none;
                    -webkit-appearance: none;
                    -moz-appearance: none;
                    appearance: none;
                }

                .change-info {
                    text-transform: uppercase;
                    cursor: pointer;
                    display: block;
                    background-color: #1490ac;
                    color: #fff;
                    text-align: center;
                    border-radius: 5px;
                    font-weight: 500;
                    transition: all 0.5s ease;
                }

                .change-info:hover {
                    color: #fff;
                    background: linear-gradient(#27d7ff, #0bc4ee, #00bae4, #00bae4);
                    transition: all 0.5s ease;
                }

                .book-right {
                    padding: 0 30px;
                }

                #book_room label {
                    font-weight: 500;
                }

                span.required {
                    color: red;
                }

                .submit-btn {
                    background-color: #1490ac;
                    color: #fff;
                    font-weight: 500;
                }

                .submit-btn:hover {
                    color: #fff;
                    background-color: #14404a;
                }

                .change-form_wp {
                    position: absolute;
                    top: 0;
                    left: 0;
                    right: 0;
                    bottom: 0;
                    background-color: #1490ac;
                    z-index: 10;
                    border-radius: 5px;
                    overflow: hidden;
                }

                .change-form {
                    position: relative;
                    z-index: 20;
                    display: inline-flex;
                    flex-wrap: wrap;
                    top: 50%;
                    transform: translateY(-50%);
                }

                .change-form .form-group {
                    width: 50%;
                    padding: 0 10px;
                }

                .change-form label {
                    color: #fff;
                    font-weight: 500;
                }

                .change-btn {
                    display: flex;
                    flex-wrap: wrap;
                    align-items: center;
                }

                .input-hidden{
                    display:none;
                }
            </style>
            <!-- header section end --><div class="container container-content">
                <div class="booking-main box">
                    <div class="container">
                        <form action="AddDichVu" id="book_room" method="get">
                            <div class="row">

                                <div class="col-lg-4">

                                </div>

                                <div class="col-lg-8">
                                    <div class="book-right mb-4">
                                        <div class="row">

                                            <div class="col-md-12" style="margin:20px 0px;">
                                                <table class="table">
                                                    <tr>
                                                        <td class="td-name"><strong>Service Name</strong></td>
                                                        <td class="td-price"><strong>Price</strong></td>
                                                        <td class="td-idRoom"><strong>Time</strong></td>
                                                        <td class="td-idRoom"><p hidden>Price.</p></td>
                                                        <td class="td-choose"><strong>Quantity</strong></td>
                                                    <c:forEach items="${listCTTP}" var ="z">
                                                    <input type="text" name="idcttp" value="${z.iDChiTietThuePhong}" class="input-hidden"/>
                                                    </c:forEach>
                                                </tr>
                                                <c:forEach items="${listDV1}" var ="s">
                                                    <tr>
                                                    <input data-val="true" data-val-number="The field RoomId must be a number."
                                                           data-val-required="The RoomId field is required."
                                                           id="ListRoomBookings_0__RoomId" name="ListRoomBookings[0].RoomId"
                                                           type="hidden" value="2019" />
                                                    <td class="td-name">

                                                        <span id="0"> ${s.tenDichVu}</span>
                                                        <input id="ListRoomBookings_0__NameRoom" name="tenPhong" type="hidden"
                                                               value=" Deluxe City View" />
                                                    </td>
                                                    <td class="td-price">
                                                        ${s.giaDichVu} <span>USD</span>
                                                        <input data-val="true" data-val-number="The field Price must be a number."
                                                               id="ListRoomBookings_0__Price" name="price" type="hidden" value="30" />
                                                    </td>
                                                    <td class="td-max">
                                                        Ticket / Day
                                                        <input data-val="true"
                                                               data-val-number="The field MaxPeople must be a number."
                                                               data-val-required="The MaxPeople field is required."
                                                               id="ListRoomBookings_0__MaxPeople" name="ListRoomBookings[0].MaxPeople"
                                                               type="hidden" value="2" />
                                                    </td>
                                                    <td class="td-max text-center">
                                                        <input type="checkbox" name="choosee" value="${s.iDDichVu}" checked class="input-hidden" />
                                                    </td>
                                                    <td class="td-max text-center">
                                                        <select class="form-control" name="quantity">
                                                            <option value="0" selected>0</option>
                                                            <option value="1">1</option>
                                                            <option value="2">2</option>
                                                            <option value="3">3</option>
                                                            <option value="4">4</option>
                                                            <option value="5">5</option>
                                                            <option value="6">6</option>
                                                            <option value="7">7</option>
                                                            <option value="8">8</option>
                                                            <option value="9">9</option>
                                                            <option value="10">10</option>
                                                        </select>
                                                    </td>

                                                    </tr>
                                                </c:forEach>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4"></div>
                            <div class="col-lg-8">
                                <div class="book-right mb-4">
                                    <div class="row">

                                        <div class="col-md-12" style="margin:20px 0px;">

                                        </div>

                                        <div class="col-md-12 agree">
                                            <input type="checkbox" name="agree" id="agree" /> <span>I read and agree with the  <a href="javascript:void(0)" onclick="ShowCondition()">terms & conditions </a> of the  Hotale Hotel</span>
                                        </div>
                                        <div class="col-md-12">
                                            <input type="submit" value="Send" class="submit-btn btn send-btn">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

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
        <script>
            var date = new Date();
            var year = date.getFullYear();
            var month = String(date.getMonth() + 1).padStart(2, '0');
            var todayDate = String(date.getDate()).padStart(2, '0');
            var todayDate1 = String(date.getDate() + 1).padStart(2, '0');
            var datePattern = year + '-' + month + '-' + todayDate;
            var datePattern1 = year + '-' + month + '-' + todayDate1;


            document.getElementById("CheckIn").value = datePattern;
            document.getElementById("CheckIn").min = datePattern;

            document.getElementById("CheckOut").value = datePattern1;
            document.getElementById("CheckOut").min = datePattern1;
        </script>
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