<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>添加收费表单</title>
 
   <script type="text/javascript">
   		     function js(lastInfo,thisInfo,price){    	
			   var lastInfo = document.getElementById('lastInfo').value;
			   var thisInfo = document.getElementById('thisInfo').value;
			    var price = document.getElementById('price').value;
			   document.getElementById('allPay').value = price*(thisInfo-lastInfo);
   		     } 
    </script>
    </head>
  <% 
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyyMMddHHmmss"); 
		java.util.Date currentTime = new java.util.Date();//得到当前系统时间 
		String id = formatter.format(currentTime); //将日期时间格式化 
   %>
  <div align="center">
  <s:form action="fee!addFee.action"  method = "post">
     <s:textfield name="fee.payId" cssStyle="width:150px" label="收费编号" value="<%=id %>"/>
     <s:textfield name="fee.Bid" cssStyle="width:150px" label="楼号" "/>
   	 <s:textfield name="fee.Roomid" cssStyle="width:150px" label="房号""/>
   	 <s:textfield name="fee.ownerName" cssStyle="width:150px" label="姓名""/>
     <s:select list="{'电费','水费','物业费','卫生费','停车费'}" name= "fee.payType" label="费用类型"/>	
   		 <s:textfield name="fee.lastMonthInfo" cssStyle="width:150px" label="上月资料" id= "lastInfo" 
   		      onkeyup="js('lastInfo','thisInfo','price')"/>
   		 <s:textfield name="fee.thisMonthInfo" cssStyle="width:150px" label="本月资料" id = "thisInfo" 
   		       onkeyup="js('lastInfo','thisInfo','price')"/>
   		 <s:textfield name="fee.unitPrice" cssStyle="width:150px" label="单价" id = "price" 
   		       onkeyup="js('lastInfo','thisInfo','price')"/>
   		 <s:textfield name="fee.monthPay" cssStyle="width:150px" label="金额"
   		       onkeyup="js('lastInfo','thisInfo','price')"/>
         <tr><td><input type="submit" value="确定">
                 <input type="reset" value="重置"></td></tr>
   </s:form>
   </div>
  </body>
</html>
