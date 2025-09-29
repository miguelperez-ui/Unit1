package part1;

import java.util.Scanner;

public class Exercise09 {

public static void main(String[] args) {
		
		//age
		int age;
		
		//adult
		boolean adult;
		
		//new scanner
		Scanner reader= new Scanner(System.in);
		
		//the console asks your age
		System.out.println("Introduce your age");
		
		//reading the number
		age = reader.nextInt();
		
		//equation of the boolean
		adult = age >= 18;
		
		
		//final message
		System.out.println("Are you an adult? " + adult );
		
		//close scanner
		reader.close();

	}

}
