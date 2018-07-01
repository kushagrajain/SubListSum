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
    <form:form method="post" action="evaluateSubList" modelAttribute="subListForm">
    	 <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Spring MVC Form for Sub List Sum Evaluation</h2></td>
                </tr>
                <tr>
                    <td>Please input the list of numbers: </td>
                    <td><form:input path="numberList" /></td>
                </tr>
                <tr>
                    <td>Please input the sum: </td>
                    <td><form:input path="sum" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Submit" /></td>
                </tr>
            </table>
    </form:form>
</body>

</html>