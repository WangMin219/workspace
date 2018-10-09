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
        <div class="widget-container fluid-height clearfix mwi1200">
            <div class="heading clearfix">
                <i class="icon-reorder"></i> 添加员工 <a href="javascript:;"
                                                     class="pull-right" onclick="history.go(-1);"><i
                    class="icon-reply"></i> </a>
            </div>
            <div class="widget-content padded clearfix">
                <form id="addEmployeeForm" class="form-horizontal" method="post">

                    <div class="form-group">
                        <label class="control-label col-md-2">工号</label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" name="employeeId"
                                   id="employeeId" value="工号自动生成无需手动填写" readonly="readonly"
                                   disabled="disabled">
                        </div>
                    </div>

                    <div class="form-group field-manage-name required">
                        <label class="control-label col-sm-2" for="manage-name">姓名</label>
                        <div class="col-sm-8">
                            <input type="text" id="employeeName" class="form-control"
                                   name="manage-name" placeholder="姓名">
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group field-manage-password required">
                        <label class="control-label col-sm-2" for="manage-password">密码</label>
                        <div class="col-sm-8">
                            <input type="input" id="manage-password" class="form-control"
                                   name="manage-password" placeholder="123456(初始化密码，修改后才能登陆)"
                                   readonly="readonly">
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
                        <label class="control-label col-sm-2" for="manage-position_id">职位</label>
                        <div class="col-sm-8" id="emp_position_id">

                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group field-manage-mobile required">
                        <label class="control-label col-sm-2" for="manage-mobile">手机</label>
                        <div class="col-sm-8">
                            <input type="text" id="manage-mobile" class="form-control"
                                   name="manage-mobile" placeholder="手机">
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group field-manage-email">
                        <label class="control-label col-sm-2" for="manage-email">电子邮箱</label>
                        <div class="col-sm-8">
                            <input type="text" id="manage-email" class="form-control"
                                   name="manage-email" placeholder="电子邮箱">
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group field-manage-parentemployeeId">
                        <label class="control-label col-sm-2" for="manage-address">上级员工工号</label>
                        <div class="col-sm-8">
                            <input type="text" id="parentemployeeId" class="form-control"
                                   name="parentemployeeId" placeholder="上级员工工号">
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-lg-10">
                            <button id="mysubmit" type="button" class="btn btn-success"
                                    onclick="commitCheck()">添加
                            </button>
                            <button type="button" class="btn btn-default"
                                    onClick="history.go(-1);">返回
                            </button>
                            <input type="hidden" name="reback">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/addEmp.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/Jurisdiction.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/until.js"></script>
</body>
</html>
