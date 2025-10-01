package part2;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// problema
		int problema;

		// volumen
		int volumen;

		// mensaje por pantalla y lectura
		System.out.println("Introduce un problema y te diré en que volumen está");
		problema = reader.nextInt();

		// ecuación para pasar de problema a volumen
		volumen = problema / 100;

		// quitar parte decimal
		volumen = (int) volumen;

		// mensaje final
		System.out.println("El problema introducido está en el volumen " + volumen);

		// cerrar scanner
		reader.close();

	}

}
