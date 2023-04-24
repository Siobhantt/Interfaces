package ej1;

public class Socio {
int id;
String nombre;
int edad;
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

}
