<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> <style type="text/css">
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
<body style="text-align: center;"><div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome ${fname}</b> <form action="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
 <form action="Customer" method="get"> <input type="submit" style="text-align: center;" id="id" value="Add Member"></form><br>
  
<!--    <form action="searchcustbyId" method="get"> <input type="submit" value="Search Member by Id"></form><br> -->
    <form action="List"> <input type="submit" style="text-align: center;" id="id" value="View Members"></form><br>
     <form action="Event" method="get"> <input type="submit" id="id" style="text-align: center;" value="Update Events"></form><br>
 
 
     <form action="Fees" method="get"><input type="submit" id="id" name="Deposit Fees" value="Deposit Fees"></form><br>
    <form action="SearchCustomerSub" method="get">
<input id="id" type="submit" name="Search Fee Deposite" value="Search Fee Deposits">
</form>
</body>
</html>