<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="fontawesome-free-6.4.0-web/css/all.css">
        <title>Document</title>
    </head>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Manrope:wght@200&display=swap');

        html,
        body {
            height: 100%
        }

        body {
            display: grid;
            place-items: center;
            width: 100%;
            height: 100vh;
            text-align: center;
            font-size: 16px;
        }

        .modal-content {
            border-radius: 1rem;
            background: white;
            padding:48px 24px;
        }




        .fa-circle-xmark {
            color: #DC3545;
            font-size: 90px;
            padding: 30px 0px;
        }

        .b1 {
            background-color: #2b84be;
            box-shadow: 0px 4px #337095;
            font-size: 17px;
        }

        .r3 {
            color: #c1c1c1;
            font-weight: 500;
        }

        a,
        a:hover {
            text-decoration: none;
        }

        .noti-title{
            font-size:28px;
        }

        .noti-desc{
            color:#c1c1c1;
            font-size: 30px;
            padding: 0 60px;
            font-weight: 500;
        }

        .noti-btn{
            border:none;
            width:50%;
            padding: 15px 0;
            border-radius: 20px;
            border:none;
        }

        .noti-btn{
            background:#DC3545;
            color:white;
            font-weight:600;
        }
    </style>

    <body>
        <form action="Fail" method="get">
            
        
        <div class="modal fade" id="form" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <i class="fa-sharp fa-regular fa-circle-xmark"></i>
                    <p class="noti-desc">Date unvalid.</p>
                    <div class="text-center"> <button class="noti-btn">OK</button> 
                        </div>
                </div>
            </div>
        </div>
        </form>
    </body>

</html>