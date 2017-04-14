<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="/views/includes.jsp"%>
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
<div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Admin</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>

<table align="center" cellspacing="20px">
<!-- <tr> -->
<!-- <td>EmployeeId:</td> -->
<!-- <td> -->
<!-- <input type="number" name="empId" autofocus required> -->
<!-- </td> -->
<!-- </tr> -->
<form:form action="Employee" method="post" modelAttribute="employee">
<tr>
<td style="font-size: xx-large;">First Name:</td>
<td>
<input type="text" style="font-size: xx-large;" name="fname" required>
</td>
</tr>
<tr>
<td style="font-size: xx-large;">Middle Name:</td>
<td>
<input style="font-size: xx-large;" type="text" name="mname">
</td>
</tr>
<tr>
<td style="font-size: xx-large;">Last Name:</td>
<td>
<input style="font-size: xx-large;" type="text" name="lname"  required>
</td>
</tr>
<tr>
<td style="font-size: xx-large;">Gender:</td>
<td>
<select style="font-size: xx-large;" name="gender" required>
  <option value="male">Male</option>
  <option value="female">Female</option>
</select>
</td>
</tr>
<tr>
<td style="font-size: xx-large;">Role:</td>
<td>
<form:select style="font-size: xx-large;" path="roles.roleId" var="role" >
	<c:forEach items="${listRoles}" var="role">
		<option value="${role.roleId}" >${role.roleName}</option>               
	</c:forEach>
</form:select>
<%-- <form:select path="role.id" var="roles" >
               <c:forEach items="${roles}" var="role">
                              <form:option label="${role.roleName}" value="${role.id}"/>
            </c:forEach> 
</form:select> --%>


</td>
</tr>
<tr>
<td style="font-size: xx-large;">Email:</td>
<td>
<input type="email" style="font-size: xx-large;" name="email" placeholder="abc@xyz.com" required>
</td>
</tr>
<tr>
<td style="font-size: xx-large;">Contact Number:</td>
<td>
<input type="number" style="font-size: xx-large;" name="contact" placeholder="9XXX or 8XXX or 7XXX" required>
</td>
</tr>
<tr>
<td style="font-size: xx-large;">Address:</td>
<td>
<input type="text" style="font-size: xx-large;" name="address"  required>
</td>
</tr>
<tr>
<td style="font-size: xx-large;">Identity Proof Type:</td>
<td>
<input type="text" style="font-size: xx-large;" name="idtype" placeholder="Aadhar,PAN,etc." required>
</td>
</tr>
<tr>
<td style="font-size: xx-large;">Identity Proof Number:</td>
<td>
<input type="number" style="font-size: xx-large;" name="idnum"  required>
</td>
</tr>
<tr>
<td style="font-size: xx-large;">Status:</td>
<td>
<form:select style="font-size: xx-large;" path="status" name="status">
  <option value="active">Active</option>
  <option value="inactive">Inactive</option>
</form:select>
</td>
</tr>

<tr>
<td>
<input type="submit" id="id" value="Add" required>
</td>
</tr></form:form>


<form:form action="ListEmployees" method="post">
<tr><td><input type="submit" id="id" value="Employees List"></td></tr>
</form:form>

</table>  


</body>
</html>
