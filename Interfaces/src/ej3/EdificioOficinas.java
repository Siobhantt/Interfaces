package ej3;
/**
 * Clase que representa un edificio de oficinas, implementa la interfaz Edficio
 * @author Luisa
 *
 */
public class EdificioOficinas implements Edificio{
	/**
	 * Atributo que representa la superficie de una (1)oficina
	 */
	double superficieOficina=0;
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
	public EdificioOficinas(int numOficinas, double superficieOficina) {
	this.numOficinas = numOficinas;
	this.superficieOficina = superficieOficina;
}
	/**
	 * Metodo de la interfaz que obtiene la superficie de edificio
	 * Siendo la superficie la multiplicacion de la superficie de una oficina por la cantidad de oficinas existentes
	 */
	@Override
	public double getSuperficieEdificio() {
		double superficie=0;
	superficie = this.superficieOficina * this.numOficinas;
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
