<%--
    Project Title
    File name  : Update
    Date       : Mar 6, 2022, 2:11:34 PM
    Author(s)  : Elena Miller
    Supporting File(s): DBAction Servlet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Records</title>
        <link rel="stylesheet" href="formstyle.css">
    </head>
    <body>
       
        <div class="container">
            <span class="title">Patient Records</span>
            <div class="content">
                <table class="table-content" border="1">
                    <tr>
                        <th>SSN</th>
                        <th>First Name</th>
                        <th>Middle Init:</th>
                        <th>Last Name:</th>
                        <th>P Type</th>
                        <th>Vaccine 1</th>
                        <th>Vaccine 2</th>  
                        <th>Vaccine 3</th>
                        <th>Vaccine 4</th>
                    </tr>
                    <c:forEach var="p" items="${pats}">
                        <tr>
                            <td>${p.ssn}</td>
                            <td>${p.fname}</td>
                            <td>${p.mname}</td>
                            <td>${p.lname}</td>
                            <td>${p.ptype}</td>
                            <td>${p.vac1.vid}</td>
                            <td>${p.vac2.vid}</td>
                            <td>${p.vac3.vid}</td>
                            <td>${p.vac4.vid}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        
        <%--<c:if test="${u.access_level}"--%>

    </body>
</html>
