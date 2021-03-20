package Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{

	private int carga;
		
	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	@Override
	public String mostrarDatos() {
		return "matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCarga: " + carga;
	
	}

}//end Class
