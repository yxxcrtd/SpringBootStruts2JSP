<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>首页</title>
    </head>

    <body>
        ========这是首页！========
        <br />
        <br />


<table border="1">
        <c:forEach items="${users}" var="u">
            <tr>
                <td>${u.id}</td>
                <td>${u.name}</td>
                <td>${u.sequence}</td>
            </tr>
        </c:forEach>
</table>
    </body>
</html>