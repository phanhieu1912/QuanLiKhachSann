<%@page import="entity.DichVu"%>
<%@page import="entity.LoaiPhong"%>
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
        <title>A World</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">
        
          <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@10/swiper-bundle.min.css" />

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
    html,
    body {
      position: relative;
      height: 100%;
    }

    body {
      background: #eee;
      font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
      font-size: 14px;
      color: #000;
      margin: 0;
      padding: 0;
    }

    .swiper {
      width: 100%;
      height: 100%;
    }

    .swiper-slide {
      text-align: center;
      font-size: 18px;
      background: #fff;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .swiper-slide img {
      display: block;
      width: 100%;
      height: 100%;
      object-fit: cover;
    }

    .swiper {
      margin-left: auto;
      margin-right: auto;
    }
  </style>
    <style>



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
        <%
            List<DichVu> listS = (List<DichVu>) request.getAttribute("listS");
            if (listS == null) {
                response.sendRedirect("Control");
            }
        %>
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
                        <form action="ConfirmControl" method="get" class="search-room">
                            <input type="text" name="session" id="" class="input-hidden" value="${sessionScope.acc.user}" >
                            <div class="form-group checkin-form">
                                <label for="">Check In</label>
                                <div class="value-space">
                                    <input type="date" name="checkInDate" id="CheckIn" class="form-control" value="" min="2023-01-01" max="2023-12-31">
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
                                    </div>
                                </div>
                            </div>
                            <div class="form-group guests-form">
                                <div class="div">
                                    <div>
                                        <label for="">Child</label>
                                        <select class="amount3" name="Child">
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
        <!-- header section end -->
        <!-- services section start -->

        <div class="services_section layout_padding">
            <div class="container text-center ">
                <h1 class="services_taital">Services </h1>
                <p class="services_text">There are many variations of passages of Lorem Ipsum available, but the majority have
                    suffered alteration</p>
                <div class="services_section_2 ">
                    <div class="row list-room ">
                        <c:forEach items="${listS}" var ="s">
                            <div class="col-md-4 ">
                                <div><img src="${s.imgDichVu}" class="services_img"></div>
                                <div class="btn_main"><a href="#">${s.tenDichVu}</a></div>
                            </div>
                        </c:forEach>
                    </div>
                   
                </div>
            </div>
        </div>
        <!-- services section end -->

        <div class="services_section layout_padding">
            <div class="container ">
                <h1 class="services_taital text-center">Our Rooms </h1>
                <p class="services_text text-center">A wonderful serenity has taken possession of my entire soul, like these
                    sweet mornings of spring which I enjoy with my whole heart. I am alone, and feel the charm of existence in
                    this spot, which was created for the bliss of soul.</p>
                <div class="services_section_2  ">
                    <div class="row list-room ">
                    <c:forEach items="${listR}" var ="o">
                        <div class="col-md-4 ">
                            <div class="room ">
                                <img src="${o.imgLoaiPhong}" class="room-img">
                                <div class="room-item">
                                    <h2 class="room-name">${o.tenLoaiPhong}</h2>
                                    <ul class="room-info">
                                        <li>
                                            <i class="fa-solid fa-bed"></i>
                                           ${o.trangBi}
                                        </li>
                                        <li>
                                            <i class="fa-solid fa-person"></i>
                                            ${o.soNguoi} People
                                        </li>
                                    </ul>
                                    <a class="room-link" href="ReadMore?pid=${o.iDLoaiPhong}">READ MORE
                                        <i class="fa-solid fa-chevron-right"></i>
                                    </a>
                                </div>
                            </div>
                            <!-- <div class="btn_main"><a href="#">Rafting</a></div> -->

                        </div>
                        </c:forEach>
                    </div>
                    
                </div>
            </div>
        </div>


        <!-- about section start -->
        <div class="about_section layout_padding">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-6">
                        <div class="about_taital_main">
                            <h1 class="about_taital">About Us</h1>
                            <p class="about_text">Hotale Hotel is located in the west of Hanoi. Hotale Hotel is a great destination and brings you the most enjoyable experience when you come to us. Come to Hotale Hotel, you will be immersed in fresh nature, to participate in leisure activities, relax to take away the sorrows and chaos of life. Hotale Hotel with all kinds of amenities and modern bungalows combined traditional style, restaurant system, conference room,  ... </p>
                            <div class="readmore_bt"><a href="#">Read More</a></div>
                        </div>
                    </div>
                    <div class="col-md-6 padding_right_0">
                        <div><img src="images/about-img.png" class="about_img"></div>
                    </div>
                </div>
            </div>
        </div>
        <!-- about section end -->
        <!-- blog section start -->
        <div class="blog_section layout_padding">
            <div class="container">
                <h1 class="blog_taital">See Our Video</h1>
                <p class="blog_text">many variations of passages of Lorem Ipsum available, but the majority have suffered
                    alteration in some form, by injected humour, or randomised words which</p>
                <div class="play_icon_main">
                    <div class="play_icon"><a href="https://www.youtube.com/watch?v=N4ziA8NIQEs"><img src="images/play-icon.png"></a></div>
                </div>
            </div>
        </div>
        <!-- blog section end -->
        <!-- client section start -->
        <style>

            .star{
                margin-top:20px;
            }
            

        </style>
        <div class="client_section layout_padding">
            <div class="container swiper">
                <h1 class="client_taital">Testimonial</h1>
                <div class="client_section_2">
                    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                        <div class="carousel-inner row list-room  swiper mySwiper">
                                <div class =" swiper-wrapper">
                                    <c:forEach items="${listRV}" var ="o">
                                        <div class="carousel-item active swiper-slide">
                                            <div class="client_main">
                                                <div class="box_left">
                                                    <p class="lorem_text">${o.noiDung}</p>
                                                    <div class="star">
                                                    </div>
                                                    <c:forEach var="i" begin="0" end ="${o.starRate-1}">
                                                        <i class="fa-solid fa-star"></i>
                                                    </c:forEach>
                                                </div>

                                                <div class="box_right">
                                                    <div class="client_taital_left">
                                                        <div class="client_img"><img src="${o.imgKhachHang}"></div>
                                                        <div class="quick_icon"><img src="images/quick-icon.png"></div>
                                                    </div>

                                                    <div class="client_taital_right">
                                                        <h4 class="client_name">${o.tenKhachHang}</h4>
                                                        <p class="customer_text">Customer</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>


                        </div>
                        <div class="swiper-button-next"></div>
                        <div class="swiper-button-prev"></div>
                        <div class="swiper-paginnation"></div> 
                    </div>
                </div>
            </div>
        </div>
        <!-- client section start -->
        <!-- choose section start -->
        <div class="choose_section layout_padding">
            <div class="container">
                <h1 class="choose_taital">Why Choose Us</h1>
                <p class="choose_text">There are many variations of passages of Lorem Ipsum available, but the majority have
                    suffered alteration in some form, by injected humour, or randomised words which don't look even slightly
                    believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything
                    embarrassing hidden in the middle of text. All </p>
                <div class="read_bt_1"><a href="#">Read More</a></div>
                <div class="newsletter_box">
                    <h1 class="let_text">Let Start Talk with Us</h1>
                    <div class="getquote_bt"><a href="#">Get A Quote</a></div>
                </div>
            </div>
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
         <script src="https://cdn.jsdelivr.net/npm/swiper@10/swiper-bundle.min.js"></script>

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
        <script>
    var swiper = new Swiper(".mySwiper", {
      slidesPerView: 1,
      spaceBetween: 30,
      loop: true,
      pagination: {
        el: ".swiper-pagination",
        clickable: true,
      },
      navigation: {
        nextEl: ".swiper-button-next",
        prevEl: ".swiper-button-prev",
      },
    });
  </script>
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
        
    </body>

</html>