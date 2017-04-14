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
<body><div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Trainer</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<h1 align="center">Customer Health Statistics</h1>
  <table align="center" style="font-size: xx-large;" cellspacing="20px">
  
  <tr bgcolor="lightgrey">

  <td>Height</td>
  <td>Weight</td>
  <td>BMI</td>
  <td>Date</td>
  
  </tr>
  <c:forEach items="${listCustHStats}" var="health">
		
			
   <tr>
 
    <td>${health.ht}</td>
    <td>${health.wt}</td>
    <td> ${health.bmi}</td>
    <td>${health.date} </td>
   
    
   
   </tr>

	</c:forEach>
	</table>

</body>
</html>