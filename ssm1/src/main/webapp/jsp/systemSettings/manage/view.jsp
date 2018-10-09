<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <jsp:include page="/common.jsp"></jsp:include>
</head>

<body class="navbar-top">
<div class="modal-shiftfix">
<jsp:include page="/common.jsp"></jsp:include>
    <jsp:include page="/menu.jsp"></jsp:include>
    <div class="container-fluid main-content">
        <div class="widget-container fluid-height clearfix mwi1200">
            <div class="heading clearfix">
                <i class="icon-reorder"></i> 查看联系人
                <i class="icon-reply pull-right" onclick="history.go(-1);"></i>
            </div>
            <div class="widget-content padded clearfix">
                <table class="table detail-view" id = "Emp">
                    
                </table>
                <div style="margin:0 auto; text-align:center;">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/Jurisdiction.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/Emp_View.js"></script>
</html>
