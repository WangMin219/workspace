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
                <i class="icon-table"></i> 职位设置 <a
                    class="btn btn-sm btn-primary pull-right weiBoxs-dialog"
                    href="addPosition" dialog-title="添加职位"><i
                    class="icon-plus"></i> 添加职位</a>
            </div>
            <div class="widget-content padded clearfix">
                <div class="dataTables_filter">
                    <form id="positionForm" class="form-inline"
                          action="emmPosition/getAllEmmPosition"
                          method="post">
                        <div class="btn-group">
                            <span>职位名：</span> <input type="text" class="form-control"
                                                     id="positionname" name="positionname" value="">
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
                                <th nowrap>等级</th>
                                <th nowrap>名称</th>
                                <th nowrap>创建时间</th>
                                <th nowrap>更新时间</th>
                                <th class="action-column">操作</th>
                            </tr>
                            </thead>
                            <tbody id="position_body">
                            <#list pageInfo.list as key>
                            <tr>
                                <td>${key.position_id}</td>
                                <td>${key.position_level}</td>
                                <td>${key.position_name}</td>
                                <td>${key.create_time?string('yyyy-MM-dd HH:mm:ss')}</td>
                                <td>${key.update_time?string('yyyy-MM-dd HH:mm:ss')}</td>
                                <td>
                                    <div class="col-lg-20">
                                        <button type="button" id="updatebtn" name="updatebtn"
                                                class="btn btn-warning btn-sm">修改
                                        </button>
                                        <button type="button" id="delbtn" name="delbtn"
                                                class="btn btn-danger btn-sm">删除
                                        </button>
                                        <button type="button" id="linkbtn" name="linkbtn"
                                                class="btn btn-success btn-sm" onclick="showselectmodel(1)">关联职位
                                        </button>
                                    </div>
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
                    <div id="checkedAllMenu" style="height:10px;display:none"></div>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- 这边是选择菜单的模态框  begin -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-hidden="true">&times;
                </button>
                <input type="hidden" id="referencepositionId"
                       name="referencepositionId">
                <h4 class="modal-title" id="myModalLabel">选择关联菜单</h4>
            </div>
            <div class="modal-body">
                <table id="example" class="table">
                    <thead>
                    <tr>
                        <th></th>
                        <th>名称</th>
                        <th>地址</th>
                        <th>上级菜单</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list relationMenus as key>
                    <tr>
                        <td><input type="checkbox" name="checkedemployee"
                                   id="checkedbox1" value=${key.menu_id} style="opacity: 1;"/>
                        </td>
                        <td>${key.menu_name}</td>
                        <td>${key.menu_url}</td>
                        <td>
                            <#if (key.parent_name)??>
                            ${key.parent_name}
                            </#if>
                        </td>
                    </tr>
                    </#list>
                    </tbody>
                </table>
            </div>
            <div class="modal-footer" style="text-align: center;">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary" id="sureToUpdate">确认
                </button>
            </div>
        </div>
    </div>
</div>
<!-- 这边是选择菜单的的模态框  end  -->


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

<#--查询职位-->
<script id="searchPosition_script" type="text/x-jquery-tmpl">
<#noparse>
                                <tr data-key="1">
                                <td class='1'>${position_id}</td>
                                <td class='2'>${position_level}</td>
                                <td class='3'>${position_name}</td>
                                <td class='4'>${create_time}</td>
                                <td class='5'>${update_time}</td>
                                <td>
                                    <div class="col-lg-20">
                                        <button type="button" id="updatebtn" name="updatebtn"
                                                class="btn btn-warning btn-sm">修改
                                        </button>
                                        <button type="button" id="delbtn" name="delbtn"
                                                class="btn btn-danger btn-sm">删除
                                        </button>
                                       <button type="button" id="linkbtn" name="linkbtn"
                                                class="btn btn-success btn-sm" onclick="showselectmodel(1)">关联职位
                                        </button>
                                    </div>
                                </td>
                            </tr>
</#noparse>
</script>


<script>
    $(function () {
        //点击查询
        $('#searchButton').click(function () {
            var positionname = $('#positionname').val().trim();
            $.ajax({
                type: 'post',
                url: '/systemSettings/position/searchPosition/' + positionname,
                cache: false,
                contentType: 'application/json;charset=UTF-8',
                dataType: "json",
                sync: true,
                success: function (result) {
                    if (result.code == 100) {
                        result.map.position.create_time = formatDateTime(result.map.position.create_time)
                        result.map.position.update_time = formatDateTime(result.map.position.update_time)
                        $('#position_body').empty();
                        $('.pagination').empty()
                        $("#searchPosition_script").tmpl(result.map.position).appendTo("#position_body");
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


<script>
    $(function () {
        //点击修改
        $('body').on('click', '#updatebtn', function () {
            var positionName = $(this).parents("tr").find("td:eq(2)").text().trim()
            location.href = "/systemSettings/position/updatePosition/" + positionName
        })
    })
</script>

<script type="text/javascript">
    $('body').on('click', '#delbtn', function () {
        if (confirm("确认删除？")) {
            var positionId = $(this).parents("tr").find("td:eq(0)").text().trim()
            console.log(positionId)
            $.ajax({
                type: 'post',
                url: '/systemSettings/position/deletePosition/' + positionId,
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

<script type="text/javascript">
    function showselectmodel(positionId) {
        $("#myModal").modal("show");
        $("#referencepositionId").val(positionId);
    }
</script>


<script>
    $(function () {
        //点击关联职位
        $('body').on('click', '#linkbtn', function () {
            var position_id = $(this).parents("tr").find("td:eq(0)").text().trim()
            $('#sureToUpdate').click(function () {
                var selectList = [];
                $("#example tbody tr input[type=checkbox]:checked").map(function () {
                    var id = $(this).val();
                    selectList.push(id)
                })
                var data={}
                data.position_id=position_id
                data.selectList=selectList
                console.log(JSON.stringify(data))
                $.ajax({
                    type: 'post',
                    url: '/systemSettings/position/updateMenuRelation',
                    cache: false,
                    data:JSON.stringify(data),
                    contentType: 'application/json;charset=UTF-8',
                    dataType: "json",
                    sync: true,
                    success: function (result) {
                       if (result.code == 100){
                           alert("添加成功！")
//                           $("#example").find("tbody tr input[type=checkbox]").prop("checked",false)
                           location.reload()
                       }
                    }, error: function () {
                        alert("请求失败")
                    }
                })
            })
        })
    })
</script>


<#--前端分页插件-->
<script type="text/javascript">
    $.extend($.fn.dataTable.defaults, {
        "searching": false,
        "ordering": false
    });
    $('#example').DataTable({
        language: {
            "sProcessing": "处理中...",
            "sLengthMenu": "显示 _MENU_ 项结果",
            "sZeroRecords": "没有匹配结果",
            "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
            "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
            "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
            "sInfoPostFix": "",
            "sSearch": "搜索:",
            "sUrl": "",
            "sEmptyTable": "表中数据为空",
            "sLoadingRecords": "载入中...",
            "sInfoThousands": ",",
            "oPaginate": {
                "sFirst": "首页",
                "sPrevious": "上页",
                "sNext": "下页",
                "sLast": "末页"
            }
        }
    });
</script>
</body>
</html>
