    <%@ include file="/views/includes.jsp"%>
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
<title>Update</title>
</head>
<body><div style="background-color: gray; font-size: x-large;"><h1 align="center"><b>Welcome Front Desk Executive</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<h3 align="center" style="font-size: xx-large;" >Update Customer Details</h3>
<table align="center" style="font-size: xx-large;" cellspacing="20px">
<form:form action="updateCustomer"  method="post" modelAttribute="customer"> <!--  action="Update" method="post"> -->
	<tr><td>Customer Id:</td><td>
	<form:input type="number" style="font-size: xx-large;" path="cust_Id" value="${cust.cust_Id}"  readonly="true" /></td></tr>
	 <tr><td>First Name:</td><td>
	<form:input type="text" style="font-size: xx-large;" path="first_Name" value="${cust.first_Name}"/></td></tr>
	 <tr><td>Middle Name:</td><td>
	<form:input type="text" style="font-size: xx-large;" path="middle_Name" value="${cust.middle_Name}"/></td></tr>
	<tr><td> Last Name:</td><td>
	<form:input type="text" style="font-size: xx-large;" path="last_Name" value="${cust.last_Name}"/></td></tr>
	<tr><td> Email ID:</td><td>
	<form:input type="text" style="font-size: xx-large;" path="email"  value="${cust.email}"/></td></tr>
	<tr><td> Gender :</td><td>
	<form:select style="font-size: xx-large;" path="gender" var="gender">
	<option value="${cust.gender}" >${cust.gender}</option>      

	</form:select></td></tr>
	<tr><td>
	Contact :</td><td>
	<form:input style="font-size: xx-large;" type="text" path="contact_No"  value="${cust.contact_No}"/></td></tr>
	<tr><td> Address:</td><td>
	<input type="text" style="font-size: xx-large;" name="address" value="${cust.address}"></td></tr>
	<tr><td>
	ID Proof No:</td><td> <form:input type="text" style="font-size: xx-large;" path="identity_Proof_No" value="${cust.identity_Proof_No}" readonly="true"/></td></tr>
<tr><td>ID Proof Type. :</td><td><form:input style="font-size: xx-large;" type="text" path="identity_Proof_Type" value="${cust.identity_Proof_Type}" readonly="true"/></td></tr>
	
<tr><td>	Trainer Assigned:</td><td>
	<form:select style="font-size: xx-large;" path="employee.empId" var="listTrain" >
	<c:forEach items="${listTrainer}" var="listTrain">
		<option value="${listTrain.empId}" >${listTrain.fname}</option>               
	</c:forEach>
</form:select>       </td></tr>
<tr><td>
Workout Type:</td><td>
<form:select style="font-size: xx-large;" path="wType.workoutId" var="listWorkoutType"  >
	<c:forEach items="${listWorkouttype}" var="listWorkoutType">
		<option value="${listWorkoutType.workoutId}" >${listWorkoutType.workoutName}</option>               
	</c:forEach>
</form:select>    
</td></tr>
<tr><td>
Duration:</td><td>
<form:select style="font-size: xx-large;" path="durationType.durationId" var="listDuration" >
	<c:forEach items="${listDuration}" var="listDuration">
		<option value="${listDuration.durationId}" >${listDuration.durationPlan}</option>               
	</c:forEach>
</form:select> 
</td></tr>
<tr><td>Diet Assigned:</td><td>
<form:select style="font-size: xx-large;" path="dietPlanID.dietPlanId" var="listDiet" value="${ cust.dietPlanID.dietPlanId }"  >
<%-- 	<c:forEach items="${listDiet}" var="listDiet"> --%>
		<option value="${cust.dietPlanID.dietPlanId}" >${cust.dietPlanID.breakfast} ${cust.dietPlanID.lunch}  ${cust.dietPlanID.dinner}</option>               
<%-- 	</c:forEach> --%>
</form:select>
</td></tr>
<tr><td>
WorkoutPlan: 
</td><td>
<form:select style="font-size: xx-large;" path="custWorkoutPlan.workoutplanId" var="listwork" value="${cust.custWorkoutPlan.workoutplanId} }" >
<%-- 	<c:forEach items="${listwork}" var="workout"> --%>
		<option value="${cust.custWorkoutPlan.workoutplanId}" >${cust.custWorkoutPlan.trainingPlan}</option>               
<%-- 	</c:forEach> --%>
</form:select>
</td></tr>
<tr><td>
	<input type="submit" id="id"value="update"/>
	</td></tr>
	
	</form:form>
	</table>
</body>
</html>