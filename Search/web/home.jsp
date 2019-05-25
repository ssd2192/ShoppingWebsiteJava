<%-- 
    Document   : index
    Created on : Aug 20, 2013, 5:32:05 PM
    Author     : Dhillon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" type="image" href="img/d.jpg"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>picSHOP</title>
        <!--  The jquery.pageslide.css stylesheet has the class that you'll need on your page -->
        <link rel="stylesheet" type="text/css" href="jquery.pageslide.css" />
        <script src="jq/jquery-1.7.1.min.js" type="text/javascript"></script>
        <script src="jquery.pageslide.min.js" type="text/javascript"></script>
        <!-- For slide-->
        <script type="text/javascript">
	<!--
	var image1=new Image()
	image1.src="img/s1.jpg"
	var image2=new Image()
	image2.src="img/s2.jpg"
	var image3=new Image()
	image3.src="img/s3.jpg"
	//-->
	</script>
        
 <!-- jquery script-->
 <meta http-equiv="content-type" content="text/html;charset=iso-8859-1" />
<meta name="description" value="A slideshow that shows information about images onMouseOver by scrolling the image up, onMouseOut the text scrolls up and the image comes scrolling back in from below. The title below the image (first slide) stays visible above the information (second slide)." />
<meta name="keywords" value="diashow, slideshow, description, preview, truncated, information, slider, carousel, imageviewer" />
<title>Mouse-over slideshow with truncated preview of second slide</title>
<script src="http://code.jquery.com/jquery-1.8.2.min.js" type="text/javascript"></script>
<script src="jquery.carouFredSel-6.1.0-packed.js" type="text/javascript"></script>

<script type="text/javascript">
$(function() {
$('.carousel').each(function() {
var $cfs = $(this);
$cfs.carouFredSel({
direction: 'up',
circular: false,
infinite: false,
align: false,
width: 275,
height: 250,
items: 1,
auto: false,
scroll: {
queue: 'last'
}
});
$cfs.hover(
function() {
$cfs.trigger('next');
},
function() {
$cfs.trigger('prev');
}
);
});
});
</script>
<script>
	$(function() {
	  $('a[href*=#]:not([href=#])').click(function() {
	    if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') && location.hostname == this.hostname) {

	      var target = $(this.hash);
	      target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
	      if (target.length) {
	        $('html,body').animate({
	          scrollTop: target.offset().top
	        }, 1000);
	        return false;
	      }
	    }
	  });
	});
	</script>
<style type="text/css">
			html, body {
                            
				height: 100%;
				padding: 0;
				margin: 0;
			}
			body {
				min-height: 600px;
			}
			body * {
				font-family: Arial, Geneva, SunSans-Regular, sans-serif;
				font-size: 14px;
				color: #333;
				line-height: 22px;
			}

			#wrapper {
				width: 830px;
				height: 550px;
				margin: -250px 0 0 -415px;
				overflow: hidden;
				position: relative;
				margin-left: auto;
                                margin-right: auto;
				top: 520px;
			}
			#wrapper * {
				color: #ccc;
			}

			#wrapper .carousel {
				display: block;
				float: left;
				width: 275px;
				height: 250px;
				margin: 0 1px 1px 0;
			}
			#wrapper .carousel img {
				display: block;
			}
			#wrapper .carousel div {
				background-color: black;
				width: 215px;
				height: 250px;
				padding: 0 30px;
			}
			#wrapper .carousel div h3 {
				font-size: 20px;
				line-height: 50px;
				height: 50px;
				margin: 0;
				padding: 0;
			}
			#wrapper .carousel div p {
				height: 160px;
				margin: 0;
			}
			
			#donate-spacer {
				height: 100%;
			}
			#donate {
				border-top: 1px solid #999;
				width: 750px;
				padding: 50px 75px;
				margin: 0 auto;
				overflow: hidden;
			}
			#donate p, #donate form {
				margin: 0;
				float: left;
			}
			#donate p {
				width: 650px;
			}
			#donate form {
				width: 100px;
			}
                        #tab
                        {
                      
				margin: -250px 0 0 -415px;  
				overflow: hidden;
				position: relative;
				margin-left: auto;
                                margin-right: auto;
				top: 850px;
                                width: 1000px;
                                background-color: black;
                                
                        }
             
                        #below{
                            margin-left: 50px;
                            margin-top: 1500px
                        }         
      #futer
           {
               margin-top: 540px;
               background-color: black;
               height: 60px;
               color: white;
               opacity: 0.7;
               
           }
     
      #vvv
      {
          height: 910px;
          margin-top: 50px;
          background-color: black;
          
         
      }
      #last
      {
        
          margin-top: 70px;
          margin-left: 450px;
          float: left;
          
      }
      #ex
      {
          margin-top: 250px;
          margin-left: 0px;
          
          height: 60pt;
          background-color: black;
          opacity: 0.7;
          color: white;
          font-family: Agency FB;
          font-size: 30pt;
      }
      #le
      {
          margin-top: 0px;
          margin-left: 500px;
          width: 10px;
          height: 10px;
          
      }
      #upb
      {
          margin-top: 400px;
      }
      
      
                        
		</style>        
