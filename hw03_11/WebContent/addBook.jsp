<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
	<form action="${pageContext.request.contextPath}/addBookAction" method="post">
  <table align="center" border="1">
  <tr>
    <td>书名:</td>
    <td><input type="text" name="bookName"> </td>
  <tr>
  <tr>
    <td>作者:</td>
    <td><input type="text" name="bookAuthor"></td>
  <tr>
  <tr>
    <td>价格:</td>
    <td><input type="text" name="bookPrice"></td>
  <tr>
  <tr>
     <td><input type="submit" value="添加"></td>
  </tr>
  </table>

</body>
</html>