package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		//Declaración de variables
		String cadena;
		
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la cadena al usuario
		System.out.println("Escribe la cadena acá: ");
		cadena=sc.nextLine();
		
		//Transformamos la cadena a un array de char
		char[] frase=cadena.toCharArray();
		
		char[] auxiliar=new char[frase.length];
	}

}
