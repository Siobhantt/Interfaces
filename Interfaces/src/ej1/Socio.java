package ej1;
/**
 * Clase que representa un socio, implementa la interfaz Comparable
 * @author Luisa
 *
 */
public class Socio implements Comparable {
	/**
	 * Atributo de id del socio
	 */
private int id;
/**
 * Atributo de nombre del socio
 */
private String nombre;
/**
 * Atributo de la edad del socio
 */
private int edad;
/**
 * Constructor con parametros
 * @param id
 * @param nombre
 * @param edad
 */
public Socio(int id, String nombre, int edad) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.edad = edad;
}
/**
 * Metodo toString con las caracteristicas del socio
 */
@Override
public String toString() {
	String res="";
	res+= "ID: " + this.id+ "\n" 
	+ "Nombre : " + this.nombre+ "\n" 
	+"Edad: " + this.edad + "\n";
	return res;
}
@Override
/**
 * Sirve para comparar el id del socio para luego ordenarlo de forma ascendente
 */
public int compareTo(Object o) {
	int result =0;
	Socio s1 = (Socio) o;
	if(this.id< s1.id) {
		result=-1;
	} else if(this.id>s1.id) {
		result =1;
	}
	return result;
}

}
