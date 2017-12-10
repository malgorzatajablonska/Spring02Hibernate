<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot</title>
</head>
<body>

<style>
.error{
	text-decoration:underline; 
	color: red; 
	font-size: 15px;
}
</style>

  <h1>Spring Boot - MVC web application example</h1>
  
  	<form:form method="post" action="validPublisher" modelAttribute="publisher">
  		Name:
		<form:input path="name" />
		<form:errors path="name" cssClass="error" /></br>
		
		NIP:
		<form:input path="nip" />
		<form:errors path="nip" cssClass="error" /></br>
		
		REGON:
		<form:input path="regon" />
		<form:errors path="regon" cssClass="error" /></br>
		
		<input type="submit" value="Save">
	</form:form>
  
</body>
</html>