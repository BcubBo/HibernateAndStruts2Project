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
<style type="text/css">

	td{
		
		 border: 1px green solid;
		 text-align: center;
	
	}

	
	strong{
	
		color:yellowgreen;
		font-size:20px;
		
	
	}
	
	table{
		
		align:center; 
		border:3px black solid;
		width:auto;
		height:auto;
	
	
	
	}

	
	
	

</style>
</head>
<body>
<s:form action="%{path}/query/add.action">
<table >
		<tr>
			<td>
			<strong>
				<input type="text" name="enli.title">
			</strong>
			</td>
		</tr>
		<tr>
			<td>
			<strong>
				<input type="text" name="enli.summary">
			</strong>
			</td>
		</tr>
		<tr>
			<td>
			<strong>
				<input type="text" name="enli.uploaduser">
			</strong>
			</td>
		</tr>
		<tr>
			<td>
			<strong>
				<ss:datetimepicker id="datePicker" cssClass="text" name="enli.createdate" ></ss:datetimepicker>
			</strong>	
			</td>					
		</tr>


	</table>
	<s:submit value="提交"></s:submit><s:url action="%{path}/query/list" value="返回"></s:url>

</s:form>
</body>
</html>