package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		// Declaración de variables
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		String cadena;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la cadena al usuario
		System.out.println("Escriba el mensaje: ");
		cadena = sc.nextLine();

		// Tranformamos en un array de caracteres la cadena del usuario
		char[] frase = cadena.toCharArray();

		// Reccoremos el array de la cadena desglosada
		for (int i = 0; i < frase.length; i++) {
			// Recorro el array conjunto2
			for (int j = 0; j < conjunto2.length; j++) {
				// Si la posicion i en el array frase es igual a la posicion j del conjunto 2
				if (frase[i] == conjunto2[j]) {
					// Cambiamos el hueco i de frase por el hueco j del conjunto 1
					frase[i] = conjunto1[j];
					// Terminamos el bucle
					break;
				}
			}
		}

		System.out.println(String.valueOf(frase));

		// Cerramos el escaner
		sc.close();

	}

}
