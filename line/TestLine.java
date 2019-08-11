package week1.day3.assignment5.line;

import java.util.Scanner;

public class TestLine {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("x-coordinate for first point?");
		int x1 = in.nextInt();
		
		System.out.println("y-coordinate for first point?");
		int y1 = in.nextInt();
		
		System.out.println("x-coordinate for second point?");
		int x2 = in.nextInt();
		
		System.out.println("y-coordinate for second point?");
		int y2 = in.nextInt();
		
		Line l = new Line (new Point (x1, y1), new Point(x2, y2));
		
		String output = "";
		output += "1: (" + Integer.toString(l.getPoint1().getX()) + ", " + Integer.toString(l.getPoint1().getY()) + ")\n";
		output += "2: (" + Integer.toString(l.getPoint2().getX()) + ", " + Integer.toString(l.getPoint2().getY()) + ")\n";
		
		System.out.println(output);
		
		in.close();
	}
}
