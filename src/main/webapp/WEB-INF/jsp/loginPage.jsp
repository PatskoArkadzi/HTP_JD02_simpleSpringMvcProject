<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>login page</title>
</head>

<body>
	<form:form method="post" action="/checkUser">
		<fieldset>
			<form:label path="name">username</form:label>
			<form:input path="name" />

			<form:label path="pass">userpass</form:label>
			<form:password path="pass" />
		</fieldset>
		<input type="submit" value="login" />
	</form:form>
</body>
</html>
