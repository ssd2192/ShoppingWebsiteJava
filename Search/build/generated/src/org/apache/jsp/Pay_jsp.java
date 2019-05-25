package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Pay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_form = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_form.release();
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
      out.write("         <link rel=\"shortcut icon\" type=\"image\" href=\"img/d.jpg\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Prducts List</title>\n");
      out.write("        <!-- For slide-->\n");
      out.write("        \n");
      out.write("    <style type=\"text/css\">\n");
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
      out.write("    </div> \n");
      out.write("        \n");
      out.write("<table align=\"center\" width=\"100%\">\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\">\n");
      out.write("   \n");
      out.write("        <table border=\"0\" width=\"80%\"><tr><td> \n");
      out.write("       \n");
      out.write("       \n");
      out.write("        <div> <table style=\"background-color: #E8E8E8  \" bordercolor=\"silver\" align=\"center\" border=\"0\" width=\"100%\" style=\"background-color: whitesmoke\"> <tr> \n");
      out.write("    \n");
      out.write("\n");
      out.write("            <td style=\"background-color: white\" valign=\"top\"> \n");
      out.write("             <div align=\"center\" style=\"font-size: 17pt; font-family: Agency FB; background-color:#009933; color: white; height: 35px\">\n");
      out.write("                 Select Payment Mode\n");
      out.write("                 \n");
      out.write("            </div>\n");
      out.write("            <table align=\"center\" border=\"0\" style=\"background-color: white\" width=\"100%\">\n");
      out.write("                 \n");
      out.write("               <tr>\n");
      out.write("                   <td >\n");
      out.write("                    1) Cash On Delivery  \n");
      out.write("                       \n");
      out.write("                   </td>\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                   <td>2) Debit Card</td>\n");
      out.write("                   ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("               \n");
      out.write("                   \n");
      out.write("               </tr>\n");
      out.write("             \n");
      out.write("            </table>   \n");
      out.write("          \n");
      out.write("            </td>\n");
      out.write("            \n");
      out.write("        </tr> </table></div>\n");
      out.write("</td></tr></table>\n");
      out.write("           \n");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                       \n");
        out.write("                   ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form.reuse(_jspx_th_s_form_0);
    return false;
  }
}
