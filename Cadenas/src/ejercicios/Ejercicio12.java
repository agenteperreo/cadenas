package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//Declaración de variables
		String palabra1, palabra2;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		//Pedimos las 2 palabras al usuario
		System.out.println("Dime 2 palabras:");
		palabra1=sc.next();
		palabra2=sc.next();
		
		//Transformo las 2 palabras a arrays de char
		char[] letras1=palabra1.toCharArray();
		char[] letras2=palabra2.toCharArray();
	}

}
