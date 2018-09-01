var $api = {
    apiUrl: window.location.protocol + "//" + window.location.hostname + (window.location.port ? ":" + window.location.port : ""),
    apiList: {
        users: {
            signup: function (query, callback) {
                var apiPath = "/users/signup";

                $ajax.request($api.apiUrl + apiPath, {method: "POST", data: query, stringify: true}, function (err, res) {
                    callback(err, res);
                });
            },
            signin: function (query, callback) {
                var apiPath = "/users/signin";

                $ajax.request($api.apiUrl + apiPath, {method: "POST", data: query, stringify: true}, function (err, res) {
                    callback(err, res);
                });
            },
            signout: function (query, callback) {
                var apiPath = "/users/signout";

                $ajax.request($api.apiUrl + apiPath, {method: "POST", data: query}, function (err, res) {
                    callback(err, res);
                });
            }
        },
        ajax: {
            get: function(query, callback) {
                var apiPath = "/communication/ajax/get";

                $ajax.request($api.apiUrl + apiPath, {method: "GET", data: query}, function (err, res) {
                    callback(err, res);
                });
            },
            post: function(query, callback) {
                var apiPath = "/communication/ajax/post";

                $ajax.request($api.apiUrl + apiPath, {method: "POST", data: query}, function (err, res) {
                    callback(err, res);
                });
            }
        }
    }
};