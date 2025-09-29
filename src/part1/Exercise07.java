package part1;

import java.util.Scanner;

public class Exercise07 {

public static void main(String[] args) {
		
		// 
		String name;
		
		//
		String adress;
		
		//
		int phone;
		
		
		//new scanner
		Scanner reader= new Scanner(System.in);
		
		//the console ask for a number
		System.out.println("Introduce your name");
		
		//reading the number
		name = reader.nextLine();
		
		//the console ask for a number
		System.out.println("Introduce your adress");
		
		//reading the number
		adress = reader.nextLine();
		
		//the console ask for a number
				System.out.println("Introduce your phone number");
				
		//reading the number
		phone = reader.nextInt();
		
		
		//final message
		System.out.println("Your name is: "+ name);
		System.out.println("Your adress is: "+ adress);
		System.out.println("Your phone number is: "+ phone);
		
		
		//close scanner
		reader.close();

	}

}
