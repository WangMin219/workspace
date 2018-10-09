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
                <i class="icon-reorder"></i> 添加职位 <a href="javascript:;"
                                                     class="pull-right" onclick="history.go(-1);"><i
                    class="icon-reply"></i> </a>
            </div>
            <div class="widget-content padded clearfix">
                <form id="addPositionFrom" class="form-horizontal" action="/systemSettings/position/sureToAddPosition"
                      method="post">

                    <div class="form-group field-manage-name required">
                        <label class="control-label col-sm-2" for="manage-name">名称</label>
                        <div class="col-sm-8">
                            <input type="text" id="positionname" class="form-control"
                                   name="positionname" placeholder="职位名称">
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group field-manage-department_id required">
                        <label class="control-label col-sm-2" for="manage-department_id">等级</label>
                        <div class="col-sm-8">
                            <select id="positionLevel" class="form-control" name="positionLevel">
                                <option value="0">选择等级</option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                            </select>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-lg-10">
                            <button type="button" id="mysubmit" class="btn btn-success">创建</button>
                            <button type="button" class="btn btn-default"
                                    onClick="history.go(-1);">返回
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script>
    $(function () {
        //验证名称唯一
        $("#positionname").blur(function () {
            var data = {}
            data.positionName = $('#positionname').val()
            $.ajax({
                type: 'POST',
                url: '/systemSettings/position/isExistPosition',
                cache: false,
                data:JSON.stringify(data),
                contentType: 'application/json;charset=UTF-8',
                sync: true,
                success: function (result) {
                    if (result.code != 100) {
                        alert('名称重复！')
                    }
                }
                ,
                error: function () {
                    alert("请求失败!");
                }
            })
        })
    })
</script>

<script>
    $(function () {
        //确认修改
        $("#mysubmit").click(function () {
            var positionLevel = $("#positionLevel").val();
            var positionName = $('#positionname').val()
            if (0 == positionLevel) {
                alert("必须选择职位等级！");
                return;
            }
            if ('' == positionName) {
                alert("必须填写职位名称！");
                return;
            }

            var data = {}
            data.positionName = positionName
            data.positionLevel = positionLevel
            $.ajax({
                type: 'post',
                url: '/systemSettings/position/sureToAddPosition',
                contentType: 'application/json;charset=UTF-8',
                cache: false,
                dataType: "json",
                data: JSON.stringify(data),
                sync: true,
                success: function (result) {
                    if (result.code == 100) {
                        alert('添加成功！')
                    } else {
                        alert('添加失败！')
                    }
                }
                ,
                error: function () {
                    alert("请求失败!");
                }
            })
        })
    })
</script>
</body>

</html>
