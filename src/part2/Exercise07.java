package part2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// número de entradas infantiles
		double infan;

		// número de entradas adultas
		double adulto;

		// suma del precio de las entradas
		double total;

		// descuento del precio final
		double descuento;

		// valor de la entrada infantil
		final double ENTRADA1 = 15.5;

		// valor de la entrada adulta
		final double ENTRADA2 = 20;

		// valor del descuento
		final double DESCUENTO = 0.05;

		// mensaje por pantalla
		System.out.println("¡Buenas tardes!, ¿Cuántas entradas infantiles deseas comprar?");

		// lectura
		infan = reader.nextDouble();

		System.out.println("¿Y, cuántas entradas para adultos deseas comprar?");
		adulto = reader.nextDouble();

		// precio de las entradas infantiles
		infan = infan * ENTRADA1;

		// precio de las entradas adultas
		adulto = adulto * ENTRADA2;

		// precio total
		total = infan + adulto;

		// condición para que se aplique el descuento
		descuento = (total >= 100) ? total - total * DESCUENTO : total + 0;

		// mensaje final
		System.out.println("El precio total es de: " + descuento + " euros.");

		// cerrar scanner
		reader.close();

	}

}
