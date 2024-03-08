<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DataEntry" method="post">
	Name: <input type="text" name="name1"/> <br/> <br/>
	Email: <input type="text" name="email1"/><br/> <br/>
	Password: <input type="password" name="pass1"/> <br> <br/>
	Gender: <input type="radio" name="gender1" value="male" />Male <input type="radio" name="gender1" value="Female" />Female<br> <br/>
	CIty: <select name="city1">
			<option> slect city </option>
			<option> Pune </option>
			<option> Mumabai </option>
			<option> Delhi </option>
			<option> Banglour </option>
			<option> CHennai </option>
		  </select> <br> <br/>
	Register: <input type="submit" value="Click Here"/>	  
	</form>
</body>
</html>