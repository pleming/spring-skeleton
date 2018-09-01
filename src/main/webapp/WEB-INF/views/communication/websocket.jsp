<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="/resources/jsp/header.jsp" %>
    <script src="/resources/js/communication/websocket.js"></script>
    <title>WebSocket</title>
</head>

<body>
<div class="connection">
    <div>
        <label>Websocket Path </label>
        <input type="text" id="websocket-path" placeholder="/communication/websocket"/>
    </div>
    <div>
        <button onclick="connect()">Connect</button>
    </div>
    <div id="connect-res">
        <label>Connect Status : </label>
        <span></span>
    </div>
</div>
<br>
<div class="send-test">
    <div>
        <p>Message </p>
        <textarea id="msg" placeholder="Message"></textarea>
    </div>
    <div>
        <button onclick="sendMessage()">Send Message</button>
    </div>
    <div id="res"></div>
</div>
</body>
</html>