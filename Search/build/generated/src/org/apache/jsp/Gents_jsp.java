package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Gents_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_url_action_nobody.release();
    _jspx_tagPool_s_iterator_value.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Search Home</title>\n");
      out.write("        <!-- For slide-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- for clock-->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("/***********************************************\n");
      out.write("\n");
      out.write("* JavaScript Image Clock- by JavaScript Kit (www.javascriptkit.com)\n");
      out.write("* This notice must stay intact for usage\n");
      out.write("* Visit JavaScript Kit at http://www.javascriptkit.com/ for this script and 100s more\n");
      out.write("\n");
      out.write("***********************************************/\n");
      out.write("\n");
      out.write("var imageclock=new Object()\n");
      out.write("\t//Enter path to clock digit images here, in order of 0-9, then \"am/pm\", then colon image:\n");
      out.write("\timageclock.digits=[\"c0.gif\", \"c1.gif\", \"c2.gif\", \"c3.gif\", \"c4.gif\", \"c5.gif\", \"c6.gif\", \"c7.gif\", \"c8.gif\", \"c9.gif\", \"cam.gif\", \"cpm.gif\", \"colon.gif\"]\n");
      out.write("\timageclock.instances=0\n");
      out.write("\tvar preloadimages=[]\n");
      out.write("\tfor (var i=0; i<imageclock.digits.length; i++){ //preload images\n");
      out.write("\t\tpreloadimages[i]=new Image()\n");
      out.write("\t\tpreloadimages[i].src=imageclock.digits[i]\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\timageclock.imageHTML=function(timestring){ //return timestring (ie: 1:56:38) into string of images instead\n");
      out.write("\t\tvar sections=timestring.split(\":\")\n");
      out.write("\t\tif (sections[0]==\"0\") //If hour field is 0 (aka 12 AM)\n");
      out.write("\t\t\tsections[0]=\"12\"\n");
      out.write("\t\telse if (sections[0]>=13)\n");
      out.write("\t\t\tsections[0]=sections[0]-12+\"\"\n");
      out.write("\t\tfor (var i=0; i<sections.length; i++){\n");
      out.write("\t\t\tif (sections[i].length==1)\n");
      out.write("\t\t\t\tsections[i]='<img src=\"ci/'+imageclock.digits[0]+'\" />'+'<img src=\"ci/'+imageclock.digits[parseInt(sections[i])]+'\" />'\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t\tsections[i]='<img src=\"ci/'+imageclock.digits[parseInt(sections[i].charAt(0))]+'\" />'+'<img src=\"ci/'+imageclock.digits[parseInt(sections[i].charAt(1))]+'\" />'\n");
      out.write("\t\t}\n");
      out.write("\t\treturn sections[0]+'<img src=\"ci/'+imageclock.digits[12]+'\" />'+sections[1]+'<img src=\"ci/'+imageclock.digits[12]+'\" />'+sections[2]\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\timageclock.display=function(){\n");
      out.write("\t\tvar clockinstance=this\n");
      out.write("\t\tthis.spanid=\"clockspan\"+(imageclock.instances++)\n");
      out.write("\t\tdocument.write('<span id=\"'+this.spanid+'\"></span>')\n");
      out.write("\t\tthis.update()\n");
      out.write("\t\tsetInterval(function(){clockinstance.update()}, 1000)\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\timageclock.display.prototype.update=function(){\n");
      out.write("\t\tvar dateobj=new Date()\n");
      out.write("\t\tvar currenttime=dateobj.getHours()+\":\"+dateobj.getMinutes()+\":\"+dateobj.getSeconds() //create time string\n");
      out.write("\t\tvar currenttimeHTML=imageclock.imageHTML(currenttime)+'<img src=\"ci/'+((dateobj.getHours()>=12)? imageclock.digits[11] : imageclock.digits[10])+'\" />'\n");
      out.write("\t\tdocument.getElementById(this.spanid).innerHTML=currenttimeHTML\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<table align=\"center\" width=\"100%\">\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\">\n");
      out.write("        <table border=\"0\" width=\"80%\"><tr><td> \n");
      out.write("        <!-- NEVIGATION -->            \n");
      out.write("        <div>\n");
      out.write("            <center>\n");
      out.write("            <table cellpadding=\"-10\" width=\"100%\" border=\"0\"> <tr> \n");
      out.write("            <td style=\"background-color: white\" width=\"50%\">\n");
      out.write("            <font size=\"7\" face=\"Agency FB\" ><b>\n");
      out.write("                <a href=\"#\" title=\"Online Shopping\" style=\"text-decoration: none; color:darkslategray\" onMouseOver=\"this.style.cursor='hand';\" > &nbsp;picWATCH</a>\n");
      out.write("            </b></font>\n");
      out.write("            </td>\n");
      out.write("            <td style=\"background-image:url(img/nbg.jpg) \" align=\"center\" width=\"15%\"><script type=\"text/javascript\">new imageclock.display()</script></td>\n");
      out.write("            <td style=\"background-image: url(img/nbg.jpg)\" align=\"center\">\n");
      out.write("            <font size=\"5\" face=\"Agency FB\" >    \n");
      out.write("            <a href=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\" title=\"Categories\" style=\"text-decoration: none; color:white\">Categories</a>\n");
      out.write("            </font>\n");
      out.write("            </td>\n");
      out.write("            <td style=\"background-image: url(img/nbg.jpg)\" align=\"center\">\n");
      out.write("            <font size=\"5\" face=\"Agency FB\" >\n");
      out.write("            <a href=\"login.jsp\" title=\"Profile\" style=\"text-decoration: none; color:white\">Profile</a>\n");
      out.write("            </font>\n");
      out.write("            </td>\n");
      out.write("            <td style=\"background-image: url(img/nbg.jpg)\" align=\"center\">\n");
      out.write("            <font size=\"5\" face=\"Agency FB\" hover=\"\">\n");
      out.write("            <a href=\"#\" title=\"Help\" style=\"text-decoration: none; color:white\">Help</a> \n");
      out.write("            </font>\n");
      out.write("            </td>\n");
      out.write("            </tr></table>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <!-- END NEVIGATION -->\n");
      out.write("       \n");
      out.write("        <!-- Search Bar -->\n");
      out.write("         <div>\n");
      out.write("        <table border=\"0\" cellpadding=\"0\" width=\"100%\" bgcolor=\"\">\n");
      out.write("        <tr>\n");
      out.write("        <td align=\"center\">\n");
      out.write("       <!-- <form method=\"post\" action=\"action3\">\n");
      out.write("        <input type=\"text\" name=\"srch\" size=\"90\" style=\"height:25px; font-size:15pt\"/>\n");
      out.write("       \n");
      out.write("       <input type=\"submit\" value=\"Search\" style=\"width: 120px; height: 30px; font-weight:bolder\"/>\n");
      out.write("        </form>  -->\n");
      out.write("       \n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        <!-- END Search Bar -->\n");
      out.write("        <!-- start center -->\n");
      out.write("        <div>\n");
      out.write("            <table align=\"center\" border=\"1\" style=\"background-color: white\" width=\"100%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">PRODID</td>\n");
      out.write("                    <td align=\"center\">CATEGORYNAME</td>\n");
      out.write("                    <td align=\"center\">NAME</td>\n");
      out.write("                    <td align=\"center\">DESCRIPTION</td>\n");
      out.write("                    <td align=\"center\">PRICE</td>\n");
      out.write("                    <td align=\"center\">PRODUCTIMG</td>\n");
      out.write("                </tr> \n");
      out.write("                ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </div>   \n");
      out.write("        <!-- end center -->     \n");
      out.write("        <div>\n");
      out.write("            <img src=\"D:/Site Final/Search/build/web/uploads/nokia-lumia-920.jpg\"/>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </td></tr></table>\n");
      out.write("            \n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent(null);
    _jspx_th_s_url_0.setAction("cat");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("userlistlist");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write(" \n");
        out.write("               <tr>\n");
        out.write("                <td align=\"center\"> \n");
        out.write("                    ");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                </td> \n");
        out.write("                <td align=\"center\">\n");
        out.write("                    ");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                </td>\n");
        out.write("                <td align=\"center\">\n");
        out.write("                    ");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                </td>\n");
        out.write("                <td align=\"center\">\n");
        out.write("                    ");
        if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                </td>\n");
        out.write("                <td align=\"center\">\n");
        out.write("                    ");
        if (_jspx_meth_s_property_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                </td>\n");
        out.write("                <td align=\"center\">\n");
        out.write("                     \n");
        out.write("                </td>\n");
        out.write("               </tr>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_0.setValue("PRODID");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_1.setValue("CATEGORYNAME");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_2.setValue("NAME");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_3.setValue("DESCRIPTION");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_property_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_4.setValue("PRICE");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }
}
