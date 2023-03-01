package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		String cadena, cadenaInversa;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la cadena al usuario
		System.out.println("Dime una cadena: ");
		cadena=sc.nextLine();
		
		//Invertimos la cadena
		cadenaInversa= new StringBuilder(cadena).reverse().toString();
		
		//Mostramos la cadena inversa
		System.out.println(cadenaInversa);
		
		//Cerramos el escaner
		sc.close();

	}

}
