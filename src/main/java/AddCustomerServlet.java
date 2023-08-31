
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCustomerServlet")
public class AddCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        String customerName = request.getParameter("customerName");
        String  gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String country = request.getParameter("country");
        
        //Important
        //String hobbies = request.getParameter("hobbies");
        String hobbies = Stream.of(request.getParameter("hobbies1"), request.getParameter("hobbies2"), request.getParameter("hobbies3"))
        		                 .filter(Objects::nonNull)
        		                 .collect(Collectors.joining(","));
        
        System.out.println(hobbies);
        
        Customer newcust = new Customer(customerId, customerName, gender, address, country, hobbies);
        
        try {
            CustomerDAO dao = new CustomerDAO();
        	boolean insertedOrNot = dao.insertCustomer(newcust);
        	
        	if(insertedOrNot) {
        	//	response.sendRedirect("/Assignment5/src/main/webapp/registrationSuccessful.jsp");
        		
        		RequestDispatcher rd = request.getRequestDispatcher("registrationSuccessful.jsp");
        		rd.forward(request, response);
        		
        	} else {
                response.sendRedirect("/Assignment5/src/main/webapp/registrationfailed.jsp");
            }
        	
        	/*
            //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdb", "username", "password");

            // Write SQL query
            String sql = "INSERT INTO customers (customerId, customerName) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, customerId);
            statement.setString(2, customerName);

            // Execute query
            int rowsInserted = statement.executeUpdate();

            // Close resources
            statement.close();
            connection.close();

            if (rowsInserted > 0) {
                response.sendRedirect("registrationSuccessful.jsp");
            } else {
                response.sendRedirect("registrationFailed.jsp");
            }*/
        	
        	
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("registrationFailed.jsp");
        }
    }
}