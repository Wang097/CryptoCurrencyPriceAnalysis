<%-- 
    Document   : Success
    Created on : 27/11/2017, 3:26:18 PM
    Author     : Alan Sun
--%>

<%
    if ((session.getAttribute("email") == null) || (session.getAttribute("email") == "")) {
%>
You are not logged in<br/>
<a href="Signin.jsp">Please Sign In</a>
<%} else {
%>

<br />
<br />
<center><h2>Welcome <%=session.getAttribute("email")%> to our website</h2></center>
<br />
<br />

<form action="LogController" method="POST">
    
       <center>
      
           
           <table border="1" width="450" >

              <tr>
                  <td><h3><a href="marketInfo.jsp">Bitcoin Realtime Price</a></h3> </td>
              </tr>
              <tr>
                  <td><h3><a href="priceDiff.jsp">Price Differences Analysis </a></h3></td>
              </tr>
              <tr>
                  <td><h3> <a href="InputTransaction.jsp">Input Transaction</a></h3></td>
              </tr>
              <tr>
                  <td><h3><a href="LogController?action=review">Transaction Record</a></h3></td>
              </tr>

      </table>
       </center>


       
    
    
    

    
</form>

<%
    }
%>