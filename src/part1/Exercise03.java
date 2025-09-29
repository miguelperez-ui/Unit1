package part1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Creating a new Scanner
				Scanner reader = new Scanner(System.in);
		
				int year;
				int born;
				int a;

				//Ask the user a number
				System.out.print("Which year is it?");
				
				//The console waits for an answer
				year = reader.nextInt();
			
				//Ask the user a number
				System.out.print("Now, in which year you were borned?");
				
				//The console waits for an answer
				born = reader.nextInt();
				
				a= year - born;
						
				//Print a message with the year it is minus the year you have borned
				System.out.println("Your age is "+ a);
				
				
				//The console waits for an answer
				born = reader.nextInt();
				
				reader.close();
	}

}
