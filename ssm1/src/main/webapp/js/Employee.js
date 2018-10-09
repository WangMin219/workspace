$(function(){
	// 获取鉴权
	getJurisdiction(-1);
	
	send_get_Empinfo();
});

// 发送获取分页数据
function send_get_Empinfo(){
	// 去首页
	to_page(1)
}

// 分页前往第几页
function to_page(pn){
//	alert("1")

	var jsonData = {
			"pn":pn
	}
	
	getPageEmpAjax(jsonData);

}

// 当点击搜索按钮得时候进行按条件分页
function SearchEmp(pn) {
	var employeeId = $('#employeeId').val();
	var employeeName = $('#employeeName').val();
	
	var jsonData = {
			"pn":pn,
			"employeeId":employeeId,
			"employeeName":employeeName
	}
	
	getPageEmpAjax(jsonData)
	
}

// 发送获取分页数据得Ajax
function getPageEmpAjax(jsonData) {
	$.ajax({
		type:'GET',
		url: 'employee/getEmployee',
		dataType: 'json',
		contentType: "application/json",
		data:jsonData,
			
		dataType:'json',
		success:function(result){
			
			console.log(result)
			
			// 解析并显示flightinfo信息
			build_Empinfo_table(result)
			
			// 显示分页条数据
			if(jsonData.employeeId || jsonData.employeeName){
				build_page_navB(result)
			} else {
				build_page_nav(result)
			}
			
			// 显示分页信息
			build_page_info(result)
		}
	});
}

// 显示数据
function build_Empinfo_table(result){
	
	// 如果取得的总的页数>0 显示table表，否则不显示
	if(result.extend.listEmp.pages>0){
		$("#show_airline_list").show();
	} else {
		$("#show_airline_list").hide();
	}
	
	// 清空table表
	$("#empList").empty();
	
	var Empinfo = result.extend.listEmp.list;
	
	// 循环遍历，显示在前台table表中
	$.each(Empinfo, function(index,item){
		var QQstr = item.email.split("@")
		
		// alert(item.f_flightIde);
		// 进行动态拼接（table内的内容，flightinfo）
		var employeeId = $("<td></td>").append(item.employeeId);
		var employeeName = $("<td></td>").append(item.employeeName);
		var sex = $("<td></td>").append("男");
		var departmentName = $("<td></td>").append(item.departmentName);
		var email = $("<td></td>").append(item.phone);
		var phone = $("<td></td>").append(item.email);
		var QQ = $("<td></td>").append(QQstr[0]);
		var positionName = $("<td></td>").append(item.positionName);
		var status = $("<td></td>").append(item.status == 0 ? "正常" : "禁用");
		var createTime = $("<td></td>").append(new Date(item.createTime).Formatter('yyyy-MM-dd hh:mm:ss'));
		var updateTime = $("<td></td>").append(new Date(item.updateTime).Formatter('yyyy-MM-dd hh:mm:ss'));
		
		var caozuo = ""
		var caozuo1 =""
		var caozuo2 ='<button type="button" id="updatebtn" name="updatebtn" class="btn btn-info btn-sm" onclick="updateEmployeeDetail('+item.employeeId+')">修改用户信息 </button>';
		
		if(item.status == 0){
			caozuo1 = '<button type="button" id="forbidbtn" name="forbidbtn" class="btn btn-danger btn-sm" onclick="updateEmployeeStatus('+result.extend.listEmp.pageNum+','+item.employeeId+','+1+')">禁用账户  </button>';
			caozuo = '<td>'+caozuo1+""+caozuo2+'<td>'
		} else {
			caozuo1 = '<button type="button" id="recevorbtn" name="recevorbtn" class="btn btn-success btn-sm" onclick="updateEmployeeStatus('+result.extend.listEmp.pageNum+','+item.employeeId+','+0+')">恢复正常</button>';
			caozuo = '<td>'+caozuo1+'<td>'
		}

//		var departmentId = $("<td class='hidden'></td>").append(item.departmentId);
		
		// 动态拼接前台显示数据
		$('<tr data-key="4"></tr>').append(employeeId)
									.append(employeeName)
									.append(sex)
									.append(departmentName)
									.append(positionName)
									.append(email)
									.append(phone)
									.append(QQ)
									.append(status)
									.append(createTime)
									.append(updateTime)
									.append('<td>')
									.append(caozuo)
									.append('</td>')
									.appendTo("#empList");
		
	})
}



// 状态修改
function updateEmployeeStatus(pn,employeeId,status){
	
//	alert(pn+","+employeeId+","+status)
	
	$.ajax({
		Type : "GET",
		url : "employee/updateEmployeeStatus",
		data : {
			"employeeId" : employeeId,
			"status" : status
		},
		dataType: 'json',
		contentType: "application/json",
		
		success : function(result){
//			console.log(result)
			if(result.code == '200'){
				var employeeId = $('#employeeId').val();
				var employeeName = $('#employeeName').val();
				jsonData = {
						"pn" : pn,
						"employeeId" : employeeId,
						"employeeName" : employeeName
				}
				getPageEmpAjax(jsonData);
			}
		},
		error : function(){
			alert("失败")
		}
	});
	
	
}

function addEmp(){
	top.location = "jsp/systemSettings/manage/create.jsp"
}

