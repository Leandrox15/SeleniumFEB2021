package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
		private int Cilindrada;
	
		public VehiculoDeportivo(String matricula, String marca, String modelo, int Cilindrada) {
			super(matricula, marca, modelo);
			this.Cilindrada = Cilindrada;
				
		}

		/**
		 * @return the Cilindrada
		 */
		public int getCilindrada() {
			return Cilindrada;
		}
		
		@Override
		public String mostrarDatos() {
			return "matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCilindradas: " + Cilindrada;
		}
	
}//end Class
