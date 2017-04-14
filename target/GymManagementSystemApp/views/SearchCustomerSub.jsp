<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
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
<body>
<div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Front Desk Executive</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<form:form action="FeeRecord" method="post" modelAttribute="fees">
<table align="center" cellspacing="20px" style="font-size: xx-large;">
<tr>
<td>Select Customer:</td>

<td>
<select style="font-size: xx-large;" name="custId" >
	<c:forEach items="${listCustomer}" var="listCustomer">
		<option value="${listCustomer.cust_Id}" >${listCustomer.first_Name}</option>               
	</c:forEach>
</select>
</td>
</tr>
<tr>
<td> 
<input type="submit" id="id" name="Search" value="Search">
</td>
</tr>
</table>
</form:form>

<form action="downloadPDF" method="post">
<select name="month">
<span class="pln">
	</span><option value="0"><span class="typ">Month</span></option><option><span class="pln">
	</span></option><option value="Jan"><span class="typ">January</span></option><option><span class="pln">
	</span></option><option value="Feb"><span class="typ">February</span></option><option><span class="pln">
	</span></option><option value="Mar"><span class="typ">March</span></option><option><span class="pln">
	</span></option><option value="Apr"><span class="typ">April</span></option><option><span class="pln">
	</span></option><option value="May"><span class="typ">May</span></option><option><span class="pln">
	</span></option><option value="Jun"><span class="typ">June</span></option><option><span class="pln">
	</span></option><option value="Jul"><span class="typ">July</span></option><option><span class="pln">
	</span></option><option value="Aug"><span class="typ">August</span></option><option><span class="pln">
	</span></option><option value="Sep"><span class="typ">November</span></option><option><span class="pln">
	</span></option><option value="Oct"><span class="typ">December</span></option><option><span class="pln">
	</span></option><option value="Now"><span class="typ">September</span></option><option><span class="pln">
	</span></option><option value="Dec"><span class="typ">October</span></option><option><span class="pln">
	
	
</option></select>
<!-- <h3><a href="downloadPDF">Download Employee Report</a></h3> --><br>
<input type="submit" name="Show Report " value="Show Report">
<form>
</body>
</html>