package demo330;

class Customer {
	public String customerId;
	public String customerName;
	public String address;
	public long contactNumber;
	
	public Customer(){
		System.out.println("Display customer details");
	}
	
	public Customer(String cId, String cName, String address, long cNumber) {
		this.customerId = cId;
		this.customerName = cName;
		this.address = address;
		this.contactNumber = cNumber;
		
	}
	
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
	
	public void changeName(Customer c) {
		c.customerName = "ZHENGJIAN LIU";
	}
	
	public double payBill(double totalPrice, double discountPercentage) {
		System.out.println("Calculating final amount to be paid......");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		return priceAfterDiscount;
	}

	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		c1.customerId = "C100";
		c1.customerName = "Jay";
		c1.address = "9890 80th st";
		c1.contactNumber = 909121121;
		
		c1.changeName(c1);
		c1.displayCustomerDetails();
		
//		System.out.println(c1.payBill(1000, 20));
		
		Customer c2 = new Customer("C102","Heyhey", "8080-23rd st", 24124124);
		c2.displayCustomerDetails();
	}
}

