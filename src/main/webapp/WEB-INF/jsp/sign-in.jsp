<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>sign-in</title>
</head>

<body>
	<h2>${message}</h2>
	<form class="sign_in" action="helloUser" method=POST>
		<div class="row">
			<div class=col-md-2>login</div>
			<div class=col-md-3>
				<input id="login" class="form-control input-md" name="login"
					value="user" />
			</div>
		</div>
		<div class="row">
			<div class=col-md-2>password</div>
			<div class=col-md-3>
				<input id="password" class="form-control input-md" name="password"
					value="123" />
			</div>
		</div>
		<button id="sign_in" value="sign_in" name="sign_in"
			class="btn btn-success">ok</button>
	</form>
</body>
</html>
