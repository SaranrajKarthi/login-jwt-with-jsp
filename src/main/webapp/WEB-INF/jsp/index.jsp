<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    margin: 0;
    padding: 0;
  }

  .register-page {
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

  .register-header {
    text-align: center;
    margin-bottom: 20px;
  }

  .register-header h3 {
    font-size: 24px;
    color: #333;
  }

  .register-header p {
    font-size: 14px;
    color: #666;
  }

  .register-form {
    display: flex;
    flex-direction: column;
  }

  .register-form input[type="text"],
  .register-form input[type="email"],
  .register-form input[type="password"] {
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 14px;
  }

  .register-form button[type="submit"] {
    background-color: #4CAF50;
    color: #fff;
    padding: 10px;
    border: none;
    border-radius: 5px;
    font-size: 14px;
    cursor: pointer;
  }

  .register-form button[type="submit"]:hover {
    background-color: #45a049;
  }

  .message {
    text-align: center;
    font-size: 14px;
    color: #666;
  }

  .message a {
    color: #4CAF50;
    text-decoration: none;
  }

  .message a:hover {
    text-decoration: underline;
  }
</style>
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
      <form class="register-form" method="post" action="api/register">
        <input type="text" placeholder="User Name" name="userName" />
        <!--  <input type="email" placeholder="Email" name="email" required="required" />-->
        <input type="password" placeholder="Password" name="password" required="required" />
        <!-- <input type="password" placeholder="Repeat password" name="repeat_password" required="required" />-->
        <button type="submit">Register</button>
        <p class="message">
          Already have an account? <a href="login">Login</a>
        </p>
      </form>
    </div>
  </div>
</body>
</html>
