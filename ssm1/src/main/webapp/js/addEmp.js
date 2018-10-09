$(function(){
	// 获取鉴权
	getJurisdiction(-1);
	
	getAllPosition();
	
	getDept();
})

function commitCheck() {
	$.ajax({
		type : 'GET',
		url : 'employee/addEmp',
		data : {
			// 'employeeId' : $('#employeeId').val(),
			'employeeName' : $('#employeeName').val(),
			'positonId' : $('#manage_position_id').val(),
			'departmentId' : $('#manage_department_id').val(),
			'phone' : $('#manage-mobile').val(),
			'email' : $('#manage-email').val(),
			'parentEmployeeId' : $('#parentemployeeId').val()
		},

		success : function(result) {
			// console.log(result)
			if (result.code == '200') {
				top.location = "jsp/systemSettings/manage/index1.jsp"
			}
		},
		error : function() {
			alert("请求失败!");
		}
	});
} 




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
			
//			console.log(Emm_dept_Str)
			
			$('<select id="manage_department_id" class="form-control" name="manage_department_id"></select>')
								.append(Emm_dept_Str)
								.appendTo("#emm_dept");
		},
		error : function(){
			alert("部门信息请求失败")
		}

	})
}