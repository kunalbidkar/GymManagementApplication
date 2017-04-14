<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><style type="text/css">

#add {
    background-color: #ccc;
    -moz-border-radius: 5px;
    -webkit-border-radius: 5px;
    border-radius:6px;
    color: #fff;
    font-family: 'Oswald';
    font-size: xx-large;
    text-decoration: none;
    cursor: pointer;
    border:none;
}



#add:hover {
    border: none;
    background:red;
    box-shadow: 0px 0px 1px #777;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-size: xx-large;">
<div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Admin</b> <form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<table align="center" cellspacing="20px">
<form action="duration" method="post">

<tr>
<td style="font-size: xx-large;" >Duration Plan:
</td>
<td>
<input type="text" style="font-size: x-large;" name="durationPlan" placeholder="Ex: Monthly, Quarterly, Yearly etc.." required>
</td>
</tr>
<tr>
<td>
<input type="submit" id="add" value="Add Duration Plan">
</td>
</tr>
</form>


</table>

</body>
</html>