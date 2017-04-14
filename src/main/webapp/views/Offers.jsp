<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Offers</title>
</head>
<body>


<div><jsp:directive.include file="header.jsp"/></div>
<div style="background-color: gray; font-size: x-large;"><h1 align="center"><b>Welcome To Kinetic Gym</b></h1></div>
  <table align="center" style="font-size: xx-large;" cellspacing="20px">
  <tr bgcolor="lightgrey">
<td>Workout Type</td>
<td>Payment Interval</td>
<td>Price</td>
</tr>
  <c:forEach items="${listSchemes}" var="scheme">
		
			
   <tr>
   <td>${scheme.workoutType.workoutName}</td>
  <td>${scheme.duration.durationPlan}</td>
<td>${scheme.price}</td>
</tr>
<%-- 			<td><a href="<c:url value='/edit/${person.id}' />" >Edit</a></td> --%>
<%-- 			<td><a href="<c:url value='/remove/${person.id}' />" >Delete</a></td> --%>
<!-- 		</tr> -->
	</c:forEach>
	</table>
</body>
</html>