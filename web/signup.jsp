<!--<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/stylelogin.css">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <h1>Sign up</h1>
        <form action="SignUpConTrol" method="post">
            <div class="form-control">
                <input name="user" id="username" type="text" placeholder="Username">
                <small></small>
                <span></span>
            </div>
            <div class="form-control">
                <input name="email" id="email" type="email" placeholder="Email">
                <small></small>
                <span></span>
            </div>
            <div class="form-control">
                <input name="pass" id="password" type="password" placeholder="Password">
                <small></small>
                <span></span>
            </div>
            <div class="form-control">
                <input name="rpass" id="confirm-password" type="password" placeholder="Confirm Password">
                <small></small>
                <span></span>
            </div>
            <div class="form-control">
                <input name="phone" id="phone" type="tel" placeholder="Phone Number" pattern="[0]{1}[0-9]{9}">
                <small></small>
                <span></span>
            </div>
    
            <button class="btn-submit" type="submit">Sign up</button>
            <div class="signup-link">
                You have account?
                <a href="home.jsp">Log in</a>
            </div>
        </form>
    </div>
    <script src="app.js"></script>
</body>
</html>-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/stylelogin.css" rel="stylesheet" type="text/css"/>
        <title>Login Form</title>
    </head>
    <body>
        <div class="container">
        <h1>Log in</h1>
         

            <form action="SignUpConTrol" method="post" class="form-signup">
                <form class="form-signin" action="SignUpConTrol" method ="post">
                    <div class="form-control">
                        <input name="user" id="username" type="text" placeholder="Username">
                        <small></small>
                        <span></span>
                    </div>
                    <div class="form-control">
                        <input name="email" id="email" type="email" placeholder="Email">
                        <small></small>
                        <span></span>
                    </div>
                    <div class="form-control">
                        <input name="pass" id="password" type="password" placeholder="Password">
                        <small></small>
                        <span></span>
                    </div>
                    <div class="form-control">
                        <input name="repass" id="confirm-password" type="password" placeholder="Confirm Password">
                        <small></small>
                        <span></span>
                    </div>
                    <div class="form-control">
                        <input name="phone" id="phone" type="tel" placeholder="Phone Number" pattern="[0]{1}[0-9]{9}">
                        <small></small>
                        <span></span>
                    </div>

                    <button class="btn-submit" type="submit">Sign up</button>
                    <div class="signup-link">
                        You have account?
                        <a href="login.jsp">Log in</a>
                    </div>
                </form>
            </form>
            <br>

        </div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            function toggleResetPswd(e) {
                e.preventDefault();
                $('#logreg-forms .form-signin').toggle() // display:block or none
                $('#logreg-forms .form-reset').toggle() // display:block or none
            }

            function toggleSignUp(e) {
                e.preventDefault();
                $('#logreg-forms .form-signin').toggle(); // display:block or none
                $('#logreg-forms .form-signup').toggle(); // display:block or none
            }

            $(() => {
                // Login Register Form
                $('#logreg-forms #forgot_pswd').click(toggleResetPswd);
                $('#logreg-forms #cancel_reset').click(toggleResetPswd);
                $('#logreg-forms #btn-signup').click(toggleSignUp);
                $('#logreg-forms #cancel_signup').click(toggleSignUp);
            })
        </script>
    </body>
</html>