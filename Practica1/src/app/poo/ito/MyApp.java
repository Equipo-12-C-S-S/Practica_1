package app.poo.ito;

import clases.poo.ito.Mascota;


public class MyApp {

	static Mascota m= new Mascota();
	
	static void run() {
		m.setClasificacion("Perro");
		m.setRaza("Maltes");
		m.setGenero("Macho");
		m.setEdad(5);
		m.setNombre("Kenji");
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        run();
	}

}
