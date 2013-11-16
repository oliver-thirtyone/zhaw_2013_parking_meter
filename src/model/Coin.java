package model;

public class Coin {

	private final String currency;	
	private final int denomination;
	
	public Coin(String currency, int denomination) {
		this.currency = currency;
		this.denomination = denomination;
	}
	
	public String getCurrency() {
		return currency;
	}
	public int getDenomination() {
		return denomination;
	}
	
}
