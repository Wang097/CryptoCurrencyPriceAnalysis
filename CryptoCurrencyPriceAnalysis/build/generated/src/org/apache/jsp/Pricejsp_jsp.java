package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import src.CurrencyExchange;
import src.BitCoin;
import java.util.Date;

public final class Pricejsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"refresh\" content=\"4\"> <!-- Refresh every 15 minutes -->\r\n");
      out.write("        <title>Crypto Currency Price Analysis</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       \r\n");
      out.write("        <!--Two Drop down list-->\r\n");
      out.write("        <select name=\"Currency\">\r\n");
      out.write("            <option selected>AUD</option>\r\n");
      out.write("            <option>USD</option>\r\n");
      out.write("            <option>CNY</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        \r\n");
      out.write("        <select name=\"Crypto\">\r\n");
      out.write("            <option selected>BTC</option>\r\n");
      out.write("            <option>BCH</option>\r\n");
      out.write("            <option>LTC</option>\r\n");
      out.write("            <option>ETH</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        <br />\r\n");
      out.write("        <div>\r\n");
      out.write("            <table border=\"2\" width=\"250\" cellspacing=\"1\" cellpadding=\"1\" size >\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Exchanges</th>\r\n");
      out.write("                        <th>Buy1</th>\r\n");
      out.write("                        <th>Volumn</th>\r\n");
      out.write("                        <th>Sale1</th>\r\n");
      out.write("                        <th>Volumn</th>\r\n");
      out.write("                        <th>Last Trade Price</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Bitstamp</td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Kraken</td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>BTCChina</td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Okcoin</td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Bitfinex</td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>BtcMarkets</td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Independent Researve</td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <h3>");
      out.print( new Date() );
      out.write("</h3>\r\n");
      out.write("         \r\n");
      out.write("        <p>  ");
      out.print( BitCoin.getPrice());
      out.write("</p>\r\n");
      out.write("        <h3>Latest currency exchange rate: base:USD</h3>\r\n");
      out.write("        ");
      out.print( CurrencyExchange.getRate() );
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
