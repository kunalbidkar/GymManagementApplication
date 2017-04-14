<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
<style>
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
}</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="background-color: gray; font-size: x-large;">
<h1 align="center"><b>Welcome Admin</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
  <table align="center" cellspacing="20px">
 <form action="roleadd" method="post">
 <tr><td  style="font-size: xx-large;">Role Name</td><td><input style="font-size: xx-large;" type= "text" name="roleName" placeholder="Ex:Trainer, Dietitian,etc."required></td></tr>
 <tr><td>
 <input type="submit" id="add" value="Add Role"></td></tr></form> 
</table>
	

  
</body>
</html>