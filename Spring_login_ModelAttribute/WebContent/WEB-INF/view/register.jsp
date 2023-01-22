<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="s.html" method="get" modelAttribute="RegVO">
first name:<f:input path="fn"/>
last name:<f:input path="ln"/>
user name:<f:input path="un"/>
password:<f:input path="pw"/>
<input type="submit" value="submit"/>
</f:form>
</body>
</html>