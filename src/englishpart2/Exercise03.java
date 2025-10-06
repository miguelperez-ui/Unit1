package englishpart2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// New a Scanner 
		Scanner reader = new Scanner(System.in);

		// Base, height, area and perimeter
		double base;
		double height;
		double area;
		double perimeter;

		// Ask the user to enter the length
		System.out.println("Enter the base value: ");
		base = reader.nextDouble();

		// Ask the user to enter the height
		System.out.println("Enter the height value: ");
		height = reader.nextDouble();

		// Calculate the area of the rectangle
		area = base * height;

		// Calculate the perimeter of the rectangle
		perimeter = base * 2 + height * 2;

		// Final message
		System.out.println("The area is: " + area);
		System.out.println("The perimeter is: " + perimeter);

		// Close the Scanner 
		reader.close();
	}

}
