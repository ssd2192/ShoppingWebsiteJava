package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_actionerror_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_name_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_value_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_password_name_cssStyle_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_actionerror_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_name_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_label_value_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_password_name_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_actionerror_nobody.release();
    _jspx_tagPool_s_form_method_action.release();
    _jspx_tagPool_s_url_action_nobody.release();
    _jspx_tagPool_s_submit_value_cssStyle_nobody.release();
    _jspx_tagPool_s_textfield_name_cssStyle_nobody.release();
    _jspx_tagPool_s_label_value_cssStyle_nobody.release();
    _jspx_tagPool_s_password_name_cssStyle_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  <table align=\"center\" width=\"100%\"><tr><td align=\"center\"> \n");
      out.write("              \n");
      out.write("        <table border=\"0\" width=\"90%\"><tr><td> \n");
      out.write("        <!-- NEVIGATION -->            \n");
      out.write("        <div>\n");
      out.write("            <center>\n");
      out.write("            <table cellpadding=\"-10\" width=\"100%\" border=\"0\"> <tr> \n");
      out.write("            <td style=\"background-color: white\" width=\"80%\">\n");
      out.write("            <font size=\"7\" face=\"Agency FB\" ><b>\n");
      out.write("                <a href=\"Adminhome.jsp\" title=\"Online Shopping\" style=\"text-decoration: none; color:darkslategray\" onMouseOver=\"this.style.cursor='hand';\"> picSHOP</a>\n");
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
      out.write("           <td align=\"center\">  <font face=\"Agency FB\" size=\"4\">\n");
      out.write("                <a href=\"AddProduct.jsp\" style=\"text-decoration: none; color: white\"><b>Add New Product</b></a>    </font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\" size=\"4\">\n");
      out.write("                <a href=\"ViewProductAdmin\" style=\"text-decoration: none; color: white\"><b>View Products List</b></a>   </font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\" size=\"4\">\n");
      out.write("                <a href=\"EditProduct.jsp\" style=\"text-decoration: none; color: white\"><b>Edit Product List</b></a>  </font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\" size=\"4\">\n");
      out.write("                <a href=\"DeleteProduct.jsp\" style=\"text-decoration: none; color: white\"><b>Delete Product</b></a>  </font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\"size=\"4\">\n");
      out.write("                <a href=\"#\" style=\"text-decoration: none; color: white\"><b>Change Password</b></a>   </font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\"size=\"4\">\n");
      out.write("                <a href=\"AddAdmin.jsp\" style=\"text-decoration: none; color: red\"><b>Add New Administrator</b></a>   </font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\">  <font face=\"Agency FB\"size=\"4\">\n");
      out.write("                <a href=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\" style=\"text-decoration: none; color: white\"><b>View Orders Placed</b></a>   </font>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("         ");
      if (_jspx_meth_s_actionerror_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div style=\"background-image: url(img/adminback.jpg);background-size: 100% 100%;background-repeat: no-repeat\"><center>\n");
      out.write("            ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </center>\n");
      out.write("            </div>    \n");
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
    _jspx_th_s_url_0.setAction("adminorderact");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_actionerror_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_actionerror_0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _jspx_tagPool_s_actionerror_nobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    _jspx_th_s_actionerror_0.setPageContext(_jspx_page_context);
    _jspx_th_s_actionerror_0.setParent(null);
    int _jspx_eval_s_actionerror_0 = _jspx_th_s_actionerror_0.doStartTag();
    if (_jspx_th_s_actionerror_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_actionerror_nobody.reuse(_jspx_th_s_actionerror_0);
      return true;
    }
    _jspx_tagPool_s_actionerror_nobody.reuse(_jspx_th_s_actionerror_0);
    return false;
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("addadmin");
    _jspx_th_s_form_0.setMethod("post");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_label_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_label_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_password_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_label_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_label_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_0 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_0.setPageContext(_jspx_page_context);
    _jspx_th_s_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_label_0.setValue("Username");
    _jspx_th_s_label_0.setCssStyle("font-size:15pt; color:black");
    int _jspx_eval_s_label_0 = _jspx_th_s_label_0.doStartTag();
    if (_jspx_th_s_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_cssStyle_nobody.reuse(_jspx_th_s_label_0);
      return true;
    }
    _jspx_tagPool_s_label_value_cssStyle_nobody.reuse(_jspx_th_s_label_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_0.setName("id");
    _jspx_th_s_textfield_0.setCssStyle("width:300pt; height:30pt; font-size:15pt");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_cssStyle_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_name_cssStyle_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_label_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_1 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_1.setPageContext(_jspx_page_context);
    _jspx_th_s_label_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_label_1.setValue("Password");
    _jspx_th_s_label_1.setCssStyle("font-size:15pt; color:black");
    int _jspx_eval_s_label_1 = _jspx_th_s_label_1.doStartTag();
    if (_jspx_th_s_label_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_cssStyle_nobody.reuse(_jspx_th_s_label_1);
      return true;
    }
    _jspx_tagPool_s_label_value_cssStyle_nobody.reuse(_jspx_th_s_label_1);
    return false;
  }

  private boolean _jspx_meth_s_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_0 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_name_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_0.setPageContext(_jspx_page_context);
    _jspx_th_s_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_password_0.setName("pas");
    _jspx_th_s_password_0.setCssStyle("width:400pt; height:30pt; font-size:15pt");
    int _jspx_eval_s_password_0 = _jspx_th_s_password_0.doStartTag();
    if (_jspx_th_s_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_name_cssStyle_nobody.reuse(_jspx_th_s_password_0);
      return true;
    }
    _jspx_tagPool_s_password_name_cssStyle_nobody.reuse(_jspx_th_s_password_0);
    return false;
  }

  private boolean _jspx_meth_s_label_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_2 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_2.setPageContext(_jspx_page_context);
    _jspx_th_s_label_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_label_2.setValue("Password Again");
    _jspx_th_s_label_2.setCssStyle("font-size:15pt; color:balck");
    int _jspx_eval_s_label_2 = _jspx_th_s_label_2.doStartTag();
    if (_jspx_th_s_label_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_cssStyle_nobody.reuse(_jspx_th_s_label_2);
      return true;
    }
    _jspx_tagPool_s_label_value_cssStyle_nobody.reuse(_jspx_th_s_label_2);
    return false;
  }

  private boolean _jspx_meth_s_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_1 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_name_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_1.setPageContext(_jspx_page_context);
    _jspx_th_s_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_password_1.setName("pas1");
    _jspx_th_s_password_1.setCssStyle("width:400pt; height:30pt; font-size:15pt");
    int _jspx_eval_s_password_1 = _jspx_th_s_password_1.doStartTag();
    if (_jspx_th_s_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_name_cssStyle_nobody.reuse(_jspx_th_s_password_1);
      return true;
    }
    _jspx_tagPool_s_password_name_cssStyle_nobody.reuse(_jspx_th_s_password_1);
    return false;
  }

  private boolean _jspx_meth_s_label_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_3 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_3.setPageContext(_jspx_page_context);
    _jspx_th_s_label_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_label_3.setValue("Email");
    _jspx_th_s_label_3.setCssStyle("font-size:15pt; color:balck");
    int _jspx_eval_s_label_3 = _jspx_th_s_label_3.doStartTag();
    if (_jspx_th_s_label_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_cssStyle_nobody.reuse(_jspx_th_s_label_3);
      return true;
    }
    _jspx_tagPool_s_label_value_cssStyle_nobody.reuse(_jspx_th_s_label_3);
    return false;
  }

  private boolean _jspx_meth_s_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_1.setName("email");
    _jspx_th_s_textfield_1.setCssStyle("width:400pt; height:30pt; font-size:15pt");
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_cssStyle_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_name_cssStyle_nobody.reuse(_jspx_th_s_textfield_1);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setValue("Register");
    _jspx_th_s_submit_0.setCssStyle("height:30pt; width:200pt; font-size:15pt");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_cssStyle_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_cssStyle_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }
}
