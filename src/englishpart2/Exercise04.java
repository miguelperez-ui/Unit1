package englishpart2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// New Scanner
        Scanner reader = new Scanner(System.in);

        // Declare variables
        double kilos;
        double pounds;
        
        //Print message
        System.out.println("Enter the pounds value: ");
        pounds= reader.nextDouble();

        // Calculate the area of the rectangle
        kilos = pounds/2.2;

        // Final message
        System.out.println("The kilos is: " + kilos);

        // Close the Scanner
        reader.close();

	}

}
