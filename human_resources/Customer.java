package week1.day3.assignment5.human_resources;

public class Customer {
	private int custNumber;
	private String name;
	private static int custCount;
	
	static {
		custCount = 0;
	}
	
	public Customer (String name) {
		this.name = name;
		this.custNumber = custCount + 1;
		custCount++;
	}
	
	public static int getCustCount () {
		return custCount;
	}

	public int getCustNumber() {
		return custNumber;
	}

	public void setCustNumber(int custNumber) {
		this.custNumber = custNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
