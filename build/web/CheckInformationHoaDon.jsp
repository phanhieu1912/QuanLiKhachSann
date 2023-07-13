<%@page import="entity.HoaDon"%>
<%@page import="entity.ChiTietThuePhong"%>
<%@page import="java.util.List"%>
<%@page import="entity.ThuePhong"%>
<!doctype html>
<html lang="en">

    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Modernize Free</title>
        <link rel="shortcut icon" type="image/png" href="../assets/images/logos/favicon.png" />
        <link rel="stylesheet" href="./fontawesome-free-6.4.0-web/css/all.css" />
        <link rel="stylesheet" href="css/ManagerStyles.min.css" />
    </head>

    <body>
        <%
            List<HoaDon> listHD = (List<HoaDon>) request.getAttribute("listHD");
            if (listHD == null) {
                response.sendRedirect("CheckInformationHoaDon");
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
                
                <!--  Header End -->
                <style>
                    .room-number{
                        font-size: 30px;
                        color:black;
                        margin-bottom: 30px;
                    }
                    .input-group-prepend{
                        width: 20%;
                    }
                </style>

                <div class="container-fluid">
                        <c:forEach  items="${listHD}" var ="s">
                            
                            <div class="room-number">ID Bill: ${s.iDHoaDon}</div>
                            <div class="room-date">
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text" id="basic-addon1">Date Dat Coc</span>
                                    </div>
                                    <input type="text" value="${s.dateDatCoc}" class="form-control"  placeholder="" aria-label="Username" aria-describedby="basic-addon1">
                                </div>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text" id="basic-addon1">Date Total </span>
                                    </div>
                                    <input type="text" value="${s.dateTotal}" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
                                </div>
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="basic-addon1">prepayment</span>
                                </div>
                                <input type="text" value="${s.tienTraTruoc}" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
                            </div>
                           
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="basic-addon1">Total</span>
                                </div>
                                <input type="text" value="${s.tongTien}" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
                            </div>
                           
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="basic-addon1">Ma Hoa Don Dat Coc</span>
                                </div>
                                <input type="text" value="${s.maHoaDonDatCoc}" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="basic-addon1">Ma Hoa Don Total</span>
                                </div>
                                <input type="text" value="${s.maHoaDonTotal}" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="basic-addon1">Phone Customer</span>
                                </div>
                                <input type="text" value="${s.phoneNumber}" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="basic-addon1">Address Customer</span>
                                </div>
                                <input type="text" value="${s.diaChi}" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="basic-addon1">Nationality Customer</span>
                                </div>
                                <input type="text" value="${s.quocTich}" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="basic-addon1">CMND Customer</span>
                                </div>
                                <input type="text" value="${s.cMND}" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
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