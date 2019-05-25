package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homebelow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_type_src_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_name_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_value_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_type_src_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_name_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_label_value_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_submit_type_src_cssStyle_nobody.release();
    _jspx_tagPool_s_iterator_value.release();
    _jspx_tagPool_s_textfield_name_cssStyle_nobody.release();
    _jspx_tagPool_s_label_value_cssStyle_nobody.release();
    _jspx_tagPool_s_form_action.release();
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
      out.write("        <link rel=\"shortcut icon\" type=\"image\" href=\"img/d.jpg\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>picSHOP</title>\n");
      out.write("        <!--  The jquery.pageslide.css stylesheet has the class that you'll need on your page -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"jquery.pageslide.css\" />\n");
      out.write("        <script src=\"jq/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"jquery.pageslide.min.js\" type=\"text/javascript\"></script>\n");
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
      out.write(" <!-- jquery script-->\n");
      out.write(" <meta http-equiv=\"content-type\" content=\"text/html;charset=iso-8859-1\" />\n");
      out.write("<meta name=\"description\" value=\"A slideshow that shows information about images onMouseOver by scrolling the image up, onMouseOut the text scrolls up and the image comes scrolling back in from below. The title below the image (first slide) stays visible above the information (second slide).\" />\n");
      out.write("<meta name=\"keywords\" value=\"diashow, slideshow, description, preview, truncated, information, slider, carousel, imageviewer\" />\n");
      out.write("<title>Mouse-over slideshow with truncated preview of second slide</title>\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.8.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"jquery.carouFredSel-6.1.0-packed.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function() {\n");
      out.write("$('.carousel').each(function() {\n");
      out.write("var $cfs = $(this);\n");
      out.write("$cfs.carouFredSel({\n");
      out.write("direction: 'up',\n");
      out.write("circular: false,\n");
      out.write("infinite: false,\n");
      out.write("align: false,\n");
      out.write("width: 275,\n");
      out.write("height: 250,\n");
      out.write("items: 1,\n");
      out.write("auto: false,\n");
      out.write("scroll: {\n");
      out.write("queue: 'last'\n");
      out.write("}\n");
      out.write("});\n");
      out.write("$cfs.hover(\n");
      out.write("function() {\n");
      out.write("$cfs.trigger('next');\n");
      out.write("},\n");
      out.write("function() {\n");
      out.write("$cfs.trigger('prev');\n");
      out.write("}\n");
      out.write(");\n");
      out.write("});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("\t$(function() {\n");
      out.write("\t  $('a[href*=#]:not([href=#])').click(function() {\n");
      out.write("\t    if (location.pathname.replace(/^\\//,'') == this.pathname.replace(/^\\//,'') && location.hostname == this.hostname) {\n");
      out.write("\n");
      out.write("\t      var target = $(this.hash);\n");
      out.write("\t      target = target.length ? target : $('[name=' + this.hash.slice(1) +']');\n");
      out.write("\t      if (target.length) {\n");
      out.write("\t        $('html,body').animate({\n");
      out.write("\t          scrollTop: target.offset().top\n");
      out.write("\t        }, 1000);\n");
      out.write("\t        return false;\n");
      out.write("\t      }\n");
      out.write("\t    }\n");
      out.write("\t  });\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t\t\thtml, body {\n");
      out.write("                            \n");
      out.write("\t\t\t\theight: 20%;\n");
      out.write("\t\t\t\tpadding: 0;\n");
      out.write("\t\t\t\tmargin: 0;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tbody {\n");
      out.write("\t\t\t\tmin-height: 400px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tbody * {\n");
      out.write("\t\t\t\tfont-family: Arial, Geneva, SunSans-Regular, sans-serif;\n");
      out.write("\t\t\t\tfont-size: 14px;\n");
      out.write("\t\t\t\tcolor: #333;\n");
      out.write("\t\t\t\tline-height: 22px;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t#donate-spacer {\n");
      out.write("\t\t\t\theight: 100%;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#donate {\n");
      out.write("\t\t\t\tborder-top: 1px solid #999;\n");
      out.write("\t\t\t\twidth: 750px;\n");
      out.write("\t\t\t\tpadding: 50px 75px;\n");
      out.write("\t\t\t\tmargin: 0 auto;\n");
      out.write("\t\t\t\toverflow: hidden;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#donate p, #donate form {\n");
      out.write("\t\t\t\tmargin: 0;\n");
      out.write("\t\t\t\tfloat: left;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#donate p {\n");
      out.write("\t\t\t\twidth: 650px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#donate form {\n");
      out.write("\t\t\t\twidth: 100px;\n");
      out.write("\t\t\t}\n");
      out.write("                        #tab\n");
      out.write("                        {\n");
      out.write("                      \n");
      out.write("\t\t\t\tmargin: -250px 0 0 -415px;  \n");
      out.write("\t\t\t\toverflow: hidden;\n");
      out.write("\t\t\t\tposition: relative;\n");
      out.write("\t\t\t\tmargin-left: auto;\n");
      out.write("                                margin-right: auto;\n");
      out.write("\t\t\t\ttop: 850px;\n");
      out.write("                                width: 1000px;\n");
      out.write("                                background-color: black;\n");
      out.write("                                \n");
      out.write("                        }\n");
      out.write("             \n");
      out.write("                        #below{\n");
      out.write("                            margin-left: 50px;\n");
      out.write("                            margin-top: 1500px\n");
      out.write("                        }         \n");
      out.write("      #futer\n");
      out.write("           {\n");
      out.write("               margin-top: 540px;\n");
      out.write("               background-color: black;\n");
      out.write("               height: 60px;\n");
      out.write("               color: white;\n");
      out.write("               opacity: 0.7;\n");
      out.write("               \n");
      out.write("           }\n");
      out.write("     \n");
      out.write("      #vvv\n");
      out.write("      {\n");
      out.write("          height: 600px;\n");
      out.write("          margin-top:0px;\n");
      out.write("                   \n");
      out.write("      }\n");
      out.write("      #last\n");
      out.write("      {\n");
      out.write("        \n");
      out.write("          margin-top: 30px;\n");
      out.write("          margin-left: 450px;\n");
      out.write("          float: left;\n");
      out.write("          \n");
      out.write("      }\n");
      out.write("      #ex\n");
      out.write("      {\n");
      out.write("          margin-top: 10px;\n");
      out.write("          margin-left: 0px;\n");
      out.write("          \n");
      out.write("          height: 60pt;\n");
      out.write("          background-color: black;\n");
      out.write("          opacity: 0.7;\n");
      out.write("          color: white;\n");
      out.write("          font-family: Agency FB;\n");
      out.write("          font-size: 30pt;\n");
      out.write("      }\n");
      out.write("      #le\n");
      out.write("      {\n");
      out.write("          margin-top: 50px;\n");
      out.write("          margin-left: 500px;\n");
      out.write("          width: 10px;\n");
      out.write("          height: 10px;\n");
      out.write("          \n");
      out.write("      }\n");
      out.write("      #upb\n");
      out.write("      {\n");
      out.write("          margin-top: 400px;\n");
      out.write("      }\n");
      out.write("      #status\n");
      out.write("      {\n");
      out.write("         margin-top: 130px;\n");
      out.write("          margin-left: 600px;\n");
      out.write("         color: white;\n");
      out.write("         background-color: black;\n");
      out.write("         opacity: 0.7;\n");
      out.write("         width: 450px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      \n");
      out.write("                        \n");
      out.write("\t\t</style>        \n");
      out.write("</head>\n");
      out.write("<body style=\"background:url(img/homeadminback.jpg) center top black; background-repeat: no-repeat;\" >\n");
      out.write("                    \n");
      out.write("<div id=\"all\">\n");
      out.write("    \n");
      out.write("  <div id=\"vvv\">\n");
      out.write("        <a id=\"view\"></a> \n");
      out.write("        \n");
      out.write("        <div id=\"le\"></div>    \n");
      out.write("        <div id=\"status\">\n");
      out.write("            \n");
      out.write("                 ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("             \n");
      out.write("        </div>  \n");
      out.write("        \n");
      out.write("        <div id=\"ex\"><center><font style=\"color:white; font-size: 30pt; font-family: Agency FB\"/><br/>CHECK ORDER STATUS</font></center></div>\n");
      out.write("         \n");
      out.write("            <div id=\"last\">\n");
      out.write("            ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <div id=\"upb\"> \n");
      out.write("            <center>\n");
      out.write("             \n");
      out.write("                 \n");
      out.write("                <br/>\n");
      out.write("           \n");
      out.write("            </center>     \n");
      out.write("        </div> \n");
      out.write("       \n");
      out.write("       </div> \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("</div> \n");
      out.write("   \n");
      out.write("   \n");
      out.write("     \n");
      out.write("       \n");
      out.write("       \n");
      out.write("</body>\n");
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
        out.write("\n");
        out.write("              Username: ");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("     <br/>\n");
        out.write("              Address :");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("   <br/>\n");
        out.write("              Customer Name : ");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("<br/>\n");
        out.write("              Product ID: ");
        if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("  <br/>\n");
        out.write("              Your Product Status: ");
        if (_jspx_meth_s_property_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              ");
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
    _jspx_th_s_property_0.setValue("UNAME");
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
    _jspx_th_s_property_1.setValue("CADDRESS");
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
    _jspx_th_s_property_2.setValue("CNAME");
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
    _jspx_th_s_property_3.setValue("PROID");
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
    _jspx_th_s_property_4.setValue("STATUS");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("uservieworder");
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
        out.write("              ");
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
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
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
    _jspx_th_s_label_0.setValue("Enter Username");
    _jspx_th_s_label_0.setCssStyle("font-size:17pt; color:white;font-family: Agency FB");
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
    _jspx_th_s_textfield_0.setName("uname");
    _jspx_th_s_textfield_0.setCssStyle("color:white; background: transparent; width:300pt; height:30pt; font-size:15pt;");
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
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_type_src_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setType("image");
    _jspx_th_s_submit_0.setSrc("img/check.svg");
    _jspx_th_s_submit_0.setCssStyle("height:40pt");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_type_src_cssStyle_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_type_src_cssStyle_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }
}
