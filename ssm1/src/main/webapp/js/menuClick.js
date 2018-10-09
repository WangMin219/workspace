// 页面跳转到员工管理页面
function getAllEmployee() {
	top.location = "jsp/systemSettings/manage/index1.jsp";
}

// 添加员工
function addEmp() {
	// 前往员工添加页面
	top.location = "jsp/systemSettings/manage/create.jsp";
}

// 修改员工
function updateEmployeeDetail(data) {
	top.location = "jsp/systemSettings/manage/update.jsp?id=" + data;
}

// 获取所有的职位信息
function getAllEmmPosition(){
	top.location = "jsp/systemSettings/position/index.jsp"
}

// 菜单
function getAllMenu(){
	top.location = "jsp/systemSettings/menu/index.jsp"
}