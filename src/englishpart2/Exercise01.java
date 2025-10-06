package englishpart2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		// New scanner
		Scanner reader = new Scanner(System.in);

		// Price
		double price;

		// Tax
		double tax;

		// Print tittle
		System.out.println("TAX CALCULATOR");

		// Ask the price value
		System.out.println("Introduce the price:");
		price = reader.nextDouble();

		// Ask the tax value
		System.out.println("Introduce the tax:");
		tax = reader.nextDouble();

		// Calculate the price with the tax included
		price = price * (1 + tax / 100);

		// Final message
		System.out.println("The price with tax is " + price);

		// Close scanner
		reader.close();

	}

}
