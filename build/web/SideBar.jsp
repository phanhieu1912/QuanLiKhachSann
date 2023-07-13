<%-- 
    Document   : SideBar
    Created on : Jun 10, 2023, 4:07:24 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<nav class="sidebar-nav scroll-sidebar" data-simplebar="">
    <form action="LogOutControl" method="get">
        <ul id="sidebarnav">
            <li class="nav-small-cap">
                <i class="fa-solid fa-house-user"></i>
                <span class="hide-menu">Home</span>
            </li>
            <li class="sidebar-item">
                <a class="sidebar-link" href="home.jsp" aria-expanded="false">
                    <span>
                        <i class="fa-sharp fa-solid fa-chart-line"></i>
                    </span>
                    <span class="hide-menu">Go Home</span>
                </a>
            </li>
            <c:if test="${sessionScope.acc.isSell==1 || sessionScope.acc.isAdmin==1 }">
                <li class="nav-small-cap">
                    <span class="hide-menu">ACTIVE</span>
                </li>
                <li class="sidebar-item">
                    <a class="sidebar-link" href="ListRoomActive.jsp" aria-expanded="false">

                        <span>
                            <i class="fa-solid fa-bed"></i>
                        </span>
                        <span class="hide-menu">Room Active</span>
                    </a>
                </li>
            </c:if>
            <li class="nav-small-cap">
                <!--              <i class="ti ti-dots nav-small-cap-icon fs-4"></i>-->
                <span class="hide-menu">AUTH</span>
            </li>
            <li class="sidebar-item">

                <a class="sidebar-link" href="LogoutControl" aria-expanded="false">
                    <span>
                        <i class="fa-solid fa-right-from-bracket"></i>
                    </span>
                    <span class="hide-menu">LogOut</span>
                </a>
            </li>


            <li class="sidebar-item">
                <a class="sidebar-link" href="EditPassword.jsp" aria-expanded="false">
                    <span><i class="fa-solid fa-lock"></i></span>
                    <span class="hide-menu">Change Password</span>
                </a>
            </li>

            <c:if test="${sessionScope.acc.isAdmin==1}">
                <li class="sidebar-item">
                    <a class="sidebar-link" href="ListSearchInformationCustomerinAdmin.jsp" aria-expanded="false">
                        <span>
                            <i class="fa-solid fa-address-card"></i>
                        </span>
                        <span class="hide-menu">Search Information Customer </span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a class="sidebar-link" href="ListInformationCustomerinAdmin.jsp" aria-expanded="false">
                        <span>
                            <i class="fa-solid fa-address-card"></i>
                        </span>
                        <span class="hide-menu">List Information Customer </span>
                    </a>
                </li>
                <li class="nav-small-cap">
                    <!--              <i class="ti ti-dots nav-small-cap-icon fs-4"></i>-->
                    <span class="hide-menu">REVIEW</span>
                </li>
                <li class="sidebar-item">
                    <a class="sidebar-link" href="ListReview.jsp" aria-expanded="false">
                        <span><i class="fa-solid fa-lock"></i></span>
                        <span class="hide-menu">List Review</span>
                    </a>
                </li>
                 <li class="sidebar-item">
                    <a class="sidebar-link" href="ListThanhToan.jsp" aria-expanded="false">
                        <span><i class="fa-solid fa-lock"></i></span>
                        <span class="hide-menu">Payment Page</span>
                    </a>
                </li>

                <li class="nav-small-cap">
                    <!--              <i class="ti ti-dots nav-small-cap-icon fs-4"></i>-->
                    <span class="hide-menu">ROOM</span>
                </li>
                <li class="sidebar-item">
                    <a class="sidebar-link" href="EditLoaiPhong.jsp" aria-expanded="false">
                        <span><i class="fa-solid fa-lock"></i></span>
                        <span class="hide-menu">Edit Kind Of Room</span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a class="sidebar-link" href="EditPhong.jsp" aria-expanded="false">
                        <span><i class="fa-solid fa-lock"></i></span>
                        <span class="hide-menu">Edit Room</span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a class="sidebar-link" href="AddNewLoaiPhong.jsp" aria-expanded="false">
                        <span><i class="fa-solid fa-lock"></i></span>
                        <span class="hide-menu">Add New Kind Of Room</span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a class="sidebar-link" href="AddNewRoom.jsp" aria-expanded="false">
                        <span><i class="fa-solid fa-lock"></i></span>
                        <span class="hide-menu">Add New Room</span>
                    </a>
                </li>

                <li class="nav-small-cap">
                    <!--              <i class="ti ti-dots nav-small-cap-icon fs-4"></i>-->
                    <span class="hide-menu">Staff</span>
                </li>
                <li class="sidebar-item">
                    <a class="sidebar-link" href="signupAccountstaff.jsp" aria-expanded="false">
                        <span>
                            <i class="fa-solid fa-user-plus"></i>
                        </span>
                        <span class="hide-menu">Add New Staff</span>
                    </a>
                </li>
                
               

                <li class="sidebar-item">
                    <a class="sidebar-link" href="EditEmployee.jsp" aria-expanded="false">

                        <span>
                            <i class="fa-solid fa-clipboard-user"></i>
                        </span> 
                        <span class="hide-menu">Edit Employee</span>
                    </a>
                </li>
            </c:if>
                 <c:if test="${sessionScope.acc.isSell==1}">
                <li class="sidebar-item">
                    <a class="sidebar-link" href="ListSearchInformationCustomerinAdmin.jsp" aria-expanded="false">
                        <span>
                            <i class="fa-solid fa-address-card"></i>
                        </span>
                        <span class="hide-menu">Search Information Customer </span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a class="sidebar-link" href="ListInformationCustomerinAdmin.jsp" aria-expanded="false">
                        <span>
                            <i class="fa-solid fa-address-card"></i>
                        </span>
                        <span class="hide-menu">List Information Customer </span>
                    </a>
                </li>
                <li class="nav-small-cap">
                    <!--              <i class="ti ti-dots nav-small-cap-icon fs-4"></i>-->
                    <span class="hide-menu">REVIEW</span>
                </li>
                <li class="sidebar-item">
                    <a class="sidebar-link" href="ListReview.jsp" aria-expanded="false">
                        <span><i class="fa-solid fa-lock"></i></span>
                        <span class="hide-menu">List Review</span>
                    </a>
                </li>
                 <li class="sidebar-item">
                    <a class="sidebar-link" href="ListThanhToan.jsp" aria-expanded="false">
                        <span><i class="fa-solid fa-lock"></i></span>
                        <span class="hide-menu">Payment Page</span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a class="sidebar-link" href="ListHoaDon.jsp" aria-expanded="false">
                        <span><i class="fa-solid fa-lock"></i></span>
                        <span class="hide-menu">List Hoa Don</span>
                    </a>
                </li>

                
            </c:if>
            <c:if test="${sessionScope.acc.isSell==0 && sessionScope.acc.isAdmin==0}">
                <li class="sidebar-item">
                    <a class="sidebar-link" href="EditInformation.jsp" aria-expanded="false">
                        <span>
                            <i class="fa-solid fa-address-card"></i>
                        </span>
                        <span class="hide-menu">Edit Information</span>
                    </a>
                </li>
                <li class="nav-small-cap">
                    <!--              <i class="ti ti-dots nav-small-cap-icon fs-4"></i>-->
                    <span class="hide-menu">ROOM</span>
                </li>
                <li class="sidebar-item">

                    <a class="sidebar-link" href="RoominUser.jsp" aria-expanded="false">
                        <span>
                            <i class="fa-solid fa-right-from-bracket"></i>
                        </span>
                        <span class="hide-menu">Your room</span>
                    </a>
                </li>
                <li class="sidebar-item">

                    <a class="sidebar-link" href="HistoryUser.jsp" aria-expanded="false">
                        <span>
                            <i class="fa-solid fa-right-from-bracket"></i>
                        </span>
                        <span class="hide-menu">History</span>
                    </a>
                </li>
                <li class="nav-small-cap">
                    <!--              <i class="ti ti-dots nav-small-cap-icon fs-4"></i>-->
                    <span class="hide-menu">RATE</span>
                </li>
                <li class="sidebar-item">

                    <a class="sidebar-link" href="RoomPaid.jsp" aria-expanded="false">
                        <span>
                            <i class="fa-solid fa-right-from-bracket"></i>
                        </span>
                        <span class="hide-menu">Feedback</span>
                    </a>
                </li>
            </c:if>
        </ul>
    </form>

    
</nav>
