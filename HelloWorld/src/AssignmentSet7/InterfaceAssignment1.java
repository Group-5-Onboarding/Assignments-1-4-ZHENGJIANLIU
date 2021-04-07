package AssignmentSet7;

interface Testable{
	 public boolean testCompatibility();
}

class Mobile {
    private String name;
	private String brand;
    private String operatingSystemName;
    private String operatingSystemVersion;
    
    public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
    	this.name = name;
    	this.brand = brand;
    	this.operatingSystemName = operatingSystemName;
    	this.operatingSystemVersion = operatingSystemVersion;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOperatingSystemName() {
		return operatingSystemName;
	}

	public void setOperatingSystemName(String operatingSystemName) {
		this.operatingSystemName = operatingSystemName;
	}

	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}
}

class SmartPhone extends Mobile implements Testable{
	private String networkGeneration;
	
	public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
		super(name, brand, operatingSystemName, operatingSystemVersion);
		this.networkGeneration = networkGeneration;
	}
	
	public String getNetworkGeneration() {
		return networkGeneration;
	}

	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}
	
	public boolean testCompatibility() {
		
		String v = this.getOperatingSystemVersion();
		
		if(this.getOperatingSystemName()=="Saturn") {
			if(this.getNetworkGeneration() == "3G") {
				if(v == "1.1" || v == "1.2" || v == "1.3") {
					return true;
				}
			} else if(this.getNetworkGeneration() == "4G") {
				if(v == "1.2" || v == "1.3") {
					return true;
				}
			} else if(this.getNetworkGeneration() == "5G") {
				if(v == "1.3") {
					return true;
				}
			}
		} else if(this.getOperatingSystemName()=="Gara") {
			if(this.getNetworkGeneration() == "3G") {
				if(v == "EXRT.1" || v == "EXRT.2" || v == "EXRU.3") {
					return true;
				}
			} else if(this.getNetworkGeneration() == "4G") {
				if(v == "EXRT.2" || v == "EXRU.1") {
					return true;
				}
			} else if(this.getNetworkGeneration() == "5G") {
				if(v == "EXRU.1") {
					return true;
				}
			}
		}
		return false;
	}
}

public class InterfaceAssignment1 {
	public static void main(String args[]){
		SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
		if(smartPhone.testCompatibility())
		    System.out.println("The mobile OS is compatible with the network generation!");
		else
		    System.out.println("The mobile OS is not compatible with the network generation!");
		
		//Create more objects for testing your code
	}
}
