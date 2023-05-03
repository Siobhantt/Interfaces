package ej2;
/**
 * Clase que representa a un futbolista, implementa la interfaz comparable
 * @author Luisa
 *
 */
public class Futbolista implements Comparable{
	/**
	 * Atributo de numero de camiseta del jugador
	 */
private int numeroCamiseta;
/**
 * Nombre del jugador
 */
private String nombre;
/**
 * Edad del jugador
 */
private int edad;
/**
 * Goles anotados por el jugador
 */
private int numGoles;
/**
 * Constructor con parametros para la creacion del jugador
 * @param numeroCamiseta
 * @param nombre
 * @param edad
 * @param numGoles
 */
public Futbolista(int numeroCamiseta, String nombre, int edad, int numGoles) {
	this.numeroCamiseta = numeroCamiseta;
	this.nombre = nombre;
	this.edad = edad;
	this.numGoles = numGoles;
}
/**
 * Metodo toString que muestra todas las caracteristicas del jugador
 */
@Override
public String toString() {
	String mensaje;
	mensaje = "Jugador :" + nombre + "\n"
			+ "Numero de camiseta: " + numeroCamiseta + "\n"
			+ "Edad: " + edad + "\n"
			+ "Numero de goles: " + numGoles;
	return mensaje;
}
/**
 * Metodo equals 
 * Devuelve un booleano segun sean iguales el numero de camiseta y el nombre
 */
public boolean equals(Object obj) {
	boolean igual=false;
	Futbolista jugador = (Futbolista) obj; 
	if(this.numeroCamiseta == jugador.numeroCamiseta && this.nombre.equals(jugador.nombre)) {
		igual = true;
	}
	return igual;
}//fin del metodo equals
/**
 * Compara el numero de camiseta y el nombre y segun el valor le da una posicion
 */
@Override
public int compareTo(Object o) {
	int result =0;
	Futbolista j1 = (Futbolista) o;
	if(this.numeroCamiseta<j1.numeroCamiseta ) {
		result = -1;
	}else if(this.numeroCamiseta>j1.numeroCamiseta){
		result = 1;
	}
	if(this.numeroCamiseta == j1.numeroCamiseta) {
		result = this.nombre.compareTo(j1.nombre);
	}
	return result;
}
}
