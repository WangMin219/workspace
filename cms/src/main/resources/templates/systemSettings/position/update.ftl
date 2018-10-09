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
                <i class="icon-reorder"></i> 修改职位 <a href="javascript:;"
                                                     class="pull-right" onclick="history.go(-1);"><i
                    class="icon-reply"></i> </a>
            </div>
            <div class="widget-content padded clearfix">
                <form id="updatePositionFrom" class="form-horizontal" action="emmPosition/updatePosition" method="post">


                    <input type="hidden" id="positionId" name="positionId" value=${position.position_id}>
                    <div class="form-group field-manage-name required">
                        <label class="control-label col-sm-2" for="manage-name">名称</label>
                        <div class="col-sm-8">
                            <input type="text" id="positionname" class="form-control"
                                   name="positionname" value=${position.position_name}>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>

                    <div class="form-group field-manage-department_id required">
                        <label class="control-label col-sm-2" for="manage-department_id">等级</label>
                        <div class="col-sm-8">
                            <select id="positionLevel" class="form-control" name="positionLevel">
                                <option value="0">${position.position_level}</option>
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
                            <button type="button" id="mysubmit" class="btn btn-success">修改</button>
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
        //验证名称、职位的唯一性
        $("#mysubmit").click(function () {
            var data = {}
            data.positionName = $('#positionname').val()
            data.position_level = $("#positionLevel option:selected").text();
            data.positionId = $("#positionId").val();
            console.log(JSON.stringify(data))
            $.ajax({
                type: 'POST',
                url: '/systemSettings/position/updatePosition',
                cache: false,
                data: JSON.stringify(data),
                contentType: 'application/json;charset=UTF-8',
                sync: true,
                success: function (result) {
                    if (result.code == 100) {
                        alert('修改成功！')
                    } else if (result.code == 400) {
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
</body>
</html>
