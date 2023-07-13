<%@page import="entity.Account"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styleloginn.css">
    <title>Document</title>
</head>
<body>
   
    <style>
        .text-danger{
            color:#DC3545;
        }
    </style>
    <div class="container">
        <h1>New Pass</h1>
        <form action="NewPassword" method="post">
            
            
            <div class="form-control">
                
                
                <input name="user" id="username" type="text" placeholder="Username" value="${sessionScope.user}" readonly>
                <small></small>
                <span></span>
            </div>
            <div class="form-control">
                <input name="password" id="password" type="password" placeholder="Password">
                <small></small>
                <span></span>
            </div>
                 <div class="form-control">
                <input name="confirmPassword" id="password" type="password" placeholder="Confirmpassword">
                <small></small>
                <span></span>
            </div>
         
            <button class="btn-submit" type="submit">Change PassWord</button>
            
        </form>
    </div>
    <script src="app.js"></script>
</body>
</html>