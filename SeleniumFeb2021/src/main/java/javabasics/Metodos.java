package javabasics;

public class Metodos {
	int numero1, numero2;
	
	public Metodos(int numero1, int numero2) {
		this.numero1=numero1;
		this.numero2=numero2;
	}
	
	public Metodos() {
		
	}

	public void mensajeBienvenida () {
		System.out.println("Bienvenido a su curso de selenium");
	}
	
	public int sumatoria( ) {
		return numero1+numero2;
	}
	
	public String mostrarNombre(String nombre) {
		System.out.println(nombre);
		return nombre;
	}
	
	
}
