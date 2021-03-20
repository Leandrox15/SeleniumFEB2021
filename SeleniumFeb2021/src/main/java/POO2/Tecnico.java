package POO2;

public class Tecnico extends Operario {

	public Tecnico(String nombre) {
		super(nombre);
		System.out.println("Constructor Clase Operario");
		System.out.println("");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
	  return super.toString()+" => Tecnico";
  }
	
	
}//end Class
