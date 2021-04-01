package SwiftFood;

class Restaurant {
	public String restaurantName;
	public long restaurantContact;
	public String restaurantAddress;
	public float rating;
	
	public Restaurant() {
		
	}
	
	public Restaurant(String name, long restaurantContact, String restaurantAddress, float rating) {
		this.restaurantName = name;
		this.restaurantContact = restaurantContact;
		this.restaurantAddress = restaurantAddress;
		this.rating = rating;
	}
	
	public void displayRestaurantDetail() {
		System.out.println("Restaurant details \n***********");
		System.out.println("Restaurant Name : " + restaurantName);
		System.out.println("Restaurant Rating: " + rating);
		System.out.println("Restaurant Contact: " + restaurantContact);
		System.out.println("Restaurant Address: " + restaurantAddress);
		System.out.println();
	}
}
