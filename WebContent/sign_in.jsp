<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
lable {
    background-color: white;
}


</style>
<body background="images/bg_image.jpg">
<center><h1><lable>Employee Data Input</lable></h1></center>
	<center>
		<form action="EmployeeDetails" method="post">
			<table cellspacing="20">
				<tr>
					<td bgcolor="white" width="40%"><h4>Name :</h1></td><br>
					<td><input type="text" style="height:60px;width:200px;" name="name"></td>
				</tr>
				<tr>
					<td bgcolor="white"  height="1"><h4>Age :</h4></td><br>
					<td><input type="text" style="height:60px;width:200px;" name="age"></td>
				</tr>
				<tr>
					<td  bgcolor="white"  height="1"><h4>Date of Birth :</h4></td><br>
					<td><input type="text" style="height:60px;width:200px;" name="dob"></td>
				</tr>
				<tr>
					<td  bgcolor="white"  height="1"><h4>Address :</h4></td><br>
					<td><input type="text" style="height:60px;width:200px;" name="address"></td>
				</tr>
				<tr>
					<td  bgcolor="white"  height="1"><h4>Salary :</h4></td><br>
					<td><input type="text" style="height:60px;width:200px;" name="salary"></td>
				</tr>
				<tr>
					<td  bgcolor="white"  height="1"><h4>Description :</h4></td><br>
					<td><input type="text" style="height:60px;width:200px;" name="description"></td>
				</tr>
				<tr>
					<td bgcolor="white"  height="1"><h4>Email Id :</h4></td><br>
					<td><input type="text" style="height:60px;width:200px;" name="email"></td>
				</tr>
				<tr>
					<td  bgcolor="white"  height="1"><h4>Phone :</h4></td><br>
					<td><input type="text" style="height:60px;width:200px;" name="phone"></td>
				</tr>
				</table>
					<input type="submit" style="height:60px;width:150px;" value="submit"></td>
					
			
			
		</form>
	</center>
</body>

</html>