<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="register-page">
		<div class="form">
			<div class="register">
				<div class="register-header">
					<h3>REGISTER</h3>
					<p>Please enter your details to Register.</p>
				</div>
			</div>
			<form class="register-form"  method="post" action="api/register">
				<input type="text" placeholder="User Name" name="userName" /> 
				<input type="email" placeholder="Email" name="email" required="required" /> 
					<input type="password" placeholder="Password" name="password" required="required" /> 
					<input type="password" placeholder="Repeat password" name="repeat_password" required="required" />
				<button type="submit">Register</button>
				<!-- <input type="submit" value="Register">-->
				<p class="message">
					Already have an account? <a href="login">Login</a>
				</p>
			</form>
		</div>
	</div>
</body>
</html>