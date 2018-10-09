﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="/common.jsp"></jsp:include>
</head>

<body class="navbar-top">
	<div class="modal-shiftfix">
		<jsp:include page="/common.jsp"></jsp:include>
		<jsp:include page="/menu.jsp"></jsp:include>
		<div class="container-fluid main-content">
			<div class="widget-container fluid-height clearfix mwi1200">
				<div class="heading clearfix">
					<i class="icon-reorder"></i> 修改职位 <a href="javascript:;"
						class="pull-right" onclick="history.go(-1);"><i
						class="icon-reply"></i> </a>
				</div>
				<div class="widget-content padded clearfix">
					<form id="updatePositionFrom" class="form-horizontal" method="post">
					
					
						<input type="hidden" id="positionId" name="positionId">
						<div class="form-group field-manage-name required">
							<label class="control-label col-sm-2" for="manage-name">名称</label>
							<div class="col-sm-8">
								<input type="text" id="positionname" class="form-control"
									name="positionname">
							</div>
							<div class="help-block help-block-error"></div>
						</div>
						
						<div class="form-group field-manage-department_id required">
							<label class="control-label col-sm-2" for="manage-department_id">等级</label>
							<div class="col-sm-8">
								<select id="positionLevel" class="form-control"	name="positionLevel">
									<option value="0">选择等级</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
								</select>
							</div>
							<div class="help-block help-block-error"></div>
						</div>
						
						<div class="form-group">
							<label class="col-sm-2 control-label"></label>

							<div class="col-lg-10">
								<button type="button" id="mysubmit" onclick="update()" class="btn btn-success">修改</button>
								<button type="button" class="btn btn-default"
									onClick="history.go(-1);">返回</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
<!-- 	<script type="text/javascript">
		$(function() {

			$("#mysubmit").click(positionCheck);
			$("#positionLevel").val('${emmPosition.positionLevel}');
			function positionCheck() {
				var positionLevel = $("#positionLevel").val();
				if( 0 == positionLevel){
				 	alert("必须选择职位等级！");
				 	return;
				}
				var positionName = $("#positionName").val();
				var data = {};
				data.positionName = positionName;
				var flag = false;
				$.ajax({
					type : 'post',
					url : 'emmPosition/positionNameCheck',
					data : data,
					cache : false,
					sync : true,
					success : function(msg) {
						var json = JSON.parse(msg);
						if (0 == json.status) {
							alert(json.msg);
						} else {
							//alert("提交表单");
							$("#updatePositionFrom").submit();
						}
					},
					error : function() {
						alert("请求失败!");
					}
				});
			}
		});
	</script> -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/Jurisdiction.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/position_updata.js"></script>
</body>
</html>
