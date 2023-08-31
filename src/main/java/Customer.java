

public class Customer {
	
	private int customer_id;
	private String customer_name;
	private String gender;
	private String address;
	private String country;
	private String hobbies;
	
	public Customer(int customer_id, String customer_name, String gender, String address, String country,
			String hobbies) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.gender = gender;
		this.address = address;
		this.country = country;
		this.hobbies = hobbies;
	}
	
	
	



	public Customer() {
		//super();
	}






	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", gender=" + gender
				+ ", address=" + address + ", country=" + country + ", hobbies=" + hobbies + "]";
	}






	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
}
