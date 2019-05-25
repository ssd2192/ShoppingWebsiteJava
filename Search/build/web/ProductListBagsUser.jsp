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
        <title>Search Home</title>
           
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
<table align="center" width="100%">
<tr>
<td align="center">
     <a id="top"></a>
        <table border="0" width="80%"><tr><td> 
        <!-- NEVIGATION -->            
 <!--       <div>
            <center>
            <table cellpadding="-10" width="100%" border="0"> <tr> 
            <td align="center" style="background-color: white" width="51%">
            <font size="7" face="Agency FB" ><b>
                <a href="BagsHome.jsp" title="Online Shopping" style="text-decoration: none; color:darkslategray" onMouseOver="this.style.cursor='hand';" > &nbsp;picBAG</a>
            </b></font>
            </td>
         </tr></table>
            <table cellpadding="-10" width="100%" border="0"> 
            <tr>
            <td align="center" style="background-color: black" width="33%">
            <font size="6" face="Agency FB" ><b>
                <a href="index.jsp" title="Online Shopping" style="text-decoration: none; color:white" onMouseOver="this.style.cursor='hand';" > &nbsp;picWATCH</a>
            </b></font>
            </td>    
            <td align="center" style="background-color: cadetblue" width="33%" >
            <font size="6" face="Agency FB" ><b>
                <a href="home.jsp" title="Online Shopping" style="text-decoration: none; color:white" onMouseOver="this.style.cursor='hand';" > &nbsp;picSHOP</a>
            </b></font>
            </td>
            <td align="center" style="background-color: black" width="33%">
            <font size="6" face="Agency FB" ><b>
                <a href="#" title="Online Shopping" style="text-decoration: none; color:white" onMouseOver="this.style.cursor='hand';" > &nbsp;picSUNGLASS</a>
            </b></font>
            </td>
            </tr>
            </table>     
            </center>
        </div>
 -->       
        <!-- END NEVIGATION -->
       
       <div> <table  align="center" width="100%"> <tr> 
            <td class="lnav"  width="20%" valign="top">
                <div class="PP">
                 <h2>PRODUCTS</h2> 
                </div>
                <div>
                    <a href="<s:url action="allbagact"/>" title="All products">All Products</a>
                </div>
                <div class="PP"><h3>Search By Type</h3></div>
                <div>
                    <a href="<s:url action="shoulderact"/>" title="Shoulder Bags">Shoulder Bags</a>
                </div>
                <div>
                    <a href="<s:url action="clutchesact"/>" title="Clutches">Clutches</a>
                </div>
                <div>
                    <a href="<s:url action="walletact"/>" title="Wallets">Wallets</a>
                </div>
                <div  class="PP" ><h3>Search By Gender</h3></div>
                <div>
                    <a href="<s:url action="malebagact"/>" title="Male Wallets">Male</a>
                </div>
                <div>
                    <a href="<s:url action="femalebagact"/>" title="Female Bags">Female</a>
                </div>
                <div class="PP" ><h3>Search By Brand</h3></div>
                <div>
                     <a href="<s:url action="pumaact"/>" title="Puma Bags" >Puma</a>
                </div>
                <div>
                      <a href="<s:url action="nikeact"/>" title="Nike Bags" >Nike</a>
                </div>
                <div>
                     <a href="<s:url action="capreseact"/>" title="Caprese Bags" >Caprese</a>
                </div>
                
                <div class="PP"><h3>Search By Price</h3></div>
                <div>
                    <a href="<s:url action="rate1bact"/>" >Upto 2000</a>
                </div>
                <div>
                    <a href="<s:url action="rate2bact"/>" >Above 2000</a>
                </div>
               
            </td>
           
            <td valign="top"> 
                
            <table class="product" align="center" border="0" width="100%">
                 <s:iterator value="userlistlist">
               <tr>
                <td align="center" width="30%" > 
                    <table class="ss"><tr><td>    
                    <img src="<s:property value="PRODUCTIMG"/>"/>
                    </td></tr></table>
                </td>
                <td >
                    
  <b> Product ID &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>  <s:property value="PRODID" /> <br/>
  <b> Brand &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : </b> <s:property value="BRANDNAME" /><br/>
  <b> Category&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : </b> <s:property value="CATEGORY" /> <br/>
  <b> Gender     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b> <s:property value="GENDER"/><br/>
  <b> Price &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : </b> <s:property value="PRICE" /><br/>
  <b> Description &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : </b> <s:property value="DESCRIPTION" /> <br/>
  <b> Type &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :</b><s:property value="TYPE"/><br/>       
                 
                </td> 
                <td>
                    <s:url id="buy" action="buyact">
                        <s:param name="PRODID"><s:property value="PRODID"/></s:param>
                    </s:url>
                    <s:a href="%{buy}"><img style="height:80px;width:140px"src="img/buy.png"/></s:a>
                </td>
               </tr>
            </s:iterator> 
            </table>   
            </td>
            
        </tr> </table></div>
</td></tr></table>
   <a href="#top">Go to top</a>           
</td>
</tr>
</table>
    </body>
</html>