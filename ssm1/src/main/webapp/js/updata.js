// 立即加载
$(function(){ 
	var str = GetUrlPara();
	console.log(GetUrlPara());
	var mycars=new Array();
	mycars=str.split("=");
	document.getElementById('employeeId').value = mycars[1];
});

//// 获取到URL参数
//function GetUrlPara(){
//　　var url = document.location.toString();
//　　var arrUrl = url.split("?");
//
//　　var para = arrUrl[1];
//　　return para;
//}

// 修改密码
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

	/*
	 * var data ={}; data. data. data.
	 */

	var data = {
		"employeeId" : employeeId,
		"oldpassword" : oldpassword,
		"newpassword" : newpassword,
	}

	$.ajax({
		type : 'post',
		url : 'login/updataPassword',
		dataType : 'json',
		data : data,
		cache : false,
		sync : true,
		success : function(result) {
			if (result.code == "200") {
				alert("修改成功");
				
				top.location = "login.jsp"
			} else if (result.code == "100") {
				alert("修改失败");
			} else {
				alert("查无此人");
			}
		},
		error : function() {
			alert("请求失败!");
		}
	});
}
