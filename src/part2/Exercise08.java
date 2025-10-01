package part2;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// metros
		double metros;

		// centímetros
		double centi;

		// mensaje por pantalla y lectura
		System.out.println("Introduce un lanzamiento en metros:");
		metros = reader.nextDouble();

		// conversión de metros a centímetros
		centi = metros * 100;

		// quitar parte decimal a los centímetros
		centi = (int) centi;

		// mensaje final
		System.out.println("Tu lanzamiento convertido a centímeteros es de : " + centi);

		// cerrar scanner
		reader.close();

	}

}
