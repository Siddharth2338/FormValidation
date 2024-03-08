<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.error{
	color: red
}
</style>
</head>
<body>
	<h3>User Registration Form</h3>
		<form:form action="register" modelAttribute="user" method="POST">
		<table>
			<tr>
				<td>UserName</td>
				<td><form:input path="userName"/>
<%-- 				<form:errors path="userName" cssClass="error"/>
 --%>				</td>
			</tr>
			<tr>
				<td>UserPassword</td>
				<td><form:input path="pwd"/>
<%-- 				<form:errors path="pwd" cssClass="error"/>
 --%>				</td>
			</tr>
			<tr>
				<td>UserEmail</td>
				<td><form:input path="email"/>
<%-- 				<form:errors path="email" cssClass="error"/>
 --%>				</td>
			</tr>
			<tr>
				<td>UserPhno</td>
				<td><form:input path="phno"/>
<%-- 				<form:errors path="phno" cssClass="error"/>
 --%>				</td>
			</tr>
			<tr>
				<td>UserAge</td>
				<td><form:input path="age"/>
				<%-- <form:errors path="age" cssClass="error"/> --%>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
		</form:form>
</body>
</html>