<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Customer</title>

<style>
        #header {
            display: flex; /* Use flexbox to arrange items horizontally */
            justify-content: space-between; /* Distribute items evenly along the line */
            align-items: center; /* Center items vertically */
            background-color: #f0f0f0;
            padding: 10px;
        }
        
        /* Style for the footer */
        #footer {
            display: flex; /* Use flexbox to arrange items horizontally */
            justify-content: space-between; /* Distribute items evenly along the line */
            align-items: center; /* Center items vertically */
            background-color: #f0f0f0;
            padding: 10px;
        }
        
        /* Style for footer links */
        #footer a {
            text-decoration: none;
            color: #333;
        }
</style>
</head>
<body>

<div id="header">
        <img src="csm.png" alt="Logo" />
        
    </div>
	<h1>Customer Management System</h1>
      
      
      
      
      
      
      
   <div id="central">
      <!-- Form -->  
      <!--  
          <form action="SearchCustomerServlet" method="post">
        <table>
            <tr>
                <td>Customer Name:</td>
                <td><input type="text" name="customerName" required></td>
            </tr>
            
            <tr>
                <td colspan="2">
                    <input type="submit" value="Search">
                    <input type="reset" value="Reset">
                </td>
            </tr>
        </table>
    </form>
      -->
        
        
    <form action="SearchCustomerServlet" method="post">
        <label for="customerName">Customer Name:</label>
        <input type="text" name="customerName" id="customerName" required>
        <input type="submit" value="Search">
        <input type="reset" value="Reset">
    </form>
    
    
        
     </div>
   
      
      
      
      
      
      <!-- <h1>Data from Database Table</h1>
    
    <ul>
        <c:forEach var="item" items="${dataList}">
            <li>${item}</li>
        </c:forEach>
    </ul>
     -->
      
    
    <!-- Display search results here -->
    <div>
        <h2>Search Results:</h2>
        <ul>
            <c:forEach var="customer" items="${customersList}" >
                <tr>
                <td>${customer.customer_id}</td> 
                <td>${customer.customer_name}</td>
                <td>${customer.gender}</td> 
                <td>${customer.address}</td>
                <td>${customer.country}</td>
                <td>${customer.hobbies}</td>
                </tr>
            </c:forEach>
        </ul>
    </div>
      
      
      
      
      <!-- For debugging purpose -->
      <c:forEach var="result" items="${searchResults}">
            <tr>
                <td>${result}</td>
            </tr>
        </c:forEach>
      
      
      
      
      
      
      
      
      
      
      
      
      



    <div id="footer">
        <p>Contact us at abc@gmail.com </p>
        <p>Our address is  xyz</p>
        <p><a href="http://www.google.com">Link to Google</a></p>
    </div>

</body>
</html>