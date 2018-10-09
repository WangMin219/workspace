// 立即加载
$(function(){
	// 获取鉴权
	getJurisdiction(-1);
	
	// 去获取参数
	var id = getRURL();
	
	// 发送请求去获取Emp
	getEmpById(id)
	
	// 获取所有的职位信息
	getAllPosition(id)
	
	// 请求所有的部门信息
	getDept();
});

// 请求所有职位信息
function getAllPosition(){
	$.ajax({
		Type : "GET",
		url : "emm_position/getAllPosition",
		contentType: "application/json",
		
		success : function(result){
//			console.log(result);
			var Emm_position = result.extend.Emm_position_list;
			var Emm_Pos_Str='<option value="0">选择职位</option>';
			$.each(Emm_position,function(index,item){
//				alert(item.positionName)
				Emm_Pos_Str+='<option value='+item.positionId+'>'+item.positionName+'</option>'
			})
			
//			console.log(Emm_Pos_Str)
			
			$('<select id="manage_position_id" class="form-control" name="manage-position_id""></select>')
								.append(Emm_Pos_Str)
								.appendTo("#emp_position_id");
		},
		error : function(){
			alert("职位信息获取失败");
		}
		
	});
}

// 请求所有的部门信息
function getDept(){
	$.ajax({
		Type : "GET",
		url : "emm_deptment/getAllDept",
		contentType: "application/json",
		
		success : function(result){
			console.log(result);
			var Emm_dept = result.extend.list_dept;
			var Emm_dept_Str='<option value="0">选择部门</option>';
			$.each(Emm_dept,function(index,item){
//				alert(item.positionName)
				Emm_dept_Str+='<option value='+item.departmentId+'>'+item.departmentName+'</option>'
			})
			
			console.log(Emm_dept_Str)
			
			$('<select id="manage_department_id" class="form-control" name="manage_department_id"></select>')
								.append(Emm_dept_Str)
								.appendTo("#emm_dept");
		},
		error : function(){
			alert("部门信息请求失败")
		}
		
		
		
	})
}

// 获取Emp信息
function getEmpById(id){
	
	$.ajax({
		Type : "GET",
		url : "employee/getEmpById",
		contentType: "application/json",
		data : {
			"employeeId" : id
		},
		dataType : "json",
		
		success : function(result){
			console.log(result)
			var emm = result.extend.emp_dept;
			document.getElementById('employeeId').value = emm.employeeId;
			document.getElementById('employeeName').value = emm.employeeName;
			document.getElementById('manage-mobile').value = emm.phone;
			document.getElementById('manage-email').value = emm.email;
			document.getElementById('parentemployeeId').value = emm.parentEmployeeId;
		},
		error : function(){
			alert("请求失败");
		}
		
	});
	
}

// 获取到参数
function getRURL(){
	var str = GetUrlPara();
	console.log(GetUrlPara());
	var mycars=new Array();
	mycars=str.split("=");
	
	return mycars[1];
//	alert(mycars[1]);
}







// 前台验证
function commitCheck() {
	var managename = $("#employeeName").val();
	if ("" == managename || undefined == managename) {
		alert("员工名称不能为空");
		return;
	}
//	var managedepartmentid = $("#manage-department_id").val();
//	if (0 == managedepartmentid) {
//		alert("必须给员工制定部门");
//		return;
//	}
//	var managepositionid = $("#manage-position_id").val();
//	if (0 == managepositionid) {
//		alert("必须给员工制定职位");
//		return;
//	}
	var managemobile = $("#manage-mobile").val();
	if (!(/^1[3|4|5|8][0-9]\d{4,8}$/.test(managemobile))) {
		alert("请输入正确的手机号码");
		return;
	}
	var myreg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
	var manageemail = $("#manage-email").val();
	if (!myreg.test(manageemail)) {
		alert("请输入正确的邮箱格式");
		return;
	}
	var parentemployeeId = $("#parentemployeeId").val();
	if ("" != parentemployeeId && undefined != parentemployeeId) {
//		var data = {};
//		data.parentemployeeId = parentemployeeId;
		$.ajax({
			type : 'GET',
			url : 'employee/updataEmp',
			data : {
				'employeeId' : $('#employeeId').val(),
				'employeeName' : $('#employeeName').val(),
				'positonId' : $('#manage_position_id').val(),
				'departmentId' : $('#manage_department_id').val(),
				'phone' : $('#manage-mobile').val(),
				'email' : $('#manage-email').val(),
				'parentEmployeeId' : $('#parentemployeeId').val()
			},

			success : function(result) {
				console.log(result)
			},
			error : function() {
				alert("请求失败!");
			}
		});
	} else {
		$("#updateEmployeeFrom").submit();
	}
}