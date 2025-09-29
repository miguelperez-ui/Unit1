package part2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// numero 1
		int numero1;
		
		// numero 2
		int numero2;
		
		// numero que hay que sumar
		int numeroFinal;

		// resto
		int resto;

		// mensaje por pantalla
		System.out.println("Introduce un número:");

		// lectura
		numero1 = reader.nextInt();
		
		// mensaje por pantalla
		System.out.println("Introduce otro número:");
		
		// lectura
		numero2 = reader.nextInt();

		// ecuación para saber el resto
		resto = numero1 % numero2;

		// ecuación para saber cuánto tienes que sumarle al número
		numeroFinal = (resto == 0) ? 0 : numero2 - resto;

		// mensaje final
		System.out.println("Para que "+ numero1+ " sea múltiplo de "+ numero2 + " tienes que sumarle: " +numeroFinal);

		// cerrar scanner
		reader.close();

	}




}
