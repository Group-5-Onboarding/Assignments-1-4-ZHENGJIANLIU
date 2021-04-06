package AssignmentSet5;

import com.infy.Food;

class Order {
	private static int orderIdCounter;
	private int orderId;
	private Customer customer;
	private Food[] orderedFoods;
	private double totalPrice;
	private String status;

	static {
		orderIdCounter = 100;
	}

	public Order() {
		this.status = "Ordered";
	}
		
	public Order( Food[] orderedFoods, Customer customer) {
		this.orderId = ++Order.orderIdCounter;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
		this.customer = customer;
	}
	
	public static int getTotalNoOfOrders(){
		return orderIdCounter - 100;
	}

	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Food[] getOrderedFoods() {
		return orderedFoods;
	}
	
	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double calculateTotalPrice(int unitPrice) {
		double newTotal = unitPrice*1.05;
		return newTotal;
	}
	
//	public static void main(String[] args) {
//		Address address1 = new Address();
//		Customer c1 = new Customer("C103", "Jacob", 5648394590L, address1);
//		Food f1 = new Food("Spinach Alfredo Pasta", "Spain", "Main Dish", 10, 35.00);
//		
//		Order o1 = new Order(f1,c1);
//	}
}
