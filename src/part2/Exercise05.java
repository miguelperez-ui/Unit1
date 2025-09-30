package part2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		// numero que introduces
		int numero;

		// horas
		int horas;

		// minutos
		int minutos;

		// segundos
		int segundos;

		// mensaje por pantalla
		System.out.println("Introduce un número de segundos:");

		// lectura
		numero = reader.nextInt();

		// ecuaciones
		horas = numero / 3600;
		minutos = (numero % 3600) / 60;
		segundos = numero % 60;

		// mensaje final
		System.out.println("Esos son: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");

		// cerrar scanner
		reader.close();

	}

}
