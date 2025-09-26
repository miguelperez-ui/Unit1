package unit1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {

		// manzanas vendidas
		double manzana;

		// peras vendidas
		double pera;

		// dinero que ganas con las manzanas
		double ventaManzana;

		// dinero que ganas con las peras
		double ventaPera;

		// crear scanner
		Scanner reader = new Scanner(System.in);

		// mensaje en pantalla
		System.out.println("Inserta el número de kilos que has vendido de manzanas");

		// leer mensaje
		manzana = reader.nextDouble();

		// mensaje por pantalla
		System.out.println("Inserta el número de kilos que has vendido de peras");

		// leer mensaje
		pera = reader.nextDouble();

		// ecuación para las ganancias de manzanas
		ventaManzana = manzana * 2.35;

		// ecuación para las ganancias de peras
		ventaPera = pera * 1.95;

		// mensaje final
		System.out.println("Has ganado " + ventaManzana + " euros con la venta de las manzanas.");
		System.out.println("Has ganado " + ventaPera + " euros con la venta de las peras.");

		// cerrar scanner
		reader.close();

	}

}
