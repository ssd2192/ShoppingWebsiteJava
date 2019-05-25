package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewProductAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("           \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table align=\"center\" width=\"100%\"><tr><td align=\"center\">    \n");
      out.write("        \n");
      out.write("        <table border=\"0\" width=\"90%\"><tr><td> \n");
      out.write("        <!-- NEVIGATION -->            \n");
      out.write("        <div>\n");
      out.write("            <center>\n");
      out.write("            <table cellpadding=\"-10\" width=\"100%\" border=\"0\"> <tr> \n");
      out.write("            <td style=\"background-color: white\" width=\"80%\">\n");
      out.write("            <font size=\"7\" face=\"Agency FB\" ><b>\n");
      out.write("            <a href=\"#\" title=\"Online Shopping\" style=\"text-decoration: none; color:darkslategray\" onMouseOver=\"this.style.cursor='hand';\"> picWATCH</a>\n");
      out.write("            </b></font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"right\"> \n");
      out.write("            <font size=\"5\" face=\"Agency FB\">\n");
      out.write("          \n");
      out.write("               <a href=\"AdminLogin.jsp\" title=\"Logout\" style=\"text-decoration: none; color: black\">logout</a>\n");
      out.write("            </font>\n");
      out.write("            </td>\n");
      out.write("            </tr></table>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"background-color: cadetblue\">\n");
      out.write("        <center><font size=\"6.5\" face=\"Agency FB\"><img height=\"30\" src=\"img/admin.png\"/>ADMINISTRATOR<img height=\"30\" src=\"img/admin.png\"/></font></center>        \n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <div>\n");
      out.write("        <table border=\"0\" cellpadding=\"5\" width=\"100%\" bgcolor=\"black\">\n");
      out.write("        <tr>\n");
      out.write(" <!--            \n");
      out.write("            <td> <font face=\"Agency FB\" size=\"4\">\n");
      out.write("                <a href=\"AddCategory.jsp\" style=\"text-decoration: none; color: white\"><b>Add New Category</b></a>   </font>\n");
      out.write("            </td>\n");
      out.write("            <td>  <font face=\"Agency FB\" size=\"4\">\n");
      out.write("            <a href=\" ");
      out.write("\" style=\"text-decoration: none; color: white\"><b>View Category List</b></a>  </font>\n");
      out.write("            </td>\n");
      out.write("            <td>  <font face=\"Agency FB\" size=\"4\">\n");
      out.write("            <a href=\"EditCategory.jsp\" style=\"text-decoration: none; color: white\"><b>Edit Category List</b></a>        </font>\n");
      out.write("            </td>\n");
      out.write("   -->          \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\" size=\"4\">\n");
      out.write("                <a href=\"AddProduct.jsp\" style=\"text-decoration: none; color: white\"><b>Add New Product</b></a>    </font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\" size=\"4\">\n");
      out.write("                <a href=\"#\" style=\"text-decoration: none; color: red\"><b>View Products List</b></a>   </font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\" size=\"4\">\n");
      out.write("                <a href=\"#\" style=\"text-decoration: none; color: white\"><b>Edit Product</b></a>  </font>\n");
      out.write("            </td>\n");
      out.write("             <td align=\"center\">  <font face=\"Agency FB\" size=\"4\">\n");
      out.write("                <a href=\"#\" style=\"text-decoration: none; color: white\"><b>Delete Product</b></a>  </font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\"size=\"4\">\n");
      out.write("                <a href=\"#\" style=\"text-decoration: none; color: white\"><b>Change Password</b></a>   </font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\"size=\"4\">\n");
      out.write("                <a href=\"AddAdmin.jsp\" style=\"text-decoration: none; color: white\"><b>Add New Administrator</b></a>   </font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\"size=\"4\">\n");
      out.write("                <a href=\"AddAdmin.jsp\" style=\"text-decoration: none; color: white\"><b>Edit/Delete Privacy Policy</b></a>   </font>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write(" <div style=\"background-image: url(img/adminback.jpg);background-size: 100% 100%;background-repeat: no-repeat\"><center>\n");
      out.write("      <br/><br/><br/><br/><br/><b><font color=\"white\"face=\"Agency FB\" size=\"6\">\n");
      out.write("          <u>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; VIEW &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</u><br/>    \n");
      out.write("      <a href=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\" title=\"Bags\"style=\"text-decoration: none; color: white;\">Bags</a><br/> \n");
      out.write("      <a href=\"");
      if (_jspx_meth_s_url_1(_jspx_page_context))
        return;
      out.write("\" title=\"Watches\"style=\"text-decoration: none; color: white\">Watches</a><br/> \n");
      out.write("      <a href=\"");
      if (_jspx_meth_s_url_2(_jspx_page_context))
        return;
      out.write("\" title=\"Sunglasses\"style=\"text-decoration: none; color: white\">Sunglasses</a>\n");
      out.write("      <br/><br/><br/><br/><br/><br/> </font></b>\n");
      out.write("  </div>    \n");
      out.write("        <!-- END NEVIGATION -->\n");
      out.write("    </td></tr></table>\n");
      out.write("</td></tr></table></body>\n");
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
    _jspx_th_s_url_0.setAction("BagsAdminAct");
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
    _jspx_th_s_url_1.setAction("WatchAdminAct");
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
    _jspx_th_s_url_2.setAction("SunglassAdminAct");
    int _jspx_eval_s_url_2 = _jspx_th_s_url_2.doStartTag();
    if (_jspx_th_s_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_2);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_2);
    return false;
  }
}
