package unit1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		
		double manzana;
		double pera;
		double ventamanzana;
		double ventapera;
		
		
		
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Inserta el número de kilos que has vendido de manzanas");
		
		manzana = reader.nextDouble();
		
		System.out.println("Inserta el número de kilos que has vendido de peras");
		
		pera = reader.nextDouble();
		
		ventamanzana = manzana*2.35;
		ventapera = pera*1.95;
		
		System.out.println("Has ganado " + ventamanzana + " euros con la venta de las manzanas.");
		System.out.println("Has ganado " + ventapera + " euros con la venta de las peras.");
		
		reader.close();
		
		
		
		
		
	}

}
