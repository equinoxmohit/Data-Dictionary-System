<%-- 
    Document   : display
    Created on : Nov 30, 2016, 6:58:39 PM
    Author     : Mohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table style="border: 1px #ff6666 dashed">
            <tr>
                <td>Author Name</td>
                <td>Address</td>
                <td>Phone</td>
                <td>Fax</td>
                <td>Email</td>
            </tr>
            <tr>
                <c:forEach var="author" items="${authors}">
                    <td>
                        ${author.authorName}
                    </td>
                    <td>
                        ${author.address}
                    </td>
                    <td>
                        ${author.phone}
                    </td>
                    <td>
                        ${author.fax}
                    </td>
                    <td>
                        ${author.email}
                    </td>

                </tr>
            </table>
        </c:forEach>
    </body>
</html>
