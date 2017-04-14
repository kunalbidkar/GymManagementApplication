<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file="/views/includes.jsp"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function check()
{	var x= ${status};
	if(x.equals("false"))
	window.location = "http://www.yoururl.com";
}</script>
<style type="text/css">
#id {
width: 490px;
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="check();">



<%-- <div><jsp:directive.include file="header1.jsp"/></div> --%>


<div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome ${fname} </b> <form action="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1>
</div>

<table cellspacing="15px" align="center">
<tr>
<td><form action="Duration"> <input name="submit" id="id" type="submit"  id="submit"value="Add Durations"></form></td>
 <td><form action="Scheme"> <input type="submit" id="id" value="Add/Update Schemes"></form></td><td>
  <form action="AddWorkoutType"> <input type="submit" id="id" value="Add Workout types"></form></td> </tr>
  <tr><td></td><td></td><td></td></tr>
   <tr><td></td><td></td><td></td></tr>
    <tr><td></td><td></td><td></td></tr>
  <tr><td> <form action="Role"> <input type="submit" id="id" value="Add Roles"></form></td><td>
      <form action="AddEmployee"> <input id="id" type="submit" value="Add Employees"></form></td><td>
   <form:form action="ActiveEmployees" method="post">
<input type="submit" id="id" value="Active Employees">
</form:form><br></td></tr> 
<tr><td></td><td></td><td></td></tr>
 <tr><td></td><td></td><td></td></tr>
<tr><td></td><td></td><td></td></tr>
<tr><td>
<form:form action="InActiveEmployees" method="post">
<input id="id" type="submit" value="InActive Employees">
</form:form></td><td>
     <form action="ListEmployees" method="post"> <input id="id" type="submit" value="Employee List"></form></td><td>
      <form action="adminHome"> <input id="id" type="submit" value="Monthly Report"></form></td></tr>
 <tr><td></td><td></td><td></td></tr>
  <tr><td></td><td></td><td></td></tr>      <tr><td></td><td></td><td></td></tr><tr><td></td><td>
       <!-- <form action="adminHome"> <input id="id" type="submit" value="Annual Report"></form> --><br></td><td></td></tr>
</table></body>
</html>