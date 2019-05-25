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
        <title>Prducts List</title>
        <!-- For slide-->
      
    <style type="text/css">
            body,table{
               
                background-color: white;
                
            }
            a{
                text-decoration: none;
            }
            #head{
                <!-- box-shadow:#ccc 5px 5px 5px; -->            
 
                margin-left: auto;
                margin-right: auto;
                width:1000px;                
            }
            div{
                
            }
            #all1,.sh,#head
            {
                max-width: 100%;
                 width: 1000px;
               margin-left: auto;
                margin-right: auto;
              
            }
             /* -------------------top navi-----------*/
            .nav 
            { 
                background-color: #333;
              float: left;
               width:25%;
               
            }
            .nav a
            { 
                border-left: 1px solid #fff;
             color: white;
               font-family: Agency FB;
                font-size: 200%; 
                display: block;
                margin: 0px;
                padding: 15px 40px 16px 40px;
               
            }
            
             /* -------------------end navi-----------*/
              /* -------------------left navi-----------*/
             
            
             
              .lnav div
            { 
                background-color: #808080 ;
               margin: 6px;
                width:100%;
              
            }
            .PP{
                  border:1px solid;
               border-bottom-left-radius:2em;
              border-top-left-radius:2em;
                background-color: #808080  ;
                width:100%;
                box-shadow: #333 1px  1px 2px;
               text-shadow:#333 1px  1px 2px;
              }
            
            div h3
            { 
                 color: white;
                font-family: Agency FB;
                font-size: 120%; 
                display: block;
                padding: 10px 30px 10px 40px;
                
                
            }
            .lnav div h2
            {
                color: white;
                font-family: Agency FB;
                font-size: 140%; 
                display: block;
                padding: 10px 30px 10px 40px;
                
            }
             .lnav a
             {  box-shadow: #333 2px  2px 10px;
               text-shadow:#333 1px  1px 2px;
                
                color:white;
               font-family: Agency FB;
                font-size: 120%; 
                display: block;
                margin: 0px;
                padding: 15px 40px 16px 40px;
                 
             }
              .lnav div a:hover
            { 
                box-shadow: #333 1px  1px 2px;
            }
             
             /* -------------------end left navi-----------*/
            .aa:link{  border-left: 0px solid #333;}
            
            #head div:hover
            { background-color:  dimgray;
              
               
                
            }
            .sh1{
               padding-top: 10px;
               padding-bottom:10px;
                margin-bottom: 10px;
                width: 100%;
                 
                background-color:#EEEEEE;
                    
            }
            .sh{
                position:relative;
                padding:0px 100% 0px 0px;
                width: 100%;
                height:72px;
                background-color:#333;
               
            }
            .pic{
                width: 1000px;
                margin-left: auto;
                margin-right: auto;
            }
            .pic img
            {z-index:0;
             position:relative;
                width:100%;
                 box-shadow: #333 0 0 80px 2px;
            }
            #left
            {
              
                float:left;
                width: 300px;
            }
            #right
            {   margin-left: 310px;            
                
                
            }
            #right div{
                
               float: left; 
               margin:  10px 15px 10px 15px;
            }
             #right div:hover{ transform: scale(1.1,1.1);
                              
                 -ms-transform: scale(1.1,1.1); /* IE 9 */
                 -webkit-transform: scale(1.1,1.1); /* Safari and Chrome */
            }
            #right div img{
             border:2px solid #fff;
             border-radius:12px;
            }
            #right div img:hover
            {
                 box-shadow: #333 0 0 20px 2px;
            }
            .limg{
                
                width:310px;
            }
            limg:hover{
 
              
            }
             .rimg{
                
                width:310px;
                
            }
            .bimg
            {
               padding-left: 90px;
                float:left;
                width: 600px;
                
            }
            /* -------------------Foter-----------*/
            
            .footer
            { margin-top: 600px;
                width:100%;
             box-shadow: #EEEEEE 0 0 4px 5px;
                
                
            }
            .foter_resize{
                
                width:1000px;
                margin-left: auto;
                margin-right: auto;
                
            }
            .foter_resize img{
                margin: 5px 0px 0px 0px;
                width: 190px;
            }
            .zx
            {
                position:relative;
                width:0px;
                height:0px;
                
              
            }
            .zxx
            {
                position:absolute;
                left:10px;
                top:-348px;
                height: 50px;
                margin-left: auto;
            }
            
            .re{ 
                position:relative;
                 width:100%;
                height:0px;
                top:-10px;
            }
            .pp{
                z-index:0;
                padding: 0% 100% 0% 0%;
                position:absolute;
                width:100%;
                height:100px;
               
                background-color:#333;
            }
            
           /* -------------------productlist-----------*/
             
             
             .product .ss img
             {
                 
                background-color: #FFF;
               
                box-shadow: #333 2px  2px 2px;
               
                 
             }
              .product tr
             {
                 
               
               
               
                 
             }
             
            
        </style> 
        
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

 <!-- scroll bar -->      
  <script type="text/javascript">
/** This is high-level function.
 * It must react to delta being more/less than zero.
 */
function handle(delta) {
var d=delta*-10;
window.scrollBy(0,d);
}

/** Event handler for mouse wheel event.
 */
function wheel(event){
        var delta = 0;
        if (!event) /* For IE. */
                event = window.event;
        if (event.wheelDelta) { /* IE/Opera. */
                delta = event.wheelDelta/120;
                /** In Opera 9, delta differs in sign as compared to IE.
                 */
                if (window.opera)
                        delta = -delta;
        } else if (event.detail) { /** Mozilla case. */
                /** In Mozilla, sign of delta is different than in IE.
                 * Also, delta is multiple of 3.
                 */
                delta = -event.detail/3;
        }
        /** If delta is nonzero, handle it.
         * Basically, delta is now positive if wheel was scrolled up,
         * and negative, if wheel was scrolled down.
         */
        if (delta)
                handle(delta);
        /** Prevent default actions caused by mouse wheel.
         * That might be ugly, but we handle scrolls somehow
         * anyway, so don't bother here..
         */
        if (event.preventDefault)
                event.preventDefault();
	event.returnValue = false;
}

/** Initialization code. 
 * If you use your own event management code, change it as required.
 */
if (window.addEventListener)
        /** DOMMouseScroll is for mozilla. */
        window.addEventListener('DOMMouseScroll', wheel, false);
/** IE/Opera. */
window.onmousewheel = document.onmousewheel = wheel;
</script>
  <!-- end scroll bar -->      


<style>
    .restricted{width:1200px; height:750px; overflow: hidden;}
</style>
    </head>
    <body>  
       
         <div class="sh">
             
        <div id="head">
             <div class="nav_home nav"> 
                 <a class="aa" href="home.jsp" title="Online Shopping"  onMouseOver="this.style.cursor='hand';" >Home</a>
          </div>
            <div class="nav">
               <a href="index.jsp" title="Online Shopping"  onMouseOver="this.style.cursor='hand';" >picWATCH</a>
           </div>
            <div class="nav">
                <a href="BagsHome.jsp" title="Online Shopping"  onMouseOver="this.style.cursor='hand';" >picBAG</a>
             </div>
            <div class="nav">
                <a href="SunglassesHome.jsp" title="Online Shopping"  onMouseOver="this.style.cursor='hand';" >picSUNGLASS</a>
            </div>        
          </div>
    </div> 
<center>  
        <iframe class="restricted" frameborder="0"  scrolling="no" src="Testing2.jsp">dhillon</iframe> 
        
</center>      
        </body>
</html>




 