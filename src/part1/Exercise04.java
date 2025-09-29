package part1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		//Creating a new Scanner
				Scanner reader = new Scanner(System.in);
				
				//first mark
				double first;
				
				//second mark
				double second;
				
				//average mark
				double a;

				//Ask the user a number
				System.out.print("Which is your firts mark?");
				
				//The console waits for an answer
				first = reader.nextDouble();
			
				//Ask the user a number
				System.out.print("Now, which is your second mark?");
				
				//The console waits for an answer
				second = reader.nextDouble();
				
				//average ecuation
				a= (first+second) /2.00;
						
				//Print a message with the average of the two marks
				System.out.println("Your average mark is " + a);
				
				
				reader.close();
	}
}