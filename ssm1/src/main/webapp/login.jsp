<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="/common.jsp"></jsp:include>
<title>用户登陆</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/login.css" />
<style>
</style>
</head>
<body>
	<div class="form_login">
		<div class="form_logo">
			<h1>CMS</h1>
		</div>
		<form method="post" id="formlogin"
			action="login/loginToCms">
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
					class="btn btn-primary btn-block btn-login" onclick="mylogin()">登录</button>
			</div>
		</form>
		<div class="form_footer">
			<h4>@2017 江苏万和系统工程有限公司</h4>
		</div>
	</div>
</body>
<script type="text/javascript" src="js/login.js"></script>
</html>
