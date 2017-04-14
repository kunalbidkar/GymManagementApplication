<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#id{

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
<body>
<body style="text-align: center;"><div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Front Desk Executive</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<form:form action="feesadd" method="post" modelAttribute="fees">
<table align="center" cellspacing="20px" style="font-size: xx-large;">
<tr>
<td>
Customer Name:
</td>

<td>
<select  style="font-size: xx-large;" name="custId" >
	<c:forEach items="${listCustomer}" var="listCustomer">
		<option value="${listCustomer.cust_Id}" >${listCustomer.first_Name}</option>               
	</c:forEach>
</select>
</td>
</tr>


<tr>
<td>Select Scheme</td>
<td>
<form:select style="font-size: xx-large;"  path="scheme.schemeId" var="scheme" >
	<c:forEach items="${listScheme}" var="scheme">
		<option value="${scheme.schemeId}" >${scheme.workoutType.workoutName}-${scheme.duration.durationPlan}-${scheme.price}</option>               
	</c:forEach>
</form:select>
</td>
</tr>
<tr>
<td>
<input type="submit" id="id" name="Make Payment" value="Make Payment">
</td>
</tr>
</table>
</form:form>
</body>
</html>