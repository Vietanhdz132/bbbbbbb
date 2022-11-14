package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class QuanLyCheDo_005fBaoHiem_005fLoiIch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            /*Định dạng CSS */\n");
      out.write("            /* form styles */\n");
      out.write("            form .row {\n");
      out.write("                display: block;\n");
      out.write("                padding: 7px 8px;\n");
      out.write("                margin-bottom: 7px;\n");
      out.write("            }\n");
      out.write("            form .row:hover {\n");
      out.write("                background: #f1f7fa;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form label {\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 1.2em;\n");
      out.write("                font-weight: bold;\n");
      out.write("                width: 120px;\n");
      out.write("                padding: 6px 0;\n");
      out.write("                color: #464646;\n");
      out.write("                vertical-align: top;\n");
      out.write("            }\n");
      out.write("            form .req { color: #ca5354; }\n");
      out.write("\n");
      out.write("            form .note {\n");
      out.write("                font-size: 1.2em;\n");
      out.write("                line-height: 1.33em;\n");
      out.write("                font-weight: normal;\n");
      out.write("                padding: 2px 7px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form input:focus, form textarea:focus { outline: none; }\n");
      out.write("\n");
      out.write("            /* placeholder styles: http://stackoverflow.com/a/2610741/477958 */\n");
      out.write("            ::-webkit-input-placeholder { color: #aaafbd; font-style: italic; } /* WebKit */\n");
      out.write("            :-moz-placeholder { color: #aaafbd; font-style: italic; }           /* Mozilla Firefox 4 to 18 */\n");
      out.write("            ::-moz-placeholder { color: #aaafbd; font-style: italic; }          /* Mozilla Firefox 19+ */\n");
      out.write("            :-ms-input-placeholder { color: #aaafbd; font-style: italic; }      /* Internet Explorer 10+ */\n");
      out.write("\n");
      out.write("            /*Tạo hiệu ứng động Transitions */\n");
      out.write("            form .txt \n");
      out.write("            {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 8px 9px;\n");
      out.write("                padding-right: 30px;\n");
      out.write("                width: 240px;\n");
      out.write("                font-family: 'Oxygen', sans-serif;\n");
      out.write("                font-size: 1.35em;\n");
      out.write("                font-weight: normal;\n");
      out.write("                color: #898989;\n");
      out.write("                background-color: #f0f0f0;\n");
      out.write("                background-image: url('images/checkmark.png');\n");
      out.write("                background-position: 110% center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                text-shadow: 0 1px 0 rgba(255,255,255,0.75);\n");
      out.write("                -webkit-box-sizing: content-box;\n");
      out.write("                -moz-box-sizing: content-box;\n");
      out.write("                box-sizing: content-box;\n");
      out.write("                -webkit-border-radius: 3px;\n");
      out.write("                -moz-border-radius: 3px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                -webkit-box-shadow: 0 1px 2px rgba(25, 25, 25, 0.25) inset, -1px 1px #fff;\n");
      out.write("                -moz-box-shadow: 0 1px 2px rgba(25, 25, 25, 0.25) inset, -1px 1px #fff;\n");
      out.write("                box-shadow: 0 1px 2px rgba(25, 25, 25, 0.25) inset, -1px 1px #fff;\n");
      out.write("                -webkit-transition: all 0.3s linear;\n");
      out.write("                -moz-transition: all 0.3s linear;\n");
      out.write("                transition: all 0.3s linear;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form .txtarea {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 8px 11px;\n");
      out.write("                padding-right: 30px;\n");
      out.write("                width: 320px;\n");
      out.write("                height: 120px;\n");
      out.write("                font-family: 'Oxygen', sans-serif;\n");
      out.write("                font-size: 1.35em;\n");
      out.write("                font-weight: normal;\n");
      out.write("                color: #898989;\n");
      out.write("                background-color: #f0f0f0;\n");
      out.write("                background-image: url('images/checkmark.png');\n");
      out.write("                background-position: 110% 4%;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                text-shadow: 0 1px 0 rgba(255,255,255,0.75);\n");
      out.write("                -webkit-box-sizing: content-box;\n");
      out.write("                -moz-box-sizing: content-box;\n");
      out.write("                box-sizing: content-box;\n");
      out.write("                -webkit-border-radius: 3px;\n");
      out.write("                -moz-border-radius: 3px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                -webkit-box-shadow: 0 1px 4px -1px #a8a8a8 inset;\n");
      out.write("                -moz-box-shadow: 0 1px 4px -1px #a8a8a8 inset;\n");
      out.write("                box-shadow: 0 1px 4px -1px #a8a8a8 inset;\n");
      out.write("                -webkit-transition: all 0.3s linear;\n");
      out.write("                -moz-transition: all 0.3s linear;\n");
      out.write("                transition: all 0.3s linear;\n");
      out.write("            }\n");
      out.write("            form .txt:focus, form .txtarea:focus\n");
      out.write("            {\n");
      out.write("                color: #545454;\n");
      out.write("                background-color: #fff;\n");
      out.write("                background-position: 110% center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                border-color: #059;\n");
      out.write("                -webkit-box-shadow: 0 1px 4px -1px #a8a8a8 inset, 0 1px rgba(255, 255, 255, 0.6), 0 0 11px rgba(70, 100, 200, 0.7);\n");
      out.write("                -moz-box-shadow: 0 1px 4px -1px #a8a8a8 inset, 0 1px rgba(255, 255, 255, 0.6), 0 0 11px rgba(70, 100, 200, 0.7);\n");
      out.write("                box-shadow: 0 1px 4px -1px #a8a8a8 inset, 0 1px rgba(255, 255, 255, 0.6), 0 0 11px rgba(70, 100, 200, 0.7);\n");
      out.write("            }\n");
      out.write("            form .txtarea:focus {\n");
      out.write("                width: 375px;\n");
      out.write("                background-position: 110% 4%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form .txt:valid {\n");
      out.write("                background-color: #deecda;\n");
      out.write("                background-position: 98% center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                color: #7d996e;\n");
      out.write("                border: 1px solid #95bc7d;\n");
      out.write("            }\n");
      out.write("            form .txtarea:valid {\n");
      out.write("                background-color: #deecda;\n");
      out.write("                background-position: 98% 4%;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                color: #7d996e;\n");
      out.write("                border: 1px solid #95bc7d;\n");
      out.write("            }\n");
      out.write("            form .txt:focus:valid, form .txtarea:focus:valid {\n");
      out.write("                -webkit-box-shadow: 0 1px 4px -1px #a8a8a8 inset, 0 1px rgba(255, 255, 255, 0.6), 0 0 11px rgba(120, 200, 70, 0.7);\n");
      out.write("                -moz-box-shadow: 0 1px 4px -1px #a8a8a8 inset, 0 1px rgba(255, 255, 255, 0.6), 0 0 11px rgba(120, 200, 70, 0.7);\n");
      out.write("                box-shadow: 0 1px 4px -1px #a8a8a8 inset, 0 1px rgba(255, 255, 255, 0.6), 0 0 11px rgba(120, 200, 70, 0.7);\n");
      out.write("            }\n");
      out.write("            #submitbtn {\n");
      out.write("                height: 70px;\n");
      out.write("                width: 275px;\n");
      out.write("                padding: 0;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-family: 'Oxygen', Arial, sans-serif;\n");
      out.write("                font-size: 2.0em;\n");
      out.write("                color: #0a528f;\n");
      out.write("                text-shadow: 1px 1px 0 rgba(255,255,255,0.65);\n");
      out.write("                border-width: 1px;\n");
      out.write("                border-style: solid;\n");
      out.write("                border-color: #317bd6 #3784e3 #2d74d5 #3774e3;\n");
      out.write("                -webkit-border-radius: 3px;\n");
      out.write("                -moz-border-radius: 3px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                background-color: #4581e5;\n");
      out.write("                background-image: -webkit-gradient(linear, left top, left bottom, from(#6faefd), to(#4581e5));\n");
      out.write("                background-image: -webkit-linear-gradient(top, #6faefd, #4581e5);\n");
      out.write("                background-image: -moz-linear-gradient(top, #6faefd, #4581e5);\n");
      out.write("                background-image: -ms-linear-gradient(top, #6faefd, #4581e5);\n");
      out.write("                background-image: -o-linear-gradient(top, #6faefd, #4581e5);\n");
      out.write("                background-image: linear-gradient(top, #6faefd, #4581e5);\n");
      out.write("                -moz-box-shadow: 1px 1px 3px rgba(0,0,0,0.4), 0 1px 0 rgba(255, 255, 255, 0.5) inset;\n");
      out.write("                -webkit-box-shadow: 1px 1px 3px rgba(0,0,0,0.4), 0 1px 0 rgba(255, 255, 255, 0.5) inset;\n");
      out.write("                box-shadow: 1px 1px 3px rgba(0,0,0,0.4), 0 1px 0 rgba(255, 255, 255, 0.5) inset;\n");
      out.write("                -webkit-transition: all 0.3s linear;\n");
      out.write("                -moz-transition: all 0.3s linear;\n");
      out.write("                transition: all 0.3s linear;\n");
      out.write("            }\n");
      out.write("            #submitbtn:hover, #submitbtn:focus\n");
      out.write("            {\n");
      out.write("                -webkit-box-shadow: 0 0 15px rgba(70, 100, 200, 0.9);\n");
      out.write("                -moz-box-shadow: 0 0 15px rgba(70, 100, 200, 0.9);\n");
      out.write("                box-shadow: 0 0 15px rgba(70, 100, 200, 0.9);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #submitbtn:active\n");
      out.write("            {\n");
      out.write("                -webkit-box-shadow: 0 0 15px rgba(70, 100, 200, 0.9), 0 1px 3px rgba(0,0,0,0.4) inset;\n");
      out.write("                -moz-box-shadow: 0 0 15px rgba(70, 100, 200, 0.9), 0 1px 3px rgba(0,0,0,0.4) inset;\n");
      out.write("                box-shadow: 0 0 15px rgba(70, 100, 200, 0.9), 0 1px 3px rgba(0,0,0,0.4) inset;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form id=\"contactform\" name=\"contact\" method=\"post\" action=\"#\">\n");
      out.write("            <p class=\"note\"><span class=\"req\">*</span> Asterisk fields are required</p>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <label for=\"name\">Your Name <span class=\"req\">*</span></label>\n");
      out.write("                <input type=\"text\" name=\"name\" id=\"name\" class=\"txt\" tabindex=\"1\" placeholder=\"Steve Jobs\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <label for=\"email\">E-mail Address <span class=\"req\">*</span></label>\n");
      out.write("                <input type=\"email\" name=\"email\" id=\"email\" class=\"txt\" tabindex=\"2\" placeholder=\"address@domain.com\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <label for=\"subject\">Subject <span class=\"req\">*</span></label>\n");
      out.write("                <input type=\"text\" name=\"subject\" id=\"subject\" class=\"txt\" tabindex=\"3\" placeholder=\"Advertising/Press Ideas\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <label for=\"message\">Message <span class=\"req\">*</span></label>\n");
      out.write("                <textarea name=\"message\" id=\"message\" class=\"txtarea\" tabindex=\"4\" required></textarea>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"center\">\n");
      out.write("                <input type=\"submit\" id=\"submitbtn\" name=\"submitbtn\" tabindex=\"5\" value=\"Send Message\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}