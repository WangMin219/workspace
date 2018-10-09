<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<jsp:include page="/common.jsp"></jsp:include>
    <title>初始密码需要修改后才能登陆</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/login.css"/>


</head>
<body>
<div class="form_login">
    <div class="form_logo"><h2>修改密码</h2><h4>初始密码修改后才能登陆</h4></div>
    <form method="get" role="form" id="form_login" action="LoginServlet?method=loginCheck">
    
    	<div class="form-group">
            <i class="fa fa-user"></i>
            <input type="text" class="form-control" name="employeeId" id="employeeId" readonly="readonly"  placeholder="输入工号">
        </div>
   		<div class="form-group">
            <i class="fa fa-key"></i>
            <input type="password" class="form-control" name="oldpassword" id="oldpassword"  placeholder="输入旧密码">
        </div>
        <div class="form-group">
            <i class="fa fa-key"></i>
            <input type="password" class="form-control" name="newpassword" id="newpassword"  placeholder="输入新密码">
        </div>
        <div class="form-group">
            <i class="fa fa-key"></i>
            <input type="password" class="form-control" name="password" id="password" placeholder="确认新密码">
        </div>
      
        <div class="form-group">
            <button type="button" id="loginsubmit" class="btn btn-primary btn-block btn-login"  onclick="updatepassword()">修改</button>
        </div>
    </form>
    <div class="form_footer">
			<h4>@2017 江苏万和系统工程有限公司</h4>
	</div>
</div>
</body>
<script type="text/javascript" src="js/updata.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script type="text/javascript" src="js/until.js"></script>
</html>
