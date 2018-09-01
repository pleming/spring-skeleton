<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="/resources/jsp/header.jsp" %>
    <script src="/resources/js/users/signup.js"></script>
    <title>Sign Up</title>
</head>
<body>
<div>
    <label>User ID </label>
    <input type="text" name="userId" placeholder="User ID"/>
</div>
<div>
    <label>Password </label>
    <input type="password" name="passwd" placeholder="Password"/>
</div>
<div>
    <label>Check Password </label>
    <input type="password" name="chkPasswd" placeholder="Check Password"/>
</div>
<div>
    <label>User Name</label>
    <input type="text" name="userName" placeholder="User Name"/>
</div>
<div>
    <label>Birth </label>
    <input type="text" name="birth" placeholder="1900-01-01"/>
</div>
<div>
    <label>Gender </label>
    <input type="radio" name="gender" value="Male"/> <span>Male </span>
    <input type="radio" name="gender" value="Female"/> <span>Female </span>
</div>
<div>
    <label>Phone Number </label>
    <input type="text" name="phone" placeholder="010-0000-0000"/>
</div>
<div>
    <label>Email </label>
    <input type="text" name="email" placeholder="email@email.com"/>
</div>
<div>
    <button onclick="signup()">Sign Up</button>
</div>
</body>
</html>
