/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.CryptoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.sql.Date;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.CustomerOrder;
import model.User;

/**
 *
 * @author Alan Sun
 */
@WebServlet(name = "LogController", urlPatterns = {"/LogController"}, initParams = {
    @WebInitParam(name = "datasource", value = "jdbc/_newCrypto")})
public class LogController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");

        //GET datasource init parameter
        String ds = this.getInitParameter("datasource");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            CryptoDAO dao = new CryptoDAO(ds);

            if (action.equals("signupView")) {
                //check first
                String email = request.getParameter("email");
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String pnumber = request.getParameter("pnumber");
                String password = request.getParameter("pass");
                Customer cus = new Customer(fname, lname, email, pnumber);
                if (dao.SaveCustomer(cus)) {

                    User user = new User(email, password);
                    dao.SaveUser(user);
                    response.sendRedirect("Signin.jsp");
                }

            } 
            else if (action.equals("signinview")) {
                String email = request.getParameter("email");
                String password = request.getParameter("pass");
                boolean found = dao.signin(email, password);
                if (found) {
                    out.print("log in successfully");
                    // start session
                    request.getSession().setAttribute("email", email);
                     response.sendRedirect("Success.jsp");

                } else {
                    response.sendRedirect("Signin.jsp");
                }
            }
            else if (action.equals("InputView")) {
                HttpSession session = request.getSession();
                String email = session.getAttribute("email").toString();
                String crypto = request.getParameter("crypto");
                String exchange = request.getParameter("exchange");
                double tradingFee = Double.valueOf(request.getParameter("tradingFee"));
                String fiat = request.getParameter("fiat");
                String orderType = request.getParameter("orderType");
               
                double amount = Double.valueOf(request.getParameter("amount"));
                double price = Double.valueOf(request.getParameter("price"));
               
                String time = request.getParameter("bday");
                Customer cu = dao.findCustomer(email);
                //List<CustomerOrder> orders=new ArrayList<CustomerOrder>();

                CustomerOrder co = new CustomerOrder(crypto, exchange, tradingFee, fiat, orderType, amount, price, time);
               if( dao.saveOrder(cu, co)){
                   out.println("success insert  a record!");
                  
               }

            } else if (action.equals("review")) {
                HttpSession session = request.getSession();
                String email = session.getAttribute("email").toString();
                Customer cu = dao.findCustomer(email);
                List<CustomerOrder> orders = new ArrayList<CustomerOrder>();
                orders = dao.findOrders(cu);
                session.setAttribute("orders", orders);
                response.sendRedirect("TransactionRecord.jsp");

            }
            

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(LogController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(LogController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
     private String getDateTime() {
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
