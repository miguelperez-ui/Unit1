package part1;

import java.util.Scanner;

public class Exercise05 {

public static void main(String[] args) {
		
		//radio de la circunferencia
		double radio;
		
		//longitud de la circunferencia
		double longitud;
		
		//área de la circunferencia
		double area;
		
		//creo un nuevo scanner
		Scanner reader = new Scanner(System.in);
		
		//En este paso el usuario introduce el radio
		System.out.println("Introduce el radio de la circunferencia");
		
		//la consola lee el mensaje
		radio = reader.nextDouble(); 
		
		//fórmula de la longitud
		longitud= 2*Math.PI*radio;
		
		//la consola imprime la longitud
		System.out.println("La longitud de la circunferencia es " + longitud);
		
		//fórmula del área
		area = Math.PI* Math.pow(radio, 2);
		
		//la consola imprime el área
		System.out.println("El área de la circunferencia es " + area);
		
		//cierro el scanner
		reader.close();

		
	
		
		
	}

}
