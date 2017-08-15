<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    <%String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.js"></script>
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

	
	
	

</style>
<script type="text/javascript">

	function addCheck(){


		if($("#add").attr("name")=="add" ){
				alert("进入块");
				alert($("option").attr("selected"));
				if($("option").attr("selected")=="selected"){
					alert($("option").val());	
					$("#hidden").val($("option").val());
					alert($("#hidden").val());
					return true;
				};
				
				//冗余
			}else{

				return false;
					

				}





	}


</script>
</head>
<body style="background-color:buttonface">

<s:form action="/query/query.action">

		<s:select label="查询的类别IT类型" 
			name="id"
			list="CategorysList"
			listKey="id"
			listValue="name"
		></s:select>
	<s:submit value="查询"></s:submit>
	

	
</s:form>
<s:form action="/query/listAll">
	<input type="submit" name="add"  id="add" value="添加信息" onclick="return addCheck()"/>
	<input type="hidden" name="id" id="hidden" value=""/>	
</s:form>

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
				<s:property value="#it.title"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="#it.summary"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="#it.uploaduser"/>
			</strong>	
			</td>
			<td>
			<strong>
				<s:date name="#it.createdate" format="yyyy-MM-dd"/>
			</strong>	
			</td>					
		</tr>
		</s:iterator>
	
	</table>





</body>
</html>