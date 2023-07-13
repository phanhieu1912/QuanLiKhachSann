<%@page import="entity.ChiTietThuePhong"%>
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
        <title>About</title>
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
    <style>
        .review-container {
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            background-color: #f9f9f9;
            width: 100%;
            margin: 20px auto;
        }

        .stars {
            display: flex;
            flex-direction: row;
            align-items: center;
            margin-bottom: 10px;
        }

        .star {
            font-size: 20px;
            color: #ccc;
            cursor: pointer;
            transition: color 0.3s ease-in-out;
            text-decoration: none;
        }

        .star:hover,
        .star.active {
            color: #ffcc00;
        }

        .review-textarea {
            width: 100%;
            height: 100px;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            resize: none;
            font-size: 20px;
        }

        .review-input{
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            resize: none;
            font-size: 20px;
        }

        .btn-container {
            display: flex;
            flex-direction: row;
            align-items: center;
            justify-content: center;
        }

        button {
            padding: 10px 20px;
            border: none;
            color: white;
            cursor: pointer;
            margin: 0 10px;
            transition: background-color 0.3s ease-in-out;
            border-radius: 30px;
            background-color: #000d10;
            width:30%;
            font-size: 20px;
        }

        button:hover {
            opacity: 0.8;
            cursor: pointer;
        }

        .input-hiden{
            display:none;
        }
        
        input[type="radio"] {
  display: none;
}

label {
  font-size: 40px;
  color: #ccc;
  cursor: pointer;
}

input[type="radio"]:checked ~ label {
  color: #ffcc00;
}

.input-hidden{
    display:none;
}
    </style>

    <body>
        <%
            List<ChiTietThuePhong> list = (List<ChiTietThuePhong>) request.getAttribute("list");
            if (list == null) {
                response.sendRedirect("Review");
            }
        %>
        <!-- header section start -->
        <div class="header_section">
            <jsp:include page="Navbar.jsp"></jsp:include>
            </div>
            <!-- header section end -->
            <!-- contact section start -->
            <div class="contact_section layout_padding">
                <div class="container">
                    <h1 class="contact_taital">Request A Call Back</h1>
                    <form action="AddReview"  method="get">
                        <div class="email_text">
                            <div class="form-group">
                            <c:forEach items="${list}" var ="s"> 
                                <div class="review-container">
                                    <div class="stars">
                                        <input type="radio" name="rating" id="star1" value="5">
                                        <label for="star1">&#9733;</label>
                                        <input type="radio" name="rating" id="star2" value="4">
                                        <label for="star2">&#9733;</label>
                                        <input type="radio" name="rating" id="star3" value="4">
                                        <label for="star3">&#9733;</label>
                                        <input type="radio" name="rating" id="star4" value="2">
                                        <label for="star4">&#9733;</label>
                                        <input type="radio" name="rating" id="star5" value="1">
                                        <label for="star5">&#9733;</label>
                                    </div>

                                    <input type="text" class="review-input" placeholder="User" name="user" value="${sessionScope.acc.user}">
                                    <input type="text" class="review-input" placeholder="Name" name="name"value="${s.tenKhachHang}">
                                    <input type="text" class="review-input" placeholder="Room" name="room" value="${s.iDPhong}">
                                    <input type="text" class="review-input" placeholder="Email" name="Email"value="${s.email}">
                                    <input type="text" class="input-hidden review-input" placeholder="Email" name="imgKH"value="${s.imgKhachHang}">
                                    <input type="text" id="myDate" name="date" class="input-hidden review-input" placeholder="date" name="Email"value="">
                                    <input type="text"  class="input-hidden review-input" placeholder="date" name="iDChiTietThuePhong"value="${s.iDChiTietThuePhong}">
                                    <textarea name="review" class="review-textarea" placeholder="Enter Your Reviews"></textarea>
                                </c:forEach>
                            </div>
                        </div>

                        <div class="btn-container">
                            <button type="submit">SEND</button>
                            <button onclick="resetReview()">RESET</button>
                        </div>

                    </div>
                </form>
            </div>
        </div>
        <!-- contact section end -->
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
            let rating = 0;

            function setRating(num) {
                rating = num;
                updateStars();
            }

            function updateStars() {
                const stars = document.querySelectorAll(".star");
                stars.forEach((star, index) => {
                    if (index < rating) {
                        star.classList.add("active");
                    } else {
                        star.classList.remove("active");
                    }
                })
            }

            function resetReview() {
                rating = 0;
                document.querySelector(".review-textarea").value = "";
                updateStars();
            }

            function submitReview() {
                const reviewText = document.querySelector(".review-textarea").value;
                if (rating > 0 && reviewText !== "") {
                    alert("Your review has been submitted.");
                    resetReview();
                } else {
                    alert("Please choose the number of stars and write your review.");
                }
            }

            var date = new Date();
            var year = date.getFullYear();
            var month = String(date.getMonth() + 1).padStart(2, '0');
            var todayDate = String(date.getDate()).padStart(2, '0');
            var datePattern = year + '-' + month + '-' + todayDate;


            document.getElementById("myDate").value = datePattern;
            document.getElementById("myDate").min = datePattern;
        </script>
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