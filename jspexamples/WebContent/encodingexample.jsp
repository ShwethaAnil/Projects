<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL fmt:requestEncoding Tag</title>
</head>
<body>
<fmt:requestEncoding value="UTF-8" />
<fmt:setBundle basename="myapp" var="lang"/>
<fmt:setLocale value="en"/>
<fmt:message key="Name" bundle="${lang}"/><br/>
<fmt:message key="Address" bundle="${lang}"/><br/>
<fmt:message key="Number" bundle="${lang}"/><br/>
</body>
</html>