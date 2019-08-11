package week1.day3.assignment5.human_resources;

import java.util.ArrayList;
import java.util.Scanner;

public class CountCustomer {

	public static void main(String[] args) {
		System.out.println("Initial customer count: " + Customer.getCustCount());
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		for (int i = 0; i < 3; i++) {
			customers.add(takeCustomer(in));
		}
		
		System.out.println("\nDone!");
		
		in.close();
	}

	private static Customer takeCustomer(Scanner in) {
		System.out.println("New customer name?");
		String name = in.next();
		Customer c = new Customer (name);
		System.out.println("New customer created, customer count: " + Customer.getCustCount());
		return c;
	}
}
