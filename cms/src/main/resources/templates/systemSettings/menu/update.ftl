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
                <i class="icon-reorder"></i> 创建菜单 <a href="javascript:;" class="pull-right" onclick="history.go(-1);"><i
                    class="icon-reply"></i></a>
            </div>
            <div class="widget-content padded clearfix">
                <input type="hidden" id="menu_id" value=${menu.menu_id}>
                <form id="updateMenuFrom" class="form-horizontal" action="menu/updateMenu" method="post">
                    <div class="form-group field-menu-parent_id required">
                        <label class="control-label col-sm-2" for="menu-parent_id">父级</label>
                        <div class="col-sm-8">
                            <select id="menu-parent_id" class="form-control" name="menu-parent_id">
                                <option value="0">
                                <#if (menu.parent_name)??>
                                ${menu.parent_name}
                                <#else>
                                </#if>
                                </option>
                                <option>顶级节点</option>

                            </select>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>
                    
                    <div class="form-group field-menu-name required">
                        <label class="control-label col-sm-2" for="menu-name">名称</label>

                        <div class="col-sm-8">
                            <input type="text" id="menu-name" class="form-control" name="menu-name" maxlength="20"
                                   value=${menu.menu_name}>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>
                    
                    <div class="form-group field-menu-url required">
                        <label class="control-label col-sm-2" for="menu-url">地址</label>
                        <div class="col-sm-8">
                            <input type="text" id="menu-url" class="form-control" name="menu-url" maxlength="50"
                                   value=${menu.menu_url}>
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>
                    
                    <div class="form-group field-menu-icon">
                        <label class="control-label col-sm-2" for="menu-icon">图标</label>
                        <div class="col-sm-8">
                            <input type="text" id="menu-icon" class="form-control" name="menu-icon" maxlength="25"
                                   value=
                                   <#if (menu.pictures)??>
                                   ${menu.pictures}
                                   <#else>
                                   </#if>
                            >
                        </div>
                        <div class="help-block help-block-error"></div>
                    </div>
                    
                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-lg-10">
                            <button type="button" id="addMenuBtn" class="btn btn-success" onclick="addMetuCheck()">修改</button>
                            <button type="button" class="btn btn-default" onClick="history.go(-1);">返回</button>
                            <input type="hidden" name="reback"></div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
<script type="text/javascript">
	function addMetuCheck(){
		var menuname=$("#menu-name").val();
		if( "" == menuname || undefined == menuname){
			alert("请设置菜单名");
			return ;
		}

		var menuurl=$("#menu-url").val();
		if( "" == menuurl || undefined == menuurl){
			alert("请设置菜单路径");
			return ;
		}
	}
</script>

<script>
    $(function () {
        //获取父级菜单
        $.ajax({
            type: 'post',
            url: '/systemSettings/menu/getFatherMenu',
            cache: false,
            contentType: 'application/json;charset=UTF-8',
            dataType: "json",
            sync: true,
            success: function (result) {
                $.each(result.map.menuVOList, function (i, data) {
                    $('#menu-parent_id').append("<option>|-" + data.menu_name + "</option>")
                })
            }
            ,
            error: function () {
                alert("请求失败!");
            }
        })
    });
</script>

<script>
    $(function () {
        //提交修改
        $("#addMenuBtn").click(function () {
            var data = {}
            data.menu_id = $('#menu_id').val();
            data.menu_parent_name = $("#menu-parent_id option:selected").text();
            data.menu_name = $('#menu-name').val();
            data.menu_url = $("#menu-url").val();
            data.menu_icon = $('#menu-icon').val();
            $.ajax({
                type: 'post',
                url: '/systemSettings/menu/updateMenu',
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
</html>
