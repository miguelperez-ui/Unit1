package part1;

import java.util.Scanner;

public class Exercise08 {

public static void main(String[] args) {
		
		//name
		String name;
		
		//age
		int age;
		
		
		//new scanner
		Scanner reader= new Scanner(System.in);
		
		//the console asks your name
		System.out.println("Introduce your name");
		
		//reading the name
		name = reader.nextLine();
		
		//the console asks your age
		System.out.println("Introduce your age");
		
		//reading the number
		age = reader.nextInt();
		
		
		//final message
		System.out.println("Hola "+ name + ", tienes "+ age + " años, ¡qué mayor eres!." );
		
		//close scanner
		reader.close();

	}

}
