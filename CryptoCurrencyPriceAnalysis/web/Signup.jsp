<%-- 
    Document   : Signup
    Created on : 27/11/2017, 3:08:03 PM
    Author     : Alan Sun
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">BitcoinArbitrageWorld</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="index.jsp">Home</a></li>
                    <li><a href="marketInfo.jsp">Bitcoin Realtime Price</a></li>
                    <li><a href="priceDiff.jsp">Bitcoin Price Difference</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="Signup.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="Signin.jsp"><span class="glyphicon glyphicon-log-in"></span> Sign In</a></li>
                </ul>
            </div>
        </nav>
        <div>
        <form method="POST" action="LogController">
            <center>
            <table border="1" width="30%" cellpadding="5"  class="table table-bordered table-striped"  style="width: 35% !important">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="fname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td>Phone Number</td>
                        <td><input type="text" name="pnumber" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>

                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td >Already signed up!! <a href="index.jsp">Sign In Here</a></td>
                        <td><input type="hidden" name ="action" value="signupView"></input></td>
                    </tr>
                     
                </tbody>
            </table>
            </center>
        </form>
        </div>
      <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>