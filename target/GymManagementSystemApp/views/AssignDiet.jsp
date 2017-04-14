<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="/views/includes.jsp"%>
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
<title>Insert title here</title>
</head>
<body>

<div style="background-color: gray; font-size: xx-large;">
<h1 align="center"><b>Welcome Trainer</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<table align="center" cellspacing="20px" style="font-size: xx-large;">
<form:form action="AssignDietPlan"  method="post" modelAttribute="customer">
<tr><td>Customer Id:</td><td>	
<form:input style="font-size: xx-large;" type="number" path="cust_Id" value="${cust.cust_Id}"  readonly="true" />
</td></tr>
<tr><td> WorkoutPlan: 
</td><td>
<form:select style="font-size: xx-large;" path="dietPlanID.dietPlanId" var="listwork"  >
	<c:forEach items="${listwork}" var="workout"> 
			<option value="${workout.dietPlanId}" >Breakfast:${workout.breakfast}+ Lunch:${workout.lunch}+ Dinner:${workout.dinner}</option>               
 	</c:forEach>
 	
</form:select></td></tr>
<tr><td>
<input type="submit" id="id" value="Save Diet Plan"/>
</td></tr>
</form:form>
</table>
</body>
</html>