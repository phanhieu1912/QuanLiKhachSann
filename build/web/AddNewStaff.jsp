<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Modernize Free</title>
  <link rel="stylesheet" href="./fontawesome-free-6.4.0-web/css/all.css" />
  <link rel="stylesheet" href="css/ManagerStyles.min.css" />
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <!-- style css -->
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <!-- Responsive-->
        <link rel="stylesheet" href="css/responsive.css">

        <link rel="stylesheet" href="/a-world-1.0.0/fontawesome-free-6.4.0-web/css/all.min.css">
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
        <div class="btn-list">
          <button class="btn-choose btn-choose-1">Nhan Vien Le Tan</button>
          <button class="btn-choose btn-choose-2">Nhan Vien Phuc Vu</button>
        </div>

        <form action="AddLT" method="post" class="addLT">
          <div class="container-fluid">
            <div class="container">
              <div class="row gutters">
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                  <div class="card h-100">
                    <div class="card-body">
                      <div class="row gutters">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <h6 class="mb-2 text-primary">Add Information Le Tan</h6>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">ID Le Tan</label>
                            <input name="id" type="text" class="form-control" id="user" placeholder="Enter ID Le Tan">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Ten Le Tan</label>
                            <input name="namee" type="text" class="form-control" id="user"
                              placeholder="Enter Ten Le Tan">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Gioi Tinh</label>
                            <input name="gioitinh" type="text" class="form-control" id="gioitinh"
                              placeholder="Enter Gioi Tinh">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Image Nhan Vien Le Tan</label>
                            <input name="image" type="text" class="form-control" id="user"
                              placeholder="Enter Image Nhan Vien Le Tan">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="eMail">Ngay Sinh</label>
                            <input name="ngaysinh" type="text" class="form-control" id="password"
                              placeholder="Enter Ngay Sinh" value="Year-Month-Day">
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
                            <input name="phone" type="text" class="form-control" id="user"
                              placeholder="Enter So Dien Thoai">
                          </div>
                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="form-group">
                            <label for="fullName">Quoc Tich</label>
                            <input name="quoctich" type="text" class="form-control" id="user"
                              placeholder="Enter Quoc Tich">
                          </div>
                        </div>


                      </div>
                      <div class="row gutters">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                          <div class="text-right">
                            <a href="manager.jsp" class="btn btn-primary">Cancel</a>
                            <button type="submit" id="submit" name="submit" class="btn btn-primary">Add</button>
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

        <form action="AddPV" method="post" class="addPV">
          <div class="container-fluid">
      <div class="container">
        <div class="row gutters">
          <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
            <div class="card h-100">
              <div class="card-body">
                <div class="row gutters">
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <h6 class="mb-2 text-primary">Add Information Phuc Vu</h6>
                  </div>
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="form-group">
                      <label for="fullName">ID PhucVu</label>
                      <input name="id" type="text" class="form-control" id="user" placeholder="Enter ID Phuc Vu" >
                    </div>
                  </div>
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="form-group">
                      <label for="fullName">Ten Phuc Vu</label>
                      <input name="namee" type="text" class="form-control" id="user" placeholder="Enter Ten Phuc Vu">
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
                      <label for="fullName">Image Nhan Vien Phuc Vu</label>
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
                      <label for="fullName">ID Phong</label>
                      <input name="IDPhong" type="text" class="form-control" id="user" placeholder="Enter ID Phong">
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
                      <button type="submit" id="submit" name="submit" class="btn btn-primary">Add</button>
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
    var btnNVLT = document.querySelector('.btn-choose-1')
    var btnNVPV = document.querySelector('.btn-choose-2')
    var btnList = document.querySelector('.btn-list')
    var addLT = document.querySelector('.addLT')
    var addPV = document.querySelector('.addPV')
    var cancel = document.querySelector('.btn-cancel')

    btnNVLT.addEventListener('click', function () {
        // btnNVLT.classList.remove('btnList')
         addLT.classList.toggle('active')
         btnList.style.display = "none"
        //  enquiry.classList.toggle('active')
        //  bookingContent1.classList.toggle('active-form')
        //  bookingContent2.classList.toggle('active-form')

      })
    btnNVPV.addEventListener('click',function(){
      addPV.classList.toggle('active')
      btnList.style.display = "none"
    })
  </script>
</body>

</html>