package part1;

import java.util.Scanner;

public class ExamenModelo2 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		// número horas
		int horas;

		// precio hora
		double precioHora;

		// variable para el salario en bruto
		double salarioBruto;

		// variable para el salario en bruto
		double salarioNeto;

		// constante del descuento menor
		final double DESCUENTO_MENOR = 0.1;

		// constante del descuento mayor
		final double DESCUENTO_MAYOR = 0.15;

		// mensaje que aparece en pantalla
		System.out.println("¿Cuántas horas has trabajado esta semana?");

		// lectura
		horas = reader.nextInt();

		// mensaje que aparece en pantalla
		System.out.println("¿Cuánto cobras por hora?");

		// lectura
		precioHora = reader.nextDouble();

		// ecuación del salario bruto
		salarioBruto = horas * precioHora;

		// ecuación condicional del salario neto
		salarioNeto = (salarioBruto < 1000) ? salarioBruto - salarioBruto * DESCUENTO_MENOR
				: salarioBruto - salarioBruto * DESCUENTO_MAYOR;

		// mensaje final
		System.out.println("Tu salario bruto es de: " + salarioBruto + " euros.");
		System.out.println("Tu salario neto es de: " + salarioNeto + " euros.");

		// cierre de scanner
		reader.close();

	}

}
