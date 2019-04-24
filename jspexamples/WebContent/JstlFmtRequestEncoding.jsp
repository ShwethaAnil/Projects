<%@ page language="java" contentType="text/html;"
pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;">
<title>JSTL fmt:requestEncoding Tag</title>
</head>
<body>
<fmt:requestEncoding value="UTF-8"/>
<% String lang= request.getParameter("choose");
if(lang.equals("en_US"))
{
%>
<b>English Locale</b><br>
<%-- <fmt:setLocale value="en_US"/> --%>
<fmt:bundle basename="com.mphasis.training.bundles.Example">
<fmt:message key="Name"/><br/>
<fmt:message key="Address"/><br/>
<fmt:message key="Number"/><br/>
</fmt:bundle>
<%}
else
{
%>
<b>French Locale</b><br>
<fmt:setLocale value="fr_FR"/>
<fmt:bundle basename="com.mphasis.training.bundles.Example">
<fmt:message key="Name"/><br/>
<fmt:message key="Address"/><br/>
<fmt:message key="Number"/><br/>
</fmt:bundle>
<%} %>
</body>
</html>