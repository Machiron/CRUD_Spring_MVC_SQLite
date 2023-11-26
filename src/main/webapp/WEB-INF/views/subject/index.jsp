<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Title Here</title>
    </head>
    <body>

        <h3>Subject List</h3>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
            </tr>
        </table>
        <c:forEach var="subject" items="${subjects }">
            <tr>
                <td>${subject.id}</td>
                <td>${subject.subjectName}</td>
                <td>Edit | Delete</td>
            </tr>
        </c:forEach>
    </body>
</html>