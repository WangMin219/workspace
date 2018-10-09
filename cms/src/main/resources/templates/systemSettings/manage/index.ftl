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
                <i class="icon-table"></i> 员工管理 <a
                    class="btn btn-sm btn-primary pull-right"
                    href="/systemSettings/manage/create"><i
                    class="icon-plus"></i> 添加员工</a>
            </div>
            <div class="widget-content padded clearfix">
                <div class="dataTables_filter">
                    <form class="form-inline">
                        <div class="btn-group">
                            <span>工号：</span> <input type="text" class="form-control"
                                                    id="emmployeeId" name="emmployeeId" value="">
                        </div>
                        <div class="btn-group">
                            <span>姓名：</span> <input type="text" class="form-control"
                                                    id="emmployeename" name="emmployeename"
                                                    value="">
                        </div>
                        <div class="btn-group">
                            <button type="button" class="btn btn-success search">
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
                                <th nowrap>工号</th>
                                <th nowrap>姓名</th>
                                <th nowrap>部门</th>
                                <th nowrap>职位</th>
                                <th nowrap>手机</th>
                                <th nowrap>电子邮箱</th>
                                <th nowrap>状态</th>
                                <th nowrap>创建时间</th>
                                <th nowrap>更新时间</th>
                                <th class="action-column" colspan="2">操作</th>
                            </tr>
                            </thead>
                            <tbody id="employee_body">
                            <#list pageInfo.list as key>
                            <tr data-key="1" class="trclass">
                                <td class='2'>${key.employee_id}</td>
                                <td class='3'>${key.employee_name}</td>
                                <td class='4'>${key.department_name}</td>
                                <td class='5'>${key.position_name}</td>
                                <td class='6'>${key.phone}</td>
                                <td class='7'>${key.email}</td>
                                <td class='8'>
                                    <#if key.status == 1>
                                        禁用
                                    <#else>
                                        正常
                                    </#if>
                                </td>
                                <td class='9'>${key.create_time?string('yyyy-MM-dd HH:mm:ss')}</td>
                                <td>${key.update_time?string('yyyy-MM-dd HH:mm:ss')}</td>
                                <td class='10'>
                                    <#if key.status == 1>
                                        <button type="button" id="recevorbtn" name="recevorbtn"
                                                class="btn btn-success btn-sm backNormal"
                                        >恢复正常
                                        </button>
                                    <#else>
                                        <button type="button" id="forbidbtn" name="forbidbtn"
                                                class="btn btn-danger btn-sm banCount"
                                        ">禁用账户
                                        </button>
                                        <button type="button" id="updatebtn" name="updatebtn"
                                                class="btn btn-info btn-sm"
                                        >修改用户信息
                                        </button>
                                    </#if>
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

<#--查询员工-->
<script id="searchEmployee_script" type="text/x-jquery-tmpl">
<#noparse>
                                <tr data-key="1">
                                <td class='1'>${employee_id}</td>
                                <td class='2'>${employee_name}</td>
                                <td class='3'>${department_name}</td>
                                <td class='4'>${position_name}</td>
                                <td class='5'>${phone}</td>
                                <td class='6'>${email}</td>
                                <td class='7'>
                                {{if status==1}}
                                        禁用
                                     {{else}}
                                        正常
                                  {{/if}}
                                    </td>
                                <td class='8'>
                                ${create_time}
                                </td>
                                <td class='9'>
                                ${update_time}
                                </td>
                                <td class='btnclass'>
                                {{if status==1}}
                                    <button type="button" id="recevorbtn" name="recevorbtn"
                                                class="btn btn-success btn-sm backNormal"
                                                >恢复正常
                                        </button>
                                    {{else}}
                                    <button type="button" id="forbidbtn" name="forbidbtn"
                                                class="btn btn-danger btn-sm banCount"
                                           >禁用账户
                                        </button>
                                        <button type="button" id="updatebtn" name="updatebtn"
                                                class="btn btn-info btn-sm"
                                           >修改用户信息
                                        </button>
                                {{/if}}
                                </td>
                            </tr>
