package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InputTransaction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Input Transaction Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                <form action=\"Controller\" method=\"POST\">\n");
      out.write("            <center>\n");
      out.write("            <table border=\"1\" width=\"30%\" cellpadding=\"5\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\">Enter Transaction Detail Here</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Crypto Currency</td>\n");
      out.write("                        \n");
      out.write("                          <td> <select name=\"crypto\">\n");
      out.write("                              <option value=\"BTC\" selected=\"true\">BTC</option>\n");
      out.write("                              <option value=\"ETH\">ETH</option>\n");
      out.write("                              <option value=\"LTC\">LTC</option>\n");
      out.write("                              <option value=\"BCH\">BCH</option>\n");
      out.write("                          </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Exchange</td>\n");
      out.write("                              <td> <select name=\"exchange\">\n");
      out.write("                              <option value=\"Bits\" selected=\"true\">Bitstamp</option>\n");
      out.write("                              <option value=\"Bitf\">Bitfinex</option>\n");
      out.write("                              <option value=\"IR\">Independent Reserve</option>\n");
      out.write("                              <option value=\"Btcm\">Btcmarket</option>\n");
      out.write("                              <option value=\"Wex\">Wex</option>\n");
      out.write("                          </select></td>     \n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Trading Fee</td>\n");
      out.write("                              <td> <select name=\"tradingFee\">\n");
      out.write("                              <option value=\"0.001\" selected=\"true\">0.1%</option>\n");
      out.write("                              <option value=\"0.002\">0.2%</option>\n");
      out.write("                              <option value=\"0.0025\">0.25%</option>\n");
      out.write("                              <option value=\"0.003\">0.3%</option>\n");
      out.write("                              <option value=\"0.004\">0.4%</option>\n");
      out.write("                              <option value=\"0.005\">0.5%</option>\n");
      out.write("                              <option value=\"0.008\">0.8%</option>\n");
      out.write("                          </select></td>     \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                      <tr>\n");
      out.write("                        <td>Fiat Currency</td>\n");
      out.write("                              <td> <select name=\"fiat\">\n");
      out.write("                              <option value=\"USD\" selected=\"true\">USD</option>\n");
      out.write("                              <option value=\"AUD\">AUD</option>\n");
      out.write("                              <option value=\"CNY\">CNY</option>\n");
      out.write("                              <option value=\"EUR\">EUR</option>\n");
      out.write("                          </select></td>     \n");
      out.write("                    </tr>\n");
      out.write("                       <tr>\n");
      out.write("                        <td>Order Type</td>\n");
      out.write("                              <td> <select name=\"orderType\">\n");
      out.write("                              <option value=\"BUY\" selected=\"BUY\">BUY</option>\n");
      out.write("                              <option value=\"SALE\">SALE</option>\n");
      out.write("                          </select></td>     \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Amount</td>\n");
      out.write("                        <td><input type=\"text\" name=\"amount\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Price</td>\n");
      out.write("                        <td><input type=\"text\" name=\"price\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Time</td>\n");
      out.write("                       <td> <input type=\"date\" name=\"bday\"/></td>\n");
      out.write("               \n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Submit\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
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
