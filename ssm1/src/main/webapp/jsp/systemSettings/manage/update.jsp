<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="/common.jsp"></jsp:include>
</head>
<body class="navbar-top">
<jsp:include page="/common.jsp"></jsp:include>
	<div class="modal-shiftfix">
		<jsp:include page="/menu.jsp"></jsp:include>
		<div class="container-fluid main-content">
			<div class="widget-container fluid-height clearfix mwi1200">
				<div class="heading clearfix">
					<i class="icon-reorder"></i> 修改员工信息 <a href="javascript:;"
						class="pull-right" onclick="history.go(-1);"><i
						class="icon-reply"></i> </a>
				</div>
				<div class="widget-content padded clearfix">
					<form id="updateEmployeeFrom" class="form-horizontal"
						action="employee/updateEmployee" method="post">
						<div class="form-group">
							<label class="control-label col-md-2">工号</label>
							<div class="col-md-8">
								<input type="text" class="form-control" id="employeeId"
									name="employeeId" readonly="readonly">
							</div>
						</div>
						<div class="form-group field-manage-name required">
							<label class="control-label col-sm-2" for="manage-name">姓名</label>
							<div class="col-sm-8">
								<input type="text" id="employeeName" class="form-control"
									name="manage-name" >
							</div>
							<div class="help-block help-block-error"></div>
						</div>

						<div class="form-group field-manage-department_id required">
							<label class="control-label col-sm-2" for="manage-department_id">部门</label>

							<div class="col-sm-8" id="emm_dept">

							</div>
							<div class="help-block help-block-error"></div>
						</div>

						<div class="form-group field-manage-position_id required">
							<label class="control-label col-sm-2" for="emm_position">职位</label>

							<div class="col-sm-8" id="emp_position_id">

							</div>
							<div class="help-block help-block-error"></div>
						</div>
						<div class="form-group field-manage-mobile required">
							<label class="control-label col-sm-2" for="manage-mobile">手机</label>

							<div class="col-sm-8">
								<input type="text" id="manage-mobile" class="form-control"
									name="manage-mobile">
							</div>
							<div class="help-block help-block-error"></div>
						</div>
						<div class="form-group field-manage-email">
							<label class="control-label col-sm-2" for="manage-email">电子邮箱</label>
							<div class="col-sm-8">
								<input type="text" id="manage-email" class="form-control"
									name="manage-email">
							</div>
							<div class="help-block help-block-error"></div>
						</div>

						<div class="form-group field-manage-parentemployeeId">
							<label class="control-label col-sm-2" for="manage-address">上级员工工号</label>
							<div class="col-sm-8">
								<input type="text" id="parentemployeeId" class="form-control"
									name="parentemployeeId">
							</div>
							<div class="help-block help-block-error"></div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label"></label>

							<div class="col-lg-10">
								<button id="mysubmit" type="button" class="btn btn-success"
									onclick="commitCheck()">修改</button>
								<button type="button" class="btn btn-default"
									onClick="history.go(-1);">返回</button>
								<input type="hidden" name="reback">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/EmpUpdate.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/Jurisdiction.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/until.js"></script>
</body>

</html>
