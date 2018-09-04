<%@page import="employee.com.bean.Employee,java.util.*"%>
<%@ page language="java"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
  background: #76b852; /* fallback for old browsers */
  background: -webkit-linear-gradient(right, #76b852, #8DC26F);
  background: -moz-linear-gradient(right, #76b852, #8DC26F);
  background: -o-linear-gradient(right, #76b852, #8DC26F);
  background: linear-gradient(to left, #76b852, #8DC26F);
  font-family: "Roboto", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;      
}
table{
 background-color: #eee;
}
</style>
<body>
<center>
<h1>  Employee Details</h1>
<table cellspacing="10" cellpadding="10" border="3">

<%
List<Employee> list=(List<Employee>)request.getAttribute("emplist");
for(Employee employee : list){
	  out.println("<tr> <td> "+employee.getName() +"</td> <td> "+employee.getAge()+ 
			  "</td><td> "+employee.getDob() +"</td><td> "+employee.getAddress() +"</td><td> "+
			  employee.getSalary() +"</td> <td> "+employee.getDescription() +"</td> <td> "+
			  employee.getEmail() +"</td> <td> "+employee.getPhone() +"</td></tr>");
}
%>
</table>

</center>

</body>
</html>






