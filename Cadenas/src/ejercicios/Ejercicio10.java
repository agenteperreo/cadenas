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

		for (int i = 0; i < frase.length; i++) {
			for (int j = 0; j < conjunto2.length; j++) {
				if (frase[i] == conjunto2[j]) {
					frase[i] = conjunto1[j];
					break;
				}
			}
		}

		System.out.println(String.valueOf(frase));

		// Cerramos el escaner
		sc.close();

	}

}
