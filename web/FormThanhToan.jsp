<%@page import="entity.ThuePhong"%>
<%@page import="java.util.List"%>
<!doctype html>
<html lang="en">

    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Modernize Free</title>
        <link rel="shortcut icon" type="image/png" href="../assets/images/logos/favicon.png" />
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
                <header class="app-header">
                    <nav class="navbar navbar-expand-lg navbar-light">
                        <ul class="navbar-nav">
                            <li class="nav-item d-block d-xl-none">
                                <a class="nav-link sidebartoggler nav-icon-hover" id="headerCollapse" href="javascript:void(0)">
                                    <i class="ti ti-menu-2"></i>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link nav-icon-hover" href="javascript:void(0)">
                                    <i class="ti ti-bell-ringing"></i>
                                    <div class="notification bg-primary rounded-circle"></div>
                                </a>
                            </li>
                        </ul>
                        <div class="navbar-collapse justify-content-end px-0" id="navbarNav">
                            <ul class="navbar-nav flex-row ms-auto align-items-center justify-content-end">
                                <a href="https://adminmart.com/product/modernize-free-bootstrap-admin-dashboard/" target="_blank" class="btn btn-primary">Download Free</a>
                                <li class="nav-item dropdown">
                                    <a class="nav-link nav-icon-hover" href="javascript:void(0)" id="drop2" data-bs-toggle="dropdown"
                                       aria-expanded="false">
                                        <img src="../assets/images/profile/user-1.jpg" alt="" width="35" height="35" class="rounded-circle">
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-end dropdown-menu-animate-up" aria-labelledby="drop2">
                                        <div class="message-body">
                                            <a href="javascript:void(0)" class="d-flex align-items-center gap-2 dropdown-item">
                                                <i class="ti ti-user fs-6"></i>
                                                <p class="mb-0 fs-3">My Profile</p>
                                            </a>
                                            <a href="javascript:void(0)" class="d-flex align-items-center gap-2 dropdown-item">
                                                <i class="ti ti-mail fs-6"></i>
                                                <p class="mb-0 fs-3">My Account</p>
                                            </a>
                                            <a href="javascript:void(0)" class="d-flex align-items-center gap-2 dropdown-item">
                                                <i class="ti ti-list-check fs-6"></i>
                                                <p class="mb-0 fs-3">My Task</p>
                                            </a>
                                            <a href="./authentication-login.html" class="btn btn-outline-primary mx-3 mt-2 d-block">Logout</a>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </header>
                <style>
                    body{
                        margin-top:20px;
                        color: #2e323c;
                        background: #f5f6fa;
                        position: relative;
                        height: 100%;
                    }
                    .invoice-container {
                        padding: 1rem;
                    }
                    .invoice-container .invoice-header .invoice-logo {
                        margin: 0.8rem 0 0 0;
                        display: inline-block;
                        font-size: 1.6rem;
                        font-weight: 700;
                        color: #2e323c;
                    }
                    .invoice-container .invoice-header .invoice-logo img {
                        max-width: 130px;
                    }
                    .invoice-container .invoice-header address {
                        font-size: 0.8rem;
                        color: #9fa8b9;
                        margin: 0;
                    }
                    .invoice-container .invoice-details {
                        margin: 1rem 0 0 0;
                        padding: 1rem;
                        line-height: 180%;
                        background: #f5f6fa;
                    }
                    .invoice-container .invoice-details .invoice-num {
                        text-align: right;
                        font-size: 0.8rem;
                    }
                    .invoice-container .invoice-body {
                        padding: 1rem 0 0 0;
                    }
                    .invoice-container .invoice-footer {
                        text-align: center;
                        font-size: 0.7rem;
                        margin: 5px 0 0 0;
                    }

                    .invoice-status {
                        text-align: center;
                        padding: 1rem;
                        background: #ffffff;
                        -webkit-border-radius: 4px;
                        -moz-border-radius: 4px;
                        border-radius: 4px;
                        margin-bottom: 1rem;
                    }
                    .invoice-status h2.status {
                        margin: 0 0 0.8rem 0;
                    }
                    .invoice-status h5.status-title {
                        margin: 0 0 0.8rem 0;
                        color: #9fa8b9;
                    }
                    .invoice-status p.status-type {
                        margin: 0.5rem 0 0 0;
                        padding: 0;
                        line-height: 150%;
                    }
                    .invoice-status i {
                        font-size: 1.5rem;
                        margin: 0 0 1rem 0;
                        display: inline-block;
                        padding: 1rem;
                        background: #f5f6fa;
                        -webkit-border-radius: 50px;
                        -moz-border-radius: 50px;
                        border-radius: 50px;
                    }
                    .invoice-status .badge {
                        text-transform: uppercase;
                    }

                    @media (max-width: 767px) {
                        .invoice-container {
                            padding: 1rem;
                        }
                    }


                    .custom-table {
                        border: 1px solid #e0e3ec;
                    }
                    .custom-table thead {
                        background: #007ae1;
                    }
                    .custom-table thead th {
                        border: 0;
                        color: #ffffff;
                    }
                    .custom-table > tbody tr:hover {
                        background: #fafafa;
                    }
                    .custom-table > tbody tr:nth-of-type(even) {
                        background-color: #ffffff;
                    }
                    .custom-table > tbody td {
                        border: 1px solid #e6e9f0;
                    }


                    .card {
                        background: #ffffff;
                        -webkit-border-radius: 5px;
                        -moz-border-radius: 5px;
                        border-radius: 5px;
                        border: 0;
                        margin-bottom: 1rem;
                    }

                    .text-success {
                        color: #00bb42 !important;
                    }

                    .text-muted {
                        color: #9fa8b9 !important;
                    }

                    .custom-actions-btns {
                        margin: auto;
                        display: flex;
                        justify-content: flex-end;
                    }

                    .custom-actions-btns .btn {
                        margin: .3rem 0 .3rem .3rem;
                    }

                </style>
                <!--  Header End -->
                <div class="container">
                    <div class="row gutters">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="card">
                                <div class="card-body p-0">
                                    <div class="invoice-container">
                                        <div class="invoice-header">
                                            <!-- Row start -->
                                            <div class="row gutters">
                                                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12">
                                                    <div class="custom-actions-btns mb-5">
                                                        <a href="#" class="btn btn-primary">
                                                            <i class="icon-download"></i> Download
                                                        </a>
                                                        <a href="#" class="btn btn-secondary">
                                                            <i class="icon-printer"></i> Print
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- Row end -->
                                            <!-- Row start -->
                                            <div class="text-center">
                                                Hoa Don
                                            </div>
                                            <div class="row gutters">
                                                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6">
                                                    <a href="index.html" class="invoice-logo">
                                                        Bootdey.com
                                                    </a>
                                                </div>
                                                <div class="col-lg-6 col-md-6 col-sm-6">
                                                    <address class="text-right">
                                                        Maxwell admin Inc, 45 NorthWest Street.<br>
                                                        Sunrise Blvd, San Francisco.<br>
                                                        00000 00000
                                                    </address>
                                                </div>
                                            </div>
                                            <!-- Row end -->
                                            <!-- Row start -->
                                            <div class="row gutters">
                                                <div class="col-xl-9 col-lg-9 col-md-12 col-sm-12 col-12">
                                                    <div class="invoice-details">
                                                        <address>
                                                            Alex Maxwell<br>
                                                            150-600 Church Street, Florida, USA
                                                        </address>
                                                    </div>
                                                </div>
                                                <div class="col-xl-3 col-lg-3 col-md-12 col-sm-12 col-12">
                                                    <div class="invoice-details">
                                                        <div class="invoice-num">
                                                            <div>Invoice - #009</div>
                                                            <div>January 10th 2020</div>
                                                        </div>
                                                    </div>													
                                                </div>
                                            </div>
                                            <!-- Row end -->
                                        </div>
                                        <div class="invoice-body">
                                            <!-- Row start -->
                                            <div class="row gutters">
                                                <div class="col-lg-12 col-md-12 col-sm-12">
                                                    <div class="table-responsive">
                                                        <table class="table custom-table m-0">
                                                            <thead>
                                                                <tr>
                                                                    <th>Room</th>
                                                                    <th>ROOM ID</th>
                                                                    <th>Quantity</th>
                                                                    <th>Price</th>
                                                                </tr>
                                                            </thead>
                                                            
                                                            <c:forEach items="${listR}" var ="s">
                                                                
                                                            <tbody>
                                                                <tr>
                                                                    <td>
                                                                        ${s.tenPhong}
                                                                        <p class="m-0 text-muted">
                                                                            Reference site about Lorem Ipsum, giving information on its origins.
                                                                        </p>
                                                                    </td>
                                                                    <td>#50000981</td>
                                                                    <td>9</td>
                                                                    <td>$5000.00</td>
                                                                </tr>
                                                                <tr>
                                                                    <td>
                                                                        Maxwell Admin Template
                                                                        <p class="m-0 text-muted">
                                                                            As well as a random Lipsum generator.
                                                                        </p>
                                                                    </td>
                                                                    <td>#50000126</td>
                                                                    <td>5</td>
                                                                    <td>$100.00</td>
                                                                </tr>
                                                                <tr>
                                                                    <td>
                                                                        Unify Admin Template
                                                                        <p class="m-0 text-muted">
                                                                            Lorem ipsum has become the industry standard.
                                                                        </p>
                                                                    </td>
                                                                    <td>#50000821</td>
                                                                    <td>6</td>
                                                                    <td>$49.99</td>
                                                                </tr>
                                                                <tr>
                                                                    <td>&nbsp;</td>
                                                                    <td colspan="2">
                                                                        <p>
                                                                            Subtotal<br>
                                                                            Shipping &amp; Handling<br>
                                                                            Tax<br>
                                                                        </p>
                                                                        <h5 class="text-success"><strong>Grand Total</strong></h5>
                                                                    </td>			
                                                                    <td>
                                                                        <p>
                                                                            $5000.00<br>
                                                                            $100.00<br>
                                                                            $49.00<br>
                                                                        </p>
                                                                        <h5 class="text-success"><strong>$5150.99</strong></h5>
                                                                    </td>
                                                                </tr>
                                                            </tbody>
                                                            </c:forEach>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- Row end -->
                                        </div>
                                        <div class="invoice-footer">
                                            Thank you for your Business.
                                        </div>
                                    </div>
                                </div>
                            </div>
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