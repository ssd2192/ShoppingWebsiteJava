package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SunglassesHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_action_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_url_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_url_action_nobody.release();
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
      out.write("        <title>picWATCH</title>\n");
      out.write("        <!-- For slide-->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\t<!--\n");
      out.write("\tvar image1=new Image()\n");
      out.write("\timage1.src=\"img/glasslide1.jpg\"\n");
      out.write("\tvar image2=new Image()\n");
      out.write("\timage2.src=\"img/glasslide2.jpg\"\n");
      out.write("\t//-->\n");
      out.write("\t</script>\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #head{\n");
      out.write("                       <!-- box-shadow:#ccc 5px 5px 5px; -->            \n");
      out.write(" \n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                width:1000px;                \n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #all1,.sh,#head\n");
      out.write("            {\n");
      out.write("                max-width: 100%;\n");
      out.write("                 width: 1000px;\n");
      out.write("               margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            .nav \n");
      out.write("            { \n");
      out.write("                background-color: #333;\n");
      out.write("              float: left;\n");
      out.write("               width:25%;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            .nav a\n");
      out.write("            { \n");
      out.write("                border-left: 1px solid #fff;\n");
      out.write("             color: white;\n");
      out.write("               font-family: Agency FB;\n");
      out.write("                font-size: 200%; \n");
      out.write("                display: block;\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 15px 40px 16px 40px;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            .aa:link{  border-left: 0px solid #333;}\n");
      out.write("            \n");
      out.write("            #head div:hover\n");
      out.write("            { background-color:  dimgray;\n");
      out.write("              \n");
      out.write("               \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .sh1{\n");
      out.write("               padding-top: 10px;\n");
      out.write("               padding-bottom:10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                width: 100%;\n");
      out.write("                 \n");
      out.write("                background-color:#EEEEEE;\n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("            .sh{\n");
      out.write("                position:relative;\n");
      out.write("                padding:0px 100% 0px 0px;\n");
      out.write("                width: 100%;\n");
      out.write("                height:72px;\n");
      out.write("                background-color:#333;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            .pic{\n");
      out.write("                width: 1000px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("            }\n");
      out.write("            .pic img\n");
      out.write("            {z-index:0;\n");
      out.write("             position:relative;\n");
      out.write("                width:100%;\n");
      out.write("                 box-shadow: #333 0 0 80px 2px;\n");
      out.write("            }\n");
      out.write("            #left\n");
      out.write("            {\n");
      out.write("              \n");
      out.write("                float:left;\n");
      out.write("                width: 300px;\n");
      out.write("            }\n");
      out.write("            #right\n");
      out.write("            {   margin-left: 310px;            \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #right div{\n");
      out.write("                \n");
      out.write("               float: left; \n");
      out.write("               margin:  10px 15px 10px 15px;\n");
      out.write("            }\n");
      out.write("             #right div:hover{ transform: scale(1.1,1.1);\n");
      out.write("                              \n");
      out.write("                 -ms-transform: scale(1.1,1.1); /* IE 9 */\n");
      out.write("                 -webkit-transform: scale(1.1,1.1); /* Safari and Chrome */\n");
      out.write("            }\n");
      out.write("            #right div img{\n");
      out.write("             border:2px solid #fff;\n");
      out.write("             border-radius:12px;\n");
      out.write("            }\n");
      out.write("            #right div img:hover\n");
      out.write("            {\n");
      out.write("                 box-shadow: #333 0 0 20px 2px;\n");
      out.write("            }\n");
      out.write("            .limg{\n");
      out.write("                \n");
      out.write("                width:310px;\n");
      out.write("            }\n");
      out.write("            limg:hover{\n");
      out.write(" \n");
      out.write("              \n");
      out.write("            }\n");
      out.write("             .rimg{\n");
      out.write("                \n");
      out.write("                width:310px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .bimg\n");
      out.write("            {\n");
      out.write("               padding-left: 90px;\n");
      out.write("                float:left;\n");
      out.write("                width: 600px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            /* -------------------Foter-----------*/\n");
      out.write("            \n");
      out.write("            .footer\n");
      out.write("            { margin-top: 600px;\n");
      out.write("                width:100%;\n");
      out.write("             box-shadow: #EEEEEE 0 0 4px 5px;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .foter_resize{\n");
      out.write("                \n");
      out.write("                width:1000px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .foter_resize img{\n");
      out.write("                margin: 5px 0px 0px 0px;\n");
      out.write("                width: 190px;\n");
      out.write("            }\n");
      out.write("            .zx\n");
      out.write("            {\n");
      out.write("                position:relative;\n");
      out.write("                width:0px;\n");
      out.write("                height:0px;\n");
      out.write("                \n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            .zxx\n");
      out.write("            {\n");
      out.write("                position:absolute;\n");
      out.write("                left:10px;\n");
      out.write("                top:-348px;\n");
      out.write("                height: 50px;\n");
      out.write("                margin-left: auto;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .re{ \n");
      out.write("                position:relative;\n");
      out.write("                 width:100%;\n");
      out.write("                height:0px;\n");
      out.write("                top:-10px;\n");
      out.write("            }\n");
      out.write("            .pp{\n");
      out.write("                z-index:0;\n");
      out.write("                padding: 0% 100% 0% 0%;\n");
      out.write("                position:absolute;\n");
      out.write("                width:100%;\n");
      out.write("                height:100px;\n");
      out.write("               \n");
      out.write("                background-color:#333;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- NEVIGATION -->            \n");
      out.write("        <div class=\"sh\">\n");
      out.write("        <div id=\"head\">\n");
      out.write("             <div class=\"nav_home nav\"> \n");
      out.write("                 <a class=\"aa\" href=\"home.jsp\" title=\"Online Shopping\" style=\"text-decoration: none\" onMouseOver=\"this.style.cursor='hand';\" >Home</a>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"nav\">\n");
      out.write("               <a href=\"index.jsp\" title=\"Online Shopping\" style=\"text-decoration: none\" onMouseOver=\"this.style.cursor='hand';\" >picWATCH</a>\n");
      out.write("           </div>\n");
      out.write("            <div class=\"nav\">\n");
      out.write("                <a href=\"BagsHome.jsp\" title=\"Online Shopping\" style=\"text-decoration: none\" onMouseOver=\"this.style.cursor='hand';\" >picBAG</a>\n");
      out.write("             </div>\n");
      out.write("            <div class=\"nav\">\n");
      out.write("                <a href=\"SunglassesHome.jsp\" title=\"Online Shopping\" style=\"text-decoration: none\" onMouseOver=\"this.style.cursor='hand';\" >picSUNGLASS</a>\n");
      out.write("            </div>        \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("                                            <br/>\n");
      out.write("        <!-- END NEVIGATION -->\n");
      out.write("       \n");
      out.write("        <!-- \n");
      out.write("        <div class=\"sh1\"> <div class=\"re\"><div class=\"pp\"></div></div>Search Bar -->\n");
      out.write("        <div class=\"pic\"> <!-- <form method=\"post\" action=\"action3\">\n");
      out.write("        <input type=\"text\" name=\"srch\" size=\"90\" style=\"height:25px; font-size:15pt\"/>\n");
      out.write("       \n");
      out.write("       <input type=\"submit\" value=\"Search\" style=\"width: 120px; height: 30px; font-weight:bolder\"/>\n");
      out.write("        </form>  -->\n");
      out.write("            <img src=\"img/glasslide1.jpg\" name=\"slide\"  height=\"\" width=\"\">\n");
      out.write("\t<script>\n");
      out.write("\t<!--\n");
      out.write("\tvar step=1\n");
      out.write("\tfunction slideit(){\n");
      out.write("\n");
      out.write("\tif (!document.images)\n");
      out.write("\treturn\n");
      out.write("\tdocument.images.slide.src=eval(\"image\"+step+\".src\")\n");
      out.write("\tif (step<2)\n");
      out.write("\tstep++\n");
      out.write("\telse\n");
      out.write("\tstep=1\n");
      out.write("\tsetTimeout(\"slideit()\",5000)\n");
      out.write("\t}\n");
      out.write("\tslideit()\n");
      out.write("\t//-->\n");
      out.write("            </script></div></div>\n");
      out.write("             <!-- END Search Bar -->\n");
      out.write("        <!-- start center -->\n");
      out.write("          <!-- left -->\n");
      out.write("        <div id=\"all1\">\n");
      out.write("            <div id=\"left\">\n");
      out.write("                <br/><br/>\n");
      out.write("            <div> <img src=\"img/ybuy.JPG\"/></div> <br/>\n");
      out.write("                <div><img src=\"img/genuine.JPG\"/></div> <br/>\n");
      out.write("                     <div> <img src=\"img/return.JPG\"/></div> <br/>\n");
      out.write("                   <div><img src=\"img/delivery.JPG\"/></div> \n");
      out.write("                                       \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>  \n");
      out.write("        <!-- end left --> <br/><br/>\n");
      out.write("        <!-- right -->\n");
      out.write("        <div id =\"right\">\n");
      out.write("            <div class=\"rimg\">\n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\" title=\"Aviators\"><img src=\"img/glas1.jpg\" height=\"200\" width=\"100%\"/></a>   \n");
      out.write("            </div >\n");
      out.write("            <div class=\"limg\">\n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_1(_jspx_page_context))
        return;
      out.write("\" title=\"Rimless\"><img src=\"img/glas2.jpg\" height=\"200\" width=\"100%\"/></a>   \n");
      out.write("            </div>\n");
      out.write("            <div class=\"rimg\">\n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_2(_jspx_page_context))
        return;
      out.write("\" title=\"All Products\"><img src=\"img/allpro.jpg\" height=\"200\" width=\"100%\"/></a>   \n");
      out.write("            </div >\n");
      out.write("            <div class=\"limg\">\n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_3(_jspx_page_context))
        return;
      out.write("\" title=\"Ray-Ban\"><img src=\"img/glas3.jpg\" height=\"200\" width=\"100%\"/></a>   \n");
      out.write("            </div>\n");
      out.write("                   \n");
      out.write("          </div>\n");
      out.write("                     <!-- end right -->\n");
      out.write("        \n");
      out.write("          </div>\n");
      out.write("        <!-- end center -->                              \n");
      out.write("        <!-- Body images--> \n");
      out.write(" <!--        <div class=\"footer\">\n");
      out.write("            <div class=\"sh\">\n");
      out.write("        <div id=\"head\">\n");
      out.write("             <div class=\"nav_home nav\"> \n");
      out.write("                 <a class=\"aa\" href=\"home.jsp\" title=\"Online Shopping\"  onMouseOver=\"this.style.cursor='hand';\" >Home</a>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"nav\">\n");
      out.write("               <a href=\"index.jsp\" title=\"Online Shopping\"  onMouseOver=\"this.style.cursor='hand';\" >picWATCH</a>\n");
      out.write("           </div>\n");
      out.write("            <div class=\"nav\">\n");
      out.write("                <a href=\"BagsHome.jsp\" title=\"Online Shopping\" onMouseOver=\"this.style.cursor='hand';\" >picBAG</a>\n");
      out.write("             </div>\n");
      out.write("            <div class=\"nav\">\n");
      out.write("                <a href=\"SunglassesHome.jsp\" title=\"Online Shopping\" onMouseOver=\"this.style.cursor='hand';\" >picSUNGLASS</a>\n");
      out.write("            </div>        \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"foter_resize\">\n");
      out.write("   ");
      out.write("         \n");
      out.write("              <div class=\"zx\"><img class=\"zxx\" src=\"img/popular.JPG\"/></div>  \n");
      out.write("           \n");
      out.write("       \n");
      out.write("                \n");
      out.write("            </div> \n");
      out.write("                \n");
      out.write("        </div>  -->\n");
      out.write("        <!-- Body image end-->\n");
      out.write("        \n");
      out.write("    </td></tr></table>\n");
      out.write("            \n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("      \n");
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
    _jspx_th_s_url_0.setAction("aviatorsact");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_1 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_1.setPageContext(_jspx_page_context);
    _jspx_th_s_url_1.setParent(null);
    _jspx_th_s_url_1.setAction("rimlessact");
    int _jspx_eval_s_url_1 = _jspx_th_s_url_1.doStartTag();
    if (_jspx_th_s_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_1);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_1);
    return false;
  }

  private boolean _jspx_meth_s_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_2 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_2.setPageContext(_jspx_page_context);
    _jspx_th_s_url_2.setParent(null);
    _jspx_th_s_url_2.setAction("allproglassact");
    int _jspx_eval_s_url_2 = _jspx_th_s_url_2.doStartTag();
    if (_jspx_th_s_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_2);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_2);
    return false;
  }

  private boolean _jspx_meth_s_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_3 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_3.setPageContext(_jspx_page_context);
    _jspx_th_s_url_3.setParent(null);
    _jspx_th_s_url_3.setAction("raybanact");
    int _jspx_eval_s_url_3 = _jspx_th_s_url_3.doStartTag();
    if (_jspx_th_s_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_3);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_3);
    return false;
  }
}
