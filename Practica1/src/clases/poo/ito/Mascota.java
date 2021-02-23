/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.poo.ito;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Mascota.
 * 
 * @author rherr
 */
public class Mascota {
	/**
	 * Description of the property clasificacion.
	 */
	private String clasificacion = "";
	
	/**
	 * Description of the property raza.
	 */
	private String raza = "";
	
	/**
	 * Description of the property genero.
	 */
	private String genero = "";
	
	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";
	
	/**
	 * Description of the property edad.
	 */
	private int edad = 0;
	
	// Start of user code (user defined attributes for Mascota)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Mascota() {
		// Start of user code constructor for Mascota)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Mascota)
	
	// End of user code
	/**
	 * Returns clasificacion.
	 * @return clasificacion 
	 */
	public String getClasificacion() {
		return this.clasificacion;
	}
	
	/**
	 * Sets a value to attribute clasificacion. 
	 * @param newClasificacion 
	 */
	public void setClasificacion(String newClasificacion) {
	    this.clasificacion = newClasificacion;
	}

	/**
	 * Returns raza.
	 * @return raza 
	 */
	public String getRaza() {
		return this.raza;
	}
	
	/**
	 * Sets a value to attribute raza. 
	 * @param newRaza 
	 */
	public void setRaza(String newRaza) {
	    this.raza = newRaza;
	}

	/**
	 * Returns genero.
	 * @return genero 
	 */
	public String getGenero() {
		return this.genero;
	}
	
	/**
	 * Sets a value to attribute genero. 
	 * @param newGenero 
	 */
	public void setGenero(String newGenero) {
	    this.genero = newGenero;
	}

	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
	    this.nombre = newNombre;
	}

	/**
	 * Returns edad.
	 * @return edad 
	 */
	public int getEdad() {
		return this.edad;
	}
	
	/**
	 * Sets a value to attribute edad. 
	 * @param newEdad 
	 */
	public void setEdad(int newEdad) {
	    this.edad = newEdad;
	}


	public String toString() {
		String t=this.nombre;
	    t+="\n\tSu clasificación es:"+this.clasificacion;
	    t+="\n\tSu raza es:"+this.raza;
	    t+="\n\tSu edad es:"+this.edad;
	    t+="\n\tSu genero es:"+this.genero+"\n";
	    return t;
	}

}
