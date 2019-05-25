package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProductList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_id_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_a_href;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_name;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_url_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_a_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_url_id_action.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_url_action_nobody.release();
    _jspx_tagPool_s_a_href.release();
    _jspx_tagPool_s_iterator_value.release();
    _jspx_tagPool_s_param_name.release();
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
      out.write("      \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("            body,table{\n");
      out.write("               \n");
      out.write("                background-color: white;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            #head{\n");
      out.write("                <!-- box-shadow:#ccc 5px 5px 5px; -->            \n");
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
      out.write("             /* -------------------top navi-----------*/\n");
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
      out.write("            \n");
      out.write("             /* -------------------end navi-----------*/\n");
      out.write("              /* -------------------left navi-----------*/\n");
      out.write("             \n");
      out.write("            \n");
      out.write("             \n");
      out.write("              .lnav div\n");
      out.write("            { \n");
      out.write("                background-color: #808080 ;\n");
      out.write("               margin: 6px;\n");
      out.write("                width:100%;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            .PP{\n");
      out.write("                  border:1px solid;\n");
      out.write("               border-bottom-left-radius:2em;\n");
      out.write("              border-top-left-radius:2em;\n");
      out.write("                background-color: #808080  ;\n");
      out.write("                width:100%;\n");
      out.write("                box-shadow: #333 1px  1px 2px;\n");
      out.write("               text-shadow:#333 1px  1px 2px;\n");
      out.write("              }\n");
      out.write("            \n");
      out.write("            div h3\n");
      out.write("            { \n");
      out.write("                 color: white;\n");
      out.write("                font-family: Agency FB;\n");
      out.write("                font-size: 120%; \n");
      out.write("                display: block;\n");
      out.write("                padding: 10px 30px 10px 40px;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .lnav div h2\n");
      out.write("            {\n");
      out.write("                color: white;\n");
      out.write("                font-family: Agency FB;\n");
      out.write("                font-size: 140%; \n");
      out.write("                display: block;\n");
      out.write("                padding: 10px 30px 10px 40px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("             .lnav a\n");
      out.write("             {  box-shadow: #333 2px  2px 10px;\n");
      out.write("               text-shadow:#333 1px  1px 2px;\n");
      out.write("                \n");
      out.write("                color:white;\n");
      out.write("               font-family: Agency FB;\n");
      out.write("                font-size: 120%; \n");
      out.write("                display: block;\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 15px 40px 16px 40px;\n");
      out.write("                 \n");
      out.write("             }\n");
      out.write("              .lnav div a:hover\n");
      out.write("            { \n");
      out.write("                box-shadow: #333 1px  1px 2px;\n");
      out.write("            }\n");
      out.write("             \n");
      out.write("             /* -------------------end left navi-----------*/\n");
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
      out.write("           /* -------------------productlist-----------*/\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             .product .ss img\n");
      out.write("             {\n");
      out.write("                 \n");
      out.write("                background-color: #FFF;\n");
      out.write("               \n");
      out.write("                box-shadow: #333 2px  2px 2px;\n");
      out.write("               \n");
      out.write("                 \n");
      out.write("             }\n");
      out.write("              .product tr\n");
      out.write("             {\n");
      out.write("                 \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("                 \n");
      out.write("             }\n");
      out.write("             \n");
      out.write("            \n");
      out.write("        </style>  \n");
      out.write("   <script>\n");
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
      out.write("\t</script>     \n");
      out.write("    </head>\n");
      out.write("    <body>    <a id=\"top\"/></a>\n");
      out.write("         <div class=\"sh\">\n");
      out.write("             \n");
      out.write("        <div id=\"head\">\n");
      out.write("             <div class=\"nav_home nav\"> \n");
      out.write("                 <a class=\"aa\" href=\"home.jsp\" title=\"Online Shopping\"  onMouseOver=\"this.style.cursor='hand';\" >Home</a>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"nav\">\n");
      out.write("               <a href=\"index.jsp\" title=\"Online Shopping\"  onMouseOver=\"this.style.cursor='hand';\" >picWATCH</a>\n");
      out.write("           </div>\n");
      out.write("            <div class=\"nav\">\n");
      out.write("                <a href=\"BagsHome.jsp\" title=\"Online Shopping\"  onMouseOver=\"this.style.cursor='hand';\" >picBAG</a>\n");
      out.write("             </div>\n");
      out.write("            <div class=\"nav\">\n");
      out.write("                <a href=\"SunglassesHome.jsp\" title=\"Online Shopping\"  onMouseOver=\"this.style.cursor='hand';\" >picSUNGLASS</a>\n");
      out.write("            </div>        \n");
      out.write("          </div>\n");
      out.write("    </div> \n");
      out.write("<table align=\"center\" width=\"100%\" border=\"0px\">\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\">\n");
      out.write("    \n");
      out.write("        <table width=\"80%\"><tr><td> \n");
      out.write("        <!-- NEVIGATION -->            \n");
      out.write(" <!--       <div>\n");
      out.write("            <center>\n");
      out.write("            <table cellpadding=\"-10\" width=\"100%\" border=\"0\"> <tr> \n");
      out.write("            <td align=\"center\"style=\"background-color: white\" width=\"52%\">\n");
      out.write("            <font size=\"7\" face=\"Agency FB\" ><b>\n");
      out.write("                <a href=\"index.jsp\" title=\"Online Shopping\" style=\"text-decoration: none; color:darkslategray\" onMouseOver=\"this.style.cursor='hand';\" > &nbsp;picWATCH</a>\n");
      out.write("            </b></font>\n");
      out.write("            </td>\n");
      out.write("            </tr></table>\n");
      out.write("            <table cellpadding=\"-10\" width=\"100%\" border=\"0\"> \n");
      out.write("            <tr>\n");
      out.write("            <td align=\"center\" style=\"background-color: black\" width=\"33%\">\n");
      out.write("            <font size=\"6\" face=\"Agency FB\" ><b>\n");
      out.write("                <a href=\"BagsHome.jsp\" title=\"Online Shopping\" style=\"text-decoration: none; color:white\" onMouseOver=\"this.style.cursor='hand';\" > &nbsp;picBAG</a>\n");
      out.write("            </b></font>\n");
      out.write("            </td>    \n");
      out.write("            <td align=\"center\" style=\"background-color: cadetblue\" width=\"33%\" >\n");
      out.write("            <font size=\"6\" face=\"Agency FB\" ><b>\n");
      out.write("                <a href=\"home.jsp\" title=\"Online Shopping\" style=\"text-decoration: none; color:white\" onMouseOver=\"this.style.cursor='hand';\" > &nbsp;picSHOP</a>\n");
      out.write("            </b></font>\n");
      out.write("            </td>\n");
      out.write("            <td align=\"center\" style=\"background-color: black\" width=\"33%\">\n");
      out.write("            <font size=\"6\" face=\"Agency FB\" ><b>\n");
      out.write("                <a href=\"#\" title=\"Online Shopping\" style=\"text-decoration: none; color:white\" onMouseOver=\"this.style.cursor='hand';\" > &nbsp;picSUNGLASS</a>\n");
      out.write("            </b></font>\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            </table> \n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write(" -->       \n");
      out.write("        <!-- END NEVIGATION -->\n");
      out.write("       \n");
      out.write("            \n");
      out.write("        <div> <table align=\"center\" width=\"100%\" > <tr> \n");
      out.write("            <td class=\"lnav\"  width=\"20%\" valign=\"top\">\n");
      out.write("                <div class=\"PP\" >\n");
      out.write("                 <h2>PRODUCTS</h2> \n");
      out.write("            </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\" title=\"All products\">All Products</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_1(_jspx_page_context))
        return;
      out.write("\" title=\"New Lines\">New Lines</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"PP\" ><h3>Search By Gender</h3></div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_2(_jspx_page_context))
        return;
      out.write("\" title=\"Male Watches\">Male</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_3(_jspx_page_context))
        return;
      out.write("\" title=\"Female Watches\">Female</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"PP\" ><h3>Search By Brand</h3></div>\n");
      out.write("                <div>\n");
      out.write("                     <a href=\"");
      if (_jspx_meth_s_url_4(_jspx_page_context))
        return;
      out.write("\" title=\"Casio Watches\" >Casio</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                      <a href=\"");
      if (_jspx_meth_s_url_5(_jspx_page_context))
        return;
      out.write("\" title=\"Fastrack Watches\" >Fastrack</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                     <a href=\"");
      if (_jspx_meth_s_url_6(_jspx_page_context))
        return;
      out.write("\" title=\"Fossil Watches\" >Fossil</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                     <a href=\"");
      if (_jspx_meth_s_url_7(_jspx_page_context))
        return;
      out.write("\" title=\"Tommy Hilfiger Watches\" >Tommy Hilfiger</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                     <a href=\"");
      if (_jspx_meth_s_url_8(_jspx_page_context))
        return;
      out.write("\" title=\"Titan Watches\" >Titan</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                     <a href=\"");
      if (_jspx_meth_s_url_9(_jspx_page_context))
        return;
      out.write("\" title=\"Burg Watches\" >Burg</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_10(_jspx_page_context))
        return;
      out.write("\" title=\"Citizen Watches\" >Citizen</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_11(_jspx_page_context))
        return;
      out.write("\" title=\"D&G Watches\" >D&G</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_12(_jspx_page_context))
        return;
      out.write("\" title=\"Police Watches\" >Police</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_13(_jspx_page_context))
        return;
      out.write("\" title=\"Q&Q Watches\" >Q&Q</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"PP\" ><h3>Search By Price</h3></div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_14(_jspx_page_context))
        return;
      out.write("\" >Up to 2000</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_15(_jspx_page_context))
        return;
      out.write("\" >2001 - 4000</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_16(_jspx_page_context))
        return;
      out.write("\" >4001 - 8000</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_17(_jspx_page_context))
        return;
      out.write("\" >8001 - 10000</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_s_url_18(_jspx_page_context))
        return;
      out.write("\" >Above 10000</a>\n");
      out.write("                </div>\n");
      out.write("            </td>\n");
      out.write("           \n");
      out.write("            <td valign=\"top\"> \n");
      out.write("         \n");
      out.write("                <table class=\"product\" align=\"center\" border=\"0\" width=\"100%\" >\n");
      out.write("                 ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("            </table>   \n");
      out.write("          \n");
      out.write("            </td>\n");
      out.write("            \n");
      out.write("        </tr> </table>\n");
      out.write(" </div>\n");
      out.write("</td></tr></table>\n");
      out.write("    <a href=\"#top\"><img src=\"img/up.svg\" style=\"height: 40pt;\"/></a>        \n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
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
    _jspx_th_s_url_0.setAction("allprowatchact");
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
    _jspx_th_s_url_1.setAction("NewLinesact");
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
    _jspx_th_s_url_2.setAction("Gentsact");
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
    _jspx_th_s_url_3.setAction("Ladiesact");
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
    _jspx_th_s_url_4.setAction("casioact");
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
    _jspx_th_s_url_5.setAction("fastrackact");
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
    _jspx_th_s_url_6.setAction("fossilact");
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
    _jspx_th_s_url_7.setAction("thact");
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
    _jspx_th_s_url_8.setAction("titanact");
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
    _jspx_th_s_url_9.setAction("burgact");
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
    _jspx_th_s_url_10.setAction("citizenact");
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
    _jspx_th_s_url_11.setAction("dgact");
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
    _jspx_th_s_url_12.setAction("policeact");
    int _jspx_eval_s_url_12 = _jspx_th_s_url_12.doStartTag();
    if (_jspx_th_s_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_12);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_12);
    return false;
  }

  private boolean _jspx_meth_s_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_13 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_13.setPageContext(_jspx_page_context);
    _jspx_th_s_url_13.setParent(null);
    _jspx_th_s_url_13.setAction("qqact");
    int _jspx_eval_s_url_13 = _jspx_th_s_url_13.doStartTag();
    if (_jspx_th_s_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_13);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_13);
    return false;
  }

  private boolean _jspx_meth_s_url_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_14 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_14.setPageContext(_jspx_page_context);
    _jspx_th_s_url_14.setParent(null);
    _jspx_th_s_url_14.setAction("rate1wact");
    int _jspx_eval_s_url_14 = _jspx_th_s_url_14.doStartTag();
    if (_jspx_th_s_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_14);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_14);
    return false;
  }

  private boolean _jspx_meth_s_url_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_15 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_15.setPageContext(_jspx_page_context);
    _jspx_th_s_url_15.setParent(null);
    _jspx_th_s_url_15.setAction("rate2wact");
    int _jspx_eval_s_url_15 = _jspx_th_s_url_15.doStartTag();
    if (_jspx_th_s_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_15);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_15);
    return false;
  }

  private boolean _jspx_meth_s_url_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_16 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_16.setPageContext(_jspx_page_context);
    _jspx_th_s_url_16.setParent(null);
    _jspx_th_s_url_16.setAction("rate3wact");
    int _jspx_eval_s_url_16 = _jspx_th_s_url_16.doStartTag();
    if (_jspx_th_s_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_16);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_16);
    return false;
  }

  private boolean _jspx_meth_s_url_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_17 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_17.setPageContext(_jspx_page_context);
    _jspx_th_s_url_17.setParent(null);
    _jspx_th_s_url_17.setAction("rate4wact");
    int _jspx_eval_s_url_17 = _jspx_th_s_url_17.doStartTag();
    if (_jspx_th_s_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_17);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_17);
    return false;
  }

  private boolean _jspx_meth_s_url_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_18 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_18.setPageContext(_jspx_page_context);
    _jspx_th_s_url_18.setParent(null);
    _jspx_th_s_url_18.setAction("rate5wact");
    int _jspx_eval_s_url_18 = _jspx_th_s_url_18.doStartTag();
    if (_jspx_th_s_url_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_18);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_18);
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
        out.write("\n");
        out.write("                     <tr>\n");
        out.write("                <td align=\"center\" width=\"30%\" > \n");
        out.write("                    <table class=\"ss\"><tr><td>    \n");
        out.write("                    <img src=\"");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\"/>\n");
        out.write("                    </td></tr></table>\n");
        out.write("                </td>\n");
        out.write("                <td>\n");
        out.write("                  \n");
        out.write("  <b> Product ID &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>  ");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(" <br/>\n");
        out.write("  <b> Brand &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : </b> ");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("<br/>\n");
        out.write("  <b> Category&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : </b> ");
        if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(" <br/>\n");
        out.write("  <b> Gender     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b> ");
        if (_jspx_meth_s_property_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("<br/>\n");
        out.write("  <b> Price &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : </b> ");
        if (_jspx_meth_s_property_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("<br/>\n");
        out.write("  <b> Description &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : </b> ");
        if (_jspx_meth_s_property_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(" <br/>\n");
        out.write("  <b> Type &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :</b>");
        if (_jspx_meth_s_property_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("<br/>       \n");
        out.write("                </td> \n");
        out.write("                <td> \n");
        out.write("                    ");
        if (_jspx_meth_s_url_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_a_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                   </td>\n");
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
    _jspx_th_s_property_0.setValue("PRODUCTIMG");
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
    _jspx_th_s_property_1.setValue("PRODID");
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
    _jspx_th_s_property_2.setValue("BRANDNAME");
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
    _jspx_th_s_property_3.setValue("CATEGORY");
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
    _jspx_th_s_property_4.setValue("GENDER");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_property_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_5 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_5.setPageContext(_jspx_page_context);
    _jspx_th_s_property_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_5.setValue("PRICE");
    int _jspx_eval_s_property_5 = _jspx_th_s_property_5.doStartTag();
    if (_jspx_th_s_property_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
    return false;
  }

  private boolean _jspx_meth_s_property_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_6 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_6.setPageContext(_jspx_page_context);
    _jspx_th_s_property_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_6.setValue("DESCRIPTION");
    int _jspx_eval_s_property_6 = _jspx_th_s_property_6.doStartTag();
    if (_jspx_th_s_property_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
    return false;
  }

  private boolean _jspx_meth_s_property_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_7 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_7.setPageContext(_jspx_page_context);
    _jspx_th_s_property_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_7.setValue("TYPE");
    int _jspx_eval_s_property_7 = _jspx_th_s_property_7.doStartTag();
    if (_jspx_th_s_property_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
    return false;
  }

  private boolean _jspx_meth_s_url_19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_19 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_19.setPageContext(_jspx_page_context);
    _jspx_th_s_url_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_19.setId("buy");
    _jspx_th_s_url_19.setAction("buyact");
    int _jspx_eval_s_url_19 = _jspx_th_s_url_19.doStartTag();
    if (_jspx_eval_s_url_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_19.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_s_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_19, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_url_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action.reuse(_jspx_th_s_url_19);
      return true;
    }
    _jspx_tagPool_s_url_id_action.reuse(_jspx_th_s_url_19);
    return false;
  }

  private boolean _jspx_meth_s_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_0 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_name.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_0.setPageContext(_jspx_page_context);
    _jspx_th_s_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_19);
    _jspx_th_s_param_0.setName("PRODID");
    int _jspx_eval_s_param_0 = _jspx_th_s_param_0.doStartTag();
    if (_jspx_eval_s_param_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_param_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_param_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_param_0.doInitBody();
      }
      do {
        if (_jspx_meth_s_property_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_param_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_param_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_param_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_0);
      return true;
    }
    _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_0);
    return false;
  }

  private boolean _jspx_meth_s_property_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_param_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_8 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_8.setPageContext(_jspx_page_context);
    _jspx_th_s_property_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_param_0);
    _jspx_th_s_property_8.setValue("PRODID");
    int _jspx_eval_s_property_8 = _jspx_th_s_property_8.doStartTag();
    if (_jspx_th_s_property_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
    return false;
  }

  private boolean _jspx_meth_s_a_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_0.setPageContext(_jspx_page_context);
    _jspx_th_s_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_0.setHref("%{buy}");
    int _jspx_eval_s_a_0 = _jspx_th_s_a_0.doStartTag();
    if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_0.doInitBody();
      }
      do {
        out.write("<img style=\"height:80px;width:140px\" src=\"img/buy.png\"/>");
        int evalDoAfterBody = _jspx_th_s_a_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
    return false;
  }
}
