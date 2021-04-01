package com.infy;
import com.infy.Food;
import com.infy.Restaurant;
import com.infy.Order;
import com.infy.Customer;
public class Tester {
	public static void main(String[] args) {
		
		Food f1 = new Food("Spinach Alfredo Pasta", "Spain", "Main Dish", 10, 35.00);
		Food f2  = new Food("Garlic Shrimp", "Asian", "App", 30, 25.00);
		int subTotal = (int)f1.getUnitPrice();
		
		Order o1 = new Order(f1.getFoodName());
		Order o2 = new Order(f2.getFoodName());
		Order o3 = new Order();

		System.out.println("\n---- Order ----\n");
		System.out.println("Order details");
		System.out.println("Order Id: " + o1.getOrderId());
		System.out.println("Ordered Food: " + o1.getOrderedFoods());
		System.out.println("Order Status: " + o1.getStatus());
		System.out.println("Total Price: " + o1.calculateTotalPrice(subTotal));
		System.out.println("\n------------------\n");
		System.out.println("Status of order 3: " + o3.getStatus());
		System.out.println("Status of order 2: " + o2.getStatus());
		System.out.println("Id of order 2: " + o2.getOrderId());
		System.out.println("Items ordered in order 2: " + o2.getOrderedFoods());
		
		
		System.out.println("\n---- Restaurant ----\n");
		
		Restaurant r1 = new Restaurant("McDonald's",9988676767l, "SH1109, carolina Street, Springfield", 4.1f);
		
		Restaurant r2 = new Restaurant();
		r2.restaurantName = "McDonald's";
		r2.restaurantContact = 98213214212l;
		r2.restaurantAddress ="D089, St. Louis Street, Springfield";
		r2.rating = 4.1f;
		
		r1.displayRestaurantDetail();
		r2.displayRestaurantDetail();
	}
}
