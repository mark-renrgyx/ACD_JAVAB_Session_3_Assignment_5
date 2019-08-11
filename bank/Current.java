package week1.day3.assignment5.bank;

public class Current extends Account{
	private double rateOfInt;
	
	public Current(int accountNumber, String accountName, float accountBalance, double rateOfInt) {
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
