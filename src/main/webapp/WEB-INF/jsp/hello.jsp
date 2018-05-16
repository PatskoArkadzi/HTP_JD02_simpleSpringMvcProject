<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Output data</title>
</head>

<body>
	<c:choose>
		<c:when test="${role!=null}">
			<p>Hello ${role.roleName} '${user.login}'</p>
			<p>your password is '${user.password}'</p>
		</c:when>
		<c:otherwise>
			<p>This user isn't exist</p>
		</c:otherwise>
	</c:choose>
</body>
</html>
