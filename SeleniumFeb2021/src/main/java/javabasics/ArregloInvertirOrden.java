package javabasics;

public class ArregloInvertirOrden {
	/**
	 * dado un arreglo de 5 indices con los calores1,2,3,4,5
	 * guardar los valores en otro arrgglo y mostrarlo invertido el orden
	 * **/
	
	public static void main(String[] args) {
		int[] arreglo1 = {1,2,3,4,5};
		int[] arreglo2 = new int[arreglo1.length];
		
		for(int i=(arreglo1.length-1), j=0; i>=0; i--, j++) {
			//
			arreglo2[j] = arreglo1[i];
			
			System.out.println(arreglo2[j]);
		}//arreglo2 indice 0 = 5
	
		
	}//main

}//class
