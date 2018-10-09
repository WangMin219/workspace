function mylogin() {
	// 非空校验
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
	data.employeeId = employeeId;
	data.emmPassword = password;
	$.ajax({
		type : 'post',
		url : 'login/loginCheck',
		data : data,
		cache : false,
		sync : true,
		success : function(result) {

			console.log(result.code)

			if (result.code == "200") {
				console.log("非空验证成功");

				Login(data);
			} else {
				console.log("非空验证失败");
				alert("您输入为空");
			}

		},
		error : function() {
			alert("请求失败!");
		}
	});
}

// 登录
function Login(data) {
	$.ajax({
		type : 'post',
		url : 'login/log',
		data : data,
		cache : false,
		sync : true,
		success : function(result) {

			console.log(result.code)

			if (result.code == "200") {
				//alert("成功");

				//alert(data.emmPassword)
				if (data.emmPassword == "123123") {
					var id = $("#employeeId").val();
					
					preUpdata(id);
					// top.location = "updatepassword.jsp";
				} else {
					var id = $("#employeeId").val();
					top.location = 'jsp/index.jsp?id='+id;
				}

			} else {
				alert("失败")
			}

		},
		error : function() {
			alert("请求失败!");
		}
	});
}

// 进行预修改
function preUpdata(data){
	top.location = "updatepassword.jsp?id="+data;
}
