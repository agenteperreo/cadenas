package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Introducimos las variables
		String frase;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario una frase
		System.out.println("Dime una frase: ");
		frase = sc.nextLine();

		// Invertimos la frase al revés
		String fraseInvertida = new StringBuilder(frase).reverse().toString();

		// Comprobamos si es una frase palíndroma
		if (frase.equals(fraseInvertida)) {
			System.out.println("La frase es palíndroma");
		} else {
			System.out.println("La frase no es palíndroma");
		}

		// Cerramos el scanner
		sc.close();

	}

}
