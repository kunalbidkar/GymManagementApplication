<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
 --%>
 
 <!DOCTYPE html>

<html lang="en">
    <head>
    <meta charset="utf-8"> 
      <meta name="viewport" content="width=device-width, initial-scale=1">    
      
      <title>GYM</title> 
      <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
      <link href="css/font-awesome.css" rel="stylesheet" type="text/css">
      <link href="css/style.css" rel="stylesheet" type="text/css">
      <script src="https://use.fontawesome.com/07b0ce5d10.js"></script>
      <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
<style>

/*////////////////TOP NAV BAR////////////////*/

.top-bar{background-color:black;min-height:40px;padding-top:5px;padding-bottom: 0px;}
.top-bar .nav-text {
    color: #00BCD4;
    display: block;
    margin-top: 5px;
}
.top-bar .social{color:#FFF;display:inline-block;padding:5px;text-decoration: none;}

.top-bar .tools{margin:0px;padding:0px;list-style-type:none;}
.top-bar .tools li{list-style-type: none;display:inline-block;}
.top-bar .tools li a {
    display: block;
    text-decoration: none;
    color: #fff;
    padding-left: 15px;
    padding-top: 5px;
}

.navbar-brand {
    /* float: left; */
    height: 50px;
    padding: 3px 15px;
    font-size: 18px;
    line-height: 20px;
    position: absolute;
    z-index: 11;
    margin: 0 auto;
    right: 42%;
}


.navbar-inverse {
    background-color: #009688;
    border-color: #080808;
}

.navbar {
    position: relative;
    min-height: 50px;
    margin-bottom: 0px;
    border: 0px solid #000;;
    border-radius:0px;
   box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}

.navbar-inverse .navbar-nav > li > a {
    color: #fff;
}
.nav > li > a {
    position: relative;
    display: block;
    padding: 15px 11px;}

.form-control{
    border-color:#fff;
    border-radius:0px;
    background-color:transparent;
}

.btn-default-1 {
    color: #fff;
    background-color: transparent;
    border-color: #fff;
    border-radius: 0px;
}

.cart-heart a{display:inline-block;color:#fff;font-size:20px;padding:5px;}

/*CROUSELE START///////////////////////////*/

.carousel-caption {
    position: absolute;
    right: 15%;
    bottom: 35px;
    width: 60%;
    left: 15%;
    z-index: 10;
    padding-top: 20px;
    padding-bottom: 20px;
    color: #fff;
    text-align: left;
    text-shadow: 0 1px 2px rgba(0, 0, 0, .6);
}

@media screen and (min-width:768px){
    .carousel-caption h3{font-size: 52px;} 
    .carousel-caption p{font-size: 32px;} 
    .carousel-caption{padding-bottom:160px;}
}


/*FOOTER START///////////////////*/

</style>
<body>
    
      <!--TOP-NAVBAR-END-->
    
    
<!--====================== NAVBAR MENU START===================-->
   
   
 


<nav class="navbar navbar-inverse">
            <label style="color: white; background-color: black; width: 150px; font-size: 35px; padding: 3px;">KINETIC</label> 
            <label style="color: white; font-size: 15px;">Push harder than yesterday if you want a different tomorrow.<br>KINETIC GYM</label>
            <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      
     <li><form action="aboutUs" method="get"><input type="submit" value="About" class="btn btn-success btn-block" style="background-color: black;"></form></li>
     <li><form action="ContactUs" method="get"><input type="submit" value="Contact Us" class="btn btn-success btn-block" style="background-color: black;"></form></li>
      <li><form action="Offers" method="get"><input type="submit" value="Offers" class="btn btn-success btn-block" style="background-color: black;"></form></li>

    </ul>
    
    <ul>
    <li><form action="Logout" method="get"><input type="submit"  value="Log Out" class="btn btn-success btn-block" style="background-color: black;"></form></li>
    </ul>
  </div>
</nav>




</body>
</html>
 