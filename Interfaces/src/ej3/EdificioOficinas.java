package ej3;
/**
 * Clase que representa un edificio de oficinas, implementa la interfaz Edficio
 * @author Luisa
 *
 */
public class EdificioOficinas implements Edificio{
	/**
	 * Atributo de numero de oficinas
	 */
int numOficinas=0;
/**
 * Constructor vacio
 */
	public EdificioOficinas() {
}
/**
 * Constructor con parametros
 * @param numOficinas
 */
	public EdificioOficinas(int numOficinas) {
	this.numOficinas = numOficinas;
}
	/**
	 * Metodo de la interfaz que obtiene la superficie de edificio
	 */
	@Override
	public double getSuperficieEdificio() {
		double superficie=0;
		return superficie;
	}
/**
 * Metodo toString que muestra la cantidad de oficinas del edificio
 */
	@Override
	public String toString() {
		return "Edificio \n"+   
				"Numero de oficinas disponibles: " + numOficinas + "\n";
	}

}
