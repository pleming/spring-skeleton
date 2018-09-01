<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="/resources/jsp/header.jsp" %>
    <title>Multipart</title>
</head>
<body>
<form action="/file/multipart" method="POST" enctype="multipart/form-data">
    <div>
        <h1>File Upload</h1>
        <input type="file" name="picture"/>
    </div>
    <div>
        <input type="submit" value="Upload"/>
    </div>
</form>
</body>
</html>
