package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaración de variables
		String frase1;
		int contEsp = 0;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase al usuario
		System.out.println("Introduzca la cadena: ");
		frase1 = sc.next();

		for (int i = 0; i < frase1.length(); i++) {
			if (frase1.charAt(i) == ' ') {
				contEsp++;
			}
		}

		System.out.println("Hay " + contEsp + " espacios en la cadena introducida");

	}

}
