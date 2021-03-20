package POO2;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
		System.out.println("Constructor del Oficial");
		System.out.println("");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString() + " => Oficial";
	}
	
}
