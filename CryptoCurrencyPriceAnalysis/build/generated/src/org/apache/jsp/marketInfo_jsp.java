package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ExchangesInterface.Market;
import java.util.HashMap;
import DAO.MarketData;

public final class marketInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <center>\n");
      out.write("           <h2> Bitcoin Realtime Price</h2>\n");
      out.write("        </center>\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <table width=\"300\"  class=\"table table-bordered table-striped\" >\n");
      out.write("                <thead>\n");
      out.write("                    <tr >\n");
      out.write("                        <th class=\"text-center\">Exchanges</th>\n");
      out.write("                        <th class=\"text-center\">Buy1</th>\n");
      out.write("                        <th class=\"text-center\">Volume</th>\n");
      out.write("                        <th class=\"text-center\">Sale1</th>\n");
      out.write("                        <th class=\"text-center\">Volume</th>\n");
      out.write("                        <th class=\"text-center\">Last Trade Price</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 MarketData md = new MarketData();
      out.write("\n");
      out.write("                    ");
 HashMap<String, Market> marketInfo = md.getDataInf();
      out.write("\n");
      out.write("                    ");

                        for (String m : marketInfo.keySet()) {
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"text-center\">");
      out.print(m);
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print(String.format("%.2f", marketInfo.get(m).getBuyPrice()));
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print(String.format("%.4f", marketInfo.get(m).getBuyVolume()));
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print(String.format("%.2f", marketInfo.get(m).getSellPrice()));
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print(String.format("%.4f", marketInfo.get(m).getSellVolume()));
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print(String.format("%.2f", marketInfo.get(m).getLastTadePrice()));
      out.write("</td>                       \n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
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
}
