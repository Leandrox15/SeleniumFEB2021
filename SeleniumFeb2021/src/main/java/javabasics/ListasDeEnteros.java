package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListasDeEnteros {

	public static void main(String[] args) {
		//Declarar nuestra lista de Enteros
		/**
		 * Como sacar el Numero Mayor y el numero Menor de la Lista
		 * **/
		
		List<Integer> listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(100);
		listaDeNumeros.add(1);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);
		listaDeNumeros.add(4);
		listaDeNumeros.add(5);
		listaDeNumeros.add(9);
		listaDeNumeros.add(20);
		listaDeNumeros.add(20);
		listaDeNumeros.add(2);
	
		
		
		//Imprime todos los elementos de nuesta lista
		System.out.println(listaDeNumeros);
		
		//ordena la lista de menor a mayor
		Collections.sort(listaDeNumeros);
		System.out.println(listaDeNumeros);
		
		//ordena la lista de mayor a menor
		Collections.sort(listaDeNumeros, Collections.reverseOrder());
		System.out.println(listaDeNumeros);
		
		//Quitar elemento repetidos en la ista
		Object last = null;
			
			int numCount=0;
			Iterator<Integer> i = listaDeNumeros.iterator();
			
			while(i.hasNext()) {
				Object temp= i.next();
				if (temp.equals(last)) {
					i.remove();
					numCount++;
					
				}else {
					last = temp;
				}//end else
			}//end while
			
		System.out.println(listaDeNumeros);
		System.out.println("El numero estaba repetido: " + numCount + " veces");
		
		Collections.sort(listaDeNumeros, Collections.reverseOrder());
		System.out.println(listaDeNumeros);
		
		
	}//Main

}//Class
