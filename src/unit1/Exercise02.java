package unit1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Creating a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declare variable a and b
		
		int a;
		int b;
				
		
		//Ask the user a number
		System.out.print("Write your age:");
		
	   
		//The console waits for an answer
		a = reader.nextInt();
		
		b = a+1;
		
		//Print a message with the previous answer
		System.out.println("Your age next year will be "+ b);
		
        //Close the scanner
		reader.close();
		
		
	}

}