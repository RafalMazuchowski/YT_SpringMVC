<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<title>Register user</title>
</head>
<body>
	<div style="margin: auto; width: 500px; padding-top: 50px">
		<from:form method="post" modelAttribute="user">

			<div class="from-group">
				<label>User Name</label>
				<from:input path="userName" placeholder="User Name" type="text"
					class="form-control" />
				<from:errors path="userName" style="color:red"
					class="form-text text-muted" /><br/> 
			</div>


			<div class="from-group">
				<label>Password</label>
				<from:input path="password" placeholder="Password" type="password" class="form-control" />
				<from:errors path="password" style="color:red" class="form-text text-muted" />
				<br/> 
				<label>Confirm Password</label>
				<from:input path="confirmPassword" placeholder="Confirm Password" type="password" class="form-control" />
				<from:errors path="confirmPassword" style="color:red" class="form-text text-muted" />
				<br/> 
			</div>


			<div class="from-group">
				<label>Email</label>
				<from:input path="email" placeholder="email" type="text"
					class="form-control" />
				<from:errors path="email" style="color:red"
					class="form-text text-muted" /><br/> 
			</div>
			<from:button type="submit" class="btn btn-success">Register</from:button>
		</from:form>
		</div>
</body>
</html>