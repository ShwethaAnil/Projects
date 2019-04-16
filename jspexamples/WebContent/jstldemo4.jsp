<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>

<s:setDataSource driver="oracle.jdbc.OracleDriver" 
url="jdbc:oracle:thin:@localhost:1521:xe"
user="shwe" password="123" var="ds"/>
<s:transaction dataSource="${ds}">
<s:update>
insert into product values(182,'chargermi',34,87)
</s:update>
<s:update>
insert into product values(183,'chargermi',34,87)
</s:update>
</s:transaction>

<s:query var="rs" dataSource="${ds}">
select * from product
</s:query>
<table>
<tr>
	<th>PId</th>
	<th>pname</th>
	<th>cost</th>
	<th>quantity</th>
</tr>
<c:forEach var="t" items="${rs.rows}">
<tr>
	<td><c:out value="${t.pid}"></c:out></td>
	<td><c:out value="${t.pname}"></c:out></td>
	<td><c:out value="${t.cost}"></c:out></td>
	<td><c:out value="${t.quantity}"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>