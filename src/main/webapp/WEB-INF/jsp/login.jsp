<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="css/login.css">
<style type="text/css">
/* login.css */
body {
  font-family: Arial, sans-serif;
  background-color: #f0f0f0;
  margin: 0;
  padding: 0;
}

.login-page {
  display: flex;
  align-items: center;
  justify-content: center;
  height: 100vh;
}

.form {
  background-color: #fff;
  padding: 20px;
  border-radius: 5px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  width: 300px;
}

.login-header {
  text-align: center;
  margin-bottom: 20px;
}

.login-header h3 {
  font-size: 24px;
  color: #333;
}

.login-header p {
  font-size: 14px;
  color: #666;
}

.login-form {
  display: flex;
  flex-direction: column;
}

.login-form input[type="text"],
.login-form input[type="password"] {
  padding: 10px;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  font-size: 14px;
}

.login-form button {
  background-color: #4CAF50;
  color: #fff;
  padding: 10px;
  border: none;
  border-radius: 5px;
  font-size: 14px;
  cursor: pointer;
}

.login-form button:hover {
  background-color: #45a049;
}

.login-form .message {
  text-align: center;
  font-size: 14px;
  color: #666;
}

.login-form .message a {
  color: #4CAF50;
  text-decoration: none;
}

.login-form .message a:hover {
  text-decoration: underline;
}

.login-form span {
  display: block;
  color: red;
  margin-bottom: 10px;
}
</style>
</head>
<body>
	<div class="login-page">
		<div class="form">
			<div class="login">
				<div class="login-header">
					<h3>LOGIN</h3>
					<p>Please enter your credentials to login.</p>
				</div>
			</div>
		<!-- 	<%
			if (request.getAttribute("successMessage") != null) {
			%>
			<div class="success-message">
				<%=request.getAttribute("successMessage")%>
			</div>
			<%
			}
			%>-->
			<div>
				<form class="login-form" action="userlogin" method="post">
					<input type="text" placeholder="User Name" name="userName"
						required="required" /> <input type="password"
						placeholder="Password" name="password" required="required" /> <span
						style="color: red">${errorMessage}</span>
					<button>login</button>
					<p class="message">

						Not registered? <a href="register">Create an account</a>
					</p>
				</form>
			</div>
		</div>
</body>
</html>