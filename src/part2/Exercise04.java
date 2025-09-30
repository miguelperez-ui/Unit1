package part2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		// crear scanner
		Scanner reader = new Scanner(System.in);

		// primer número
		int a;

		// segundo número
		int b;

		// tercer número
		int c;

		// cuarto número
		int x;

		// mensaje en pantalla
		System.out.println("Introduce el primer número A:");

		// lectura
		a = reader.nextInt();

		System.out.println("Introduce el segundo número B:");
		b = reader.nextInt();

		System.out.println("Introduce el tercer número C:");
		c = reader.nextInt();

		System.out.println("Introduce el tercer número X:");
		x = reader.nextInt();

		// mensaje final
		System.out.println("La fórmula es: y=" + a + "*(" + x + ")^2 +" + b + "*(" + x + ") + " + c);

		// cerrar scanner
		reader.close();

	}

}
