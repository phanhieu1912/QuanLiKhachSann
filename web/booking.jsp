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

<body>
   <!-- header section start -->
   <div class="header_section">
      <jsp:include page="Navbar.jsp"></jsp:include>
   </div>
   <!-- header section end -->
   <div class="container container-content">
       <c:forEach items="${list}" var ="o">
      <div class="row">
         <div class="col-lg-9">
            <div class="room-content">
               <div class="room-name">
                   <h3 class="room-title">${o.tenLoaiPhong}</h3>

<!--                  <div class="room-price">
                     <span>From</span>
                     $ 23.10 / Night
                  </div>-->
               </div>
               <div class="room-caption">
                  <span style="color:rgb(101, 101, 101)">Room Feature</span>
               </div>
               <div class="room-service">
                  <div class="row">
                     <div class="col-md-6">
                        <div class="inner">
                           <div class="icon">
                              <i class="fa-solid fa-bed"></i>
                           </div>
                           <div class="content">
                              <h3>Bed</h3>
                              <span>${o.trangBi}</span>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-6">
                        <div class="inner">
                           <div class="icon">
                              <i class="fa-solid fa-users-line"></i>
                           </div>
                           <div class="content">
                              <h3>Max guest</h3>
                              <span>${o.soNguoi}</span>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-6">
                        <div class="inner">
                           <div class="icon">
                              <i class="fa-solid fa-maximize"></i>
                           </div>
                           <div class="content">
                              <h3>Room space</h3>
                              <span>30 sqm</span>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-6">
                        <div class="inner">
                           <div class="icon">
                              <i class="fa-solid fa-tree"></i>
                           </div>
                           <div class="content">
                              <h3>Room view</h3>
                              <span>City View</span>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
               <div class="room-desc">
                  <p style="text-align:justify; margin:20px 0;font-size:18px;color:#656565;">
                     Hotale Hotel boasts 10 Deluxe City View rooms that offer the relaxing and elegant feel of
                     Neoclassical Style. Every room in the Hotale Hotel is a combination of beauty, aesthetics and art.
                     Deluxe City View room is arranged with a reasonable area of 30 m2 and is fully equipped with modern
                     amenities such as LCD cable TV, air conditioning, separate bedroom with hot and cold shower and
                     toiletries. modern. The room has large windows opening to charming views of Hanoi. Deluxe is your
                     smart choice for budget travelers because of its convenience and reasonable price. Connecting rooms
                     are also available for groups and families
                  </p>
               </div>
               <div class="room-amenities">
                  <h3 class="title">
                     Room amenities
                  </h3>
                  <div class="row">
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/Group-40.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Parking
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/icon_nosmoking.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 No smoking
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/icon_phone.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Phone
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/be-boi.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Swimming Pool
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/safe.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Safe
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/icon_shower.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Shower
                              </h3>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
               <div class="room-amenities">
                  <h3 class="title">
                     Hotel amenities
                  </h3>
                  <div class="row">
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/Group-40.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Parking
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/icon_nosmoking.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 No smoking
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/icon_phone.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Phone
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/icon_aircondition.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Air-codition
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/kets.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Safe
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/be-boi.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Swimming Pool
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/an-sansg.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Have breakfast
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/gym.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Gym
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/safe.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Safe
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/icon_shower.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Shower
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/spa.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Spa
                              </h3>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-4">
                        <div class="inner">
                           <div class="icon">
                              <img src="images/wifi.png" />
                           </div>
                           <div class="icon-wrap">
                              <h3>
                                 Wifi
                              </h3>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
               <div class="room-rules">
                  <h3>
                     Hotel rules
                  </h3>
                  <ul class="list-rules">
                     <li>
                        Smoking not allowed
                     </li>
                     <li>
                        Pets not allowed
                     </li>
                     <li>
                        Swimming pool closed from 8.00pm - 6.00am
                     </li>
                  </ul>
               </div>
            </div>
         </div>
         <div class="col-lg-3">
            <div class="slidebar">
               <div class="booking-bar">
                  <div class="list-tab">
                     <span id="booking-tab1" class="booking-tab active">
                        Book rooms
                     </span>
                     <span id="booking-tab2" class="booking-tab">
                        Enquiry
                     </span>
                  </div>
                  <div class="booking-tab__content">
                     <div class="booking-content booking-content1 ">
                        <div class="form-search__room">
                            <form action="ConfirmControl" method="get" class="search-room">
                              <input name="Id" value="2019" hidden />
                              <div class="form-group checkin-form">
                                 <label for="">Check In</label>
                                 <div class="value-space">
                                    <input type="date" name="checkInDate" id="CheckIn" class="form-control"
                                       value="2023-07-22" min="2023-01-01" max="2023-12-31">
                                 </div>
                              </div>
                              <div class="form-group checkout-form">
                                 <label for="">Check Out</label>
                                 <div class="value-space">
                                    <input type="date" name="checkOutDate" id="CheckOut" class="form-control"
                                       value="2023-07-22" min="2023-01-01" max="2023-12-31">
                                 </div>
                              </div>
                              <div class="form-group guests-form">
                                 <div class="div">
                                    <div class="guest-quantity">
                                       <label for="">Adults</label>
                                       <select class="amount2" name="Adult">
                                          <option value="1" selected>1</option>
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
                                       <label for="">Child</label>
                                       <select class="amount2" name="Adult">
                                          <option value="1" selected>1</option>
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

                                 <div>

                                 </div>
                              </div>
                              <div class="form-group btn-form">
                                  <!--<a href="confirm.jsp" class="search-btn-booking">-->
                                      
                                  
                                      <button type="submit" class="btn-search1">
                                    Search Rooms
                                      </button>
                                 <!--</a>-->
                              </div>
                           </form>
                        </div>
                     </div>
                     <div class="booking-content booking-content2 active-form">
                        <form action="/Enquiry/Create" id="form-submid__enquiry" class="form-submid__enquiry">
                           <div class="form-group">
                              <label for="">Full Name*</label>
                              <input type="text" name="Name" class="form-control">
                           </div>
                           <div class="form-group">
                              <label for="">Email*</label>
                              <input type="text" name="Email" class="form-control">
                           </div>
                           <div class="form-group">
                              <label for="">Your enquiry*</label>
                              <textarea name="Enquiry" id="" cols="30" rows="10" class="form-control"></textarea>
                           </div>
                           <div class="check-agree">
                              <input type="checkbox" name="ckbox" id="" class="check-box" required>
                              <label for="">
                                 * I agree with Terms of Service and Privacy Statement.
                              </label>
                           </div>
                           <div class="form-btn">
                              <input type="submit" class="submid-enquiry" value="submid enquiry">

                           </div>
                        </form>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
