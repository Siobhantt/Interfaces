package ej4;
/**
 * Clase Gato, un tipo de animalDomestico
 * @author Luisa
 *
 */
public class Gato extends AnimalDomestico {
/**
 * Constructor vacio
 */
	public Gato() {
	}
	/**
	 * Constructor con todos los parametros
	 * @param nombre
	 * @param raza
	 * @param peso
	 * @param color
	 */
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}
/**
 * Metodo que representa el sonido del gato
 */
	@Override
	public void hacerRuido() {
		System.out.println("¡Miau!");
	}
/**
 * Metodo que devuelve true el 5% de las veces(Mucho es para un gato xd)
 */
	@Override
	public boolean hacerCaso() {
		boolean obedece = false;
		double aleatorio= Math.random();
		if(aleatorio>=0.95) {
			obedece = true;
		}
		return obedece;
	}
	/**
	 * Metodo que representa a un gato tosiendo una bola de pelos(?
	 */
	public void toserBolaPelo() {
		System.out.println("PUUUUACK --> * ");
	}
	/**
	 * Metodo toString que muestra las caracteristicas del gato
	 */
	@Override
	public String toString() {
		return  super.toString();
	}
}
