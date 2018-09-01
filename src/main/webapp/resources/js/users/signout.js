var signout = function () {
    $api.apiList.users.signout("", function (err, res) {
        console.log(err);
        console.log(res);
        if (err || res.status == false) {
            alert("로그아웃을 실패하였습니다. 관리자에게 문의해주세요.");
            return;
        }

        alert("로그아웃이 완료되었습니다.");
        location.href = "/users/signin";
    })
};
