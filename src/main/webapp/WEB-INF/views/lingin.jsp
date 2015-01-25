<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<style>
body {
	margin: 0px;
	padding: 0px;
	font-size: 12px;
	background-color: A29E98;
	overflow: hidden;
	text-align: center;
}

h1 {
	margin-top: 100px;
	text-align: center;
}
</style>
<title>Login page</title>
</head>
<body>
	<h1>Login</h1>

	<h1></h1>
	<form action="/login" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="username" name="username" /></td>
			</tr>
			<br />
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<br />
			<tr>
				<td>**All fields are Mandatory.</td>
				<td><div>
						<a href="">Biller? Register Here</a>
					</div></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
			<br />
		</table>
	</form>

</body>
</html>