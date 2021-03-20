package POO2;

public class Directivo extends Empleado {

	public Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Directivo(String nombre) {
		super(nombre);
		System.out.println("Constructor del Directivo");
		System.out.println("");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " => Directivo";
	}
}
