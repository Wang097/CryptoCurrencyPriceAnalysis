package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ExchangesInterface.Market;
import java.util.HashMap;
import DAO.MarketData;

public final class priceDiff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Refresh every 4 minutes -->\n");
      out.write("        <!--<meta http-equiv=\"refresh\" content=\"4\"> -->\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <title>Information of Market</title>\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <table width=\"400\"  class=\"table table-bordered table-striped\" >\n");
      out.write("                <thead>\n");
      out.write("                    <tr >\n");
      out.write("                        <th>\n");
      out.write("                        <th class=\"text-center\">BtcMarkets</th>\n");
      out.write("                        <th class=\"text-center\">BitStamp</th>\n");
      out.write("                        <th class=\"text-center\">BitFinex</th>\n");
      out.write("                        <th class=\"text-center\">IR</th>\n");
      out.write("                        <th class=\"text-center\">Wex</th>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("                    ");
 MarketData md = new MarketData();
      out.write("\n");
      out.write("                    ");
 HashMap<String, Market> marketInfo = md.getDataInf();
      out.write("\n");
      out.write("                    ");
 for (String ma : marketInfo.keySet()) { 
      out.write("\n");
      out.write("                   \n");
      out.write("                    <tr> \n");
      out.write("                        <td>");
      out.print(ma);
      out.write("</td>\n");
      out.write("                    ");
   for (String mb : marketInfo.keySet()) { 
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");
 double b= marketInfo.get(ma).getSellPrice(); 
      out.write("\n");
      out.write("                    ");
 double s = marketInfo.get(mb).getBuyPrice(); 
      out.write("\n");
      out.write("                    ");
 double r = (s * 0.9975 - b * 1.0025) / (b * 1.0025);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                      <td>");
      out.print(String.format("%.2f", r * 100));
      out.write("</td>    \n");
      out.write("                      ");
 } 
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("<p>Note: Buy from COLUMN exchange and sell to ROW exchange</p>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
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
