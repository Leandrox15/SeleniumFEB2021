package javabasics;

import javax.swing.JOptionPane;

public class Divisible {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un nuemero"));
		
		if(numero%2==0) {
						System.out.println("El numero ingresado [ "+ numero + " ] es divisible entre 2");
		}else {
			
		}
		
	}

}
