package javabasics;

public class MayorMenor {
	/**
	 * 2)Declarar dos variables numericas, indica cual es mayor de las dos, o si son
	 * iguales.
	 * 
	 **/

	public static void main(String[] args) {
		int numero1 = 5;
		int numero2 = 5;

		if (numero1 >= numero2) {
			if (numero1 == numero2) {
				System.out.println("El numero: [ " + numero1 + "] es igual que el numero: " + numero2);
			} else {
				System.out.println("El numero: [ " + numero1 + "] es mayor que el numero: " + numero2);
			}

		} else {

			System.out.println("El numero: [" + numero1 + "] es menor que el numero: " + numero2);
		} // End else

	}// End main
}
