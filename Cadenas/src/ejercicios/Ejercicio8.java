package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Declaración de variables
		String cadena;
		boolean empieza, termina;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la cadena al usuario
		System.out.println("Introduce la cadena deseada:");
		cadena = sc.nextLine();

		// Miramos si empieza o termina por las muletillas de javalandia
		empieza = cadena.startsWith("Javalín, javalón   ");
		termina = cadena.endsWith("   javalén, len, len");

		// Si empieza o termina por uno de los anteriores
		if (empieza || termina) {
			// Mostramos que es un dialecto de javalandia
			System.out.println("Es un dialecto de javalandia");

			// Dividimos la cadena y la guardamos en el array
			String[] frase = cadena.split("    ");

			// Si empieza o empieza y termina por las muletillas
			if (empieza || (empieza && termina)) {
				// Mostramos el segundo hueco del array
				System.out.println(frase[1].trim());
				// Si no
			} else {
				// Mostramos el primer hueco del array
				System.out.println(frase[0].trim());
			}
			// Si no
		} else {
			// Mostramos que no es un dialecto
			System.out.println("No es un dialecto de javalandia.");
		}

		// Cerramos el escaner
		sc.close();
	}

}
