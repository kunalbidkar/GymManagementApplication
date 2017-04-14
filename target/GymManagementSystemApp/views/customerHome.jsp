<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function check(){
	
	
	var fname="Welcome"+localStorage.getItem("fname");
};


</script>
<style type="text/css">
input {
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



input:hover {
    border: none;
    background:red;
    box-shadow: 0px 0px 1px #777;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="check();"><div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Customer</b></h1><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></div>
<table align="center" cellspacing="20px">

  <form action="SearchCustomerSub"> <tr><td><input type="submit" value="Membership Details"></td></tr></form><br>
   <form action="viewEvents"> <tr><td><input type="submit" value="View Upcoming Events"></td></tr></form><br>
    <tr><td> <form action="healthSearchbyId"> <input type="submit" value="View Customer Health Statistics"></form><br>
   </td></tr>
   </table>
</body>
</html>