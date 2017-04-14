<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ include file="/views/includes.jsp"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#id {
width: 580px;
    background-color: #ccc;
    -moz-border-radius: 50px;
    -webkit-border-radius: 50px;
    border-radius:60px;
    color: #fff;
    font-family: 'Oswald';
    font-size: 55px;
    text-decoration: none;
    cursor: pointer;
    border:none;
}

select{
width:390px;
}

#id:hover {
    border: none;
    background:red;
    box-shadow: 0px 0px 1px #777;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Workout Plan</title>
</head>
<body>
<div style="background-color: gray; font-size: xx-large;">
<h1 align="center"><b>Welcome Trainer</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<form:form action="workoutPlan" method="post" modelAttribute="wplan">
<table align="center" cellspacing="20px" style="font-size: xx-large;">
<tr>
<td>Workout Type:</td>
<td>
<form:select style="font-size: xx-large;" path="workoutType.workoutId" var="workoutType" >
	<c:forEach items="${listWorkout}" var="workoutType">
		<option value="${workoutType.workoutId}" >${workoutType.workoutName}</option>               
	</c:forEach>
</form:select>
</td>
</tr>
<tr>
<td>Training Level:
</td>
<td>
<select style="font-size: xx-large;" name="trainingLevel">
<option>Beginner</option>
<option>Intermediate</option>
<option>Insane</option></select>
</td>
</tr>
<tr>
<td>Training Intensity:
</td>
<td>
<select style="font-size: xx-large;" name="trainingIntensity">
<option>Low</option>
<option>Medium</option>
<option>High</option></select>
</td>
</tr>
<tr>
<td>Schedule:
</td>
<td>
<input style="font-size: xx-large;" type="text" name="Schedule" placeholder="Ex:Mon-Fri" required>
</td>
</tr>
<tr>
<td>Training Plan:
</td>
<td>
<input style="font-size: xx-large;" type="text" name="trainingPlan" placeholder="Ex:20 pushups,50 crunches" required>
</td>
</tr>
<tr>
<td>
<input type="submit" id="id" value="Add Workout Plan">
</td>
</tr>
</table>
</form:form>
</body>
</html>