package part1;

import java.util.Scanner;

public class ExamenModelo1 {

	public static void main(String[] args) {

		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// primer número
		int primero;

		// segundo número
		int segundo;

		// tercer número
		int tercero;

		// media de los tres números
		double media;

		// mensaje por consola
		System.out.println("dime el primer número");

		// leer mensaje
		primero = reader.nextInt();

		// mensaje por consola
		System.out.println("dime el segundo número");

		// leer mensaje
		segundo = reader.nextInt();

		// mensaje por consola
		System.out.println("dime el tercer número");

		// leer mensaje
		tercero = reader.nextInt();

		// ecuación para hacer la media
		media = (primero + segundo + tercero) / 3.0;

		// mensaje final
		System.out.println("La media es: " + media);

		// cerra scanner
		reader.close();

	}

}
