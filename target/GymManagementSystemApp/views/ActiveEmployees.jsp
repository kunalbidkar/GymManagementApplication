<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ><div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Admin</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>

<h1 align="center">Active Employees</h1>
<table cellspacing="20px" style="font-size: xx-large;" align="center" >
<tr bgcolor="lightgrey">
<td>Employee Id</td>
<td>First Name</td>
<td>Middle Name</td>
<td>Last Name</td>
</tr>
  <c:forEach items="${listActiveEmployee}" var="employee">
            
                  
   <tr>
    <td>${employee.empId}</td>
    <td>${employee.fname}</td>
	<td>${employee.mname}</td>
	<td>${employee.lname}</td>  
		<td><a href="UpdateEmployee?id=${employee.empId}">Edit</a></td> 
   </tr>

      </c:forEach>
      </table>

</body>
</html>