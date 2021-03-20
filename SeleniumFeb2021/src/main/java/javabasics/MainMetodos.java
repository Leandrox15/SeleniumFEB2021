package javabasics;

public class MainMetodos {

	public static void main(String[] args) {
		Metodos objeto = new Metodos(10,20);
		Metodos constructorAutomatico = new Metodos();
		
		System.out.println(objeto.sumatoria());
		System.out.println(constructorAutomatico.sumatoria());
		constructorAutomatico.mensajeBienvenida();
		objeto.mensajeBienvenida();
		objeto.mostrarNombre("Sergio ");
		String name = objeto.mostrarNombre("Sergio");
		System.out.println(name);	
		
	}

}
