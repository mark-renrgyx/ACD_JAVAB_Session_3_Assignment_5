package week1.day3.assignment5.bank;

public class Saving extends Account {
	private double rateOfInt;

	public Saving(int accountNumber, String accountName, float accountBalance, double rateOfInt) {
		super(accountNumber, accountName, accountBalance);
		this.rateOfInt = rateOfInt;
	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}
}
