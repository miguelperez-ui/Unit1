package part2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// milímetros
		double mili;

		// centímetros
		double centi;

		// metros
		double metro;

		// suma total
		double total;

		// mensaje por pantalla
		System.out.println("Introduce una medida en milímetros:");

		// lectura
		mili = reader.nextDouble();

		System.out.println("Introduce una medida en centímetros:");
		centi = reader.nextDouble();

		System.out.println("Introduce una medida en metros:");
		metro = reader.nextDouble();

		// ecuaciones para pasar a centímetros
		mili = mili / 10;
		metro = metro * 100;

		// ecuación para sumar
		total = mili + metro + centi;

		// mensaje final
		System.out.println("La suma de estas medidas es de: " + total + " centímetros.");

		// cerrar scanner
		reader.close();
	}

}
