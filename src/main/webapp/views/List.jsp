<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="background-color: gray; font-size: x-large;"><h1 align="center"><b>Welcome Front Desk Executive</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<h3 align="center" style="font-size: xx-large;" >Customer List</h3>
  <table align="center" style="font-size: xx-large;" cellspacing="20px">
  <tr bgcolor="lightgrey">
<td>Employee Id</td>
<td>First Name</td>
<td>Middle Name</td>
<td>Address</td>
<td>Contact No</td>
<td>Trainer Assigned</td>
<td>Workout Type </td>
</tr>
  <c:forEach items="${listPersons}" var="customer">
		
			
   <tr>
    <td>${customer.cust_Id}</td>
   
 	<td>${customer.first_Name}</td>
  <td>${customer.last_Name}</td>
<td>${customer.address}</td>
<td>${customer.contact_No}</td>
<td>${customer.employee.fname}</td>
<td>${customer.wType.workoutName}</td>
<td>
<a href="Edit?id=${customer.cust_Id}">Edit</a></td>

   
   </tr>
<%-- 			<td><a href="<c:url value='/edit/${person.id}' />" >Edit</a></td> --%>
<%-- 			<td><a href="<c:url value='/remove/${person.id}' />" >Delete</a></td> --%>
<!-- 		</tr> -->
	</c:forEach>
	</table>

</body>
</html>