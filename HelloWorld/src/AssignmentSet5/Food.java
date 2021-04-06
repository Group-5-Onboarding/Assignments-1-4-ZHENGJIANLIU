package AssignmentSet5;

class Food {
	private String foodName;
	private String cuisine;
	private String foodType;
	private int quantityAvailable;
	private double unitPrice;
	
	public String getFoodName() {
		return foodName;
	}
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public String getCuisine() {
		return cuisine;
	}
	
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	
	public String getFoodType() {
		return foodType;
	}
	
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public int getQuantityAvailable() {
		return quantityAvailable;
	}
	
	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public Food(String foodName,String cuisine, String foodType, int quantityAvailable, double unitPrice){
		this.foodName = foodName;
		this.cuisine = cuisine;
		this.foodType = foodType;
		this.quantityAvailable = quantityAvailable;
		this.unitPrice = unitPrice;
	}
}
