<!DOCTYPE html>
<html lang="en">

<head>
<#include "./common.ftl">
    <title>用户登陆</title>
    <link rel="stylesheet"
          href="/css/login.css"/>
    <style>
    </style>
</head>
<body>
<div class="form_login">
    <div class="form_logo">
        <h1>CMS</h1>
    </div>
    <form method="post" id="formlogin"
          action="/loginToCms">
        <div class="form-group">
            <i class="fa fa-user"></i> <input type="text" class="form-control"
                                              name="employeeId" id="employeeId" placeholder="输入工号">
        </div>
        <div class="form-group">
            <i class="fa fa-key"></i> <input type="password"
                                             class="form-control" name="password" id="password"
                                             placeholder="输入密码">
        </div>
        <div class="form-group">
            <button type="button" id="loginsubmit"
                    class="btn btn-primary btn-block btn-login" onclick="mylogin()">登录
            </button>
        </div>
    </form>
    <div class="form_footer">
        <h4>@2017 江苏万和系统工程有限公司</h4>
    </div>
</div>
</body>
<script type="text/javascript">

    function mylogin() {
        //非空校验
        var employeeId = $("#employeeId").val();
        var password = $("#password").val();
        if ("" == employeeId || undefined == employeeId) {
            alert("工号不能为空");
            return;
        }
        if ("" == password || undefined == password) {
            alert("密码不能为空");
            return;
        }

        var data = {};
        data.employee_id = employeeId;
        data.emm_password = password;
        $.ajax({
            type: 'post',
            url: '/loginCheck',
            data: JSON.stringify(data),
            cache: false,
            contentType: 'application/json;charset=UTF-8',
            dataType: "json",
            sync: true,
            success: function (result) {
                console.log(result)
                if (result.code == 100) {
                    $("#formlogin").submit();
                } else if (result.code == 200) {
                    alert("用户名或者密码不正确");
                    return;
                } else if (result.code == 300) {
                    alert(result.msg);
                    window.location.href="/updatePd"
            }
    }
    ,
    error: function () {
        alert("请求失败!");
    }
    })
    ;
    }
</script>
</html>
