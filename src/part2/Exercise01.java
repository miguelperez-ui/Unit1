package part2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// numero
		double numero;

		// parte entera
		double parteEntera;

		// parte decimal
		double parteDecimal;

		// redondeo
		double redondeo;

		// numero redondeado
		double numeroRedondeado;

		// mesaje en pantalla
		System.out.println("Introduce un número con decimales:");

		// lectura
		numero = reader.nextDouble();

		// ecuaciones para definir variables
		parteEntera = (int) numero;
		parteDecimal = numero - parteEntera;

		// ecuaciones para saber si hay que redondear hacia arriba o no
		redondeo = (parteDecimal >= 0.5) ? 1 : 0;

		numeroRedondeado = numero + redondeo;

		// mensaje final
		System.out.println("El número redondeado es: " + (int) numeroRedondeado);

		// cerrar scanner
		reader.close();

	}

}
