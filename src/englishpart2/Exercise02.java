package englishpart2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		// New scanner
		Scanner reader = new Scanner(System.in);

		// Your age
		int age;

		// Year
		int year;

		// Print message
		System.out.println("Introduce the age");
		age = reader.nextInt();

		// Calculate the birth year
		year = (2025 - age);

		// Final message
		System.out.println("Your bith year is: " + year);

		// Close scanner
		reader.close();

	}

}
