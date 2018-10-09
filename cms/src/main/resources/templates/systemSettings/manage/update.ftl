<!DOCTYPE html>
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
                                   name="employeeId" value=${employee.employee_id} readonly="readonly">
                        </div>
                    </div>
                    <div class="form-group field-manage-name required">
                        <label class="control-label col-sm-2" for="manage-name">姓名</label>
                        <div class="col-sm-8">
                            <input type="text" id="manage-name" class="form-control"
                                   name="manage-name" value=${employee.employee_name}>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group field-manage-department_id required">
                        <label class="control-label col-sm-2" for="manage-department_id">部门</label>

                        <div class="col-sm-8">
                            <select id="manage-department_id" class="form-control"
                                    name="manage-department_id">
                                <option value="0">${employee.department_name}</option>

                            </select>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group field-manage-position_id required">
                        <label class="control-label col-sm-2" for="manage-position_id">职位</label>

                        <div class="col-sm-8">
                            <select id="manage-position_id" class="form-control"
                                    name="manage-position_id">
                                <option value="0">${employee.position_name}</option>
                            </select>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>
                    <div class="form-group field-manage-mobile required">
                        <label class="control-label col-sm-2" for="manage-mobile">手机</label>

                        <div class="col-sm-8">
                            <input type="text" id="manage-mobile" class="form-control"
                                   name="manage-mobile" value=${employee.phone}>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>
                    <div class="form-group field-manage-email">
                        <label class="control-label col-sm-2" for="manage-email">电子邮箱</label>
                        <div class="col-sm-8">
                            <input type="text" id="manage-email" class="form-control"
                                   name="manage-email" value=${employee.email}>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group field-manage-parentemployeeId">
                        <label class="control-label col-sm-2" for="manage-address">上级员工工号</label>
                        <div class="col-sm-8">
                            <input type="text" id="parentemployeeId" class="form-control"
                                   name="parentemployeeId" value=${employee.parent_employee_id}>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>

                        <div class="col-lg-10">
                            <button id="mysubmit" type="button" class="btn btn-success">修改
                            </button>
                            <a type="button" class="btn btn-default"
                                    href="/systemSettings/manage/index/emps">返回
                            </a>
                            <input type="hidden" name="reback">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    <#--  $(function () {-->
    <#--$("#manage-department_id").val('${employee.departmentId}');-->
    <#--$("#manage-position_id").val('${employee.positonId}');-->
    <#--});-->

    function commitCheck() {
        var managename = $("#manage-name").val();
        if ("" == managename || undefined == managename) {
            alert("员工名称不能为空");
            return;
        }
        var managedepartmentid = $("#manage-department_id").val();
        if (0 == managedepartmentid) {
//            alert("必须给员工制定部门");
            return;
        }
        var managepositionid = $("#manage-position_id").val();
        if (0 == managepositionid) {
//            alert("必须给员工制定职位");
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
                        $("#updateEmployeeFrom").submit();
                    }
                },
                error: function () {
                    alert("请求失败!");
                }
            });
        } else {
            $("#updateEmployeeFrom").submit();
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
        //校验上级工号是否存在
        $("#parentemployeeId").blur(function () {
            if ($('#parentemployeeId').val() != '') {
                var data = {}
                data.parentemployeeId = $('#parentemployeeId').val();
                $.ajax({
                    type: 'post',
                    url: '/isParent_employee_id',
                    data: JSON.stringify(data),
                    cache: false,
                    contentType: 'application/json;charset=UTF-8',
                    dataType: "json",
                    sync: true,
                    success: function (result) {
                        if (result.code == 200) {
                            alert("请重新输入上级工号，此工号不存在")
                        }
                    }
                    ,
                    error: function () {
                        alert("请求失败!");
                    }
                })
            }
        });

    })
</script>

<script>
    $(function () {
        //提交修改
        $("#mysubmit").click(function () {
            var data = {}
            data.employee_id = $('#employeeId').val();
            data.employee_name = $('#manage-name').val();
            data.department_name = $("#manage-department_id option:selected").text();
            data.position_name = $("#manage-position_id option:selected").text();
            data.phone = $('#manage-mobile').val();
            data.email = $('#manage-email').val();
            data.parent_employee_id = $('#parentemployeeId').val();
            console.log(data)
            $.ajax({
                type: 'post',
                url: '/sureToUpdateEmployee',
                data: JSON.stringify(data),
                cache: false,
                contentType: 'application/json;charset=UTF-8',
                dataType: "json",
                sync: true,
                success: function (result) {
                   if(result.code==100){
                       alert('修改成功！')
                   }
                }
                ,
                error: function () {
                    alert("请求失败!");
                }
            })
        });

    })
</script>
</body>

</html>
