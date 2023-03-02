package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		// Declaración de variables
		String palabra1, palabra2;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos las 2 palabras al usuario
		System.out.println("Dime 2 palabras:");
		palabra1 = sc.next();
		palabra2 = sc.next();

		// Si las dos palbras son igual de largas
		if (palabra1.length() == palabra2.length()) {
			// Transformo las 2 palabras a arrays de char
			char[] letras1 = palabra1.toCharArray();
			char[] letras2 = palabra2.toCharArray();

			// Ordenamos los arrays
			Arrays.sort(letras1);
			Arrays.sort(letras2);

			// si los 2 arrays son iguales
			if (Arrays.equals(letras1, letras2)) {
				// Las palabras son angramas
				System.out.println("Las dos palabras son anagramas");
				// Si no
			} else {
				// No son anagramas
				System.out.println("No son anagramas");
			}
			// Si no
		} else {
			// No son anagramas
			System.out.println("No son anagramas");
		}

		// Cerramos el escaner
		sc.close();
	}

}
