<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id=request.getParameter("p1");
if(id==null || id.isEmpty()){
	out.print("enter id");
}
else{	
try{
	int playerId=Integer.parseInt(id);	
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","shwe","123");
	PreparedStatement pst=con.prepareStatement
			("select * from player where pid=?");
	pst.setInt(1, playerId);
	ResultSet rs=pst.executeQuery();
	while(rs.next()){
		out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
	}
}catch(Exception e){
	e.printStackTrace();
	out.print("error");
}
}
%>
</body>
</html>