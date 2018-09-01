<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="/resources/jsp/header.jsp" %>
    <script src="/resources/js/communication/ajax.js"></script>
    <title>AJAX</title>
</head>
<body>
<div class="ajax-get">
    <button onclick="ajaxGet()">AJAX GET</button>
    <div id="ajax-get-res"/>
</div>
<div class="ajax-post">
    <button onclick="ajaxPost()">AJAX POST</button>
    <div id="ajax-post-res"/>
</div>
</body>
</html>
