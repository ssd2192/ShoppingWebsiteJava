package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\timage1.src=\"img/s1.jpg\"\n");
      out.write("\tvar image2=new Image()\n");
      out.write("\timage2.src=\"img/s2.jpg\"\n");
      out.write("\tvar image3=new Image()\n");
      out.write("\timage3.src=\"img/s3.jpg\"\n");
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
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                width:1000px;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("                displa:inline;\n");
      out.write("            }\n");
      out.write("            #all1\n");
      out.write("            {\n");
      out.write("               margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                width:1000px; \n");
      out.write("            }\n");
      out.write("            .header\n");
      out.write("            {\n");
      out.write("              \n");
      out.write("              \n");
      out.write("                background-color: black;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            .nav \n");
      out.write("            {  background-color: #333;\n");
      out.write("              float: left;\n");
      out.write("               width:25%;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .nav a\n");
      out.write("            { text-decoration:none;\n");
      out.write("             color: white;\n");
      out.write("               font-family: Agency FB;\n");
      out.write("                font-size: 35px; \n");
      out.write("                display: block;\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 30px 40px 30px 40px;\n");
      out.write("                border: 1px #fff solid;\n");
      out.write("            }\n");
      out.write("            #head div:hover\n");
      out.write("            {background-color: cadetblue;\n");
      out.write("               \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"all1\">\n");
      out.write("            \n");
      out.write("           \n");
      out.write("\n");
      out.write("   \n");
      out.write("        <!-- NEVIGATION -->            \n");
      out.write("     \n");
      out.write("        <div id=\"head\">\n");
      out.write("             <div class=\"nav_home nav\"> \n");
      out.write("                <a href=\"home.jsp\" title=\"Online Shopping\"  onMouseOver=\"this.style.cursor='hand';\" >Home</a>\n");
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
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("          \n");
      out.write("        \n");
      out.write("        <!-- END NEVIGATION -->\n");
      out.write("       \n");
      out.write("        <!-- Search Bar -->\n");
      out.write("         <div>\n");
      out.write("       <!-- <form method=\"post\" action=\"action3\">\n");
      out.write("        <input type=\"text\" name=\"srch\" size=\"90\" style=\"height:25px; font-size:15pt\"/>\n");
      out.write("       \n");
      out.write("       <input type=\"submit\" value=\"Search\" style=\"width: 120px; height: 30px; font-weight:bolder\"/>\n");
      out.write("        </form>  -->\n");
      out.write("       <img src=\"img/s1.jpg\" name=\"slide\"  height=\"\" width=\"\">\n");
      out.write("\t<script>\n");
      out.write("\t<!--\n");
      out.write("\tvar step=1\n");
      out.write("\tfunction slideit(){\n");
      out.write("\n");
      out.write("\tif (!document.images)\n");
      out.write("\treturn\n");
      out.write("\tdocument.images.slide.src=eval(\"image\"+step+\".src\")\n");
      out.write("\tif (step<3)\n");
      out.write("\tstep++\n");
      out.write("\telse\n");
      out.write("\tstep=1\n");
      out.write("\tsetTimeout(\"slideit()\",5000)\n");
      out.write("\t}\n");
      out.write("\tslideit()\n");
      out.write("\t//-->\n");
      out.write("\t</script>\n");
      out.write("             <!-- END Search Bar -->\n");
      out.write("        <!-- start center -->\n");
      out.write("        <div>\n");
      out.write("            <table align=\"center\" border=\"0\" style=\"background-color: white\" width=\"100%\">\n");
      out.write("                <tr>\n");
      out.write("            <td align=\"left\" width=\"30%\" > \n");
      out.write("                <div> <img src=\"img/ybuy.JPG\"/></div> <br/>\n");
      out.write("                <div><img src=\"img/genuine.JPG\"/></div>\n");
      out.write("                    \n");
      out.write("            </td> \n");
      out.write("                    <td align=\"center\">\n");
      out.write("                        <a href=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\" title=\"Gents Watches\"><img src=\"img/gents.jpg\" height=\"200\" width=\"100%\"/></a>   \n");
      out.write("                    </td>\n");
      out.write("                     <td align=\"right\">\n");
      out.write("                     <a href=\"");
      if (_jspx_meth_s_url_1(_jspx_page_context))
        return;
      out.write("\" title=\"Ladies Watches\"><img src=\"img/ladies.jpg\" height=\"200\" width=\"100%\"/></a>   \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table border=\"0\" align=\"center\" style=\"background-color: white\" width=\"100%\">\n");
      out.write("              <tr>\n");
      out.write("                  <td align=\"left\" width=\"30%\">\n");
      out.write("                   <div> <img src=\"img/return.JPG\"/></div> <br/>\n");
      out.write("                   <div><img src=\"img/delivery.JPG\"/></div>\n");
      out.write("                      \n");
      out.write("                  </td>\n");
      out.write("                     <td align=\"center\">\n");
      out.write("                     <a href=\"");
      if (_jspx_meth_s_url_2(_jspx_page_context))
        return;
      out.write("\" title=\"NewLines\"><img src=\"img/newlines.jpg\" height=\"200\" width=\"80%\"/></a>   \n");
      out.write("                    </td>\n");
      out.write("                 </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>   \n");
      out.write("        <!-- end center -->                              \n");
      out.write("        <!-- Body images-->\n");
      out.write("        <div>\n");
      out.write("            <center>\n");
      out.write("                ----------------------------------------------------------------\n");
      out.write("                <img src=\"img/popular.JPG\"/>\n");
      out.write("                ----------------------------------------------------------------\n");
      out.write("            </center>\n");
      out.write("        <table style=\"background-color: whitesmoke\" border=\"0\" cellpadding=\"5\" width=\"100%\" bgcolor=\"1\">\n");
      out.write("         \n");
      out.write("        <tr>\n");
      out.write("            <td align=\"center\">  \n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_3(_jspx_page_context))
        return;
      out.write("\" title=\"Casio Watches\"><img src=\"img/casio.jpg\"/></a>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">\n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_4(_jspx_page_context))
        return;
      out.write("\" title=\"Fastrack Watches\"><img src=\"img/fastrack.jpg\"/></a>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  \n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_5(_jspx_page_context))
        return;
      out.write("\" title=\"Fossil Watches\"><img src=\"img/fossil.jpg\"/></a>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">\n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_6(_jspx_page_context))
        return;
      out.write("\" title=\"Tommy Hilfiger Watches\"><img src=\"img/hilfiger.jpg\"/></a>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  \n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_7(_jspx_page_context))
        return;
      out.write("\" title=\"Titan Watches\"><img src=\"img/titan.jpg\"/></a>\n");
      out.write("            </td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td align=\"center\">  \n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_8(_jspx_page_context))
        return;
      out.write("\" title=\"Burg Watches\"><img src=\"img/burg.jpg\"/></a>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">\n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_9(_jspx_page_context))
        return;
      out.write("\" title=\"Citizen Watches\"><img src=\"img/citizen.jpg\"/></a>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  \n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_10(_jspx_page_context))
        return;
      out.write("\" title=\"D&G Watches\"><img src=\"img/dg.jpg\"/></a>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">\n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_11(_jspx_page_context))
        return;
      out.write("\" title=\"Police Hilfiger Watches\"><img src=\"img/police.jpg\"/></a>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  \n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_12(_jspx_page_context))
        return;
      out.write("\" title=\"Q&Q Watches\"><img src=\"img/qq.jpg\"/></a>\n");
      out.write("            </td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        <!-- Body image end-->\n");
      out.write("    </td></tr></table>\n");
      out.write("            \n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("        </div>\n");
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
    _jspx_th_s_url_0.setAction("Gentsact");
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
    _jspx_th_s_url_1.setAction("Ladiesact");
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
    _jspx_th_s_url_2.setAction("NewLinesact");
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
    _jspx_th_s_url_3.setAction("casioact");
    int _jspx_eval_s_url_3 = _jspx_th_s_url_3.doStartTag();
    if (_jspx_th_s_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_3);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_3);
    return false;
  }

  private boolean _jspx_meth_s_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_4 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_4.setPageContext(_jspx_page_context);
    _jspx_th_s_url_4.setParent(null);
    _jspx_th_s_url_4.setAction("fastrackact");
    int _jspx_eval_s_url_4 = _jspx_th_s_url_4.doStartTag();
    if (_jspx_th_s_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_4);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_4);
    return false;
  }

  private boolean _jspx_meth_s_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_5 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_5.setPageContext(_jspx_page_context);
    _jspx_th_s_url_5.setParent(null);
    _jspx_th_s_url_5.setAction("fossilact");
    int _jspx_eval_s_url_5 = _jspx_th_s_url_5.doStartTag();
    if (_jspx_th_s_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_5);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_5);
    return false;
  }

  private boolean _jspx_meth_s_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_6 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_6.setPageContext(_jspx_page_context);
    _jspx_th_s_url_6.setParent(null);
    _jspx_th_s_url_6.setAction("thact");
    int _jspx_eval_s_url_6 = _jspx_th_s_url_6.doStartTag();
    if (_jspx_th_s_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_6);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_6);
    return false;
  }

  private boolean _jspx_meth_s_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_7 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_7.setPageContext(_jspx_page_context);
    _jspx_th_s_url_7.setParent(null);
    _jspx_th_s_url_7.setAction("titanact");
    int _jspx_eval_s_url_7 = _jspx_th_s_url_7.doStartTag();
    if (_jspx_th_s_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_7);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_7);
    return false;
  }

  private boolean _jspx_meth_s_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_8 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_8.setPageContext(_jspx_page_context);
    _jspx_th_s_url_8.setParent(null);
    _jspx_th_s_url_8.setAction("burgact");
    int _jspx_eval_s_url_8 = _jspx_th_s_url_8.doStartTag();
    if (_jspx_th_s_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_8);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_8);
    return false;
  }

  private boolean _jspx_meth_s_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_9 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_9.setPageContext(_jspx_page_context);
    _jspx_th_s_url_9.setParent(null);
    _jspx_th_s_url_9.setAction("citizenact");
    int _jspx_eval_s_url_9 = _jspx_th_s_url_9.doStartTag();
    if (_jspx_th_s_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_9);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_9);
    return false;
  }

  private boolean _jspx_meth_s_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_10 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_10.setPageContext(_jspx_page_context);
    _jspx_th_s_url_10.setParent(null);
    _jspx_th_s_url_10.setAction("dgact");
    int _jspx_eval_s_url_10 = _jspx_th_s_url_10.doStartTag();
    if (_jspx_th_s_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_10);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_10);
    return false;
  }

  private boolean _jspx_meth_s_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_11 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_11.setPageContext(_jspx_page_context);
    _jspx_th_s_url_11.setParent(null);
    _jspx_th_s_url_11.setAction("policeact");
    int _jspx_eval_s_url_11 = _jspx_th_s_url_11.doStartTag();
    if (_jspx_th_s_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_11);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_11);
    return false;
  }

  private boolean _jspx_meth_s_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_12 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_12.setPageContext(_jspx_page_context);
    _jspx_th_s_url_12.setParent(null);
    _jspx_th_s_url_12.setAction("qqact");
    int _jspx_eval_s_url_12 = _jspx_th_s_url_12.doStartTag();
    if (_jspx_th_s_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_12);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_12);
    return false;
  }
}
