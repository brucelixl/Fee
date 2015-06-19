<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>收费信息</title>
  </head>
  
  <body>
    <div align="center">
       <table  border="0" width="60%"  border="0" >
		<tr bgcolor="#6495ED">
		    <th align="center">收费编号</th>
			<th align="center">楼号</th>	
			<th align="center">房号</th>
			<th align="center">业主名</th>
			<th align="center">类型</th>			
			<th align="center">上月资料</th>
			<th align="center">本月资料</th>
			<th align="center">单价</th>
			<th align="center">金额</th>
			<th align="center">操作</th>
		</tr>
		<s:iterator value="fees" status="st" var="fee">
		<%
		      int i=1;
			  String bg=null;
			  if(i%2==0)
				  bg="#FFFFFF";
			  else
				  bg="#CCFFF";
		%>
		<tr align="center" bgcolor="<%=bg %>">
		    <td><s:property value="#fee.payId"/></td>
			<td><s:property value="#fee.Bid"/></td>
			<td><s:property value="#fee.Roomid" /></td>
			<td><s:property value="#fee.ownerName"/></td>
			<td><s:property value="#fee.payType"/></td>
			<td><s:property value="#fee.lastMonthInfo"/></td>
			<td><s:property value="#fee.thisMonthInfo"/>
			<td><s:property value="#fee.unitPrice" /></td>
			<td><s:property value="#fee.monthPay"/></td>
			<td>
			<a href="postAct!delPost.action?message.postId=<s:property value="#message.postId"/>" onclick="del()">修改</a>
			<a href="postAct!delPost.action?message.postId=<s:property value="#message.postId"/>" onclick="del()">删除</a>
			     
		</tr>
		<%
			i++;
		%>
		</s:iterator>
		</table>
  </body>
</html>
