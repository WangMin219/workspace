// 立即加载
$(function(){
	// 鉴权
	getJurisdiction(-1);
	
	// 取ID
	var id = GetUrlParaPare();
	
	// 获取Emp信息
	getEmp(id);
})

function getEmp(id) {
//	jsonData = {
//		'employeeId':id
//	}
//	
	$.ajax({
		url : "employee/getEmpById",
		type:'GET',
		dataType: 'json',
		contentType: "application/json",
		data:{
			employeeId:id
		},
			
		success : function(result){
			console.log(result)
			Splicing(result)
		},
		error : function(){
			alert("获取用户信息失败")
		}
	})
}

// 拼接
function Splicing(result){
	var Emp = result.extend.emp_dept;
	var employeeName = '<tr><th>姓名</th><td>'+Emp.employeeName+'</td></tr>';
	var sex = '<tr><th>性别</th><td>男</td></tr>';
	var departmentName = '<tr><th>职位</th><td>'+Emp.departmentName+'</td></tr>';
	var phone = '<tr><th>手机</th><td>'+Emp.phone+'</td></tr>';
	var QQ = '<tr><th>QQ</th><td>'+Emp.email+'</td></tr>';
	var email = '<tr><th>邮件</th><td>'+Emp.email+'</td></tr>';
//	var aaa =        $('<tr></tr>').append('<th>创建时间</th><td>').append(Emp.createTime.Formatter('yyyy-MM-dd hh:mm:ss')).append('</td>'),
	var createTime = '<tr><th>创建时间</th><td>'+(new Date(Emp.createTime).Formatter('yyyy-MM-dd hh:mm:ss'))+'</td></tr>';
	var updateTime = '<tr><th>更新时间</th><td>'+(new Date(Emp.updateTime).Formatter('yyyy-MM-dd hh:mm:ss'))+'</td></tr>';
//	var a1 = '<tr><th>姓名</th><td>'+result.employeeName+'</td></tr>';
//	var a1 = '<tr><th>姓名</th><td>'+result.employeeName+'</td></tr>';
//	var a1 = '<tr><th>姓名</th><td>'+result.employeeName+'</td></tr>';
	
	$('<tbody></tbody>').append(employeeName)
	   					.append(sex)
	   					.append(departmentName)
	   					.append(phone)
	   					.append(QQ)
	   					.append(email)
	   					.append(createTime)
	   					.append(updateTime)
	   					.appendTo("#Emp")
}

// 拿到ID
function GetUrlParaPare(){
	var str = GetUrlParaSon();
	console.log(GetUrlParaSon());
	var mycars=new Array();
	mycars=str.split("=");
	
	return mycars[1];
}

//获取到URL参数
function GetUrlParaSon(){
　　var url = document.location.toString();
　　var arrUrl = url.split("?");

　　var para = arrUrl[1];
　　return para;
}

//时间戳转为年月日时分秒 Y:M:D HH:MM:SS
Date.prototype.Formatter = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1,                 // 月份
        "d+": this.getDate(),                    // 日
        "h+": this.getHours(),                   // 小时
        "m+": this.getMinutes(),                 // 分
        "s+": this.getSeconds(),                 // 秒
        "q+": Math.floor((this.getMonth() + 3) / 3), // 季度
        "S": this.getMilliseconds()             // 毫秒
    };
    if (/(y+)/.test(fmt))
        fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt))
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
};