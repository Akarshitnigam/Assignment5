<%@ page import='java.util.Random' %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add customer</title>
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
      <!-- Form -->  <!-- <%=request.getContextPath()%> -->
          <form action="AddCustomerServlet" method="post">
        <table>
            <tr>
                <td>Customer ID:</td>
                <td><input type="text" name="customerId" required></td>
            </tr>
            <tr>
                <td>Customer Name:</td>
                <td><input type="text" name="customerName" required></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td>
                    <input type="radio" name="gender" value="Male" required>Male
                    <input type="radio" name="gender" value="Female">Female
                </td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><textarea name="address" rows="4" cols="30" required></textarea></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td>
                    <select name="country" required>
                        <option value="">Select Country</option>
                        <option value="USA">USA</option>
                        <option value="Canada">Canada</option>
                        <option value="UK">UK</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Hobbies:</td>
                <td >
                    <input type="checkbox" name="hobbies1" value="Reading" >Reading
                    <input type="checkbox" name="hobbies2" value="Sports">Sports
                    <input type="checkbox" name="hobbies3" value="Music">Music
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit">
                    <input type="reset" value="Reset">
                </td>
            </tr>
        </table>
    </form>
      
        
        
     </div>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        




 
    <div id="footer">
        <p>Contact us at abc@gmail.com </p>
        <p>Our address is  xyz</p>
        <p><a href="http://www.google.com">Link to Google</a></p>
    </div>
</body>
</html>