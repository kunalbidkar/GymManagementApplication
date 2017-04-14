<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>Add Diet</title>
</head>
<body>
<div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Dietician</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
 <table align="center" cellspacing="20px" style="font-size: xx-large;">
<form action="DietADDUPDATES" method="post">
 <tr><td>
BreakFast:</td><td> <input type="text" style="font-size: xx-large;" name="breakfast" required></td></tr>
 <tr><td>
Lunch:</td><td><input type="text" style="font-size: xx-large;" name="lunch" required></td></tr>
 <tr><td>
Dinner:</td><td><input type="text" style="font-size: xx-large;" name="dinner" required></td></tr>
 <tr><td>
<input id="id" type="submit" value="Add Diet">
</td></tr>
</form>
</table>
</body>
</html>