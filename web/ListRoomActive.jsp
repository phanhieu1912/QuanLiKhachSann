<%@page import="entity.ChiTietThuePhong"%>
<%@page import="entity.ThuePhong"%>
<%@page import="java.util.List"%>
<!doctype html>
<html lang="en">

    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Modernize Free</title>
        <link rel="shortcut icon" type="image/png" href="../assets/images/logos/favicon.png" />
        <link rel="stylesheet" href="./fontawesome-free-6.4.0-web/css/all.css" />
        <link rel="stylesheet" href="css/ManagerStyles.min.css" />
    </head>

    <body>
        <%
            List<ChiTietThuePhong> listTP = (List<ChiTietThuePhong>) request.getAttribute("listTP");
            if (listTP == null) {
                response.sendRedirect("ListThuePhong");
            }
        %>
        <!--  Body Wrapper -->
        <div class="page-wrapper" id="main-wrapper" data-layout="vertical" data-navbarbg="skin6" data-sidebartype="full"
             data-sidebar-position="fixed" data-header-position="fixed">
            <!-- Sidebar Start -->
            <aside class="left-sidebar">
                <!-- Sidebar scroll-->
                <div>
                    <div class="brand-logo d-flex align-items-center justify-content-between">
                        <a href="./index.html" class="text-nowrap logo-img">
                            <img src="../assets/images/logos/dark-logo.svg" width="180" alt="" />
                        </a>
                        <div class="close-btn d-xl-none d-block sidebartoggler cursor-pointer" id="sidebarCollapse">
                            <i class="ti ti-x fs-8"></i>
                        </div>
                    </div>
                    <!-- Sidebar navigation-->
                    <jsp:include page="SideBar.jsp"></jsp:include>
                    <!-- End Sidebar navigation -->
                </div>
                <!-- End Sidebar scroll-->
            </aside>
            <!--  Sidebar End -->
            <!--  Main wrapper -->
            <div class="body-wrapper">
                <!--  Header Start -->
                
                <style>
                    .empty-room{
                        display:flex;
                        border:1px solid #ccc;
                        align-items: center;
                        /* justify-content:center; */
                        /* text-align: center; */
                    }

                    .empty-room-img img{
                        width:50px;
                    }

                    .empty-room-IDRoom{
                        color:black;
                        font-size:30px;

                    }

                    .empty-room-name{
                        margin:5px 0;
                    }

                    .title{
                        margin-bottom: 50px;
                    }

                    .empty-room-price{
                        color:black;
                        font-size: 20px;
                    }
                    .button-room-active{
                        display:flex;
                    }

                </style>
                <!--  Header End -->
                <div class="container-fluid">
                    <h1 class="title text-center">List room is active</h1>
                    <c:forEach items="${listTP}" var ="s">
                        
                            <div class="row empty-room">
                                <div  class="col-2 empty-room-IDRoom">
                                    <p>${s.iDPhong}</p>
                                </div>
                                <div class="col-3 empty-room-info">
                                    <h3 class="empty-room-name">${s.tenKhachHang}</h3>
                                    <ul class="empty-room-info">
                                        <li>${s.gioiTinh}</li>
                                        <li>${s.soLuongNguoiLon} adult</li>
                                        <li>${s.soLuongTreEm} child</li>
                                    </ul>
                                </div>
                                <div class="col-4">
                                    <div class="empty-room-ngayNhanPhong">
                                        <span>Check-in date:</span>
                                        ${s.ngayNhanPhong}</div>
                                    <div class="empty-room-ngayTraPhong">
                                        <span>Check-out date:</span>
                                        ${s.ngayTraPhong}</div>
                                        
                                </div>
                                <div class="col-3 button-room-active">
                                    <a href="CheckInformationRoom?pid=${s.iDChiTietThuePhong}" class="btn btn-primary" data-toggle="modal">Check</a>
                                    <a href="RemoveChiTietThuePhong?pid=${s.iDThuePhong}&rid=${s.iDPhong}&zid=${s.idNgayDaDatPhong}&tid=${s.iDChiTietThuePhong}" class="btn btn-danger openConfirm" data-toggle="modal">Done</a>
                                    <a href="Bill?idChiTietThuePhong=${s.iDChiTietThuePhong}" class="btn btn-danger openConfirm" data-toggle="modal">Bill</a>
                                </div>
                            </div>
                        
                    </c:forEach>

                </div>
            </div>
            
            
        </div>
        <script src="../assets/libs/jquery/dist/jquery.min.js"></script>
        <script src="../assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
        <script src="../assets/js/sidebarmenu.js"></script>
        <script src="../assets/js/app.min.js"></script>
        <script src="../assets/libs/apexcharts/dist/apexcharts.min.js"></script>
        <script src="../assets/libs/simplebar/dist/simplebar.js"></script>
        <script src="../assets/js/dashboard.js"></script>
    </body>

</html>