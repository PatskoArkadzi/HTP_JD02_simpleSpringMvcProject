<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>login page</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js">
	
</script>
</head>

<body>
	<script type="text/javascript">
		function doAjax() {
			$.ajax({
				url: 'checkPass',
				data: ({
					password: $('#password').val()
				}),
				success: function(data) {
					$('#resultValue').html(data);
				}
			})		
		}
		function doAjax2() {
			$.ajax({
				url: 'checkLog',
				data: ({
					login: $('#login').val()
				}),
				success: function(data) {
					$('#resultValue').html(data);
				}
			})	
		}
	</script>
	<div id="resultValue"></div>
	<form:form method="post" action="register">
		<fieldset>
			<form:label path="login">login</form:label>
			<form:input path="login" onkeyup="doAjax2()"/>

			<form:label path="password" >password</form:label>
			<form:password path="password" onkeyup="doAjax()"/>
		</fieldset>
		<input type="submit" value="register" />
	</form:form>
</body>
</html>
