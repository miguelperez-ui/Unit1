package unit1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Creating a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declare variable number
				double number;
				
		//Ask the user a number
		System.out.print("Write a number:");
		
		
		//The console waits for an answer
		number = reader.nextDouble();
		
		//Print a message with the previous answer
		System.out.println("You wrote : " + number);
		
        //Close the scanner
		reader.close();
		
		
	}

}
