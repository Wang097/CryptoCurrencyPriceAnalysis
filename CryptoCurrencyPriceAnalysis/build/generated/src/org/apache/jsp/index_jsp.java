package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CurrencyConvert.CurrencyRate;
import java.util.Map;
import java.util.HashMap;
import ExchangesInterface.Wex;
import ExchangesInterface.BtcMarkets;
import ExchangesInterface.BitStamp;
import ExchangesInterface.BitFinex;
import ExchangesInterface.IR;
import java.util.Date;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("   <!--     <meta http-equiv=\"refresh\" content=\"4\"> <!-- Refresh every 15 minutes -->\r\n");
      out.write("       <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\"\">\r\n");
      out.write("        <title>Crypto Currency Price Analysis</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"container\"> \r\n");
      out.write("        <!--Two Drop down list-->\r\n");
      out.write("        <form name =\"f1\" method=\"post\" action=\"#\">\r\n");
      out.write("        <select name=\"Currency\" class=\"selectpicker\" >\r\n");
      out.write("            <option value=\"AUD\">AUD</option>\r\n");
      out.write("            <option selected value=\"USD\">USD</option>\r\n");
      out.write("            <option value=\"CNY\">CNY</option>\r\n");
      out.write("        </select>\r\n");
      out.write("            <input type=\"submit\" value=\"select currency\" />\r\n");
      out.write("        </form>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        <select name=\"Crypto\"class=\"selectpicker\" >\r\n");
      out.write("            <option selected>BTC</option>\r\n");
      out.write("            <option>BCH</option>\r\n");
      out.write("            <option>LTC</option>\r\n");
      out.write("            <option>ETH</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        <br />\r\n");
      out.write("        <div>\r\n");
      out.write("            <table width=\"400\"  class=\"table table-bordered table-striped\" >\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr >\r\n");
      out.write("                        <th class=\"text-center\">Exchanges</th>\r\n");
      out.write("                        <th class=\"text-center\">Buy1</th>\r\n");
      out.write("                        <th class=\"text-center\">Volumn</th>\r\n");
      out.write("                        <th class=\"text-center\">Sale1</th>\r\n");
      out.write("                        <th class=\"text-center\">Volumn</th>\r\n");
      out.write("                        <th>Last Trade Price</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Wex</td>\r\n");
      out.write("                        <td>");
      out.print( Wex.getOrder().get("buyPrice") );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( Wex.getOrder().get("buyVolume"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( Wex.getOrder().get("sellPrice"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( Wex.getOrder().get("sellVolume"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( Wex.getLastPrice().get("LastPrice"));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                   \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>BtcMarkets</td>\r\n");
      out.write("                        <td>");
      out.print( BtcMarkets.getMarketinUSD().get("buyPrice") );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BtcMarkets.getMarketinUSD().get("buyVolume"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BtcMarkets.getMarketinUSD().get("sellPrice"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BtcMarkets.getMarketinUSD().get("sellVolume"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BtcMarkets.getMarketinUSD().get("LastPrice"));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  \r\n");
      out.write("                   \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Bitstamp</td>\r\n");
      out.write("                        <td>");
      out.print( BitStamp.getOrder().get("buyPrice"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BitStamp.getOrder().get("buyVolume"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BitStamp.getOrder().get("sellPrice"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BitStamp.getOrder().get("sellVolume"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BitStamp.getLastPrice().get("LastPrice"));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Bitfinex</td>\r\n");
      out.write("                        <td>");
      out.print( BitFinex.getOrder().get("buyPrice"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BitFinex.getOrder().get("buyVolume"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BitFinex.getOrder().get("sellPrice"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BitFinex.getOrder().get("sellVolume"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( BitFinex.getLastPrice().get("LastPrice"));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Independent</td>\r\n");
      out.write("                        <td>");
      out.print( IR.getMarketinUSD().get("buyPrice"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( IR.getMarketinUSD().get("buyVolume"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( IR.getMarketinUSD().get("sellPrice"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( IR.getMarketinUSD().get("sellVolume"));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( IR.getMarketinUSD().get("LastPrice"));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("                        <p>");
      out.print(  CurrencyRate.getRate().get("USD") );
      out.write("</p>\r\n");
      out.write("                        \r\n");
      out.write("                         <p>");
      out.print(  CurrencyRate.getRate().get("AUD") );
      out.write("</p> \r\n");
      out.write("                         <p> ");
      out.print(  request.getParameter("Currency") );
      out.write("</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("       <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("       <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"> </script>\r\n");
      out.write("    \r\n");
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
