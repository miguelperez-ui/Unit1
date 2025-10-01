package part2;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// año
		int ano;

		// siglo
		int siglo;

		// mensaje por pantalla y lectura
		System.out.println("Dime un año y te lo convertiré a que siglo pertenece");
		ano = reader.nextInt();

		// conversión de año a siglo
		siglo = ano / 100;
		siglo++;

		// mensaje final
		System.out.println("Ese año pertenece al siglo: " + siglo);

		// cerrar scanner
		reader.close();

	}

}
