<!DOCTYPE html>
<html lang="en">

<head>
	<#include "../../common.ftl">
</head>

<body class="navbar-top">
	<div class="modal-shiftfix">
	<#include "../../menu.ftl">
		<div class="container-fluid main-content">
			<div class="widget-container fluid-height clearfix">
				<div class="heading clearfix">
					<i class="icon-table"></i> 菜单管理 <a
						class="btn btn-sm btn-primary pull-right"
						href="/systemSettings/menu/createMenu"><i
						class="icon-plus"></i> 创建菜单</a>
				</div>
				<div class="widget-content padded clearfix">
					<div class="dataTables_filter">
						<form class="form-inline" method="post">
							<div class="btn-group">
							<span>菜单名：</span>
								<input type="text" class="form-control" id="name" name="name"
									value="" placeholder="名称">
							</div>
							<div class="btn-group">
								<button type="button" id="searchButton" class="btn btn-success">
									<i class="glyphicon glyphicon-search"></i> 搜索
								</button>
							</div>
						</form>
					</div>
					<div id="w0" class="grid-view">
						<div class="table-responsive">
							<table class="table table-hover">
								<thead>
									<tr>
										<th nowrap>ID</th>
										<th nowrap>名称</th>
										<th nowrap>地址</th>
										<th nowrap>图标</th>
										<th nowrap>创建时间</th>
										<th nowrap>更新时间</th>
										<th nowrap>上级菜单</th>
										<th class="action-column">操作</th>
									</tr>
								</thead>
								<tbody id="menuTbody">
<#list pageInfo.list as key>
									<tr data-key="1">
										<td>${key.menu_id}</td>
										<td>${key.menu_name}</td>
										<td>${key.menu_url}</td>
										<td>
<#if (key.pictures)??>
${key.pictures}
</#if>
                                        </td>
										<td>${key.create_time?string('yyyy-MM-dd HH:mm:ss')}</td>
										<td>${key.update_time?string('yyyy-MM-dd HH:mm:ss')}</td>
                                        <td>
											<#if (key.parent_name)??>
                                               ${key.parent_name}
                                            </#if></td>
										<td>
											<button type="button" id="updatebtn" name="updatebtn"
												class="btn btn-warning btn-sm" onclick="updateMenu(1)">修改
											</button>
											<button type="button" id="delbtn" name="delbtn"
												class="btn btn-danger btn-sm" onclick="deleteMenu(1)">删除
											</button>
										</td>
									</tr>
</#list>
								</tbody>
							</table>
						<#--分页开始-->
                            <nav aria-label="Page navigation">
                                <ul class="pagination pull-right">
                                    <li>
									<#if pageInfo.pageNum<=1 >
                                        <a href="?pn=1" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                        </a>
									<#else>
                                        <a href="?pn=${pageInfo.pageNum-1}" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                        </a>
									</#if>
                                    </li>
								<#list pageInfo.navigatepageNums as key>
									<#if pageInfo.pageNum==key>
                                        <li><a href="#" class="active">${key}</a></li>
									<#else >
                                        <li><a href="?pn=${key}">${key}</a></li>
									</#if>
								</#list>
                                    <li>
									<#if (pageInfo.pageNum >=pageInfo.navigateLastPage)>
                                        <a href="#" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
									<#else>
                                        <a href="?pn=${pageInfo.pageNum+1}" aria-label="Previous">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
									</#if>
                                    </li>
                                </ul>
                            </nav>
						<#--分页结束-->
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
    <script>
        //时间戳转时间工具
        function formatDateTime(inputTime) {
            var date = new Date(inputTime);
            var y = date.getFullYear();
            var m = date.getMonth() + 1;
            m = m < 10 ? ('0' + m) : m;
            var d = date.getDate();
            d = d < 10 ? ('0' + d) : d;
            var h = date.getHours();
            h = h < 10 ? ('0' + h) : h;
            var minute = date.getMinutes();
            var second = date.getSeconds();
            minute = minute < 10 ? ('0' + minute) : minute;
            second = second < 10 ? ('0' + second) : second;
            return y + '-' + m + '-' + d + ' ' + h + ':' + minute + ':' + second;
        };
    </script>
	<#--查询菜单-->
    <script id="searchMenu_script" type="text/x-jquery-tmpl">
<#noparse>
                                <tr data-key="1">
                                <td class='1'>${menu_id}</td>
                                <td class='2'>${menu_name}</td>
                                <td class='3'>${menu_url}</td>
                                <td class='4'>
                                {{if pictures!=null}}
                                        ${pictures}
                                  {{/if}}
                                </td>
                                <td class='8'>
                                ${create_time}
                                </td>
                                <td class='9'>
                                ${update_time}
                                </td>
                                <td class='btnclass'>
                                {{if parent_name!=null}}
                                        ${parent_name}
                                  {{/if}}
                                </td>
                                <td>
											<button type="button" id="updatebtn" name="updatebtn"
												class="btn btn-warning btn-sm" onclick="updateMenu(1)">修改
											</button>
											<button type="button" id="delbtn" name="delbtn"
												class="btn btn-danger btn-sm" onclick="deleteMenu(1)">删除
											</button>
										</td>
                            </tr>
</#noparse>
</script>
    <script>
        $(function () {
            //点击查询
            $('#searchButton').click(function () {
                var name = $('#name').val().trim();
                console.log(name)
                $.ajax({
                    type: 'post',
                    url: '/systemSettings/menu/searchMenu/' + name,
                    cache: false,
                    contentType: 'application/json;charset=UTF-8',
                    dataType: "json",
                    sync: true,
                    success: function (result) {
                        console.log(result)
                        if (result.code == 100) {
                            result.map.relationMenu.create_time = formatDateTime(result.map.relationMenu.create_time)
                            result.map.relationMenu.update_time = formatDateTime(result.map.relationMenu.update_time)
                            $('#menuTbody').empty();
                            $('.pagination').empty()
                            $("#searchMenu_script").tmpl(result.map.relationMenu).appendTo("#menuTbody");
                        } else {
                            alert("无此人信息!");
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



    <script type="text/javascript">
        $('body').on('click', '#delbtn', function () {
            if (confirm("确认删除？")) {
                var menuId = $(this).parents("tr").find("td:eq(0)").text().trim()
                console.log(menuId)
                $.ajax({
                    type: 'post',
                    url: '/systemSettings/menu/deleteMenu/' + menuId,
                    cache: false,
                    contentType: 'application/json;charset=UTF-8',
                    dataType: "json",
                    sync: true,
                    success: function (result) {
                        if (result.code == 100) {
                            location.reload();
                        } else {
                            alert("删除失败！")
                        }
                    }, error: function () {
                        alert("请求失败")
                    }
                })
            }
        })
    </script>

    <script>
        $(function () {
            //点击修改
            $('body').on('click', '#updatebtn', function () {
                var menuId = $(this).parents("tr").find("td:eq(0)").text().trim()
                location.href = "/systemSettings/menu/updateMenu/" + menuId
            })
        })
    </script>
</body>

</html>
