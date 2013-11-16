package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ParkingMeter {

	private final ParkingDurationCalulator parkingDurationCalulator;

	private final Set<ParkingLot> parkingLots;
	private final Set<ParkingLotOccupation> parkingLotOccupations;

	private final Set<Coin> acceptedCoins;
	private final Map<Coin, Integer> coinCounter;
	
	public ParkingMeter(ParkingDurationCalulator parkingDurationCalulator) {
		this.parkingDurationCalulator = parkingDurationCalulator;
		
		this.parkingLots = new HashSet<>();
		this.parkingLotOccupations = new HashSet<>();
		
		this.acceptedCoins = new HashSet<>();
		this.coinCounter = new HashMap<>();
	}
	
	public ParkingDurationCalulator getParkingDurationCalulator() {
		return parkingDurationCalulator;
	}
	
	public Set<ParkingLot> getParkingLots() {
		return parkingLots;
	}
	
	public void addParkingLot(ParkingLot parkingLot) {
		// TODO
	}
	
	public void removeParkingLot(ParkingLot parkingLot) {
		// TODO
	}
	
	public Set<ParkingLotOccupation> getParkingLotOccupations() {
		return parkingLotOccupations;
	}
	
	public void occupyParkingLot(ParkingLot parkingLot) {
		// TODO
	}
	
	public boolean isParkingLotOccupied(ParkingLot parkingLot) {
		// TODO
		return true;
	}
	
	public Set<Coin> getAcceptedCoins() {
		return acceptedCoins;
	}
	
	public void addAcceptedCoin(Coin coin) {
		
	}
	
	public void removeAcceptedCoin(Coin coin) {
		
	}
	
	public Map<Coin, Integer> getCoinCounter() {
		return coinCounter;
	}
	
	public Integer getCoinCounter(Coin coin) {
		return coinCounter.get(coin);
	}
	
	public void insertCoin(Coin coin) {
		// TODO
	}
	
	public void removeCoin(Coin coin) {
		// TODO
	}

}
