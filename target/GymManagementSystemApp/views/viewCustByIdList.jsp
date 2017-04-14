<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List </title>
</head>
<body>
Searched By Id Customer detail
  <table> 

   
   
  <c:forEach items="${listPersons}" var="customer">
  <tr>

 <h1>I am inside for loop</h1>
     <td>${customer.cust_Id}</td>
    <td>${customer.first_Name}</td>
<%--    <td>${customer.IdProof}</td>  --%>
<%--     <td>${customer.IdProofNo}</td>  --%>
</tr>
    </c:forEach>
   

   

    </table> 

</body>
</html>

