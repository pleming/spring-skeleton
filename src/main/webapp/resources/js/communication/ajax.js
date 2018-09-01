var ajaxGet = function () {
    $api.apiList.ajax.get("", function (err, res) {
        if (err || res.status == false) {
            $("#ajax-get-res").append(JSON.stringify(err));
            return;
        }
        $("#ajax-get-res").append(JSON.stringify(res));
    });
};

var ajaxPost = function () {
    $api.apiList.ajax.post("", function (err, res) {
        if (err || res.status == false) {
            $("#ajax-post-res").append(JSON.stringify(err));
            return;
        }

        $("#ajax-post-res").append(JSON.stringify(res))
    });
};