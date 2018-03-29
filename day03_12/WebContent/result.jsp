<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:set name="score" value="#session.sore"/>
<s:if test="%{#score > 90}"> 
  优秀
</s:if>
<s:elseif test="%{#score<60}">
    不及格
</s:elseif>

<s:else>
 中等
</s:else>
</body>
</html>
