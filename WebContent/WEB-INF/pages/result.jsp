<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Sub List Sum Evaluation</title>
</head>

<body>
	<table border="0">
		<tr>
			<td colspan="2" align="center"><h2>Spring MVC Form for Sub
					List Sum Evaluation</h2></td>
		</tr>
		<tr>
			<td>List of numbers:</td>
			<td>${numberList}</td>
		</tr>
		<tr>
			<td>Sum:</td>
			<td>${sum}</td>
		</tr>
		<tr>
			<td><br/>Output:</td>
			<td>${subList}</td>
		</tr>
		
	</table>
</body>

</html>