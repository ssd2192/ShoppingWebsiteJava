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
        <title>picWATCH</title>
        <!-- For slide-->
        <script type="text/javascript">
	<!--
	var image1=new Image()
	image1.src="img/glasslide1.jpg"
	var image2=new Image()
	image2.src="img/glasslide2.jpg"
	//-->
	</script>
        
        <style type="text/css">
            body{
                
                
                
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
            
        </style>
    </head>
    <body>
        <!-- NEVIGATION -->            
        <div class="sh">
        <div id="head">
             <div class="nav_home nav"> 
                 <a class="aa" href="home.jsp" title="Online Shopping" style="text-decoration: none" onMouseOver="this.style.cursor='hand';" >Home</a>
          </div>
            <div class="nav">
               <a href="index.jsp" title="Online Shopping" style="text-decoration: none" onMouseOver="this.style.cursor='hand';" >picWATCH</a>
           </div>
            <div class="nav">
                <a href="BagsHome.jsp" title="Online Shopping" style="text-decoration: none" onMouseOver="this.style.cursor='hand';" >picBAG</a>
             </div>
            <div class="nav">
                <a href="SunglassesHome.jsp" title="Online Shopping" style="text-decoration: none" onMouseOver="this.style.cursor='hand';" >picSUNGLASS</a>
            </div>        
          </div>
        </div>
                                            <br/>
        <!-- END NEVIGATION -->
       
        <!-- 
        <div class="sh1"> <div class="re"><div class="pp"></div></div>Search Bar -->
        <div class="pic"> <!-- <form method="post" action="action3">
        <input type="text" name="srch" size="90" style="height:25px; font-size:15pt"/>
       
       <input type="submit" value="Search" style="width: 120px; height: 30px; font-weight:bolder"/>
        </form>  -->
            <img src="img/glasslide1.jpg" name="slide"  height="" width="">
	<script>
	<!--
	var step=1
	function slideit(){

	if (!document.images)
	return
	document.images.slide.src=eval("image"+step+".src")
	if (step<2)
	step++
	else
	step=1
	setTimeout("slideit()",5000)
	}
	slideit()
	//-->
            </script></div></div>
             <!-- END Search Bar -->
        <!-- start center -->
          <!-- left -->
        <div id="all1">
            <div id="left">
                <br/><br/>
            <div> <img src="img/ybuy.JPG"/></div> <br/>
                <div><img src="img/genuine.JPG"/></div> <br/>
                     <div> <img src="img/return.JPG"/></div> <br/>
                   <div><img src="img/delivery.JPG"/></div> 
                                       


        </div>  
        <!-- end left --> <br/><br/>
        <!-- right -->
        <div id ="right">
            <div class="rimg">
                <a href="<s:url action="aviatorsact"/>" title="Aviators"><img src="img/glas1.jpg" height="200" width="100%"/></a>   
            </div >
            <div class="limg">
                <a href="<s:url action="rimlessact"/>" title="Rimless"><img src="img/glas2.jpg" height="200" width="100%"/></a>   
            </div>
            <div class="rimg">
                <a href="<s:url action="allproglassact"/>" title="All Products"><img src="img/allpro.jpg" height="200" width="100%"/></a>   
            </div >
            <div class="limg">
                <a href="<s:url action="raybanact"/>" title="Ray-Ban"><img src="img/glas3.jpg" height="200" width="100%"/></a>   
            </div>
                   
          </div>
                     <!-- end right -->
        
          </div>
        <!-- end center -->                              
        <!-- Body images--> 
 <!--        <div class="footer">
            <div class="sh">
        <div id="head">
             <div class="nav_home nav"> 
                 <a class="aa" href="home.jsp" title="Online Shopping"  onMouseOver="this.style.cursor='hand';" >Home</a>
          </div>
            <div class="nav">
               <a href="index.jsp" title="Online Shopping"  onMouseOver="this.style.cursor='hand';" >picWATCH</a>
           </div>
            <div class="nav">
                <a href="BagsHome.jsp" title="Online Shopping" onMouseOver="this.style.cursor='hand';" >picBAG</a>
             </div>
            <div class="nav">
                <a href="SunglassesHome.jsp" title="Online Shopping" onMouseOver="this.style.cursor='hand';" >picSUNGLASS</a>
            </div>        
          </div>
        </div>
          <div class="foter_resize">
   <%--              <a href="<s:url action="casioact"/>" title="Casio Watches"><img src="img/casio.jpg"/></a>  
                <a href="<s:url action="casioact"/>" title="Casio Watches"><img src="img/casio.jpg"/></a>  
                <a href="<s:url action="fossilact"/>" title="Fossil Watches"><img src="img/fossil.jpg"/></a>
                <a href="<s:url action="thact"/>" title="Tommy Hilfiger Watches"><img src="img/hilfiger.jpg"/></a>
                <a href="<s:url action="titanact"/>" title="Titan Watches"><img src="img/titan.jpg"/></a>
                <a href="<s:url action="burgact"/>" title="Burg Watches"><img src="img/burg.jpg"/></a>
                <a href="<s:url action="citizenact"/>" title="Citizen Watches"><img src="img/citizen.jpg"/></a>
                <a href="<s:url action="dgact"/>" title="D&G Watches"><img src="img/dg.jpg"/></a>
                <a href="<s:url action="policeact"/>" title="Police Hilfiger Watches"><img src="img/police.jpg"/></a>
                <a href="<s:url action="qqact"/>" title="Q&Q Watches"><img src="img/qq.jpg"/></a>
  --%>         
              <div class="zx"><img class="zxx" src="img/popular.JPG"/></div>  
           
       
                
            </div> 
                
        </div>  -->
        <!-- Body image end-->
        
    </td></tr></table>
            
</td>
</tr>
</table>
      
    </body>
</html>