package ej1;

public class Socio implements Comparable {
private int id;
private String nombre;
private int edad;

/**
 * 
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
 * Esto se basa en algun parametro para comparar en ascendente o descendente segun la configuracion del metodo
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