//// 显示分页信息
//function build_page_info(result){
//	$("#page_info_area").empty();
//	$("#page_info_area").append("当前"+result.extend.listEmp.pageNum+"页,总"+
//			result.extend.listEmp.pages+"页,总"+
//			result.extend.listEmp.total+"条记录");
//}
//
//// 显示分页条
//function build_page_nav(result){
//	$("#page_nav_area").empty();
//	var ul = $("<ul></ul>").addClass("pagination");
//	// 构建元素
//	// 分页 第一页
//	var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
//	// 分页 上一页
//	var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
//	
//	if(result.extend.listEmp.hasPreviousPage == false){
//		firstPageLi.addClass("disabled");
//		prePageLi.addClass("disabled");
//	} else {
//		// 为元素添加点击翻页事件(第一页)
//		firstPageLi.click(function(){
//			to_page(1);
//		})
//		// 为元素添加点击翻页事件(上一页)
//		prePageLi.click(function(){
//			to_page(result.extend.listEmp.pageNum - 1);
//		})
//	}
//	
//	// 分页 下一页
//	var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
//	// 分页 最后一页
//	var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
//	
//	if(result.extend.listEmp.hasNextPage == false){
//		nextPageLi.addClass("disabled");
//		lastPageLi.addClass("disabled");
//	}else{
//		// 为元素添加点击翻页事件(最后一页)
//		lastPageLi.click(function(){
//			to_page(result.extend.listEmp.pages);
//		})
//		// 为元素添加点击翻页事件(下一页)
//		nextPageLi.click(function(){
//			to_page(result.extend.listEmp.pageNum + 1);
//		})
//		
//	}
//	
//	
//	// 添加首页和前一页 的提示
//	ul.append(firstPageLi).append(prePageLi);
//	// 1,2，3遍历给ul中添加页码提示
//	$.each(result.extend.listEmp.navigatepageNums,function(index,item){
//		
//		var numLi = $("<li></li>").append($("<a></a>").append(item));
//		
//		if(result.extend.listEmp.pageNum ==item){
//			numLi.addClass("active");
//		}
//		
//		// 点击之后前往第item页
//		numLi.click(function(){
//			to_page(item);
//		})
//		
//		ul.append(numLi);
//	});
//	// 添加下一页和末页 的提示
//	ul.append(nextPageLi).append(lastPageLi);
//	
//	// 把ul加入到nav
//	var navEle = $("<nav></nav>").append(ul);
//	navEle.appendTo("#page_nav_area");
//}
//
////显示分页条
//function build_page_navB(result){
//	$("#page_nav_area").empty();
//	var ul = $("<ul></ul>").addClass("pagination");
//	// 构建元素
//	// 分页 第一页
//	var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
//	// 分页 上一页
//	var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
//	
//	if(result.extend.listEmp.hasPreviousPage == false){
//		firstPageLi.addClass("disabled");
//		prePageLi.addClass("disabled");
//	} else {
//		// 为元素添加点击翻页事件(第一页)
//		firstPageLi.click(function(){
//			SearchEmp(1);
//		})
//		// 为元素添加点击翻页事件(上一页)
//		prePageLi.click(function(){
//			SearchEmp(result.extend.listEmp.pageNum - 1);
//		})
//	}
//	
//	// 分页 下一页
//	var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
//	// 分页 最后一页
//	var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
//	
//	if(result.extend.listEmp.hasNextPage == false){
//		nextPageLi.addClass("disabled");
//		lastPageLi.addClass("disabled");
//	}else{
//		// 为元素添加点击翻页事件(最后一页)
//		lastPageLi.click(function(){
//			SearchEmp(result.extend.listEmp.pages);
//		})
//		// 为元素添加点击翻页事件(下一页)
//		nextPageLi.click(function(){
//			SearchEmp(result.extend.listEmp.pageNum + 1);
//		})
//		
//	}
//	
//	
//	// 添加首页和前一页 的提示
//	ul.append(firstPageLi).append(prePageLi);
//	// 1,2，3遍历给ul中添加页码提示
//	$.each(result.extend.listEmp.navigatepageNums,function(index,item){
//		
//		var numLi = $("<li></li>").append($("<a></a>").append(item));
//		
//		if(result.extend.listEmp.pageNum ==item){
//			numLi.addClass("active");
//		}
//		
//		// 点击之后前往第item页
//		numLi.click(function(){
////			to_page(item);
//			SearchEmp(item);
//		})
//		
//		ul.append(numLi);
//	});
//	// 添加下一页和末页 的提示
//	ul.append(nextPageLi).append(lastPageLi);
//	
//	// 把ul加入到nav
//	var navEle = $("<nav></nav>").append(ul);
//	navEle.appendTo("#page_nav_area");
//}



////时间戳转为年月日时分秒 Y:M:D HH:MM:SS
//Date.prototype.Formatter = function (fmt) {
//    var o = {
//        "M+": this.getMonth() + 1,                 // 月份
//        "d+": this.getDate(),                    // 日
//        "h+": this.getHours(),                   // 小时
//        "m+": this.getMinutes(),                 // 分
//        "s+": this.getSeconds(),                 // 秒
//        "q+": Math.floor((this.getMonth() + 3) / 3), // 季度
//        "S": this.getMilliseconds()             // 毫秒
//    };
//    if (/(y+)/.test(fmt))
//        fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
//    for (var k in o)
//        if (new RegExp("(" + k + ")").test(fmt))
//            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
//    return fmt;
//};