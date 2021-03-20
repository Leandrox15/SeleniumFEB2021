package POO2;

public class TestEmpleado {
	
	public static void main(String[] args) {
		
		Empleado E1 = new Empleado("Sergio");
		Operario OP1 = new Operario("Silvia");
		Oficial OF1 = new Oficial("Lilia");
		Tecnico TEC1 = new Tecnico("Omar");
		Empleado E2 = new Tecnico("Sergio");
		
				
		System.out.println(E1);
		System.out.println("");
		//System.out.println(D1);
		System.out.println("");
		System.out.println(OP1);
		System.out.println("");
		System.out.println(OF1);
		System.out.println("");
		System.out.println(TEC1);
		System.out.println("");
		System.out.println(E2.toString());
		
		
		
	}
}
