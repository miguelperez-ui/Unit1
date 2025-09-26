package unit1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		// número
		int numero;

		// número par
		boolean esPar;

		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// introducir un número
		System.out.println("Introduce un número");

		// leer número
		numero = reader.nextInt();

		// condición para que sea par
		esPar = numero % 2 == 0;

		// mensaje final
		System.out.println("¿El número es par? " + esPar);

		// cerrar scanner
		reader.close();

	}

}
