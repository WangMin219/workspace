// 立即加载
$(function(){
	var str = GetUrlPara();
	console.log(GetUrlPara());
	var mycars=new Array();
	mycars=str.split("=");
	
	getJurisdiction(mycars[1])
});

////获取到URL参数
//function GetUrlPara(){
//　　var url = document.location.toString();
//　　var arrUrl = url.split("?");
//
//　　var para = arrUrl[1];
//　　return para;
//}

//// 页面跳转到员工管理页面
//function getAllEmployee(){
//	top.location = "jsp/systemSettings/manage/index1.jsp";
//}
