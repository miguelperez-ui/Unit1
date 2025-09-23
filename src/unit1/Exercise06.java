package unit1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		// first number
		double a;
		
		//second number
		double b;
		
		//first number + second number
		double suma;
		
		//first number -  second numbe
		double resta;
		
		//first number * second number
		double multiplicacion;
		
		//first number / second number
		double division;
		
		//new scanner
		Scanner reader= new Scanner(System.in);
		
		//the console ask for a number
		System.out.println("Introduce a number");
		
		//reading the number
		a = reader.nextDouble();
		
		//the console ask for a number
		System.out.println("Introduce another number");
		
		//reading the number
		b = reader.nextDouble();
		
		//equations
		suma= a + b;
		
		resta= a-b;
		
		multiplicacion= a*b;
		
		division= a/b;
		
		//final message
		System.out.println("Your first number + your second number is: "+ suma);
		System.out.println("Your first number - your second number is: "+ resta);
		System.out.println("Your first number * your second number is: "+ multiplicacion);
		System.out.println("Your first number /your second number is: "+ division);
		
		//close scanner
		reader.close();

	}

}
