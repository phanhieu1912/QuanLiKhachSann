<!doctype html>
<html lang="en">

<head>
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
              <a href="https://adminmart.com/product/modernize-free-bootstrap-admin-dashboard/" target="_blank"
                class="btn btn-primary">Download Free</a>
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
        
        .btn-list{
    display:flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    /* display:none; */
}

.btn-choose{
    margin: 0 30px;
    border:none;
    padding: 20px 40px;
    background: #5D87FF;
    color:white;
    border-radius: 5px;
    font-size: 20px;
}

.addLT{
    display: none;
}

.addPV{
    display:none;
}

.active{
    display:block;
}
      </style>
      <div class="container-fluid">

        <form action="UpdateNhanVienLeTan" method="post" class="">
          <div class="container-fluid">
            <div class="container">
              <div class="row gutters">
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                  <div class="card h-100">
                    <div class="card-body">
                      <div class="row gutters">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <h6 class="mb-2 text-primary">Change Information Le Tan</h6>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">ID Le Tan</label>
                            <input name="pid" type="text" class="form-control" id="user" placeholder="Enter ID Le Tan" value="${detail.iDLeTan}">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Ten Le Tan</label>
                            <input name="namee" type="text" class="form-control" id="user" value="${detail.tenLeTan}"
                              placeholder="Enter Ten Le Tan">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Gioi Tinh</label>
                            <input name="gioitinh" type="text" class="form-control" id="gioitinh"
                              placeholder="Enter Gioi Tinh" value="${detail.gioiTinh}">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Image Nhan Vien Le Tan</label>
                            <input name="image" type="text" class="form-control" id="user"
                              placeholder="Enter Image Nhan Vien Le Tan" value="${detail.imgngaySinh}" >
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="eMail">Ngay Sinh</label>
                            <input name="ngaysinh" type="text" class="form-control" id="password" placeholder="Enter Ngay Sinh" value="${detail.ngaySinh}">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="eMail">Email</label>
                            <input name="email" type="email" class="form-control" id="password" placeholder="Email" value="${detail.email}">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Dia Chi</label>
                            <input name="diachi" type="text" class="form-control" id="user" placeholder="Enter Dia Chi" value="${detail.diaChi}">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">So Dien Thoai</label>
                            <input name="phone" type="text" class="form-control" id="user"
                              placeholder="Enter So Dien Thoai" value="${detail.soDienthoai}">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Quoc Tich</label>
                            <input name="quoctich" type="text" class="form-control" id="user"
                              placeholder="Enter Quoc Tich" value="${detail.quocTich}">
                          </div>
                        </div>


                      </div>
                      <div class="row gutters">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="text-right">
                            <button type="submit" id="submit" name="submit" class="btn btn-secondary btn-cancel">Cancel</button>
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
<!--      <form action="AddLT" method="post">
        <div class="container-fluid">
      <div class="container">
        <div class="row gutters">
          <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
            <div class="card h-100">
              <div class="card-body">
                <div class="row gutters">
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <h6 class="mb-2 text-primary">Change Information Le Tan</h6>
                  </div>
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="form-group">
                      <label for="fullName">ID Le Tan</label>
                      <input name="id" type="text" class="form-control" id="user" placeholder="Enter ID Le Tan" >
                    </div>
                  </div>
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="form-group">
                      <label for="fullName">Ten Le Tan</label>
                      <input name="namee" type="text" class="form-control" id="user" placeholder="Enter Ten Le Tan">
                    </div>
                  </div>
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="form-group">
                      <label for="fullName">Gioi Tinh</label>
                      <input name="gioitinh" type="text" class="form-control" id="gioitinh" placeholder="Enter Gioi Tinh">
                    </div>
                  </div>
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="form-group">
                      <label for="fullName">Image Nhan Vien Le Tan</label>
                      <input name="image" type="text" class="form-control" id="user" placeholder="Enter Image Nhan Vien Le Tan">
                    </div>
                  </div>
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="form-group">
                      <label for="eMail">Ngay Sinh</label>
                      <input name="ngaysinh" type="text" class="form-control" id="password" placeholder="Enter Ngay Sinh" value="Year-Month-Day">
                    </div>
                  </div>
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="form-group">
                      <label for="eMail">Email</label>
                      <input name="email" type="email" class="form-control" id="password" placeholder="Email">
                    </div>
                  </div>
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="form-group">
                      <label for="fullName">Dia Chi</label>
                      <input name="diachi" type="text" class="form-control" id="user" placeholder="Enter Dia Chi">
                    </div>
                  </div>
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="form-group">
                      <label for="fullName">So Dien Thoai</label>
                      <input name="phone" type="text" class="form-control" id="user" placeholder="Enter So Dien Thoai">
                    </div>
                  </div>
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="form-group">
                      <label for="fullName">Quoc Tich</label>
                      <input name="quoctich" type="text" class="form-control" id="user" placeholder="Enter Quoc Tich">
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
      </div>
    </div>
    </form>-->

      
    </div>
  </div>
  <script src="../assets/libs/jquery/dist/jquery.min.js"></script>
  <script src="../assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
  <script src="../assets/js/sidebarmenu.js"></script>
  <script src="../assets/js/app.min.js"></script>
  <script src="../assets/libs/apexcharts/dist/apexcharts.min.js"></script>
  <script src="../assets/libs/simplebar/dist/simplebar.js"></script>
  <script src="../assets/js/dashboard.js"></script>
  
  <script>
  </script>
</body>

</html>
