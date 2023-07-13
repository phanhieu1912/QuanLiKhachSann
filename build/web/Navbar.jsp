<%-- 
    Document   : Menu
    Created on : Jun 10, 2023, 3:57:09 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="header_main">
                <div class="mobile_menu">
                    <nav class="navbar navbar-expand-lg navbar-light bg-light">
                        <div class="logo_mobile"><a href="home.jsp"><img src="images/logo.png"></a></div>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNav">
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="nav-link" href="home.jsp">Home</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="about.jsp">About</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="services.jsp">Services</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link " href="blog.jsp">Blog</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link " href="contact.jsp">Contact</a>
                                </li>
                            </ul>

                        </div>
                    </nav>
                </div>
                <div class="container-fluid">
                    <div class="logo"><a href="home.jsp"><img src="images/logo.png"></a></div>
                    <div class="menu_main">
<!--                          <form action="LogoutControl" method="get">-->
                            <ul>
                                <li class="active"><a href="home.jsp">Home</a></li>
                                <li><a href="about.jsp">About</a></li>
                                <li><a href="services.jsp">Services</a></li>
                                <li><a href="blog.jsp">Blog</a></li>
                                <li><a href="contact.jsp">Contact us</a></li>
                                <li><a href="manager.jsp">Manager</a></li>
                                <c:if test="${sessionScope.acc!=null}">
                                <li><a href="home.jsp">Hello ${sessionScope.acc.user}</a></li>
                                <li><a href="LogoutControl">Log out</a></li>
                                </c:if>
                                <c:if test="${sessionScope.acc==null}">
                                <li><a href="login.jsp">Log in</a></li>
                                <li><a href="signup.jsp">Sign Up</a></li>
                                </c:if> 
                                
                                
                                
                            </ul>
<!--                        </form>-->
                    </div>
                </div>
            </div>