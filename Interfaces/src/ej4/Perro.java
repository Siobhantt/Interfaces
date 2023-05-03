package ej4;
/**
 * Clase que representa un perro, otro tipo de animalDomestico
 * @author Luisa
 *
 */
public class Perro extends AnimalDomestico {
/**
 * Constructor vacio
 */
	public Perro() {
	}
	/**
	 * Constructor con todos los parametros
	 * @param nombre
	 * @param raza
	 * @param peso
	 * @param color
	 */
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza,peso,color);
	}
/**
 * Metodo que representa el sonido de un perro
 */
	@Override
	public void hacerRuido() {
		System.out.println("¡Guau!");
	}
/**
 * 	Metodo que devuelve un booleano cuando el perro te haga caso
 */
	@Override
	public boolean hacerCaso() {
		boolean obedece = false;
		double aleatorio= Math.random();
		if(aleatorio<=0.9) {
			obedece = true;
		}
		return obedece;
	}
	/**
	 * Representa al perro paseando
	 */
	public void sacarPaseo() {
		System.out.println("Paseando... (:");
	}
/**
 * Metodo toString que muestra las caracteristicas del perro
 */
	@Override
	public String toString() {
		return  super.toString();
	}
	
	
}
