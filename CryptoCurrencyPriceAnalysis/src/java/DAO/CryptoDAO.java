/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Alan Sun
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import model.Customer;
import model.CustomerOrder;
import model.User;

/**
 *
 * @author Alan Sun
 */
public class CryptoDAO {

    protected Connection connection;

    protected PreparedStatement saveCustomerPS;
    protected PreparedStatement saveUserPS;
    protected PreparedStatement signinPS;
    protected PreparedStatement saveOrderPS;
    protected PreparedStatement findCustomerPS;
    protected PreparedStatement findOrdersPS;

    public CryptoDAO(String datasource) throws Exception {
        try {
            InitialContext ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup(datasource);
            connection = ds.getConnection();

            saveCustomerPS = this.saveCustomerSQL();
            saveUserPS = this.saveUserSQL();
            signinPS = this.signinSQL();
            saveOrderPS = this.saveOrderSQL();
            findCustomerPS = this.findCustomerSQL();
            findOrdersPS = this.findOrdersSQL();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public boolean SaveCustomer(Customer c) throws SQLException {
        connection.setAutoCommit(false);
        boolean result = false;

        try {
            saveCustomerPS.setString(1, c.getEmail());
            saveCustomerPS.setString(2, c.getFirstName());

            saveCustomerPS.setString(3, c.getLastName());
            saveCustomerPS.setString(4, c.getPhone());

            if (saveCustomerPS.executeUpdate() > 0) {
                result = true;
            }
            connection.commit();
        } catch (SQLException ex) {
            connection.rollback();
        }
        connection.setAutoCommit(true);
        return result;

    }

    public boolean SaveUser(User user) throws SQLException {

        connection.setAutoCommit(false);
        boolean result = false;

        try {
            saveUserPS.setString(1, user.getEmail());
            saveUserPS.setString(2, user.getPassword());
            System.out.println(saveUserPS);

            if (saveUserPS.executeUpdate() > 0) {
                result = true;
            }
            connection.commit();
        } catch (SQLException ex) {
            connection.rollback();
        }
        connection.setAutoCommit(true);
        return result;
    }

    

    public boolean signin(String email, String password){

        boolean result = false;
        ResultSet rs = null;
        try {
            signinPS.setString(1, email);
            signinPS.setString(2, password);
            rs = signinPS.executeQuery();
            if (rs.next()) {
                result = true;
            }

        } 
        catch (SQLException ex) {

        }

        return result;
    }

    public boolean saveOrder(Customer cu, CustomerOrder co) throws SQLException {

        connection.setAutoCommit(false);
        boolean result = false;

        try {
            saveOrderPS.setString(1, co.getCryptoName());
            saveOrderPS.setString(2, co.getExchange());

            saveOrderPS.setDouble(3, co.getTradingFee());
            saveOrderPS.setString(4, co.getFiat());
            saveOrderPS.setString(5, co.getOrderType());
            saveOrderPS.setDouble(6, co.getAmount());
            saveOrderPS.setDouble(7, co.getPrice());
            saveOrderPS.setString(8,  co.getTime());
            saveOrderPS.setInt(9, cu.getCustomerID());

            if (saveOrderPS.executeUpdate() > 0) {
                result = true;
            }
            connection.commit();
        } catch (SQLException ex) {
            connection.rollback();
        }
        connection.setAutoCommit(true);
        return result;

    }

    public Customer findCustomer(String email) {
        ResultSet rs;
        Customer c = new Customer();
        try {
            findCustomerPS.setString(1, email);
            rs = findCustomerPS.executeQuery();

            if (rs.next()) {
                int cusId = rs.getInt("CUSTOMERID");
                String firstn = rs.getString("FIRSTNAME");
                String lastn = rs.getString("LASTNAME");
                String phone = rs.getString("PHONE");
                c = new Customer(cusId, firstn, lastn, email, phone);

            }
        } catch (SQLException ex) {

        }

        return c;

    }

    public List<CustomerOrder> findOrders(Customer cu) {
        ResultSet rs;
        List<CustomerOrder> orders = new ArrayList<CustomerOrder>();
        int cusId = cu.getCustomerID();
        try {
            findOrdersPS.setInt(1, cusId);
            rs =findOrdersPS.executeQuery();

            while (rs.next()) {
                int orderId = rs.getInt("ORDERID");
                String crypto = rs.getString("CRYPTONAME");
                String exchange = rs.getString("EXCHANGE");
                double tradingFee = rs.getDouble("TRADINGFEE");
                String fiat = rs.getString("FIAT");
                String orderType = rs.getString("ORDERTYPE");
                double amount = rs.getDouble("AMOUNT");
                double price = rs.getDouble("PRICE");
                String time = rs.getString("TIME");

                CustomerOrder order = new CustomerOrder(orderId, crypto, exchange, tradingFee, fiat, orderType, amount, price, time, cusId);
                orders.add(order);

            }
        } catch (SQLException ex) {

        }

        return orders;
    }




    private PreparedStatement saveCustomerSQL() throws SQLException {
        return connection.prepareStatement("insert into APP.Customer(EMAIL,FIRSTNAME,LASTNAME,PHONE) values(?,?,?,?)");
    }

    private PreparedStatement saveUserSQL() throws SQLException {
        return connection.prepareStatement("insert into APP.USERFILE values(?,?)");
    }

    private PreparedStatement signinSQL() throws SQLException {
        return connection.prepareStatement("Select * from APP.USERFILE where APP.USERFILE.email=? and APP.USERFILE.password=?");
    }

    private PreparedStatement saveOrderSQL() throws SQLException {
        return connection.prepareStatement("insert into APP.CustomerOrder(CRYPTONAME,EXCHANGE,TRADINGFEE,FIAT,ORDERTYPE,AMOUNT,PRICE,TIME,CUSTOMERID) values(?,?,?,?,?,?,?,?,? )");
    }

    private PreparedStatement findCustomerSQL() throws SQLException {
        return connection.prepareStatement("Select * from APP.CUSTOMER where APP.CUSTOMER.email=?");
    }

    private PreparedStatement findOrdersSQL() throws SQLException {
        return connection.prepareStatement("Select * from APP.CUSTOMERORDER where APP.CUSTOMERORDER.CUSTOMERID=?");
    }

 

}
