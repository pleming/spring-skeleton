var signin = function () {
    var data = {
        userId: $("input[name=userId]").val(),
        passwd: $("input[name=passwd]").val()
    };

    $api.apiList.users.signin(data, function (err, res) {
        if (err || res.status == false) {
            alert("로그인을 실패하였습니다. 관리자에게 문의해주세요.");
            return;
        }

        alert("로그인이 완료되었습니다.");
        location.href = "/";
    });
};