</head>
<body style="background:url(img/homeback.jpg) center top  black; background-repeat: no-repeat;" >
                 
    <a id="up"></a>    
<div id="all">
        <div id="wrapper">
        <div class="carousel">
	<img src="img/banner1.jpg" alt="car1" width="275" height="200" />
	<div>
	<h3>About</h3>
	<p>
        It's Online Shop </p>
	</div>
	</div>
	<div class="carousel">
	<img src="img/banner2.jpg" alt="car2" width="275" height="200" />
	<div>
            <h3>Why Us ?</h3>
        <p>Genuine Products<br/>14 Day Return<br/>Cash On Delivery</p>
	</div>
	</div>
	<div class="carousel">
	<img src="img/banner3.jpg" alt="car5" width="275" height="200" />
	<div>
	<h3>Check Order Status</h3>
        <p>Check <a href="#view">Status</a></p>
        </div>
	</div>     
            
        <!-- slide right-->
       
            
            
            
        <!-- end slide right-->    
	<div class="carousel">
	<img src="img/homejesica.jpg" alt="car8" width="275" height="200" />
	<div>
	<h3>Sunglasses</h3>
        <p>View <a href="SunglassesHome.jsp" target="_blank">Sunglasses</a> </p>
	</div>
	</div>
      <div class="carousel">
	<img src="img/homewatch1.jpg" alt="car6" width="275" height="200" />
	<div>
	<h3>Watches</h3>
        <p>View <a href="index.jsp" target="_blank">Watches</a></p>
	</div>
	</div>
 
	<div class="carousel">
        <img src="img/homebag11.jpg" alt="car9" width="275" height="200" />
	<div>
	<h3>Bags | Wallets</h3>
        <p>View <a href="BagsHome.jsp" target="_blank">Bags</a></p>
	</div>
	</div>
        
        </div>      
 <!--    <table id="tab">
           
        <tr><td>
        
    <!--      <b><a href="AdminLogin.jsp" target="_blank"><font style="color: white; background-color: black"> LOGIN </font></a></b>&nbsp;&nbsp;
    -->      
  <!--        <b><font style="color: white; background-color: black"> &copy; 2013 picSHOP </font></b>&nbsp;&nbsp;   
  -->
   <!--     <b><font style="color: white; background-color: black"> Privacy Policy </font></b>
   -->        
        </td>
        </tr>
      </table>  
      
   <div id="futer">
        <center> <font style="color: white"/><br/> &copy; 2013 picSHOP </font> </center>
    </div> 
     
  <div id="vvv">
        <a id="view"></a> 
        
        <div id="le"></div>    
        <iframe frameborder="0" width="100%" height="90%"src="homebelow.jsp">dhillon</iframe>   
        
        <center>    <a href="#up"> 
                <img src="img/up.svg" style="height: 40pt;"/>
            </a>
        </center>    
       </div> 
 


</div> 
   
   
     
       
       
</body>
</html>