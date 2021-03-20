package POO;

import comun.LeerProperties;

public class TestProperties {

	public static void main(String[] args) {

		LeerProperties prop = new LeerProperties();

		prop.getSystemProperties();

		String mensaje = System.getProperty("MENSAJE");
		String mensaje2 = System.getProperty("SALUDO");
		String mensaje3 = System.getProperty("NOMBRE");
	

		System.out.println(mensaje);
		System.out.println(mensaje2);
		System.out.println(mensaje3);
	

		prop.setSystemPropFileName(System.getProperty("user.dir") + "\\src\\main'\resources\\DataFiles\\data2.properties");
		prop.getSystemProperties();
		
		String mensaje4 = System.getProperty("MENSAJE2");
		System.out.println(mensaje4);

	}

}
