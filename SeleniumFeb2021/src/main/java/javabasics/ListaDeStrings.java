package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListaDeStrings {

	public static void main(String[] args) {
		//  uja lista de Strings remover e invertir orden
		List<String> listaDeNombres = new ArrayList<>();
		listaDeNombres.add("Persona 1");
		listaDeNombres.add("Persona 2");
		listaDeNombres.add("Persona 3");
		listaDeNombres.add("Persona 4");
		listaDeNombres.add("Persona 5");
		listaDeNombres.add("Persona 5");
		listaDeNombres.add("Persona 2");
		
		//Imprimier lista tal cual esta 
		System.out.println(listaDeNombres);
		Collections.sort(listaDeNombres, Collections.reverseOrder());
		System.out.println(listaDeNombres);
		
		//Elminar los elementos repetidos de la lsita de string
		List<String> nombresSinRepetir = listaDeNombres
				.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(nombresSinRepetir);
		
		
	}//end Main

}//end Class
