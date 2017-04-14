<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body><div style="background-color: gray; font-size: xx-large;">
<h1 align="center"><b>Welcome Trainer</b> <form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
  <table align="center" cellspacing="20px" style="font-size: xx-large;">
  <tr bgcolor="lightgrey">
  <td>Workout Plan Id</td>
  <td>Schedule</td>
  <td>Training Plan</td>
 
  </tr>
  <c:forEach items="${list}" var="customer">
		
			
   <tr>
   <td>${customer.workoutplanId}</td>
    <td>${customer.schedule}</td>
   
 	<td>${customer.trainingPlan}</td>
<%--   <td>${customer.last_Name}</td> --%>
<%-- <td>${customer.address}</td> --%>
<%-- <td>${customer.contact_No}</td> --%>
<%-- <td>${customer.employee.fname}</td> --%>
<%-- <td>${customer.wType.workoutName}</td> --%>
<!-- <td> -->
	</c:forEach>
	</table>
</body>
</html>