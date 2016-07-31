<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShoppingCart</title>
</head>
<body>
	<a href="register">Register</a>
	<a href="loginHere">Login</a>
	<div>
		<c:if test="${isUserClickedRegisterHere==true}">
			<%@ include file="Register.jsp"%>

		</c:if>
	</div>
	<div>
		<div id="loginHere">
			<c:if test="${isUserClickedLogin==true || invalidCredentials==true}">
				<div id="error">${errorMessage}</div>
				<%@ include file="login.jsp"%>

			</c:if>
		</div>

		
	</div>


</body>
</html>