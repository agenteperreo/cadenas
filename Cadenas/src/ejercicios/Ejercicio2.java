package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaracion de variables
		String contraseña1, contraseña2;

		// Contador de intentos
		int cont = 5;

		//
		boolean iguales = true;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la contraseña al primer jugador
		System.out.print("Escriba la contraseña a adivinar: ");
		contraseña1 = sc.next();

		while (cont > 0 && iguales) {

			System.out.println("Dime cual crees que es la contraseña del jugador 1: ");
			contraseña2 = sc.next();

			if (contraseña1.equals(contraseña2)) {
				iguales = false;
				System.out.println("¡¡¡Acertaste!!!");
			} else {
				for (int j = 0; j < contraseña1.length(); j++) {
					try {
						// Declaramos las letras de cada contraseña
						char letraC1 = contraseña1.charAt(j);
						char letraC2 = contraseña2.charAt(j);

						if (letraC1 == letraC2) {
							System.out.print(letraC1);
						} else {
							System.out.print("*");
						}
					} catch (StringIndexOutOfBoundsException e) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
			cont--;
		}

		// Mostramos que el juego ha terminado
		System.out.println("El juego a terminado.");

		sc.close();

	}

}
