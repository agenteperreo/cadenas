package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de variables
		String palabra = "";

		// Creamos un array en el que vamos a guardar cada una de las palabras
		String[] frase = new String[0];

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Vamos pidiendo palabras al usuario mientras esta no sea "fin"
		System.out.println("Escribeme la frase palabra a palabra:");

		// Mientras la palabra no sea fin
		while (!palabra.equalsIgnoreCase("fin")) {
			//Leemos la palabra del usuario
			palabra = sc.next();
			
			//Añadimos un hueco al array
			frase = Arrays.copyOf(frase, frase.length + 1);
			
			//Guardamos la palabra en la ultima posición del array
			frase[frase.length - 1] = palabra;
		}

		//Recorremos el array menos la ultima posicion que será fin
		for (int i = 0; i < frase.length - 1; i++) {
			//Vamos mostrando cada hueco del array seguido de un espacio
			System.out.print(frase[i] + " ");
		}

		// Cerramos el escaner
		sc.close();

	}

}
