package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaración de variables
		String cadena, palabra;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase al usuario
		System.out.println("Dime la frase: ");
		cadena = sc.nextLine();

		// Pedimos la palabara al usuario
		System.out.print("¿Que palabra quieres buscar en la frase?: ");
		palabra = sc.next();

		// Dividimos la cadena por la palabra que busca el usuario y en función de la
		// longiitud del array sabemos cuantas veces ha encontrado la palabra
		String[] frase = cadena.split(palabra);

		//Mostramos cuantas veces se ha encontrado la palabra
		System.out.println("La palabra "+palabra+" se ha encontrado "+(frase.length-1));
		
		//Cerramos el escaner
		sc.close();

	}

}
