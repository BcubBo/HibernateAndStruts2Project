<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String path = request.getContextPath(); %>
    <%@taglib prefix="s" uri="/struts-tags" %>
    <%@taglib prefix="ss" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/add/add.action" method="post">
<table >
		<tr>
			<td>
			<strong>
				标题名称（*）<input type="text" name="enli.title">
			</strong>
			</td>
		</tr>
		<tr>
			<td>
			<strong>
				摘要（*）<input type="text" name="enli.summary">
			</strong>
			</td>
		</tr>
		<tr>
			<td>
			<strong>
				上传人<input type="text" name="enli.uploaduser">
			</strong>
			</td>
		</tr>

	</table>
	<input type="submit" value="提交"/>
	

</form>
<form action="${pageContext.request.contextPath }/query/list" method="post">
	<input type="submit" value="返回"/>

</form>
</body>
</html>