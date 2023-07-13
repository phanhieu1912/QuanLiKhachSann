<%@page import="entity.LoaiPhong"%>
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
                    
                    .input-hidden{
                        display:none;
                    }
                </style>

                <div class="container-fluid">
                    <form action="AddNewLoaiPhong" method="get">
                        
                    
                        
                            <div class="room-date">
                                 <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text" id="basic-addon1">ID Loai Phong</span>
                                    </div>
                                    <input name="idphong" type="text" class="form-control" placeholder="ID Loai Phong" aria-label="Username" aria-describedby="basic-addon1">
                                </div>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text" id="basic-addon1">Room Name</span>
                                    </div>
                                    <input name="namee" type="text" class="form-control" placeholder="Room Name" aria-label="Username" aria-describedby="basic-addon1">
                                </div>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text" id="basic-addon1">Link image</span>
                                    </div>
                                    <input name="linkImg" type="text"  class="form-control"  placeholder="Link image" aria-label="Username" aria-describedby="basic-addon1">
                                    <input name="idLoaiPhong" type="text"  class="form-control input-hidden"  placeholder="" aria-label="Username" aria-describedby="basic-addon1">
                                </div>
                                
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="basic-addon1">Trang Bi</span>
                                </div>
                                <input name="trangbi" type="text"  class="form-control" placeholder="Trang Bi" aria-label="Username" aria-describedby="basic-addon1">
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="basic-addon1">People</span>
                                </div>
                                <input name="soNguoi" type="text"  class="form-control" placeholder="People" aria-label="Username" aria-describedby="basic-addon1">
                            </div>
                            
                            
                            <div class="row gutters">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="text-right">
                            <a href="manager.jsp" class="btn btn-primary">Cancel</a>
                            <button type="submit" id="submit" name="submit" class="btn btn-primary">Update</button>
                          </div>
                        </div>
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