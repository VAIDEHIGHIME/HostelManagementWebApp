package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" >\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Flat Login Form</title>\n");
      out.write("  \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css\">\n");
      out.write("\n");
      out.write("  <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'>\n");
      out.write("<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Montserrat:400,700'>\n");
      out.write("<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>\n");
      out.write("\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  \n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"info\">\n");
      out.write("    <h1>Flat Login Form</h1><span>Made with <i class=\"fa fa-heart\"></i> by <a href=\"http://andytran.me\">Andy Tran</a></span>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"form\">\n");
      out.write("  <div class=\"thumbnail\"><img src=\"https://s3-us-west-2.amazonaws.com/s.cdpn.io/169963/hat.svg\"/></div>\n");
      out.write("  \n");
      out.write("  <form class=\"login-form\" action=\"LoginController\" method=\"POST\">\n");
      out.write("    <input type=\"text\" placeholder=\"userName\" name=\"userName\"/>\n");
      out.write("    <input type=\"password\" placeholder=\"password\" name=\"pass\"/>\n");
      out.write("    <button>login</button>\n");
      out.write("    <p class=\"message\">Not registered? <a href=\"registration.jsp\">Create an account</a></p>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("<video id=\"video\" autoplay=\"autoplay\" loop=\"loop\" poster=\"polina.jpg\">\n");
      out.write("  <source src=\"http://andytran.me/A%20peaceful%20nature%20timelapse%20video.mp4\" type=\"video/mp4\"/>\n");
      out.write("</video>\n");
      out.write("  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <script  src=\"js/index.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
