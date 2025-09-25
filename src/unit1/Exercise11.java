package unit1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		 
		//euro
		double euro;
		
		//peseta
		double peseta;
		
		//nuevo scanner
		Scanner reader= new Scanner(System.in);
		
		//Imprimir mensaje
		System.out.println("Introduce una cantidad de euros para convertir a pesetas");
		
		//leer el número
		euro= reader.nextDouble();
		
		//ecuación para pasar de euro a peseta
		peseta = euro*166;
		
		//mensaje final
		System.out.println(euro + " euros son: " + peseta + " pesetas.");
		
		//cerrar scanner
		reader.close();
		
		
		
		
	}

}