</#noparse>

</script>

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

<script>
    $(function () {
        //点击查询
        $('.search').click(function () {
            var emmployeeId = $('#emmployeeId').val();
            var emmployeename = $('#emmployeename').val();
            var data = {}
            data.emmployeeId = emmployeeId;
            data.emmployeename = emmployeename;
            $.ajax({
                type: 'post',
                url: '/searchEmployee',
                data: JSON.stringify(data),
                cache: false,
                contentType: 'application/json;charset=UTF-8',
                dataType: "json",
                sync: true,
                success: function (result) {
                    result.update_time = formatDateTime(result.update_time)
                    result.create_time = formatDateTime(result.create_time)
                    if (result == null) {
                        alert("无此人信息")
                    } else {
                        $('#employee_body').empty()
                        $('.pagination').empty()
                        $("#searchEmployee_script").tmpl(result).appendTo("#employee_body");
                    }
                }
                ,
                error: function () {
                    alert("无此人信息!");
                }
            })
        })
    })
</script>


<script type="text/javascript">
    $(function () {
        //点击恢复账户
        $('#employee_body').on('click', '.backNormal', function () {
            var data = {}
            var employeeId = $(this).parents("tr").find("td:eq(0)").text().trim();
            data.employeeId = employeeId
            var obj = $(this)
            $.ajax({
                type: 'post',
                url: '/updateStatus',
                data: JSON.stringify(data),
                cache: false,
                contentType: 'application/json;charset=UTF-8',
                dataType: "json",
                sync: true,
                success: function (result) {
                    //更换按钮
                    obj.parents("tr").find("td:eq(9) button").hide(); //这里不能使用empty()方法，一单使用append方法就失效了，不清楚为什么会这样，，这里也可以用jqery Tmpl拼接
                    obj.parents("tr").find("td:eq(9)").append("<button type='button' id='forbidbtn' name='forbidbtn'class='btn btn-danger btn-sm banCount'>禁用账户</button><button type='button' id='updatebtn' name='updatebtn'class='btn btn-info btn-sm'>修改用户信息</button>")
                    //更换状态值
                    obj.parents("tr").find("td:eq(6)").empty();
                    obj.parents("tr").find("td:eq(6)").append('正常')
                    if (result.code == 100) {
                    }
                }
            })
        })
    })
</script>

<script>
    //updatebtn更新用户信息
    $(function () {
        $('#employee_body').on('click', '#updatebtn', function () {
            var employeeId = $(this).parents("tr").find("td:eq(0)").text().trim()
            var employeeName = $(this).parents("tr").find("td:eq(1)").text().trim()
            console.log(employeeId);
            location.href = "/systemSettings/manage/update/" + employeeId + "/" + employeeName
        })
    })
</script>
<script>
    $(function () {
        //点击禁用账户
        $('#employee_body').on('click', '.banCount', function () {
            var data = {}
            var employeeId = $(this).parents("tr").find("td:eq(0)").text().trim();
            data.employeeId = employeeId
            var obj = $(this)
            $.ajax({
                type: 'post',
                url: '/banCount',
                data: JSON.stringify(data),
                cache: false,
                contentType: 'application/json;charset=UTF-8',
                dataType: "json",
                sync: true,
                success: function (result) {
                    //更换按钮
                    obj.parents("tr").find("td:eq(9) button").hide(); //这里不能使用empty()方法，一单使用append方法就失效了，不清楚为什么会这样，，这里也可以用jqery Tmpl拼接
                    obj.parents("tr").find("td:eq(9)").append("<button type='button' id='recevorbtn' name='recevorbtn'class='btn btn-success btn-sm backNormal'>恢复正常</button>")

                    //更换状态值
                    obj.parents("tr").find("td:eq(6)").empty();
                    obj.parents("tr").find("td:eq(6)").append('禁用')
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
