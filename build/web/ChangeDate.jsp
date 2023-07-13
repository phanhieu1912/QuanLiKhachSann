
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
        <title>A World</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- bootstrap css -->
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <!-- style css -->
        <!-- Responsive-->
        <link rel="stylesheet" href="css/responsive.css">

        <link rel="shortcut icon" type="image/png" href="../assets/images/logos/favicon.png" />
        <link rel="stylesheet" href="./fontawesome-free-6.4.0-web/css/all.css" />
        <link rel="stylesheet" href="css/responsive.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
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
    <style>

        @import url("https://fonts.googleapis.com/css2?family=Poppins:weight@100;200;300;400;500;600;700;800&display=swap");


        body{
            background-color:#eee;
            font-family: "Poppins", sans-serif;
            font-weight: 300;
        }

        .height{
            /* height: 100vh; */
        }


        .search{
            position: relative;
            box-shadow: 0 0 40px rgba(51, 51, 51, .1);
            margin-bottom: 100px;
            ;

        }

        .search input{

            height: 60px;
            text-indent: 25px;
            border: 2px solid #d6d4d4;


        }

        .input-hidden{
            display:none;
        }


        .search input:focus{

            box-shadow: none;
            border: 2px solid blue;


        }

        .search .fa-search{

            position: absolute;
            top: 20px;
            left: 16px;

        }

        .search button{

            position: absolute;
            top: 5px;
            right: 5px;
            height: 50px;
            width: 110px;
            background: blue;

        }

        .search-room {
            width: 100%;
            display: flex;
            gap: 10px;
            flex-wrap: wrap;
            padding-bottom: 30px;
        }

        .checkin-form{
            flex:5;
        }

        .checkout-form{
            flex:5;
        }

        .guests-form {
            flex-grow: 1;
        }

        .form-search__room{
            position: relative;
            padding: 270px 100px 0 100px;

        }

        .form-group {
            position: relative;
            padding: 15px 25px;
            border-radius: 5px;
            background-color: #ffffff;
            margin-bottom: 0;
        }

        .form-group label {
            display: block;
            font-size: 16px;
            line-height: 27.2px;
            font-weight: 500;
            margin-bottom: 4px;
            color: #8f8f8f;
            text-transform: capitalize;
        }

        .form-group input, .form-group select {
            border-color: transparent;
            width: 100%;
            padding-left: 0;
            padding-right: 0;
            font-size: 13px;
            font-weight: 600;
        }

        .btn-form button{
            outline:none;
            bordeR:none;
            background: transparent;
            text-align: center;
            height: 100%;
            font-size:20px;
        }

        .form-group-1{
            background-color: transparent;
            border:1px solid white;
        }

        .btn-search1{
            width: 100%;
            height: 100%;
            border: none;
            background-color: transparent;
            color: #fff;
            min-height: 50px;
            padding: 0;
            text-transform: uppercase;
            font-size: 13px;
            font-weight: 700;
            text-transform: uppercase;
            letter-spacing: 0.8px;
            display: inline-block;

        }

    </style>

    <body>
        <!-- header section start -->
        <div class="header_section">
            <jsp:include page="Navbar.jsp"></jsp:include>

                <!--             banner section start -->
                <div class="banner_section layout_padding">
                    <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="">
                                <div class="container">
                                    <h1 class="banner_taital">Book Your Vacation</h1>
                                    <p class="banner_text">Explore new experience with Hotale</p>                 
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            <c:if test="${sessionScope.acc!=null}">
                <div class="container-fluid">
                    <div class="form-search__room">
                        <form action="BookingAddDate" method="get" class="search-room">
                            <div class="form-group checkin-form">
                                <label for="">Check In</label>
                                <div class="value-space">
                                    <input type="date" name="checkInDate" id="CheckIn" class="form-control" value="${checkOut}" min="2023-01-01" max="2023-12-31">
                                </div>
                            </div>
                            <div class="form-group checkout-form">
                                <label for="">Check Out</label>
                                <div class="value-space">
                                    <input type="date" name="checkOutDate" id="CheckOut" class="form-control" value="" min="2023-01-01" max="2023-12-31">
                                </div>
                            </div>
                            <div class="form-group guests-form">
                                <div class="div">
                                    <div>
                                        <label for="">Adults</label>
                                        <select class="amount2" name="Adult">
                                            <option value="${adult}" selected>${adult}</option>
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
                                    </div>
                                </div>
                            </div>
                            <div class="form-group guests-form">
                                <div class="div">
                                    <div>
                                        <label for="">Child</label>
                                        <select class="amount3" name="Child">
                                            <option value="${child}" selected>${child}</option>
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>
                                            <option value="6">6</option>
                                            <option value="7">7</option>
                                            <option value="8">8</option>
                                            <option value="9">9</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group form-group-1">
                                <button type="submit" class="btn-search1" >
                                    Book rooms
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </c:if>



            <!-- banner section end -->
        </div>
        <!-- choose section end -->
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
        <script>
            var checkIn = document.getElementById("CheckIn").value;

var dateParts = checkIn.split("-");
var year = parseInt(dateParts[0], 10);
var month = parseInt(dateParts[1], 10) - 1; 
var day = parseInt(dateParts[2], 10);
var checkInDate = new Date(year, month, day); 
var checkoutDate = new Date(checkInDate.getTime() + 24 * 60 * 60 * 1000); 

var yearOut = checkoutDate.getFullYear();
var monthOut = checkoutDate.getMonth() + 1; 
var dayOut = checkoutDate.getDate();
if (monthOut < 10) {
  monthOut = "0" + monthOut; 
}
if (dayOut < 10) {
  dayOut = "0" + dayOut; 
}
var datePattern1 = yearOut + "-" + monthOut + "-" + dayOut;

document.getElementById("CheckOut").value = datePattern1;
document.getElementById("CheckOut").min = datePattern1;
        </script>
        <!--<script src="js/jquery.min.js"></script>-->
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