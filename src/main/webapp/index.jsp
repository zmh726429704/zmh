<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="static/login/js/jquery-1.5.1.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>

<body>
asdasdasd
<script type="text/javascript">
	$(document).ready(function(){
		var a = '<%= basePath%>';
		//alert(a)
		//var abc = "SourceCode/src/main/webapp/daishilu/index.html";
		//window.location.href = a+'/src/main/webapp/daishilu/index.html';
	});
</script>
</body>
</html>