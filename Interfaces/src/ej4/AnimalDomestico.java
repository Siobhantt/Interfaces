package ej4;
/**
 * Clase abstracta AnimalDomestico, implementa la interfaz animal
 * @author Luisa
 *
 */
public abstract class AnimalDomestico implements Animal{
	/**
	 * Atributo de nombre del animal
	 */
	String nombre="";
	/**
	 * Atributo de la raza del animal
	 */
	String raza="";
	/**
	 * Atributo del peso del animal
	 */
	double peso=0;
	/**
	 * Atributo del color del animal
	 */
	String color="";
	/**
	 * Constructor vacio 
	 */
	public AnimalDomestico() {
		
	}
	/**
	 * Constructor con todos los parametros
	 * @param nombre
	 * @param raza
	 * @param peso
	 * @param color
	 */
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}
/**
 * Metodo de la interfaz que representa el comer
 */
	@Override
	public void comer() {
		System.out.println("Comiendo...");
		
	}
	/**
	 * Metodo de la interfaz que representa el dormir
	 */
	@Override
	public void dormir() {
		System.out.println("ZzzzZz");
	}
	/**
	 * Metodo de la interfaz(abstracto)que representa el hacer ruido(Será distinto para cada animal)
	 */
	@Override
	public abstract void hacerRuido();
	/**
	 * Metodo que representa al animal vacunado
	 */
	public void vacunar() {
		System.out.println("Criatura vacunada");
	}
	/**
	 * Metodo abstracto, devuelve un booleano las veces que el animal te eche cuenta
	 * @return
	 */
	public abstract boolean hacerCaso();
	/**
	 * Metodo toString que muestra todas las caracteristicas del animal
	 */
	public String toString() {
		return "Nombre: " + nombre + "\n"
	+"Raza: " + raza + "\n" 
	+"Peso: " + peso + "\n"
	+"color: " + color + "\n";
	}
}
