<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示页面</title>
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
	
	body{
	
		background-image:url('/struts2Obj_1/image/21.gif');
		background-repeat: repeat;
		
		
}
	
	
	

</style>
</head>
<body style="background-color:buttonface">

	<s:select label="查询的类别IT类型" 
		name="categorys.id"
		list="CategorysList"
		listKey="id"
		listValue="name"
	></s:select>
<input type="button" name="add" value="添加"/>
	<table >
	
		<tr>
		
			<td><strong >文档编号</strong></td>
			<td><strong >文档名称</strong></td>
			<td><strong >文档摘要</strong></td>
			<td><strong >上传人</strong></td>
			<td><strong >上传时间</strong></td>

		</tr>
		<s:iterator var="it"	value="infosList" status="st">
		
		<tr
			<s:if test="(#st.index)%2!=0">
				bgcolor="greenyellow"
			</s:if>
			<s:if test="(#st.index)%2==0">
				bgcolor="buttonface"
			</s:if>
		
		
		>
			<td>
			<strong>
				<s:property value="#it.id"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="#it.name"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="#it.summary"/>
			</strong>
			</td>
			<td>
			<td>
			<strong>
				<s:property value="#it.uploaduser"/>
			</strong>			
		</tr>
		</s:iterator>
	
	</table>





</body>
</html>