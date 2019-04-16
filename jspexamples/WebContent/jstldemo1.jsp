<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- int var1=900;
if(){

}
 --%>
<c:set var="balance" 
value='<%=request.getParameter("balance")%>'></c:set>
balance is<c:out value="${balance}"></c:out>

<c:if test="${balance<10000}">
	<h1>balance is low</h1>
</c:if>
<c:choose>
	<c:when test="${balance<10000}">
		balance is low
	</c:when>
	<c:when test="${balance>10000}">
		balacne is good
	</c:when>
	<c:otherwise>Balanace is 10000</c:otherwise>
</c:choose>


<c:catch var="catching">
	<% int a[]={10,45};
		out.print(a[9]);%>
</c:catch>

<c:if test="${catching!=null}">
Exception code ${catching}
</c:if>
<br/>
<c:set var="income" value="35000" scope="session"/>
Income is <c:out value="${income}"></c:out>
<br/>
<c:remove var="income"/>
Income is after removal<c:out value="${income}"></c:out>
<br/>
<%-- <c:redirect url="bank.html"></c:redirect> --%>

<c:import url="http://www.google.com" var="data"></c:import>
<c:out value="${data}"></c:out>

<c:forEach var="item" begin="0" end="45" step="6">
	Items are <c:out value="${item}"></c:out><br/>
</c:forEach>

<c:forTokens items="ashwini-pooja-pallavi Hema,Rahul" 
delims="- ," var="names">
	<c:out value="${names}"/><br/>
</c:forTokens>







</body>
</html>