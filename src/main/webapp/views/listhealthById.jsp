<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Trainer</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>

<h2 align="center">Enter your ID to get your health statistics.</h2>


<form action="ListHealthStats" method="get" >
<table align="center" style="font-size: xx-large;">
<tr><td>Member Name: 
</td><td>
<input type="text"  style="font-size: xx-large;"name="cust_Id"></td></tr>
<tr><td>
<input type="submit" id="id" value="Fetch my Stats!">
</td></tr></table>
</form>



</body>
</html>