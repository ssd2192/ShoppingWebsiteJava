package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_actionerror_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_name_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_value_cssStyle_nobody;

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
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_actionerror_nobody.release();
    _jspx_tagPool_s_form_method_action.release();
    _jspx_tagPool_s_url_action_nobody.release();
    _jspx_tagPool_s_submit_value_cssStyle_nobody.release();
    _jspx_tagPool_s_textfield_name_cssStyle_nobody.release();
    _jspx_tagPool_s_label_value_cssStyle_nobody.release();
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
      out.write("        <title>Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"1\" width=\"100%\"><tr><td> \n");
      out.write("        <!-- NEVIGATION -->            \n");
      out.write("        <div>\n");
      out.write("            <center>\n");
      out.write("            <table cellpadding=\"-10\" width=\"100%\" border=\"1\"> <tr> \n");
      out.write("            <td bgcolor=\"006699\" width=\"70%\">\n");
      out.write("            <font size=\"7\" face=\"Bradley Hand ITC\" ><b>\n");
      out.write("            <a href=\"index.jsp\" title=\"Online Shopping\" style=\"text-decoration: none; color: white\" onMouseOver=\"this.style.backgroundColor='009999';  this.style.cursor='hand';\" onMouseOut=\"this.style.backgroundColor='006699'\"> eCom.com</a>\n");
      out.write("            </b></font>\n");
      out.write("            </td>\n");
      out.write("            <td bgcolor=\"006699\" align=\"center\">\n");
      out.write("            <font size=\"5\" face=\"Agency FB\" >    \n");
      out.write("            <a href=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\" title=\"Search\" style=\"text-decoration: none; color: white\">Categories</a>\n");
      out.write("            </font>\n");
      out.write("            </td>\n");
      out.write("            <td bgcolor=\"006699\" align=\"center\">\n");
      out.write("            <font size=\"5\" face=\"Agency FB\" >\n");
      out.write("            <a href=\"#\" title=\"Profile\" style=\"text-decoration: none; color: white\">Profile</a>\n");
      out.write("            </font>\n");
      out.write("            </td>\n");
      out.write("            <td bgcolor=\"006699\" align=\"center\">\n");
      out.write("            <font size=\"5\" face=\"Agency FB\" hover=\"\">\n");
      out.write("            <a href=\"#\" title=\"Help\" style=\"text-decoration: none; color: white\">Help</a>\n");
      out.write("            </font>\n");
      out.write("            </td>\n");
      out.write("            </tr></table>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <div>\n");
      out.write("        <table border=\"1\" cellpadding=\"5\" width=\"100%\" bgcolor=\"#F0F0F0\">\n");
      out.write("        <tr>\n");
      out.write("        <td align=\"center\">\n");
      out.write("            <font size=\"5\" face=\"Arial\" color=\"#505050\">\n");
      out.write("            Administrator\n");
      out.write("            </font> \n");
      out.write("        </td> \n");
      out.write("        </tr><br/><br/>\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("            <a href=\"AddCategory.jsp\">    \n");
      out.write("            Add New Category</a>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("            View Category List\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("            Edit Category List\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("            Add New Product\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("            View Products List\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("            Edit Product List\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("            Change Password\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <a href=\"AddAdmin.jsp\">Add New Administrator</a>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        <div><center>\n");
      out.write("         ");
      if (_jspx_meth_s_actionerror_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <!-- END NEVIGATION -->\n");
      out.write("    </td></tr></table>\n");
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
    _jspx_th_s_form_0.setAction("action3");
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
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
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
    _jspx_th_s_label_0.setValue("Category");
    _jspx_th_s_label_0.setCssStyle("font-size:15pt; color:#505050");
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
    _jspx_th_s_textfield_0.setName("category");
    _jspx_th_s_textfield_0.setCssStyle("width:400pt; height:30pt; font-size:15pt");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_cssStyle_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_name_cssStyle_nobody.reuse(_jspx_th_s_textfield_0);
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
    _jspx_th_s_submit_0.setValue("Add Category");
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
