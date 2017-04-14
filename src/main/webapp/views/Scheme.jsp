<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%--      <%@ include file="/WEB-INF/views/includes.jsp"%> --%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#id {

  background-color: #ccc;
    -moz-border-radius: 5px;
    -webkit-border-radius: 5px;
    border-radius:6px;
    color: #fff;
    font-family: 'Oswald';
    font-size:xx-large;
    text-decoration: none;
    cursor: pointer;
    border:none;

}



#id:hover {
    border: none;
    background:red;
    box-shadow: 0px 0px 1px #777;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Admin</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>

<table align="center" cellspacing="20px">
<form:form action="schemeadd" method="post" modelAttribute="scheme">
<tr>
<td style="font-size: xx-large;">Workout Type:</td>
<td>
<form:select style="font-size: xx-large; width:330px"  path="workoutType.workoutId" var="workoutType" >
	<c:forEach items="${listWorkout}" var="workoutType">
		<option value="${workoutType.workoutId}" >${workoutType.workoutName}</option>               
	</c:forEach>
</form:select>
</td>
</tr>
<tr>
<td style="font-size: xx-large;">Paying Interval:</td>
<td>
<form:select style="font-size: xx-large; width:330px" path="duration.durationId" var="duration" >
	<c:forEach items="${listDuration}" var="duration">
		<option value="${duration.durationId}" >${duration.durationPlan}</option>               
	</c:forEach>
</form:select>
</td>
</tr>

<tr>
<td style="font-size: xx-large;">
Scheme Price:
</td>
<td>
<input style="font-size: xx-large; width:325px" type="number" name="price" placeholder="Ex:5000/-" required>
</td>
</tr>
<tr>
<td>
 <input type="submit" id="id" value="Add Scheme">
</td>
</tr>

</form >
<tr><td>
<form action="SchemeList" method="get">
<input type="submit" id="id" value="Update Schemes">
</form:form>
</td></tr>
</table>

</body>
</html>