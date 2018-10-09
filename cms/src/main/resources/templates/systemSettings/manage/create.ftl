﻿<!DOCTYPE html>
<html lang="en">

<head>
<#include "../../common.ftl">
</head>

<body class="navbar-top">
<div class="modal-shiftfix">
<#include "../../menu.ftl">
    <div class="container-fluid main-content">
        <div class="widget-container fluid-height clearfix mwi1200">
            <div class="heading clearfix">
                <i class="icon-reorder"></i> 添加员工 <a href="javascript:;"
                                                     class="pull-right" onclick="history.go(-1);"><i
                    class="icon-reply"></i> </a>
            </div>
            <div class="widget-content padded clearfix">
                <form id="addEmployeeForm" class="form-horizontal"
                      action="employee/addEmployee" method="post">

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
                            <input type="text" id="manage-name" class="form-control"
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
                        <div class="col-sm-8">
                            <select id="manage-department_id" class="form-control"
                                    name="manage-department_id">
                                <option value="0">选择部门</option>

                            </select>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group field-manage-position_id required">
                        <label class="control-label col-sm-2" for="manage-position_id">职位</label>
                        <div class="col-sm-8">
                            <select id="manage-position_id" class="form-control"
                                    name="manage-position_id">
                                <option value="0">选择职位</option>
                            </select>
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
                            ">添加
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
<script type="text/javascript">
    function commitCheck() {
        var managename = $("#manage-name").val();
        if ("" == managename || undefined == managename) {
            alert("员工名称不能为空");
            return;
        }

        var managedepartmentid = $("#manage-department_id").val();
        if (0 == managedepartmentid) {
            alert("必须给员工制定部门");
            return;
        }

        var managepositionid = $("#manage-position_id").val();
        if (0 == managepositionid) {
            alert("必须给员工制定职位");
            return;
        }

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

            var data = {};
            data.parentemployeeId = parentemployeeId;
            $.ajax({
                type: 'post',
                url: 'employee/checkParentEmployee',
                data: data,
                cache: false,
                sync: true,
                success: function (msg) {
                    var json = JSON.parse(msg);
                    if (0 == json.status) {
                        alert(json.msg);
                    } else {
                        //alert("提交表单");
                        $("#addEmployeeForm").submit();
                    }
                },
                error: function () {
                    alert("请求失败!");
                }
            });
        } else {
            $("#addEmployeeForm").submit();
        }
    }
</script>

<script>
    $(function () {
        //获取部门信息
        $.ajax({
            type: 'post',
            url: '/getDepartmentList',
            cache: false,
            contentType: 'application/json;charset=UTF-8',
            dataType: "json",
            sync: true,
            success: function (result) {
                if (result.code == 100) {
                    $.each(result.map.departList, function (i, data) {
                        $('#manage-department_id').append('<option>' + data.department_name + '</option>')
                    })
                } else {
                    alert("请求失败!");
                }

            }
            ,
            error: function () {
                alert("请求失败!");
            }
        })
    })
</script>

<script>
    $(function () {
        //获取职位信息
        $.ajax({
            type: 'post',
            url: '/getPositionList',
            cache: false,
            contentType: 'application/json;charset=UTF-8',
            dataType: "json",
            sync: true,
            success: function (result) {
                if (result.code == 100) {
                    $.each(result.map.PositionList, function (i, data) {
                        $('#manage-position_id').append('<option>' + data.position_name + '</option>')
                    })
                } else {
                    alert("请求失败!");
                }

            }
            ,
            error: function () {
                alert("请求失败!");
            }
        })
    })
</script>


<script>
    $(function () {
        $('body').on('click', '#mysubmit', function () {
            //添加员工信息
            var data = {}
            data.employee_name = $('#manage-name').val();
            data.department_name = $("#manage-department_id option:selected").text();
            data.position_name = $("#manage-position_id option:selected").text();
            data.phone = $('#manage-mobile').val();
            data.email = $('#manage-email').val();
            data.parent_employee_id = $('#parentemployeeId').val();
            $.ajax({
                type: 'post',
                url: '/createEmployee',
                cache: false,
                contentType: 'application/json;charset=UTF-8',
                data: JSON.stringify(data),
                dataType: "json",
                sync: true,
                success: function (result) {
                    if (result.code == 100) {
                        alert('添加成功！')
                    } else {
                        alert('添加失败！')
                    }
                },
                error: function () {
                    alert("请求失败!");
                }
            })
        })
    })
</script>
</body>
</html>
