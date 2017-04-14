<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ include file="/views/includes.jsp" %>
   
    

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

select{
width:400px}

#id:hover {
    border: none;
    background:red;
    box-shadow: 0px 0px 1px #777;
}
</style>
 <title>Customer Health statistics</title>
      
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Health Statistics</title>

</head>
<body><div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Trainer</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<form:form action="stats" method="post" modelattribute="custHStats">
<h1 align="center">Add Health Statistics</h1>

<table cellspacing="20px" style="font-size: xx-large;" align="center" >
<tr><td>Weight:</td><td> <input style="font-size: xx-large;" type="text" name="wt" placeholder="in Kg" required></td></tr>
<tr><td>Height:</td><td> <input style="font-size: xx-large;" type="text" name="ht" placeholder="in cm"required></td></tr>
<%-- <label>${customerList}</label> --%>
<%--  <form:select path="custHStats" name="customer">  --%>
 <tr><td>Select Customer</td><td> <select style="font-size: xx-large;" name="cust_Id">
<%--  <form:options items="${customerList}"></form:options> --%>
	<c:forEach items="${customerList}" var="listTrain">
		<option value="${listTrain.cust_Id}" >${listTrain.cust_Id}. ${listTrain.first_Name}</option>               
	</c:forEach>
 </select>
</td></tr>
<tr><td>
<input type="submit" id="id" name="Register"></td></tr>
</table>
</form:form>
</body>
</html>