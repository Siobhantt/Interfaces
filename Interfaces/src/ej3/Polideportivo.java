package ej3;
/**
 * Clase polideportivo que implementa 2 interfaces, Instalacion deportiva y edificio
 * @author Luisa
 *
 */
public class Polideportivo implements InstalacionDeportiva, Edificio {
	/**
	 * Atributo con el tipo del polideportivo
	 */
	String tipo="";
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
	public Polideportivo(String tipo,String nombre, double superficie) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.superficie = superficie;
	}
/**
 * Metodo que obtiene el un numero segun el tipo de instalacion
 * 
 */
	@Override
	public int getTipoDeInstalacion() {
		int tipoN=0; 
		if(this.tipo.equals("Piscina")) {
			tipoN=1;
		}else if(this.tipo.equals("Sala")) {
			tipoN=2;
		}else if(this.tipo.equals("Pista")) {
			tipoN=3;
		}
	return tipoN;
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
				+ "Tipo: " + tipo + "\n"
				+ "Nombre: " + nombre + "\n"
	+"Superficie: " + superficie + "\n";
	}

}
