package javabasics;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {

		Scanner Tabla = new Scanner(System.in);
		int tabla1 = 0;
		int resultado = 0;
		int temporal = 0;

		System.out.println("Ingresa el numero que quieres multiplicar");
		temporal = Tabla.nextInt();

		while (temporal <= 0) {
			System.out.println("El n�mero que ingresaste debe ser mayor que cero, ingrese nuevamente otro n�mero ");
			temporal = Tabla.nextInt();
			
			} // end while

		for (int indice = 1; indice <= 10; indice++) {

			resultado = indice * temporal;

			System.out.println("La multiplicaci�n " + temporal + " por " + indice + " El resultado es: " + resultado);

		} // end for

	}// end Main

}// end class
