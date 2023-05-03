package ej3;
/**
 * Clase polideportivo que implementa 2 interfaces, Instalacion deportiva y edificio
 * @author Luisa
 *
 */
public class Polideportivo implements InstalacionDeportiva, Edificio {
	/**
	 * Atributo del nombre del polideportivo
	 */
	String nombre="";
	/**
	 * Atributo de la superficie del polideportivo
	 */
	double superficie=0;
	/**
	 * Constructor vacio
	 */
	public Polideportivo() {
	}
/**
 * Constrctor con parametros
 * @param nombre del polideportivo
 * @param superficie del polideportivo
 */
	public Polideportivo(String nombre, double superficie) {
		this.nombre = nombre;
		this.superficie = superficie;
	}
/**
 * Metodo que obtiene el tipo de instalacion
 */
	@Override
	public int getTipoDeInstalacion() {
		int tipo=0; 
	return tipo;
	}
/**
 * Metodo que obtiene la superficie del edificio
 */
	@Override
	public double getSuperficieEdificio() {	
	double superficie=0;
	superficie = this.superficie;
	return superficie;
	}
/**
 * Metodo toString que muestra las caracteristicas del polideportivo
 */
	@Override
	public String toString() {
		return "Polideportivo \n"
				+ "Nombre:" + nombre + "\n"
	+"Superficie: " + superficie + "\n";
	}

}
