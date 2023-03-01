package ejercicios2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaración de variables
		String cadena;
		boolean empieza, termina;
		
		//Array que contendra los comentarios
		String[] comentarios;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la cadena al usuario
		System.out.println("Introduce la cadena: ");
		cadena=sc.nextLine();
		
		//Dividimos la cadena por las barras /
		comentarios=cadena.split("/");
		
		//System.out.println(Arrays.toString(comentarios));
		
		for(int i=0; i < comentarios.length; i++) {
			empieza=comentarios[i].startsWith("*");
			termina=comentarios[i].endsWith("*");
			
			if(!empieza || !termina) {
				System.out.print(comentarios[i]);
			} 
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
