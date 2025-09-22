package unit1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Creating a new Scanner
				Scanner reader = new Scanner(System.in);
		
				int year;
				int born;

				//Ask the user a number
				System.out.print("Which year is it?");
				
				//The console waits for an answer
				year = reader.nextInt();
			
				//Ask the user a number
				System.out.print("Now, in which year you were borned?");
				
				
				
				
				//Print a message with the previous number + 1
				System.out.println("");
				
				//The console waits for an answer
				born = reader.nextInt();
				
				reader.close();
	}

}
