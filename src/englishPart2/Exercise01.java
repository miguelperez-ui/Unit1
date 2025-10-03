package englishPart2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		// new scanner
		Scanner reader = new Scanner(System.in);

		// price
		double price;

		// tax
		double tax;

		// print tittle
		System.out.println("TAX CALCULATOR");

		// print message
		System.out.println("Introduce the price:");

		// read answer
		price = reader.nextDouble();

		// print message
		System.out.println("Introduce the tax:");

		// read answer
		tax = reader.nextDouble();

		// ecuation
		price = price * (1 + tax / 100);

		// final message
		System.out.println("The price with tax is " + price);

		// close scanner
		reader.close();

	}

}
