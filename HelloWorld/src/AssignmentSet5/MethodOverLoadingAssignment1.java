package AssignmentSet5;

class Bill{
	

    public double findPrice(int itemId){
    	if(itemId == 1001) {
    		return 25;
    	} else if(itemId == 1002) {
    		return 20;
    	} else if(itemId == 1003) {
    		return 23;
    	} else if(itemId == 1004) {
    		return 18;
    	}else {
    		return 0;
    	}
    }
    
    public double findPrice(String brandName, String itemType, int size) {
    	if(brandName == "Puma") {
    		if(itemType== "T-shirt") {
    			return 25;
    		}else if(itemType == "Skirt") {
    			return 20;
    		}else {
    			return 0;
    		}
    	}else if (brandName == "Reebok") {
    		if(itemType== "T-shirt") {
    			return 23;
    		}else if(itemType == "Skirt") {
    			return 18;
    		}else {
    			return 0;
    		}
    	}else {
    		return 0;
    	}
    }
}

public class MethodOverLoadingAssignment1 {
	public static void main(String[] args) {
		
		Bill bill = new Bill();
		
		double price = bill.findPrice(1001);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The Item Id is invalid");
		
		price = bill.findPrice("Reebok","T-shirt",34);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The values are not valid");
	}
}
