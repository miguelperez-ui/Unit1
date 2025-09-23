package unit1;

import java.util.Scanner;

public class Exercise08 {

public static void main(String[] args) {
		
		// 
		String name;
		
		//
		int age;
		
		
		//new scanner
		Scanner reader= new Scanner(System.in);
		
		//the console ask for a number
		System.out.println("Introduce your name");
		
		//reading the number
		name = reader.nextLine();
		
		//the console ask for a number
		System.out.println("Introduce your age");
		
		//reading the number
		age = reader.nextInt();
		
		
		//final message
		System.out.println("Hola "+ name + ", tienes "+ age + " años, ¡qué mayor eres!." );
		
		//close scanner
		reader.close();

	}

}
