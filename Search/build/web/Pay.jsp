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
        
<table align="center" width="100%">
<tr>
<td align="center">
   
        <table border="0" width="80%"><tr><td> 
       
       
        <div> <table style="background-color: #E8E8E8  " bordercolor="silver" align="center" border="0" width="100%" style="background-color: whitesmoke"> <tr> 
    

            <td style="background-color: white" valign="top"> 
             <div align="center" style="font-size: 17pt; font-family: Agency FB; background-color:#009933; color: white; height: 35px">
                 Select Payment Mode
                 
            </div>
            <table align="center" border="0" style="background-color: white" width="100%">
                 
               <tr>
                   <td align="center" style="background-color: blue; font-size: 17pt; font-family: Agency FB; color: white;" width="50%">
                     Cash On Delivery  
                       
                   </td>
                   
               
                   <td align="center" style="background-color: blue; font-size: 17pt; font-family: Agency FB; color: white;">
                       Debit Card
                   </td>
               </tr>
               <tr>
                   <td valign="top">
                       <s:form action="CODact">
                           <s:label value="Re-enter Username" cssStyle="font-size:15pt; color:black"/>
                           <s:textfield name="uname" cssStyle="width:300pt; height:20pt; font-size:15pt"/>
                           <s:submit type="image" cssStyle="height:50pt" src="img/Pay.svg"></s:submit> 
                       </s:form>
                       <s:actionerror/>
                   </td>
                    <td valign="top">
                        
                       <s:form action="debitact">
                           <s:label value="Re-enter Username" cssStyle="font-size:15pt; color:black"/>
                           <s:textfield name="uname" cssStyle="width:300pt; height:20pt; font-size:15pt"/>
                           <s:label value="Enter card number" cssStyle="font-size:15pt; color:black"/>
                           <s:textfield name="cnumber" cssStyle="width:300pt; height:20pt; font-size:15pt"/>
                           <s:label value="Enter PIN" cssStyle="font-size:15pt; color:black"/>
                           <s:password name="pin" cssStyle="width:300pt; height:20pt; font-size:15pt"/>
                           <s:label value="Card Holder Name" cssStyle="font-size:15pt; color:black"/>
                           <s:textfield name="chn" cssStyle="width:300pt; height:20pt; font-size:15pt"/>
                           <s:submit type="image" cssStyle="height:50pt" src="img/Pay.svg"></s:submit> 
                       </s:form>
                       
                   </td>
                   
               
                   <td >
                       
                   </td>
               </tr>
             
            </table>   
          
            </td>
            
        </tr> </table></div>
</td></tr></table>
           
</td>
</tr>
</table>
    </body>
</html>