<!DOCTYPE html>
<html lang="en">
<head>
</head>

<body class="navbar-top">
<div class="modal-shiftfix">
    <!-- 菜单 -->
<#include "../common.ftl">
<#include "../menu.ftl">
    <div class="container-fluid main-content">
        <div class="row">
            <div class="col-lg-12">
                <div class="widget-container stats-container">
                    <div class="col-md-3">
                        <div class="number">
                            <div class="icon visitors"></div>
                            <span id="customerCount"></span>
                            <small>个</small>
                        </div>
                        <div class="text">近七日新增客户</div>
                    </div>
                    <div class="col-md-3">
                        <div class="number">
                            <div class="icon globe"></div>
                            <span id="businessCount"></span>
                            <small>个</small>
                        </div>
                        <div class="text">近七日新增商机</div>
                    </div>
                    <div class="col-md-3">
                        <div class="number">
                            <div class="icon money"></div>
                            <span id="salesCount"></span>
                            <small>单</small>
                        </div>
                        <div class="text">近七日新增销售单</div>
                    </div>
                    <div class="col-md-3">
                        <div class="number">
                            <div class="icon chat-bubbles"></div>
                            <span id="customerTotal"></span>

                        </div>
                        <div class="text">月度新增客户</div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-8">
                <div class="widget-container fluid-height">
                    <div class="heading">
                        <i class="icon-bar-chart"></i>本月客户,商机
                        <table class="table table-hover">
                            <thead>
                            <tr>
                                <th nowrap>来源</th>
                                <th nowrap>名称</th>
                                <th nowrap>负责人</th>
                                <th nowrap>商机来源</th>
                                <th nowrap>更新时间</th>
                            </tr>
                            </thead>
                            <tbody id="bsTobdy">

                            </tbody>
                        </table>
                    </div>
                    <div class="widget-content" id="main" style="height: 280px;"></div>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="widget-container fluid-height clearfix">
                    <div class="heading">
                        <i class="icon-table"></i>我最近的任务
                    </div>
                    <div class="widget-content padded clearfix">
                        <table class="table" style="color: #007aff;">
                            <thead>
                            <th>名称</th>
                            <th>状态</th>
                            <th>待完成时间</th>
                            </thead>
                            <tbody>
                            <tr>
                                <td>双方各</td>
                                <td>未启动</td>
                                <td>推迟</td>
                                <td>进行中</td>
                                <td>完成</td>
                                <td>2012-12-18 11:26:38</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
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
        $.ajax({
            type: 'post',
            url: '/indexInfo',
            cache: false,
            contentType: 'application/json;charset=UTF-8',
            dataType: "json",
            sync: true,
            success: function (result) {
                $('#customerCount').text(result.map.resultData[0])
                $('#businessCount').text(result.map.resultData[1])
                $('#salesCount').text(result.map.resultData[2])
                $('#customerTotal').text(result.map.resultData[3])
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
        $.ajax({
            type: 'post',
            url: '/getBusAndPro',
            cache: false,
            contentType: 'application/json;charset=UTF-8',
            dataType: "json",
            sync: true,
            success: function (result) {
                if (result.code == 100) {
                    $.each(result.map.resultData, function (i, data) {
                        data.update_time = formatDateTime(data.update_time)
                        $('#bsTobdy').empty();
                        $('#bsTobdy').append('<tr data-key="8"><td>' + data.type_name + '</td><td>' + data.business_name + '</td><td>' + data.name + '</td><td>' + data.source_name + '</td><td>' + data.update_time + '</td></tr>')
                    })
                }
            }
            ,
            error: function () {
                alert("请求失败!");
            }
        })
    });
</script>
</html>
