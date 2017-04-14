<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%-- <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> --%>
<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> --%>
<%-- <%@ page session="false" %> --%>
    <%@ include file="/views/includes.jsp"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<style type="text/css">
#id {

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



#id:hover {
    border: none;
    background:red;
    box-shadow: 0px 0px 1px #777;
}
</style>
      <title>Register</title>
      <style type="text/css">
            .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
            .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
            .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
            .tg .tg-4eph{background-color:#f9f9f9}
      </style>
      
      
</head>
<body><div style="background-color: gray; font-size: x-large;"><h1 align="center"><b>Welcome Front Desk Executive</b> <form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<h3 align="center" style="font-size: xx-large;" >Add a Customer</h3>

<table align="center" cellspacing="20px" style="font-size: xx-large;">
<form:form action="Customer" method="post" modelAttribute="customer" >
<tr>
<td>First Name: </td><td><input style="font-size: xx-large;" type="text" name="first_Name" required></td></tr>
<tr><td>Middle Name:</td><td> <input style="font-size: xx-large;" type="text" name="middle_Name"></td></tr>
<tr><td>Last Name:</td><td> <input style="font-size: xx-large;" type="text" name="last_Name" required></td></tr>
<tr><td>Email ID: </td><td><input style="font-size: xx-large;" type="text" name="email" placeholder="abc@xyz.com" required></td></tr>
<tr><td>Contact : </td><td><input style="font-size: xx-large;" type="text" name="contact_No" placeholder="9XXX or 8XXX or 7XXX" required></td></tr>
<tr><td>Address: </td><td> <textarea rows="3" cols="17" style="font-size: xx-large;" type="text" name="address" required></textarea><br></td></tr>
<tr><td>ID Proof No:</td><td> <input style="font-size: xx-large;" type="text" name="identity_Proof_No" required></td></tr>
<tr><td>ID Proof Type. :</td><td><input style="font-size: xx-large;" type="text" name="identity_Proof_Type" placeholder="Aadhar,PAN,etc." required></td></tr>

<tr><td>
Gender:</td><td><select style="font-size: xx-large;" name="gender">
<option value="Male">Male</option>
<option value="Female">Female</option>
</select></td></tr>
<tr><td>
Trainer assigned: </td><td>

<form:select style="font-size: xx-large;" path="employee.empId" var="listTrain" >
	<c:forEach items="${listTrainer}" var="listTrain">
		<option value="${listTrain.empId}" >${listTrain.fname}</option>               
	</c:forEach>
</form:select>       </td></tr>
<tr><td>
WorkType:</td><td>
<form:select style="font-size: xx-large;" path="wType.workoutId" var="listWType" >
	<c:forEach items="${listWorkoutType}" var="listWType">
		<option value="${listWType.workoutId}" >${listWType.workoutName}</option>               
	</c:forEach>
</form:select>    </td></tr>
<tr><td>
Duration:</td><td>
<form:select style="font-size: xx-large;" path="durationType.durationId" var="listDuartion" >
	<c:forEach items="${listduartion}" var="listDuartion">
		<option value="${listDuartion.durationId}" >${listDuartion.durationPlan}</option>               
	</c:forEach>
</form:select> </td></tr>

<tr><td>
DietPlan: 
</td><td>
<form:select style="font-size: xx-large;" path="dietPlanID.dietPlanId" var="listDiet" >
	<c:forEach items="${listdiet}" var="listDiet">
		<option value="${listDiet.dietPlanId}" >${listDiet.breakfast}  ${listDiet.lunch}  ${listDiet.dinner}</option>               
	</c:forEach>
</form:select>
</td></tr>
<tr><td>
WorkoutPlan: 
</td><td>
<form:select style="font-size: xx-large;" path="custWorkoutPlan.workoutplanId" var="workout" >
	<c:forEach items="${listworkout}" var="workout">
		<option value="${workout.workoutplanId}" >${workout.workoutplanId}. ${workout.trainingPlan}</option>               
	</c:forEach>
</form:select>
</td></tr>

<tr><td>
<input style="font-size: xx-large;" type="submit" id="id" value="Register customers">  <br>
</td></tr>
</form:form>





</table>

</body>
</html>
