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
    <li><form action="Login" method="get" style="width:70px; float: right;"><input type="submit" value="Login" class="btn btn-success btn-block" style="background-color: black;"> </form></li>
    </ul>
  </div>
</nav>


<!--=================CAROUSELE START====================-->
  
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active" style="height: 643px;">
       <img src="http://www.webgranth.com/wp-content/uploads/2013/10/working-out-fitness-girl-wallpaper.jpg">
     
    </div>

    <div class="item" style="height: 643px;">
      <img src="http://hdqwalls.com/wallpapers/gym-girl-8k-image.jpg">
      
    </div>
    
    <div class="item" style="height: 643px;">
      <img src="https://awscloudfront.kempinski.com/1201/amm1fitnessl.jpg;width=1920;height=1080;mode=crop;anchor=middlecenter;autorotate=true;quality=90;scale=both;progressive=true;encoder=freeimage" >
      
    </div>
  </div>
  

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
    
    
    
<!--   FOOTER START================== -->
    
    <footer class="footer" style="background-color: black; color: white;" >
   
        <div class="row text-center"> © 2017. Xpanxion.</div>
      
        
        
    </footer>

</body>
</html>