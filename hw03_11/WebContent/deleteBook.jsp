<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除书籍信息</title>
</head>
<body>
    <%
       String bookName=request.getParameter("bookName"); 
       bookName=new String(bookName.getBytes("ISO-8859-1"),"utf-8");
    %>
    <form action="deleteBookAction"  method="post">
        <input type="text" name="bookName" value="<%=bookName%>"/>
        <input type="submit" value="删除"/>
    </form>
</body>
</html>