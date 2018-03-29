<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="com.vo.Book,java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
			<td><a href="findBook.jsp">查询某本书籍信息</a></td>
		</tr>
	</table>

	<table align="center" border="1">
		<caption>全部书籍信息</caption>
		<tr>
			<td>书名</td>
			<td>作者</td>
			<td>定价</td>
			<td>操作1</td>
			<td>操作2</td>
		</tr>
		<s:iterator value="books" var="b">
			<tr>
				<td><s:property value="#b.bookName" /></td>
				<td><s:property value="#b.bookAuthor" /></td>
				<td><s:property value="#b.bookPrice" /></td>
				<td><a
					href="updateBook.jsp?bookName=<s:property value="#b.bookName" />
                &bookAuthor=<s:property value="#b.bookAuthor" />
                &bookPrice=<s:property value="#b.bookPrice" />">修改</a></td>
				<td><a
					href="deleteBook.jsp?bookName=<s:property value="#b.bookName"/>">删除</a></td>
			</tr>
		</s:iterator>

	</table>


</body>
</html>