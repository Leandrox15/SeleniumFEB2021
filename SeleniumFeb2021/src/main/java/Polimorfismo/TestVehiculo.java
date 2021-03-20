package Polimorfismo;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo misVehiculos[] = new Vehiculo[2];
		misVehiculos[0] = new Vehiculo("GFER324", "Ford", "2009");
		misVehiculos[1] = new VehiculoTurismo (8, "GFT56-78", "Audi", "2012");
		misVehiculos[2] = new VehiculoDeportivo ("GHT36-78", "Mazda", "2020", 4);
		misVehiculos[3] = new VehiculoFurgoneta ("HHJ56-8", "Toyota", "2012", 8);
		
		//vehiculos = misVehiculos[0]
		for(Vehiculo vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}
		
		Vehiculo vehiculodeportivo = new VehiculoDeportivo("JKH-45-6", "Audi", "2022", 5);
		System.out.println(vehiculodeportivo.mostrarDatos());

	}//end Main

}//end Class
