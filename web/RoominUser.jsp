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
            List<ChiTietThuePhong> listCTTP = (List<ChiTietThuePhong>) request.getAttribute("listCTTP");
            if (listCTTP == null) {
                response.sendRedirect("ListRoominUser");
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

                        .modal {
                            display: none;
                            position: fixed;
                            left: 0;
                            top: 0;
                            width: 100%;
                            height: 100%;
                            overflow: auto;
                            background-color: rgba(0,0,0,0.4);
                        }

                        .modal-contentt {
                            background-color: #fefefe;
                            margin: 15% auto;
                            padding: 20px;
                            border: 1px solid #888;
                            width: 80%;
                            max-width: 600px;
                            box-shadow: 0 0 10px rgba(0,0,0,0.3);
                            border-radius: 10px;
                        }

                        .modal-contentt h2,.modal-contentt p{
                            margin:16px 0;
                        }

                        .modal-contentt p{
                            font-size:20px;
                        }

                        .close {
                            color: #aaa;
                            float: right;
                            font-size: 28px;
                            font-weight: bold;
                        }

                        .close:hover,
                        .close:focus {
                            color: black;
                            text-decoration: none;
                            cursor: pointer;
                        }

                        .btn{
                            padding: 10px 35px;
                            color:white;
                            border:none;
                            border-radius: 5px;
                            font-size: 16px;
                        }

                        .btn-err{
                            background-color: #dc3545;
                        }

                        .btn-err:hover{
                            opacity: 0.8;
                            cursor: pointer;
                        }

                        .btn-confirm{
                            background-color:#5D87FF;
                        }

                        table {
                            border-collapse: collapse;
                            font-size: 16px;
                            width: 100%;
                            box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);

                        }

                        th,
                        td {
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

                        caption {
                            font-size: 24px;
                            font-weight: bold;
                            margin: 20px;
                        }

                        .fail {
                            padding: 5px 10px;
                            background: #dc3545;
                            color: white;
                            border-radius: 5px;
                        }

                        .success {
                            padding: 5px 10px;
                            background: #28a745;
                            color: white;
                            border-radius: 5px;
                        }

                    </style>

                    <!--  Header End -->
                    <div class="container-fluid">
                        <h1 class="title text-center">My Room</h1>
                        <table>
                            <thead>
                                <tr>
                                    <th>Room ID</th>
                                    <th>Name Room</th>
                                    <th>Date Check In</th>
                                    <th>Date Check Out</th>
                                    <th class="text-center">Edit</th>
                                </tr>
                            </thead>
                        <c:forEach items="${listCTTP}" var ="s">
                            <c:if test="${sessionScope.acc.user == s.iDKhachHang}">
                                <tbody>
                                    <tr>
                                        <td>${s.iDPhong}</td>
                                        <td>${s.tenLoaiPhong}</td>
                                        <td>${s.ngayNhanPhong}</td>
                                        <td>${s.ngayTraPhong}</td>
                                        <td>
                                            <a href="CheckInformationRoom?pid=${s.iDChiTietThuePhong}" class="btn btn-primary"
                                               data-toggle="modal">Check</a>
                                            <button class="btn btn-primary" onclick="openModal()">Delete</button>
                                            <a href="UpdateRoom?pid=${s.iDChiTietThuePhong}&zid=${s.idNgayDaDatPhong}&checkIn=${s.ngayNhanPhong}&checkOut=${s.ngayTraPhong}&adult=${s.soLuongNguoiLon}&child=${s.soLuongTreEm}"
                                               class="btn btn-primary" data-toggle="modal">Update</a>
                                            <a href="UpdateDate?rid=${s.iDPhong}&pid=${s.iDChiTietThuePhong}&zid=${s.idNgayDaDatPhong}&checkIn=${s.ngayNhanPhong}&checkOut=${s.ngayTraPhong}&adult=${s.soLuongNguoiLon}&child=${s.soLuongTreEm}"
                                               class="btn btn-primary" data-toggle="modal">Update Date</a>
                                        </td>
                                    </tr>
                                </tbody>
                                <div id="myModal" class="modal">
                                    <div class="modal-contentt">
                                        <span class="close" onclick="closeModal()">&times;</span>
                                        <h2>Cancellation confirmation</h2>
                                        <p>If you confirm the cancellation, you will lose the entire deposit</p>
                                        <button onclick="closeModal()" class="btn btn-err">Cancle</button>
                                        <a href="RemoveChiTietThuePhongUser?pid=${s.iDThuePhong}&rid=${s.iDPhong}&zid=${s.idNgayDaDatPhong}&tid=${s.iDChiTietThuePhong}" class="btn btn-confirm openConfirm" data-toggle="modal">Confirm</a>
                                    </div>
                                </div>
                            </c:if>
                        </c:forEach>
                    </table>
                </div>
            </div>


        </div>

        <script>
            function openModal() {
                document.getElementById("myModal").style.display = "block";
            }

            function closeModal() {
                document.getElementById("myModal").style.display = "none";
            }
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