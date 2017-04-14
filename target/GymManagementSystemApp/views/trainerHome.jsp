<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#id {
width: 780px;
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
<body><div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Trainer</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<table align="center" cellspacing="20px">
 <tr><td><form action="MembersAssigned"> <input id="id" type="submit" value="View Members Assigned"></form><br>
  </td></tr><tr><td><form action="AddWorkoutPlan"> <input id="id" type="submit" value="Add Workout Plans"></form><br>
  </td></tr><tr><td> <form action="workoutPlanList"> <input type="submit" id="id" value="View Workout Plans"></form><br>
   </td></tr>
   <tr><td> <form action="AddCustStats"> <input type="submit"  id="id" value="Add Customer Health Statistics"></form><br>
   </td></tr>
   <tr><td> <form action="healthSearchbyId"> <input type="submit" id="id" value="View Customer Health Statistics"></form><br>
   </td></tr>
   
   </table>
   </body>
</html>