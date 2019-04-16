<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:set var="str1" value="This is my String"></c:set>
<c:set var="str2" value="This <b>is my</b> String"></c:set>
${str1}
<br/>
${str2}
<br/>
with escape xml funation: <br/>
${fn:escapeXml(str1)}
<br/>
${fn:escapeXml(str2)}
<br/>

${fn:length(str1)}
<br/>
<c:if test="${fn:endsWith(str1,'ng')}">
	String endswith ng
</c:if>
<c:set var="author" value="Ganesh Gyan"/>   
${fn:replace(author, "Ganesh", "Mukesh")}   
<c:if test="${fn:contains(str1,'my')}">
	String contains my
</c:if>
<c:set var="str1" value="Welcome-to-JSP-Programming."/>  
<c:set var="str2" value="${fn:split(str1, '-')}" />  
<c:set var="str3" value="${fn:join(str2, ' ')}" />  
  
<p>String-3 : ${str3}</p>
  
${fn:toLowerCase(str1)}  
${fn:toUpperCase(str1)} 

</body>
</html>