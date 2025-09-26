package unit1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		// estar lloviendo
		boolean estaLloviendo;

		// terminar las tareas
		boolean tareasTerminadas;

		// ir a la biblioteca
		boolean irBiblioteca;

		// salir a la calle
		boolean salir;

		// mensaje por pantalla
		System.out.println("¿Está lloviendo?");

		// leer mensaje
		estaLloviendo = reader.nextBoolean();

		// mensaje por pantalla
		System.out.println("¿Has terminado las tareas?");

		// leer mensaje
		tareasTerminadas = reader.nextBoolean();

		// mensaje por pantalla
		System.out.println("¿Tienes que ir a la biblioteca?");

		// leer mensaje
		irBiblioteca = reader.nextBoolean();

		// condición para que funcione el programa
		salir = (!estaLloviendo && tareasTerminadas) || irBiblioteca;

		// mensaje final
		System.out.println("¿Puedo salir a la calle? " + salir);

		// cerrar scanner
		reader.close();

	}

}
