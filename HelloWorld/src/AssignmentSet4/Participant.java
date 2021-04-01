package AssignmentSet4;

public class Participant {
	private static int counter;
	private String registrationId;
	private String name;
	private long contactNumber;
	private String city;
	
	static {
		counter = 10000;
	}
	
	public Participant(String name, long contactNumber, String city) {
		this.registrationId = "D" + ++Participant.counter;
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
	}
	
	public String getRegistrationId() {
		return registrationId;
	}
	
	public static int getCounter() {
		return counter;
	}
	
	public static void setCounter(int counter) {
		Participant.counter = counter;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public static void main(String[] args) {
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		
		Participant[] participants = { participant1, participant2 };
		for (Participant participant : participants) {
			System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}
		
	}
	
	
}
