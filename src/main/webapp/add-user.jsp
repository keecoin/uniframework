<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="/meta.jsp" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form action="add.action" method="post">
	<input type="text" name="user.userName" title="用户名">
	<input type="password" name="user.password" title="密码">
	<input type="submit" value="add">
</form>
</body>
</html>