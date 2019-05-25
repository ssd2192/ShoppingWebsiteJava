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
                            
				height: 20%;
				padding: 0;
				margin: 0;
			}
			body {
				min-height: 400px;
			}
			body * {
				font-family: Arial, Geneva, SunSans-Regular, sans-serif;
				font-size: 14px;
				color: #333;
				line-height: 22px;
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
          height: 600px;
          margin-top:0px;
                   
      }
      #last
      {
        
          margin-top: 30px;
          margin-left: 450px;
          float: left;
          
      }
      #ex
      {
          margin-top: 150px;
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
          margin-top: 50px;
          margin-left: 500px;
          width: 10px;
          height: 10px;
          
      }
      #upb
      {
          margin-top: 400px;
      }
      #status
      {
         margin-top: 180px;
          margin-left: 400px;
         color: white;
         background-color: black;
         opacity: 0.7;
         width: 520px;
         
      }
      
      
                        
		</style>        
</head>
<body style="background:url(img/homeadminback.jpg) center top black; background-repeat: no-repeat;" >
                    
<div id="all">
    
  <div id="vvv">
        <a id="view"></a> 
        
        <div id="le"></div>    
        
        
        
        <div id="ex"><center><font style="color:white; font-size: 30pt; font-family: Agency FB"/><br/>CHECK ORDER STATUS</font></center></div>
         
            <div id="last">
            <s:form action="uservieworder">
            <s:label value="Enter Username" cssStyle="font-size:17pt; color:white;font-family: Agency FB"/>
            <s:textfield name="uname" cssStyle="color:white; background: transparent; width:300pt; height:30pt; font-size:15pt;"/>
              <s:submit type="image" src="img/check.svg" cssStyle="height:40pt"/>
            </s:form> 
            </div>
        
        <div id="status">
             <s:iterator value="userlistlist">
              Username.................... <s:property value="UNAME"/>     <br/>
              Address....................... <s:property value="CADDRESS"/>   <br/>
              Customer Name........... <s:property value="CNAME"/><br/>
              Product ID.................... <s:property value="PROID"/>  <br/>
              Your Product Status.....<font style="color: greenyellow"/> <s:property value="STATUS"/></font>
              </s:iterator>
             
        </div>
        
       <div id="upb"> 
               
        </div>   
       
       </div> 
 


</div> 
   
   
     
       
       
</body>
</html>