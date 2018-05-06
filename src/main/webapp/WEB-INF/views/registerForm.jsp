<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<h1>注册</h1>
<form method="POST">
 姓：<input type="text" name="firstName"/><br/>
 名：<input type="text" name="lastName"/><br/>
Email：<input type="email" name="email"/><br/>
用户名：<input type="text" name="userName"/><br/>
密码：<input type="password" name="password"/><br/>
<input type="submit" value="注册"/>
</form>
</body>
</html>