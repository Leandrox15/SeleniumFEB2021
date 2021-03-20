package POO2;

public class Operario extends Empleado{
	
	
	public Operario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operario(String nombre) {
		super(nombre);
		System.out.println("Constructor del Operario");
		System.out.println("");
		
	}
	
	@Override
	public String toString() {
		return super.toString()+ " => Operario";
		
	}
		
}//end Class
