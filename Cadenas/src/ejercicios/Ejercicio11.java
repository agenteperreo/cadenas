package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		// Declaración de variables
		String cadena, palabra = "";

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la cadena al usuario
		System.out.println("Introduzca la frase: ");
		cadena = sc.nextLine();

		// Separamos la cadena por los espacios
		String[] frase = cadena.split(" ");

		// Recorremos todo el array
		for (int i = 0; i < frase.length; i++) {
			// Si la longitud de la palabra del hueco del array es mas grande que la
			// longitud de la palabra guardada
			if ((frase[i]).length() > palabra.length()) {
				// La nueva palabra es la mas larga
				palabra = frase[i];
			}
		}

		// Mostramos la palabra
		System.out.println("La palabra mas larga de la frase es " + palabra);

		// Cerramos el escaner
		sc.close();

	}

}
