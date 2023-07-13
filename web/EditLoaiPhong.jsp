<%@page import="entity.LoaiPhong"%>
<%@page import="java.util.List"%>
<%@page import="entity.NhanVienLeTan"%>
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
  <link rel="stylesheet" href="css/responsive.css">
  <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <!-- style css -->
        <!-- Responsive-->
        <link rel="stylesheet" href="css/responsive.css">
</head>

<body>
    <%
            List<LoaiPhong> list = (List<LoaiPhong>) request.getAttribute("list");
            if (list == null) {
                response.sendRedirect("ListLoaiPhong");
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
                     width: 100%; 
                }

                .empty-room-trang-bi{
                    display:flex;
                    justify-content: space-between;
                }

                .empty-room-date,.empty-room-room-id,.empty-room-trang-bi{
                    font-size: 20px;
                    color:black;
                }
                
                .button-room-active a:first-child{
                    margin-left: 100px;
                }
                
                .btn{
                    width: 80px;
                }
                
                .thao-tac{
                    float:right;
                    padding-bottom: 30px;
                }
                .room-item{
    padding: 30px 30px 60px 30px;
    display:block;
}
            </style>
      <div class="container-fluid">
                
                <div class="services_section_2">
                    <div class="row">

                        <c:forEach items="${list}" var ="o">
                            <div class="col-md-4">
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
                                            <div class="thao-tac">
                                                <a href="ListLoaiPhongByID?pid=${o.iDLoaiPhong}" class="btn btn-primary">Edit</a>
                                                <a href="DeleteLoaiPhong?pid=${o.iDLoaiPhong}" class="btn btn-danger">Delete</a>
                                            </div>
                                        
                                    </div>
                                </div>
                            </div>
                        </c:forEach>         
                    </div>

                </div>
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