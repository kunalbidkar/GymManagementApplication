<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>Update Employee</title>
</head>
<body  >

<div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Admin</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<h1 align="center" style="font-size: xx-large;">
Update Employee details</h1>
<form:form action="editEmployee" method="post" modelAttribute="employee"> <!--  action="Update" method="post"> -->
<table cellspacing="20px" style="font-size: xx-large;" align="center">
<tr>
<td>EmployeeId:</td>
<td>
<form:input style="font-size: xx-large;" type="number" path="empId" value="${editEmployee.empId}"  readonly="true" />
</td>
</tr>
<tr>
<td>First Name:</td>
<td>
<form:input style="font-size: xx-large;" type="text" path="fname"  value="${editEmployee.fname}"  />
</td>
</tr>
<tr>
<td>Middle Name:</td>
<td>
<form:input style="font-size: xx-large;" type="text" path="mname" value="${editEmployee.mname}"/>
</td>
</tr>
<tr>
<td>Last Name:</td>
<td>
<form:input type="text" path="lname" style="font-size: xx-large;" value="${editEmployee.lname}"/> 
</td>
</tr>
<tr>
<td>Gender:</td>
<td>
<form:input style="font-size: xx-large;" type="text" path="gender" value="${editEmployee.gender}" readonly="true"/>
  
</td>
</tr>
<tr>
<td>Role:</td>
<td>
<form:select style="font-size: xx-large;" path="roles.roleId" var="role" value="${editEmployee.role.roleId}">
	<c:forEach items="${listRoles}" var="role">
		<option value="${role.roleId}" >${role.roleName}</option>               
	</c:forEach>
</form:select>
</td>
</tr>

<tr>
<td>Email:</td>
<td>
<form:input style="font-size: xx-large;" type="email" path="email" value="${editEmployee.email}" />
</td>
</tr>
<tr>
<td>Contact Number:</td>
<td>
<form:input style="font-size: xx-large;" type="number" path="contact" value="${editEmployee.contact}"/>
</td>
</tr>
<tr>
<td>Address:</td>
<td>
<form:input style="font-size: xx-large;" type="text" path="address" value="${editEmployee.address}"/>
</td>
</tr>
<tr>
<td>Identity Proof Type:</td>
<td>
<form:input style="font-size: xx-large;" type="text" path="idtype" value="${editEmployee.idtype}" readonly="true"/>
</td>
</tr>
<tr>
<td>Identity Proof Number:</td>
<td>
<form:input style="font-size: xx-large;" type="number" path="idnum" value="${editEmployee.idnum}" readonly="true"/>
</td>
</tr>
<tr>
<td>Status:</td>
<td>
<form:select style="font-size: xx-large;" path="status" name="status" value="${editEmployee.ststus}" >
  <option value="active">Active</option>
  <option value="inactive">Inactive</option>
</form:select>
</td>
</tr>
<tr>
<td>
<input  type="submit" id="id" value="Update Employee" >
</td><td></td></tr></table>

</form:form>

</body>
</html>
