package model;

import java.util.Date;
import java.util.Set;

public class ParkingLotOccupation {

	private final ParkingLot parkingLot;
	private final Date parkingTimeStart;
	private final Date parkingTimeEnd;
	private final Set<Coin> payment;
	
	public ParkingLotOccupation(ParkingLot parkingLot, Date parkingTimeEnd, Set<Coin> payment) {
		this.parkingLot = parkingLot;
		this.parkingTimeEnd = parkingTimeEnd;
		this.payment = payment;
		
		this.parkingTimeStart = new Date();
	}
	
	public ParkingLot getParkingLot() {
		return parkingLot;
	}
	
	public Date getParkingTimeStart() {
		return parkingTimeStart;
	}
	
	public Date getParkingTimeEnd() {
		return parkingTimeEnd;
	}
	
	public Set<Coin> getPayment() {
		return payment;
	}
	
}
