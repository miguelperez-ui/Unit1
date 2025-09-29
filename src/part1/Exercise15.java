package part1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {

		// constante del IVA
		final int IVA = 21;

		// precio
		double precio;

		// precio con el IVA añadido
		double precioConIVA;

		// scanner nuevo
		Scanner reader = new Scanner(System.in);

		// mensaje que se ve en pantalla
		System.out.println("Introduzca el precio");

		// leer el número
		precio = reader.nextDouble();

		// ecuación para calcular el precio con IVA
		precioConIVA = precio + (precio * IVA / 100);

		// mensaje final
		System.out.println("El precio con IVA es: " + precioConIVA);

		// cerrar scanner
		reader.close();

	}

}
