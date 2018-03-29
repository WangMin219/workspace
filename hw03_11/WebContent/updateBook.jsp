<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.vo.Book,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>修改书籍信息</title>
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
<%
  String bookName=request.getParameter("bookName");
  bookName=new String(bookName.getBytes("ISO-8859-1"),"utf-8");
  String bookAuthor=request.getParameter("bookAuthor");
  bookAuthor=new String(bookAuthor.getBytes("ISO-8859-1"),"utf-8");
  String bookPrice=request.getParameter("bookPrice");
  bookPrice=new String(bookPrice.getBytes("ISO-8859-1"),"utf-8");
%>
<form action="${pageContext.request.contextPath}/updateBookAction" method="post">
<table align="center" border="1">
  <caption>修改书籍信息</caption>
  <tr>
    <td>书名:</td>
    <td><input type="text" name="bookName" value="<%=bookName%>"> </td>
  <tr>
  <tr>
    <td>作者:</td>
    <td><input type="text" name="bookAuthor" value="<%=bookAuthor%>"></td>
  <tr>
  <tr>
    <td>价格:</td>
    <td><input type="text" name="bookPrice" value="<%=bookPrice%>"></td>
  <tr>
  <tr>
     <td><input type="submit" value="修改书籍信息"></td>
  </tr>

  </table>
</form>
</body>
</html>