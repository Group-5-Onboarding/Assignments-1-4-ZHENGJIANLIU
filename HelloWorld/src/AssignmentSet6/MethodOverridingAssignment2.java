package AssignmentSet6;

class Event{
    private String eventName;
	private String participantName;
    private double registrationFee;
    
    public Event(String eventName, String participantName) {
    	this.eventName = eventName;
    	this.participantName = participantName;
    }
    
    public void registerEvent() {
		if(this.getEventName() == "Singing") {
    		this.setRegistrationFee(8);
    	} else if(this.getEventName() == "Dancing") {
    		this.setRegistrationFee(10);
    	} else if(this.getEventName() == "DigitalArt") {
    		this.setRegistrationFee(12);
    	} else if(this.getEventName() == "Acting") {
    		this.setRegistrationFee(15);
    	} else {
    		this.setRegistrationFee(0);
    	}
    }
    
    
    public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
}

class SoloEvent extends Event{
    private int participantNo;

	public SoloEvent(String eventName, String participantName, int participantNo) {
    	super(eventName, participantName);
    	this.participantNo = participantNo;
    }
	
	public void registerEvent() {
		super.registerEvent();
	}
	
    public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
}

class TeamEvent extends Event{
    private int noOfParticipant;
	private int teamNo;
    
    public TeamEvent(String eventName, String participantName, int noOfParticipant, int teamNo) {
    	super(eventName, participantName);
    	this.noOfParticipant = noOfParticipant;
    	this.teamNo = teamNo;    	
    }
    
    public void registerEvent() {
		if(this.getEventName() == "Singing") {
    		this.setRegistrationFee(4 *this.getNoOfParticipant());
    	} else if(this.getEventName() == "Dancing") {
    		this.setRegistrationFee(6 *this.getNoOfParticipant());
    	} else if(this.getEventName() == "DigitalArt") {
    		this.setRegistrationFee(8 *this.getNoOfParticipant());
    	} else if(this.getEventName() == "Acting") {
    		this.setRegistrationFee(10 *this.getNoOfParticipant());
    	} else {
    		this.setRegistrationFee(0);
    	}
	}
    
    public int getNoOfParticipant() {
		return noOfParticipant;
	}

	public void setNoOfParticipant(int noOfParticipant) {
		this.noOfParticipant = noOfParticipant;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
    
    
}

public class MethodOverridingAssignment2 {
	public static void main(String[] args) {
        
        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
		soloEvent.registerEvent();
		if (soloEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + soloEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
			System.out.println("Your participant number is " + soloEvent.getParticipantNo());

		} else {
			System.out.println("Please enter a valid event");
		}

		System.out.println();
		TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
		teamEvent.registerEvent();
		if (teamEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + teamEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
			System.out.println("Your team number is " + teamEvent.getTeamNo());
		} else {
			System.out.println("Please enter a valid event");
		}
	}
}
