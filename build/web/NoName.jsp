<%@page import="entity.ChiTietThuePhong"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>My History</title>
        <style>
            table {
                border-collapse: collapse;
                font-size: 16px;
                width: 100%;
                box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);

            }

            th, td {
                padding: 12px;
                text-align: left;
                border-bottom: 1px solid #ddd;
            }

            th {
                background-color: #4CAF50;
                color: white;
                font-weight: bold;
            }

            tr:nth-child(even) {
                background-color: #f2f2f2;
            }

            tr:hover {
                background-color: #ddd;
            }

            caption {
                font-size: 24px;
                font-weight: bold;
                margin: 20px;
            }

            .fail{
                padding: 5px 10px;
                background: #dc3545;
                color:white;
                border-radius: 5px ;
            }

            .success{
                padding: 5px 10px;
                background: #28a745;
                color:white;
                border-radius: 5px ;
            }
        </style>
    </head>
    <body>
        <%
            List<ChiTietThuePhong> listK = (List<ChiTietThuePhong>) request.getAttribute("listK");
            if (listK == null) {
                response.sendRedirect("HistoryUser");
            }
        %>
        <table>
            <caption>My History</caption>
            <thead>
                <tr>
                    <th>Room ID</th>
                    <th>Name Room</th>
                    <th>Date Check In</th>
                    <th>Date Check Out</th>
                    <th>Status</th>
                </tr>
            </thead>
            <c:forEach items="${listK}" var ="s">
                <tbody>

                    <tr>
                        <td>${s.iDPhong}</td>
                        <td>${s.tenLoaiPhong}</td>
                        <td>${s.ngayNhanPhong}</td>
                        <td>${s.ngayTraPhong}</td>
                        <td class="status"><label class="" for="">${s.tinhTrangChiTietThuePhong}</label></td>
                    </tr>
                </tbody>
            </c:forEach>
        </table>
    </body>
    <script>
        let statusList = document.querySelectorAll('.status label')
        console.log(status.length)
        console.log(status.innerHTML)
        statusList.forEach(status => {
            if (status.innerHTML == "0") {
                status.innerHTML = 'Cancelled'
                status.classList.add("fail")
            } else {
                status.innerHTML = 'Complete'
                status.classList.add("success")
            }
        })

    </script>
</html>