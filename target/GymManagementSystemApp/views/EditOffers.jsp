    <%@ include file="/views/includes.jsp"%>
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
width:390px;
}

#id:hover {
    border: none;
    background:red;
    box-shadow: 0px 0px 1px #777;
}
</style>
      <title>Event Register</title>
      
</head>
<body><div style="background-color: gray; font-size: x-large;"><h1 align="center"><b>Welcome Front Desk Executive</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<h3 align="center" style="font-size: xx-large;" >Update Event</h3>

<table align="center" cellspacing="20px" style="font-size: xx-large;">
<form action="updateEvent" method="post" >
<tr><td>
Event Name:</td><td><select width="300px" style="font-size: xx-large;" name="event_Id" >
	<c:forEach items="${eventList}" var="id">
		<option value="${id.event_Id}" >${id.event_Name}</option>   
 		            
	</c:forEach>
</select></td></tr>

<input type="text" style="font-size: xx-large;" name="event_Name" value="${id.event_Name}" hidden="true"> 
<br>
<tr><td>Event Desc: </td><td> <input type="text" style="font-size: xx-large;" name="event_desc"><br>
</td></tr>
<tr><td>

<input type="submit" id= "id" value="UpdateEvent">  <br>
</td></tr></form>
</table>




</body>
</html>
