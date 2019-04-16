<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>

<c:import url="books.xml" var="bookinfo"></c:import>

<x:parse xml="${bookinfo}" var="data"></x:parse>
Book details:
<x:out select="$data/books/book[1]/name"/>
<x:out select="$data/books/book[1]/author"/>
<x:out select="$data/books/book[2]/name"/>
<x:out select="$data/books/book[2]/author"/>
<br/>
<br/>

<x:forEach select="$data/books/book" var="data">
	<x:out select="$data/name"/>
	<x:out select="$data/author"/>
	<x:out select="$data/price"/>
</x:forEach>

</body>
</html>