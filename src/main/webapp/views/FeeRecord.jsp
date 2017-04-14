<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Front Desk Executive</b></h1></div>
<h1 align="center">Customer Fees Records </h1>
<table align="center" style="font-size: xx-large;" cellspacing="20px">
<tr bgcolor="lightgrey">
<td>Date:</td>
<td>Amount Paid:</td>
<td>Payment Interval:</td>
</tr>

  <c:forEach items="${listFees}" var="Fees">
            
                  
   <tr>
    <td>${Fees.date}</td>
    <td>${Fees.scheme.price}</td>
     <td>${Fees.scheme.duration.durationPlan}</td>
	</tr>

      </c:forEach>
      </table>
</body>
</html>