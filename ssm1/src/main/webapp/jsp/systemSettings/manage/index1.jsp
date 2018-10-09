<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="/common.jsp"></jsp:include>
</head>

<body class="navbar-top">
	<div class="modal-shiftfix">
		<jsp:include page="/common.jsp"></jsp:include>
		<!-- 菜单 -->
		<jsp:include page="/menu.jsp"></jsp:include>

		<div class="container-fluid main-content">
			<div class="widget-container fluid-height clearfix">
				<div class="heading clearfix">
					<i class="icon-table"></i> 员工管理 <a
						class="btn btn-sm btn-primary pull-right" onclick="addEmp()"><i class="icon-plus"></i>添加员工</a>
				</div>
				<div class="widget-content padded clearfix">
					<div class="dataTables_filter">

						<form id="actionFormSo"
							action="LinkManServlet?method=getOneLinkMan" method="post">
							<div class="btn-group">
								<input type="text" class="form-control input-sm"
									name="employeeId" id="employeeId" placeholder="员工号" value="">
							</div>
							<div class="btn-group">
								<input type="text" class="form-control input-sm"
									name="employeeName" id="employeeName" placeholder="员工姓名" value="">
							</div>
							<div class="btn-group">
								<button type="button" class="btn btn-success btn-sm" id="soo"
									onclick="SearchEmp()">
									<i class="glyphicon glyphicon-search"></i> 搜索
								</button>
							</div>
						</form>
					</div>

					<div id="w0" class="grid-view">
						<div class="table-responsive">
							<table class="table table-hover" id="EmpTable">
								<thead>
									<tr>
										<!-- <th nowrap>所属客户</th> -->
										<th nowrap>员工号</th>
										<th nowrap>姓名</th>
										<th nowrap>性别</th>
										<th nowrap>部门</th>
										<th nowrap>职位</th>
										<th nowrap>手机</th>
										<th nowrap>电子邮箱</th>
										<th nowrap>QQ</th>
										<th nowrap>状态</th>
										<th nowrap>创建时间</th>
										<th nowrap>更新时间</th>
										<th class="action-column">操作</th>
									</tr>
								</thead>
								<tbody id="empList">

								</tbody>
							</table>

							<!-- 分页条 -->
							<!-- 显示分页信息 -->
							<div class="row" align="center">
								<!--分页文字信息  -->
								<div class="col-md-6" id="page_info_area"></div>
								<!-- 分页条信息 -->
								<div class="col-md-6" id="page_nav_area"></div>
							</div>
							<!-- 分页结束 -->
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/Employee.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/Jurisdiction.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/until.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/dividePage.js"></script>
</html>
