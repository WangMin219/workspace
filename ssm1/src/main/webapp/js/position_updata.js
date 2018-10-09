$(function(){
	// 获取鉴权
	getJurisdiction(-1);
	
	var persionID = GetUrlParaPre();
	
	getPositionInfo(persionID);
	
})

// 提交修改
function update(){

	$.ajax({
		Type : 'GET',
		url : 'emm_position/emm_position_update',
		data : {
			"positionId" : $("#positionId").val(),
			"positionName" : $("#positionname").val(),
			"positionLevel" : $("#positionLevel").val()
		},
		dataType : "json",
		success : function(result){
//			console.log(result)
//			top.location = "jsp/systemSettings/position/index.jsp"
			var returnVal = window.confirm("修改成功，是否跳回到展示页面？", "标题");
			if(!returnVal) {
				top.location = "jsp/systemSettings/position/index.jsp"
			} else {
				top.location = "jsp/systemSettings/position/update.jsp?positionId="+$("#positionId").val()
			}
		},
		error : function(){
			alert("请求失败")
		}
		
	})

}

// 请求需要修改的信息
function getPositionInfo(positionId){
	$.ajax({
		Type : 'GET',
		url : 'emm_position/getPositionInfo',
		dataType : 'json',
		data : {
			'positionId' : positionId
		},
		success : function(result){
//			console.log(result)
			document.getElementById('positionname').value = result.extend.emm_position.positionName;
			document.getElementById('positionId').value = result.extend.emm_position.positionId;
		},
		error : function(){
			alert("请求失败")
		}
	});
}

function GetUrlParaPre(){
	var str = GetUrlPara();
	console.log(GetUrlPara());
	var mycars=new Array();
	mycars=str.split("=");
	
	return mycars[1];
}