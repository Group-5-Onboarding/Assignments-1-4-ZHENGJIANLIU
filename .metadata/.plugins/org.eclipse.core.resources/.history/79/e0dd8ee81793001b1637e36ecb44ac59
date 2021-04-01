package AssignmentSet4;

import java.util.Calendar;

public class Traveler {
	private final int customerId = 1001;
	private int travelerId;
	private int baggageAmount;
	private int expiryyear;
	private boolean nocStatus;
	public int getTravelerId() {
		return travelerId;
	}
	public void setTravelerId(int travelerId) {
		this.travelerId = travelerId;
	}
	public int getBaggageAmount() {
		return baggageAmount;
	}
	public void setBaggageAmount(int baggageAmount) {
		this.baggageAmount = baggageAmount;
	}
	public int getExpiryyear() {
		return expiryyear;
	}
	public void setExpiryyear(int expiryyear) {
		this.expiryyear = expiryyear;
	}
	public boolean getNocStatus() {
		return nocStatus;
	}
	public void setNocStatus(boolean nocStatus) {
		this.nocStatus = nocStatus;
	}
	public int getId() {
		return customerId;
	}
	public boolean checkBaggage() {
		boolean ret = false;
		if (this.baggageAmount >= 0 && this.baggageAmount <= 40) {
			nocStatus = true;
			ret = true;
		} else {
			nocStatus = true;
			System.out.println("Invalid baggage amount");
		}
		return ret;
	}
}