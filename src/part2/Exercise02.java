package part2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// numero
		int numero;

		// resto
		int resto;

		// mensaje por pantalla
		System.out.println("Introduce un número:");

		// lectura
		numero = reader.nextInt();

		// ecuación para saber el resto
		resto = numero % 7;

		// ecuación para saber cuánto tienes que sumarle al número
		numero = (resto == 0) ? 0 : 7 - resto;

		// mensaje final
		System.out.println("Para que el número sea múltiplo de 7 le tienes que sumar: " + numero);

		// cerrar scanner
		reader.close();

	}

}
