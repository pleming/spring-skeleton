var socket = null;

var connect = function() {
    var websocketPath = $("#websocket-path").val();

    socket = new SockJS(websocketPath);

    socket.onopen = function() {
        $("#connect-res > span").text(websocketPath + " Connected.");
    };

    socket.onmessage = function(event) {
        var data = event.data;
        $("#res").append("<p>" + data + "</p>");
    };

    socket.onclose = function(event) {
        $("#connect-res > span").text(websocketPath + " Disconnected.");
    };
};

var sendMessage = function() {
    socket.send($("#msg").val());
    $("#res").append("<p>Message To Server : " + $("#msg").val() + "</p>");
};