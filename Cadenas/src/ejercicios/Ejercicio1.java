package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos las 2 variables que va a almacenar las frases
		String frase1, frase2;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos las 2 frases
		System.out.println("Dime 2 frases: ");
		frase1 = sc.next();
		frase2 = sc.next();

		// Si la longitud de la primera frase es mayor que la de la segunda
		if (frase1.length() > frase2.length()) {
			// Mostramos que la primera es mas larga
			System.out.println("La cadena \"" + frase1 + "\" es la mas larga");
			// Si la longitud de la primera frase es menor que la de la segunda
		} else if (frase1.length() < frase2.length()) {
			// Mostramos que la segunda es mas larga
			System.out.println("La cadena \"" + frase2 + "\" es la mas larga");
		// Si no 	
		} else {
			//Mostramos que son iguales
			System.out.println("Las cadenas son igual de largas");
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
