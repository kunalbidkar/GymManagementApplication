<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> <style type="text/css">
#id {

  background-color: #ccc;
    -moz-border-radius: 5px;
    -webkit-border-radius: 5px;
    border-radius:6px;
    color: #fff;
    font-family: 'Oswald';
    font-size:xx-large;
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
<h1 align="center"><b>Welcome Admin</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>

<form action="schemeupdate" method="post">
<table cellspacing="20px" align="center">
<tr>
<td style="font-size: xx-large;">
Scheme Name:
</td>
<td>
<select style="font-size: xx-large;" name="schemeId">
<c:forEach items="${listSchemes}" var="scheme">
<option value=${ scheme.schemeId}>${scheme.workoutType.workoutName}+${scheme.duration.durationPlan}</option>               
</c:forEach>
</select>
</td>
</tr>
<tr>
<td style="font-size: xx-large;">
Scheme Price:
</td>
<td>
<input  style="font-size: xx-large; width:410px;"  type="number" name="price">
</td>
</tr>
<tr>
<td>
 <input type="submit" id="id" value="Update Scheme">
</td>
</tr>
</table>
</form>
</body>

</html>