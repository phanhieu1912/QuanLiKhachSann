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
</head>

<body>
    <%
            List<NhanVienLeTan> listLT = (List<NhanVienLeTan>) request.getAttribute("listLT");
            if (listLT == null) {
                response.sendRedirect("EditEmployee");
                
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
        <section class="vh-100" style="background-color: #eee;">
          <div class="container py-5 h-100">
            <div class="row d-flex justify-content-center align-items-center h-100">
              <div class="col col-lg-9 col-xl-7">
                <div class="card rounded-3">
                  <div class="card-body p-4">
        
                    <h4 class="text-center my-3 pb-3">Edit Information Employee</h4>
        
                    
        
                    <table class="table mb-4">
                      <thead>
                        <tr>
                          <th scope="col">ID.</th>
                          <th scope="col">Name</th>
                          <th scope="col">Phone</th>
                          <th scope="col">Actions</th>
                        </tr>
                      </thead>
                      <tbody>
                          <c:forEach items="${listLT}" var ="l">
                              <tr>
                          <th scope="row">${l.iDLeTan}</th>
                          <td>${l.tenLeTan}</td>
                          <td>${l.soDienthoai}</td>
                          <td>
                            <a href="ListNVLT?pid=${l.iDLeTan}"  class="btn btn-success ms-1" data-toggle="modal">Update</a>
                            <a href="delete?pid=${l.iDLeTan}" class="btn btn-danger" data-toggle="modal">Delete</a>
                          </td>
                        </tr>
                        </c:forEach>
                        <c:forEach items="${listPV}" var ="l">
                              <tr>
                          <th scope="row">${l.iDPhucVu}</th>
                          <td>${l.tenPhucVu}</td>
                          <td>${l.soDienthoai}</td>
                          <td>
                            <a href="ListNVPV?pid=${l.iDPhucVu}"  class="btn btn-success ms-1" data-toggle="modal">Update</a>
                            <a href="DeleteNVPV?pid=${l.iDPhucVu}" class="btn btn-danger" data-toggle="modal">Delete</a>
                          </td>
                        </tr>
                        </c:forEach>
<!--                        <tr>
                          <th scope="row">1</th>
                          <td>Buy groceries for next week</td>
                          <td>In progress</td>
                          <td>
                            <button type="submit" class="btn btn-danger">Delete</button>
                            <button type="submit" class="btn btn-success ms-1">Finished</button>
                          </td>
                        </tr>
                        <tr>
                          <th scope="row">2</th>
                          <td>Renew car insurance</td>
                          <td>In progress</td>
                          <td>
                            <button type="submit" class="btn btn-danger">Delete</button>
                            <button type="submit" class="btn btn-success ms-1">Finished</button>
                          </td>
                        </tr>
                        <tr>
                          <th scope="row">3</th>
                          <td>Sign up for online course</td>
                          <td>In progress</td>
                          <td>
                            <button type="submit" class="btn btn-danger">Delete</button>
                            <button type="submit" class="btn btn-success ms-1">Finished</button>
                          </td>
                        </tr>-->
                      </tbody>
                    </table>
        
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section>
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