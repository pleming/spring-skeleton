<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="/resources/jsp/header.jsp" %>
    <script src="/resources/js/users/signin.js"></script>
    <title>Sign In</title>
</head>
<body>
<div>
    <label>User ID </label>
    <input type="text" name="userId"/>
</div>
<div>
    <label>Password </label>
    <input type="password" name="passwd"/>
</div>
<div>
    <button onclick="signin()">Sign In</button>
</div>
</body>
</html>
