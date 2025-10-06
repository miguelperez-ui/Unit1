package englishpart2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// New Scanner 
        Scanner reader = new Scanner(System.in);
        
        // Declare variables for weight, height and BMI
        double weight;
        double height;
        double BMI;
        
        // Ask the user to enter their weight in kilograms
        System.out.println("Enter your weight in kilograms: ");
        weight = reader.nextDouble();
        
        // Ask the user to enter their height in meters
        System.out.println("Enter your height in meters: ");
        height = reader.nextDouble();
        
        // Calculate BMI using the formula: weight / (height * height)
        BMI = weight/(height * height);
        
        // Final message
        System.out.println("Your BMI is: " + BMI);
        
        // Close the Scanner 
        reader.close();



	}

}
