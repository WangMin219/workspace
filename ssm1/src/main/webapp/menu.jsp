<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="common.jsp" %>

<div class="navbar navbar-fixed-top scroll-hide">
    <div class="container-fluid top-bar">
        <div class="pull-right">
            <ul class="nav navbar-nav pull-right">
                <li class="dropdown notifications hidden-xs"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span
                        aria-hidden="true" class="se7en-flag"></span>

                    <div class="sr-only">Notifications</div>
                </a></li>
                <li class="dropdown messages hidden-xs"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span
                        aria-hidden="true" class="se7en-envelope"></span>

                    <div class="sr-only">Messages</div>
                </a></li>
                <li class="dropdown user hidden-xs"><a data-toggle="dropdown" class="dropdown-toggle" href="#"> <img
                        width="34" height="34" src="picture/2_avatar_middle.jpg">${sessionScope.currentUser.employeeName}<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="login/logout"><i class="icon-signout"></i>Logout</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <button class="navbar-toggle">
            <span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
        </button>
        <a class="logo" href="#">weiboxs</a>
    </div>
    <div class="container-fluid main-nav clearfix">
        <div class="nav-collapse" id="table1">
            <ul class="nav">
            	<!-- <li class="">
            	
                </li> -->
            </ul>
        </div>
    </div>
</div>
<!-- <html>
	<script type="text/javascript" src="js/menu.js"></script>
</html> -->