</c:forEach>
   </div>

   <div class="gallery-horizontal">
      <ul class="gallery-list">
         <li class="gallery-item">
             <img class="img-fluid" src="images/bl-img.jpg" alt="">
         </li>
         <li class="gallery-item">
            <img src="images/gll-ho2.jpg" alt="">
         </li>
         <li class="gallery-item">
            <img src="images/gll-ho4.jpg" alt="">
         </li>
         <li class="gallery-item">
            <img src="images/gll-ho6.jpg" alt="">
         </li>
      </ul>
   </div>

   <div class="services_section layout_padding">
      <div class="container">
         <h1 class="more-room text-center">More Rooms </h1>

         <div class="services_section_2">
            <div class="row">
                
               <div class="col-md-4">
                  <div class="room">
                     <img src="images/deluxeCity.jpg" class="room-img">
                     <div class="price">
                        <p>From $30/Night</p>
                     </div>
                     <div class="room-item">
                        <h2 class="room-name">Deluxe City View</h2>
                        <ul class="room-info">
                           <li>
                              <i class="fa-solid fa-bed"></i>
                              2 Double Bed
                           </li>
                           <li>
                              <i class="fa-solid fa-person"></i>
                              2 Guests
                           </li>
                        </ul>
                        <a class="room-link" href="booking.html">READ MORE
                           <i class="fa-solid fa-chevron-right"></i>
                        </a>
                     </div>
                  </div>
                  <!-- <div class="btn_main"><a href="#">Rafting</a></div> -->

               </div>
               <div class="col-md-4">
                  <div class="room">
                     <img src="images/Balcony.jpg" class="">
                     <div class="price">
                        <p>From $30/Night</p>
                     </div>
                     <div class="room-item">
                        <h2 class="room-name">Balcony Triple Suite</h2>
                        <ul class="room-info">
                           <li>
                              <i class="fa-solid fa-bed"></i>
                              2 Double Bed
                           </li>
                           <li>
                              <i class="fa-solid fa-person"></i>
                              2 Guests
                           </li>
                        </ul>
                        <a class="room-link" href="booking.html">READ MORE
                           <i class="fa-solid fa-chevron-right"></i>
                        </a>
                     </div>
                  </div>
               </div>
               <div class="col-md-4">
                  <div class="room">
                      <img src="images/senior.jpg" class="">
                     <div class="price">
                        <p>From $30/Night</p>
                     </div>
                     <div class="room-item">
                        <h2 class="room-name">Senior De.City view</h2>
                        <ul class="room-info">
                           <li>
                              <i class="fa-solid fa-bed"></i>
                              2 Double Bed
                           </li>
                           <li>
                              <i class="fa-solid fa-person"></i>
                              2 Guests
                           </li>
                        </ul>
                        <a class="room-link" href="booking.html">READ MORE
                           <i class="fa-solid fa-chevron-right"></i>
                        </a>
                     </div>
                  </div>
               </div>
            </div>
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
   <script>
      var bookRoom = document.querySelector('#booking-tab1')
      var enquiry = document.querySelector('#booking-tab2')
      var active = document.querySelector('.active')
      var bookingContent1 = document.querySelector('.booking-content1')
      var bookingContent2 = document.querySelector('.booking-content2')

      enquiry.addEventListener('click', function () {
         bookRoom.classList.toggle('active')
         enquiry.classList.toggle('active')
         bookingContent1.classList.toggle('active-form')
         bookingContent2.classList.toggle('active-form')

      })

      bookRoom.addEventListener('click', function () {
         bookRoom.classList.toggle('active')
         enquiry.classList.toggle('active')
         bookingContent1.classList.toggle('active-form')
         bookingContent2.classList.toggle('active-form')
      })
   </script>
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