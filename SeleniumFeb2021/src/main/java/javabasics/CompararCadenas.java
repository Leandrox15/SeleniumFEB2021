package javabasics;

import java.util.Scanner;

public class CompararCadenas {

	public static void main(String[] args) {
		
		// Creamos scanner para leer palabras
		
		Scanner leer = new Scanner(System.in);
		System.out.println(" Escribe la primera Palabra");
		String cadena = leer.next();	
		
	///	System.out.println(" Escribe la segunda palabra Palabra");
		////String cadena2 = leer.next();
		////leer.close();
		
		
		if (cadena.equals("Hola")) {
			System.out.println("Las cadenas son iguales");			
		}else {
			System.out.println("Las cadenas no son iguales");	
		}		
		if (cadena.equalsIgnoreCase("hola")) {
			System.out.println("Las cadenas son iguales");			
		}else {
			System.out.println("Las cadenas no son iguales");	
		}
		if (cadena.contains("la")) {
			System.out.println("si esta el elemento");		
		}else {
			System.out.println("no esta el elemento");	
		}		
		
		
		String texto="Un 45 teto";
		String textosinespacios = texto.replace(" ", "");
		
		System.out.println(textosinespacios);
		
		System.out.println("el texto tiene [ "+ texto.length());
		
		
		
	}// end Main

}// end Class
