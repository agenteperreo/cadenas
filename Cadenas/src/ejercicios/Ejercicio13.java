package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		// Declaración de variables
		char[] abecedario = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k',
				'l', 'ñ', 'z', 'x', 'c', 'v', 'b', 'n', 'm' };
		String cadena;
		int contador;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Le pedimos la cadena al usuario
		System.out.println("Escribe la cadena: ");
		cadena = sc.nextLine();

		// Convertimos la cadena en un array de chars
		char[] frase = cadena.toCharArray();

		// Recorremos el abecedario
		for (int i = 0; i < abecedario.length; i++) {
			// Inicializamos el contador a 0
			contador = 0;

			// Recorremos el array frase
			for (int j = 0; j < frase.length; j++) {
				// Si la letra i del abecedario es igual que la j de la cadena
				if (abecedario[i] == frase[j]) {
					// Aumentamos en 1 el contador
					contador++;
				}
			}

			// Si el contador es mayor que 0
			if (contador > 0) {
				// Mostramos cuantas veces se repite cada letra
				System.out.println("La letra " + abecedario[i] + " se repite: " + contador + " "
						+ (contador == 1 ? "vez" : "veces"));
			}
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
