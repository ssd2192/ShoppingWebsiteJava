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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Category</title>
        
         <!-- for clock-->
        <script type="text/javascript">

/***********************************************

* JavaScript Image Clock- by JavaScript Kit (www.javascriptkit.com)
* This notice must stay intact for usage
* Visit JavaScript Kit at http://www.javascriptkit.com/ for this script and 100s more

***********************************************/

var imageclock=new Object()
	//Enter path to clock digit images here, in order of 0-9, then "am/pm", then colon image:
	imageclock.digits=["c0.gif", "c1.gif", "c2.gif", "c3.gif", "c4.gif", "c5.gif", "c6.gif", "c7.gif", "c8.gif", "c9.gif", "cam.gif", "cpm.gif", "colon.gif"]
	imageclock.instances=0
	var preloadimages=[]
	for (var i=0; i<imageclock.digits.length; i++){ //preload images
		preloadimages[i]=new Image()
		preloadimages[i].src=imageclock.digits[i]
	}

	imageclock.imageHTML=function(timestring){ //return timestring (ie: 1:56:38) into string of images instead
		var sections=timestring.split(":")
		if (sections[0]=="0") //If hour field is 0 (aka 12 AM)
			sections[0]="12"
		else if (sections[0]>=13)
			sections[0]=sections[0]-12+""
		for (var i=0; i<sections.length; i++){
			if (sections[i].length==1)
				sections[i]='<img src="ci/'+imageclock.digits[0]+'" />'+'<img src="ci/'+imageclock.digits[parseInt(sections[i])]+'" />'
			else
				sections[i]='<img src="ci/'+imageclock.digits[parseInt(sections[i].charAt(0))]+'" />'+'<img src="ci/'+imageclock.digits[parseInt(sections[i].charAt(1))]+'" />'
		}
		return sections[0]+'<img src="ci/'+imageclock.digits[12]+'" />'+sections[1]+'<img src="ci/'+imageclock.digits[12]+'" />'+sections[2]
	}

	imageclock.display=function(){
		var clockinstance=this
		this.spanid="clockspan"+(imageclock.instances++)
		document.write('<span id="'+this.spanid+'"></span>')
		this.update()
		setInterval(function(){clockinstance.update()}, 1000)
	}

	imageclock.display.prototype.update=function(){
		var dateobj=new Date()
		var currenttime=dateobj.getHours()+":"+dateobj.getMinutes()+":"+dateobj.getSeconds() //create time string
		var currenttimeHTML=imageclock.imageHTML(currenttime)+'<img src="ci/'+((dateobj.getHours()>=12)? imageclock.digits[11] : imageclock.digits[10])+'" />'
		document.getElementById(this.spanid).innerHTML=currenttimeHTML

	}


</script>
    </head>
    <body>
 <table align="center" width="100%">
<tr>
<td align="center">       
        <table border="1" width="80%"><tr><td> 
        <!-- NEVIGATION -->            
        <div>
            <center>
            <table cellpadding="-10" width="100%" border="0"><tr> 
            <td style="background-color: white" width="50%">
            <font size="7" face="Agency FB" ><b>
                <a href="index.jsp" title="Home" style="text-decoration: none; color:darkslategray" onMouseOver="this.style.cursor='hand';" > &nbsp;picWATCH</a>
            </b></font>
            </td>
            <td style="background-image:url(img/nbg.jpg) " align="center" width="15%"><script type="text/javascript">new imageclock.display()</script></td>
            <td style="background-image: url(img/nbg.jpg)" align="center">
            <font size="5" face="Agency FB" >    
            <a href="<s:url action="cat"/>" title="Categories" style="text-decoration: none; color:white">Categories</a>
            </font>
            </td>
            <td style="background-image: url(img/nbg.jpg)" align="center">
            <font size="5" face="Agency FB" >
            <a href="login.jsp" title="Profile" style="text-decoration: none; color:white">Profile</a>
            </font>
            </td>
            <td style="background-image: url(img/nbg.jpg)" align="center">
            <font size="5" face="Agency FB" hover="">
            <a href="#" title="Help" style="text-decoration: none; color:white">Help</a> 
            </font>
            </td>
            </tr></table>
            </center>
        </div>
        <!-- END NEVIGATION -->
        
        <!-- Search Bar -->
    <!--    <div>
        <table border="1" cellpadding="5" width="100%" bgcolor="F4B499">
        <tr>
        <td>
        <form method="post" action="action3">
        <input type="text" name="srch" size="90" style="height:25px; font-size:15pt"/>
        <input type="submit" value="Search" style="width: 120px; height: 30px; font-weight:bolder"/>
        </form>
        </td>
        </tr>
        </table>
        </div>  -->
        <!-- END Search Bar -->
        <div>
        <table align="center" border="1" width="100%"><tr>
        <s:iterator value="userlistlist">
        <td width="299" align="center">
        <s:if test="CATEGORYNAME=='Male'">
        <a href="<s:url action="accessoriesact"/>">
        <s:property value="CATEGORYNAME"/>
        </a>   
        </s:if>
        <s:elseif test="CATEGORYNAME=='Female'">
        <s:a href="Adminhome.jsp">
        <s:property value="CATEGORYNAME"/>
        </s:a>
        </s:elseif>
        <s:elseif test="CATEGORYNAME=='Special'">
        <s:a href="Adminhome.jsp">
        <s:property value="CATEGORYNAME"/>
        </s:a>  
        </s:elseif>
        <s:elseif test="CATEGORYNAME=='SHOES'">
        <s:a href="Adminhome.jsp">
        <s:property value="CATEGORYNAME"/>
        </s:a>  
        </s:elseif> 
        </td>
        </s:iterator>
        </tr> </table>
        </div>
    </td></tr></table>
            
</td>
</tr>
</table>          
    </body>
</html>