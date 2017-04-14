
<html>
<head>
      <title>Event Register</title>
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
      <title>Register</title>
      <style type="text/css">
            .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
            .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
            .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
            .tg .tg-4eph{background-color:#f9f9f9}
      </style>
      
</head>
<body><div style="background-color: gray; font-size: x-large;"><h1 align="center"><b>Welcome Front Desk Executive</b><form action ="logout"><input style="float: right; height: 55px; background-color:red;color:white;" type="submit" align="right"  value="Log Out"></form></h1></div>
<h3 align="center" style="font-size: xx-large;" >Add an Event</h3>

<table align="center" cellspacing="20px" style="font-size: xx-large;">
<form action="Event" method="post">
<tr><td>
Event Name:</td><td> <input style="font-size: xx-large;" type="text" name="event_Name"></td></tr>
<tr><td>Event Desc:</td><td> <input style="font-size: xx-large;" type="text" name="event_desc"></td></tr>


<tr><td>
<input type="submit" id="id" style="font-size: xx-large;" value="Add Event">  </td></tr>
</form>

<form action="redirectupdateOffer" method="post">
<tr><td>
<input type="submit"  id="id" style="font-size: xx-large;" value="Edit Event"> <br><br>
</td></tr></form>

<form action="redirectListOffer" method="post">
<tr><td>
<input type="submit" style="font-size: xx-large;"id="id"  value="List Event"> <br><br>
</td></tr></form>





</table>



</body>
</html>
