
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CustomerDAO {
 
	private String jdbcURL = "jdbc:mysql://localhost:3306/assignment5";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";
	
	//Add Customer
	private static final String INSERT_CUSTOMER = "insert into customer(Customer_id,Customer_name,Gender,Address,Country,HOBBIES) values (?,?,?,?,?,?)";
	
	//Search Customer
	private static final String SEARCH_CUSTOMER_BY_Customer_name = "Select Customer_id,Customer_name,Gender,Address,Country,HOBBIES from customer where Customer_name=?";
	
	
	
	//JDBC COnnection method
	protected Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	
	//Add Customer method
	public boolean insertCustomer(Customer cust) throws SQLException {
		
		//this boolean variable will tell that customer information is inserted or not
		boolean insertedOrNot;
		
		//Establishing a connection
		try(Connection connection = getConnection();
			 PreparedStatement preparedStatement= 
					 connection.prepareStatement(INSERT_CUSTOMER)){
		
		 preparedStatement.setInt(1, cust.getCustomer_id());
		 preparedStatement.setString(2,cust.getCustomer_name());
		 preparedStatement.setString(3,cust.getGender());
		 preparedStatement.setString(4,cust.getAddress());
		 preparedStatement.setString(5,cust.getCountry());
		 preparedStatement.setString(6,cust.getHobbies());
		 
		 
		 insertedOrNot = preparedStatement.executeUpdate() >0;
		 System.out.println(insertedOrNot);
	 }
		return insertedOrNot;
	 
	}
	
	
	
	//Search Customer by Customer_name method
	public Customer searchCustomer(String customer_name) throws SQLException {
		Customer cust = null;
		//Establishing a connection
		try(Connection connection = getConnection();
				//Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_CUSTOMER_BY_Customer_name);){
		    preparedStatement.setString(1, customer_name);
		    
		    ResultSet rs = preparedStatement.executeQuery();
		    
		    while(rs.next()) {
		    	 int customerid = rs.getInt("Customer_id");
		    	String customername = rs.getString("Customer_name");
		    	String customergender =   rs.getString("Gender");
		    	String customeraddress =   rs.getString("Address");
		    	String customercountry =   rs.getString("Country");
		    	String customerhobbies =   rs.getString("HOBBIES");
		    	
		    	cust = new Customer(customerid,customername,customergender,customeraddress,customercountry,customerhobbies);
		    	
		    	
		    }
		}
		return cust;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}