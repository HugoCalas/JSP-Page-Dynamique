<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 29/05/18
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="header.jsp" />
    <h1>githubers</h1>
</head>
<body>
<%--
<ul>
    <c:forEach items="${requestScope.githubersList}" var="currentGithuber">
        <li>Content : ${currentGithuber.content}</li>
    </c:forEach>
</ul>
--%>
<table class="table">
    <tr class="table-success">
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Login</th>
        <th scope="col">AvatarURL</th>

    </tr>
    <c:forEach items="${requestScope.githubersList}" var="currentGithuber">
    <tr>
        <th>${currentGithuber.id}</th>
        <th>${currentGithuber.name}</th>
        <th>${currentGithuber.email}</th>
        <th>${currentGithuber.login}</th>
        <th>${currentGithuber.avatarURL}</th>
    </tr>
    </c:forEach>
</table>
</body>
</html>
