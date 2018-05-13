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
	<form:form method="post" commandName="user" action="hello">
		<fieldset>
			<form:label path="login">login</form:label>
			<form:input path="login" />

			<form:label path="password">password</form:label>
			<form:password path="password" />
		</fieldset>
		<input type="submit" value="login" />
	</form:form>
</body>
</html>
