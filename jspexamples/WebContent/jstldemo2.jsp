<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="today" value="<%= new Date()%>"></c:set>
<%-- 
<c:out value="${date}"></c:out> --%>
<br/>
Formatting Dates:
<fm:formatDate value="${today}" type="time" timeStyle="full"/>
<br/>
<fm:formatDate value="${today}" type="date" dateStyle="short"/>
<br/>
<fm:formatDate value="${today}" type="both"/>

<br/>
<fm:formatDate value="${today}" type="both" dateStyle="short"/>
<br/>

<fm:formatDate value="${today}" type="both" pattern="dd-MMM-yyyy hh-mm-ss"/>
<br/>









</body>
</html>