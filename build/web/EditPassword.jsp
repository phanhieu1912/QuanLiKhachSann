<!doctype html>
<html lang="en">
  
<head>
  <meta charset="utf-8">
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        body {
          margin: 0;
          padding-top: 0;
          color: #2e323c;
          background: #f5f6fa;
          position: relative;
          height: 100%;
        }

        .account-settings .user-profile {
          margin: 0 0 1rem 0;
          padding-bottom: 1rem;
          text-align: center;
        }

        .account-settings .user-profile .user-avatar {
          margin: 0 0 1rem 0;
        }

        .account-settings .user-profile .user-avatar img {
          width: 90px;
          height: 90px;
          -webkit-border-radius: 100px;
          -moz-border-radius: 100px;
          border-radius: 100px;
        }

        .account-settings .user-profile h5.user-name {
          margin: 0 0 0.5rem 0;
        }

        .account-settings .user-profile h6.user-email {
          margin: 0;
          font-size: 0.8rem;
          font-weight: 400;
          color: #9fa8b9;
        }

        .account-settings .about {
          margin: 2rem 0 0 0;
          text-align: center;
        }

        .account-settings .about h5 {
          margin: 0 0 15px 0;
          color: #007ae1;
        }

        .account-settings .about p {
          font-size: 0.825rem;
        }

        .form-control {
          border: 1px solid #cfd1d8;
          -webkit-border-radius: 2px;
          -moz-border-radius: 2px;
          border-radius: 2px;
          font-size: .825rem;
          background: #ffffff;
          color: #2e323c;
        }

        .card {
          background: #ffffff;
          -webkit-border-radius: 5px;
          -moz-border-radius: 5px;
          border-radius: 5px;
          border: 0;
          margin-bottom: 1rem;
        }
        
        .card-body{
            padding-top:150px;
        }

        .card-body input {
          margin: 10px 0;
        }
      </style>
      <form action="EditControl" method="post">
          <div class="container-fluid">
        <div class="container">
          <div class="row gutters">
            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
              <div class="card h-100">
                <div class="card-body">
                  <div class="row gutters">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                      <h6 class="mb-2 text-primary">Change Password</h6>
                    </div>
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                      <div class="form-group">
                        <label for="fullName">Username</label>
                      <input name="user" type="text" class="form-control" value="${sessionScope.acc.user}" id="user" placeholder="Enter Username" readonly="False">
                      </div>
                    </div>
                      <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                      <div class="form-group">
                        <label for="eMail">Old Password</label>
                        <input name="oldPassword" type="password" class="form-control" id="password" placeholder="Enter OldPassword">
                      </div>
                    </div>
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                      <div class="form-group">
                        <label for="eMail">Password</label>
                        <input name="password" type="password" class="form-control" id="password" placeholder="Enter Password">
                      </div>
                    </div>
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                      <div class="form-group">
                        <label for="eMail">Confirm Password</label>
                        <input name="confirmPassword" type="password" class="form-control" id="password" placeholder="Confirm Password">
                      </div>
                    </div>
                    

                  </div>
                  <div class="row gutters">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <p class="text-danger">${mess}</p>
                        <p class="text-danger">${mess1}</p>
                      <div class="text-right">
                          <button type="submit" id="submit" name="cancel" class="btn btn-secondary">Cancel</button>
                        <button type="submit" id="submit" name="submit" class="btn btn-primary">Update</button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      </form>

      
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