import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SearchCustomerServlet")
public class SearchCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String customerName = request.getParameter("customerName");
        List<Customer> customerList = new ArrayList<>();
        try {
        	
        	Class.forName("com.mysql.jdbc.Driver");
			
        	// Establish database connection
        	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment5", "root", "root");

            // Write SQL query
            String sql = "SELECT * FROM customer WHERE Customer_name LIKE ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + customerName + "%");

            // Execute query
            ResultSet resultSet = statement.executeQuery();

            // Process results

            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setCustomer_id(resultSet.getInt("Customer_id"));
                customer.setCustomer_name(resultSet.getString("Customer_name"));

                customer.setGender(resultSet.getString("Gender"));
                customer.setAddress(resultSet.getString("Address"));
                customer.setCountry(resultSet.getString("Country"));
                customer.setHobbies(resultSet.getString("HOBBIES"));
                // Set other fields if needed
                
                //Just for debugging
                System.out.println(customer);
                
                
                customerList.add(customer);
            }

            
            System.out.println(customerList);
            
            //Checking
            ArrayList<String> myList = new ArrayList<>();
            myList.add("Rishabh");
            myList.add("Anshika");
            
            request.setAttribute("searchResults", myList);
            
            
            
            
            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

            // Store results in session and redirect back to JSP
            //HttpSession session = request.getSession();
            request.setAttribute("customersList", customerList);
            //session.setAttribute("customerList", customerList);
            //response.sendRedirect("searchCustomer.jsp");
            
            //Important thing which i was forgetting
            RequestDispatcher rd = request.getRequestDispatcher("searchCustomer.jsp");
    		rd.forward(request, response);
    		
            
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("searchCustomer.jsp");
        }
    }
}
