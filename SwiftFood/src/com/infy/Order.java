package com.infy;

class Order {
	private static int orderIdCounter;
	private int orderId;
	private Food[] orderedFoods;
	private double totalPrice;
	private String status;

	public Order() {
		this.status = "Ordered";
	}
	static {
		orderIdCounter = 100;
	}
	
	public Order( Food[] orderedFoods) {
		this.orderId = ++Order.orderIdCounter;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
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
}
