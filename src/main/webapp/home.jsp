<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Management System</title>


<style>
        /* Style for the footer */
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
    
    <header id="header">
        <img src="csm.png" alt="Logo" />
        
    </header>
    <h1>Customer Management System</h1>
    <div id="central">
        <h2>Welcome to Customer Management System</h2>
        <p>Please select an option:</p>
        <ul>
            <li><a href="addcustomer.jsp">Add Customer</a></li>
            <li><a href="searchCustomer.jsp">Search Customer</a></li>
        </ul>
    </div>
    
    <div id="footer">
        <p>Contact us at abc@gmail.com </p>
        <p>Our address is  xyz</p>
        <p><a href="http://www.google.com">Link to Google</a></p>
    </div>
</body>






</html>