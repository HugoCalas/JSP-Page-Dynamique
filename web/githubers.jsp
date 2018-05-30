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
    <h1>Githubers list :</h1>
</head>
<body>

<table class="table">
    <tr class="table-success">
        <th>#</th>
        <th>Name</th>
        <th>Email</th>
        <th>Login</th>
        <th>AvatarURL</th>

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
