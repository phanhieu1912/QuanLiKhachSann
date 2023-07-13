<%@page import="entity.KhachHang"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Modernize Free</title>
        <link rel="shortcut icon" type="image/png" href="../assets/images/logos/favicon.png" />
        <link rel="stylesheet" href="./fontawesome-free-6.4.0-web/css/all.css" />
        <link rel="stylesheet" href="css/EditInformationCSS.css"/>
        <link rel="stylesheet" href="css/ManagerStyles.min.css" />
    </head>

    <body>
        <%
            List<KhachHang> listR = (List<KhachHang>) request.getAttribute("listR");
            if (listR == null) {
                response.sendRedirect("ListInformationAccount");
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
                        .input-hidden{
                            display:none;
                        }
                    </style>
                    <div class="container-fluid">
                        <form action="UpdateInformationAccount" method="get">
                            <div class="container">
                            <c:forEach items="${listR}" var ="s">
                                <c:if test="${sessionScope.acc.user == s.idkhachhang}">
                                    <div class="row gutters">
                                        <div class="col-xl-3 col-lg-3 col-md-12 col-sm-12 col-12">
                                            <div class="card h-100">
                                                <div class="card-body">
                                                    <div class="account-settings">
                                                        <div class="user-profile">
                                                            <div class="user-avatar">
                                                                <img src="${s.imgKhachHang}" alt="${s.tenKhachHang}">
                                                            </div>
                                                            <h5 class="user-name">${s.tenKhachHang}</h5>
                                                            <h6 class="user-email">${s.email}</h6>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xl-9 col-lg-9 col-md-12 col-sm-12 col-12">
                                            <div class="card h-100">
                                                <div class="card-body">
                                                    <div class="row gutters">
                                                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                                                            <h6 class="mb-2 text-primary">Personal Details</h6>
                                                        </div>
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                                                            <div class="form-group">
                                                                <label for="fullName">Full Name</label>
                                                                <input name="nameKH" type="text" class="form-control" id="fullName" placeholder="Enter full name" value="${s.tenKhachHang}">
                                                                <input class="input-hidden" name="idKH" type="text" class="form-control" id="fullName" placeholder="Enter full name" value="${sessionScope.acc.user}">
                                                                <input class="input-hidden" name="imgKH" type="text" class="form-control" id="fullName" placeholder="Enter full name" value="${s.imgKhachHang}">
                                                            </div>
                                                        </div>
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                                                            <div class="form-group">
                                                                <label for="eMail">Email</label>
                                                                <input name="emailKH" type="email" class="form-control" id="eMail" placeholder="Enter Gioi Tinh" value="${sessionScope.acc.email}">
                                                            </div>
                                                        </div>
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                                                            <div class="form-group">
                                                                <label for="eMail">Gioi Tinh</label>
                                                                <input name="gioiTinhKH" type="text" class="form-control" id="eMail" placeholder="Enter email ID" value="${s.gioiTinh}">
                                                            </div>
                                                        </div>
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                                                            <div class="form-group">
                                                                <label for="phone">Phone</label>
                                                                <input name="phoneKH" type="text" class="form-control" id="phone" placeholder="Enter phone number" value="${s.phoneNumber}">
                                                            </div>
                                                        </div>
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                                                            <div class="form-group">
                                                                <label for="website">CMND</label>
                                                                <input name="cmndKH" type="text" class="form-control" id="website" placeholder="CMND" value="${s.cMND}">
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row gutters">
                                                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                                                            <h6 class="mt-3 mb-2 text-primary">Address</h6>
                                                        </div>
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                                                            <div class="form-group">
                                                                <label for="Street">Address</label>
                                                                <input name="diaChiKH" type="text" class="form-control" id="Street" placeholder="Enter Address" value="${s.diaChi}">
                                                            </div>
                                                        </div>
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                                                            <div class="form-group">
                                                                <label for="ciTy">Country</label>
                                                                <input name="quocTichKH" type="text" class="form-control" id="ciTy" placeholder="Enter Country" value="${s.quocTich}">
                                                            </div>
                                                        </div>

                                                    </div>
                                                    <div class="row gutters">
                                                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                                                            <div class="text-right">
                                                                <button type="submit" id="submit" name="submit" class="btn btn-secondary">Cancel</button>
                                                                <button type="submit" id="submit" name="submit" class="btn btn-primary">Update</button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </c:if>
                            </c:forEach>
                        </div>
                    </form>

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