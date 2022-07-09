<%--
  Created by IntelliJ IDEA.
  User: 호선
  Date: 2022-07-08
  Time: 오후 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    index 페이지
    <hr>
    게시판 모든 글
    <table class="table table-hover">
        <c:forEach var="v" items="${content}">
            <tr>
                <td>${v.no }</td>
                <td>${v.title }</td>
                <td>${v.name }</td>
            </tr>
        </c:forEach>
    </table>
    <hr>

    <td>${a.no }</td>
    <td>${a.title }</td>
    <td>${a.name }</td>

    <hr>
    <c:forEach var="v" items="${nameList}">
        <tr>
            <td>${v.no }</td>
            <td>${v.name }</td>
        </tr>
    </c:forEach>

</body>
</html>
