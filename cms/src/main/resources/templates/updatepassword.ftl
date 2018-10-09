<!DOCTYPE html>
<html>
<head>
<#include "./common.ftl">
    <title>初始密码需要修改后才能登陆</title>
    <link rel="stylesheet"
          href="/css/login.css"/>
</head>
<body>
<div class="form_login">
    <div class="form_logo"><h2>修改密码</h2><h4>初始密码修改后才能登陆</h4></div>
    <form method="post" role="form" id="form_login" action="/sureUpdatePd">

        <div class="form-group">
            <i class="fa fa-user"></i>
            <input type="text" class="form-control" name="employeeId" id="employeeId" placeholder="输入工号">
        </div>
        <div class="form-group">
            <i class="fa fa-key"></i>
            <input type="password" class="form-control" name="oldpassword" id="oldpassword" placeholder="输入旧密码">
        </div>
        <div class="form-group">
            <i class="fa fa-key"></i>
            <input type="password" class="form-control" name="newpassword" id="newpassword" placeholder="输入新密码">
        </div>
        <div class="form-group">
            <i class="fa fa-key"></i>
            <input type="password" class="form-control" name="password" id="password" placeholder="确认新密码">
        </div>

        <div class="form-group">
            <button type="button" id="loginsubmit" class="btn btn-primary btn-block btn-login"
                    onclick="updatepassword()">修改
            </button>
        </div>
    </form>
    <div class="form_footer">
        <h4>@2017 江苏万和系统工程有限公司</h4>
    </div>
</div>
</body>
<script type="text/javascript">
    function updatepassword() {
        var employeeId = $("#employeeId").val();
        var oldpassword = $("#oldpassword").val();
        var newpassword = $("#newpassword").val();
        var password = $("#password").val();


        if ("" == employeeId || undefined == employeeId) {
            alert("工号不能为空");
            return;
        }
        if ("" == oldpassword || undefined == oldpassword) {
            alert("旧密码不能为空");
            return;
        }

        if ("" == newpassword || undefined == newpassword) {
            alert("新密码不能为空");
            return;
        }

        if ("" == password || undefined == password) {
            alert("确认密码不能为空");
            return;
        }

        if (newpassword != password) {
            alert("两次新密码不一致");
            return;
        }

        if ("" == newpassword || newpassword.length < 6) {
            alert("密码长度必须至少六位!");
            return;
        }
        var reg = new RegExp(/^(?![^a-zA-Z]+$)(?!\D+$)/);
        if (!reg.test(newpassword)) {
            alert("密码至少包含一个数字和一个字母!");
            return;
        }


        var data = {};
        data.employeeId = employeeId;
        data.oldpassword = oldpassword;
        data.newpassword = newpassword;

        $.ajax({
            type: 'post',
            url: '/sureUpdatePd',
            data: JSON.stringify(data),
            cache: false,
            contentType: 'application/json;charset=UTF-8',
            dataType: "json",
            sync: true,
            success: function (result) {
                console.log(result)
                if (result.code == 100) {
                    window.location.href = "/login"
                } else if (result.code == 200) {
                    alert('用户名或者密码错误')
                } else if (result.code == 400) {
                    alert('新密码与原始密码一致')
                }
            },
            error: function () {
                alert("请求失败!");
            }
        });
    }

</script>
</html>
