package javabasics;

public class HolaMundo {//open class
	
	String miNombre = "Leandro Aguirre";
	int edad = 25;
	//casi no se usa
	float edadconDecimal = (float) 25.0;
	char letra = 'f';
	//
	double edadDoble =25.00000;
	boolean bandera = true;
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Hola Mundo");
		
		double numero1 = 500.00035;
		double numero2 = 35.37;
		String nombre = "Sergio";
		int edad = 32;
		double resultado = numero1 + numero2;
		

		
		System.out.println("El resultado de la suma es: " + resultado);
		System.out.println("El resultado de la suma es: " + (numero1*numero2));
		System.out.println("El resultado de la suma es: " + (numero1/numero2));
		System.out.println("El resultado de la suma es: " + (numero1-numero2));

		
		
	}
	
	

}//end class
