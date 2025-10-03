package englishPart2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		// Create new scanner
		Scanner reader = new Scanner(System.in);

		// your age
		int age;

		// year
		int year;

		// print message
		System.out.println("Introduce the age");

		// read answer
		age = reader.nextInt();

		// ecuation for the birth year
		year = (2025 - age);

		// final message
		System.out.println("Your bith date is: " + year);

		// close scanner
		reader.close();

	}

}
