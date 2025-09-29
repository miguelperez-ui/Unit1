package part1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {

		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// notas de cada trimestre
		int notaPrimerTrimestre;
		int notaSegundoTrimestre;
		int notaTercerTrimestre;

		// nota que sale en el boletín
		int notaBoletin;

		// nota que sale en el expediente
		double notaExpediente;

		// mensaje por consola
		System.out.println("Introduce la nota del primer trimestre");

		// lectura del número
		notaPrimerTrimestre = reader.nextInt();

		// mensaje por consola
		System.out.println("Introduce la nota del segundo trimestre");

		// lectura del número
		notaSegundoTrimestre = reader.nextInt();

		// mensaje por consola
		System.out.println("Introduce la nota del tercer trimestre");

		// lectura del número
		notaTercerTrimestre = reader.nextInt();

		// ecuación para sacar la nota media con decimales
		notaExpediente = (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) / 3.0;

		// ecuación para sacar la nota media sin decimales
		notaBoletin = (int) notaExpediente;

		// mensaje final
		System.out.println("Tu nota en el boletín de calificaciones es: " + notaBoletin);
		System.out.println("Tu nota en el expediente académico es: " + notaExpediente);

		// cerrar scanner
		reader.close();
	}

}
