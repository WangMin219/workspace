<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.vo.Book,java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>结果书籍信息</title>
</head>
<body>
<table align="left" border="1"> 
  <tr>
    <td><a href="addBook.jsp">添加一本书籍信息</a></td>
  </tr>
  <tr>
    <td><a href="${pageContext.request.contextPath}/findBook.jsp">查询某本书籍信息</a></td>
  </tr>
</table>
 <table align="center" border="1">
         <caption>结果书籍信息</caption>
 <tr>
          <td>书名:</td>
          <td>作者:</td>
         <td>定价:</td>
  </tr>
    <tr>
      <td><s:property value="#session.Book.bookName"/></td>
      <td><s:property value="#session.Book.bookAuthor"/></td>
      <td><s:property value="#session.Book.bookPrice"/></td>
    </tr>    
</table>    
</body>
</html>