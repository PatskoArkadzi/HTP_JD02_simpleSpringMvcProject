<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Output data</title>
</head>

<body>
	<h1>${role!=null?'Hello '.concat(role.roleName):'Пользователя с таким логином не
		существует'}</h1>
</body>
</html>
