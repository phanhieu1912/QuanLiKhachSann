<%@page import="entity.Review"%>
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
    <style>
        table {
            border-collapse: collapse;
            font-size: 16px;
            width: 100%;
            box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);

        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
            font-weight: bold;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #ddd;
        }

        .caption {
            font-size: 24px;
            font-weight: bold;
            text-align: center;
            margin: 20px 0;
        }

        .fail{
            padding: 5px 10px;
            background: #dc3545;
            color:white;
            border-radius: 5px ;
        }

        .success{
            padding: 5px 10px;
            background: #28a745;
            color:white;
            border-radius: 5px ;
        }

        .active{
            padding: 5px 10px;
            background: #007bff;
            color:white;
            border-radius: 5px ;
        }
    </style>

    <body>
        <%
            List<ThuePhong> listTT = (List<ThuePhong>) request.getAttribute("listTT");
            if (listTT == null) {
                response.sendRedirect("ListThanhToan");
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

                    <div class="container-fluid">
                        <h1 class="caption">Payment Page</h1>
                        <table>

                            <thead>
                                <tr>
                                    <th>Room Rental ID</th>
                                    <th>Name Customer</th>
                                    <th>ID Customer</th>
                                    <th>Pay</th>

                                </tr>
                            </thead>
                        <c:forEach items="${listTT}" var ="s">
                            <tbody>

                                <tr>
                                    <td>${s.iDThuePhong}</td>
                                    <td>${s.tenKhachHang}</td>
                                    <td>${s.iDKhachHang}</td>
                                    <td>
           <a href="BillByIDThuePhong?iDThuePhong=${s.iDThuePhong}&maHoaDon=${s.maHoaDon}&iDHoaDon=${s.iDHoaDon}" class="btn btn-danger openConfirm" data-toggle="modal">Payment</a>
                                    </td>

                                </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                </div>
            </div>


        </div>
        <script>
            let statusList = document.querySelectorAll('.status label')
            console.log(status.length)
            console.log(status.innerHTML)
            statusList.forEach(status => {
                if (status.innerHTML == "0") {
                    status.innerHTML = 'Cancelled'
                    status.classList.add("fail")
                } else {
                    status.innerHTML = 'Active'
                    status.classList.add("active")
                }
            })

        </script>
        <script src="../assets/libs/jquery/dist/jquery.min.js"></script>
        <script src="../assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
        <script src="../assets/js/sidebarmenu.js"></script>
        <script src="../assets/js/app.min.js"></script>
        <script src="../assets/libs/apexcharts/dist/apexcharts.min.js"></script>
        <script src="../assets/libs/simplebar/dist/simplebar.js"></script>
        <script src="../assets/js/dashboard.js"></script>
    </body>

</html>