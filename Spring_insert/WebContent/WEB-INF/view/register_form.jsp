<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>

	<f:form action="insert.html" post="Post" modelAttribute="RegVO">
FIRST_NAME:<f:input path="firstname" />
		<br />
		<br />
LAST_NAME:<f:input path="lastname" />
		<br />
		<br />
		<f:hidden path="id" />
		<input type="submit" value="Submit">
	</f:form>

</body>
</html>