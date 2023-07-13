<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/styleloginn.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        
        <title>Document</title>
    </head>
    <body>
        <style>
            .container{
                width:500px;
            }
            .text-danger{
                color:#DC3545;
            }

            .forget-pass{
                float:right;
            }
            
            
            .card-footer{
                margin-top:20px;
                background-color: white;
                border-top:1px solid white;
                float:right;
            }
            
            input{
                border:none;
            }
            
            .form-control{
                border:none;
            }
           
            .text-danger{
                margin-left:12px;
            }
            
            
        </style>
        <div class="container">
            <h1>Enter Account</h1>
            <form  action="CheckAcountinForgetPasswordd" method="POST">

                <div class="form-control">
                     <input type="text" name="username" placeholder="Enter " id="email-for-pass">
                   
                    <small></small>
                </div>
                <p class="text-danger">${mess}</p>
                <div class="card-footer">
                    <button class="btn btn-success" type="submit">Next</button>


                    <a href="login.jsp" class="btn btn-danger">Back</a>
                </div>
            </form>
        </div>
        <script src="app.js"></script>
    </body>
</html>