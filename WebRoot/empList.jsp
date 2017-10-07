<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" href="themes/default/easyui.css" type="text/css"></link>
<link rel="stylesheet" href="themes/icon.css" type="text/css"></link>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/easyui-lang-zh_TW.js"></script>
</head>

<body>
	<table id="dg"></table>
	<!-- 使用easyui显示服务器回传给视图的jason文本 的模板代码 -->
	<script type="text/javascript">
	   $("#dg").datagrid({
		url:"${pageContext.request.contextPath}/find/findAll.action?time=" + new Date().getTime(),
		columns : [[
		       {field:'id',title:'编号',width:100},
		       {field:'ename',title:'姓名',width:100},
		       {field:'job',title:'职位',width:100},
		       {field:'mgr',title:'上级编号',width:100},
		       
		       {field:'hiredate',title:'入职时间',width:100,
		    	   formatter:function(hiredate){//hiredate
		    		   //alert(hiredate);
		    		   var date =new Date(hiredate);
		    		   var year = date.getFullYear();
                       var month = date.getMonth() + 1;
		    		   var day = date.getDate();
		    		   return year + "年" + month + "月" + day + "日"; 
		    	   }		       
		       },
		       
		       {field:'sal',title:'薪水',width:100},
		       
		       {field:'comm',title:'佣金',width:100,
		    	   formatter:function(comm){
		    	   if(comm == null)
		    		   return 0;
		    	   return comm;	    	   
		       }    
		       },
		       
		       
		       {field:'depno',title:'部门编号',width:100},
		       ]],
		       singleSelect :true,
		       pagination : true
	   });
	
	</script>
</body>
</html>
