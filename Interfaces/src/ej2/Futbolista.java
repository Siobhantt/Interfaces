package ej2;

public class Futbolista {
private int numeroCamiseta;
private String nombre;
private int edad;
private int numGoles;

public Futbolista(int numeroCamiseta, String nombre, int edad, int numGoles) {
	this.numeroCamiseta = numeroCamiseta;
	this.nombre = nombre;
	this.edad = edad;
	this.numGoles = numGoles;
}

@Override
public String toString() {
	String mensaje;
	mensaje = "Jugador :" + nombre + "\n"
			+ "Edad: " + edad + "\n"
			+ "Numero de camiseta: " + numeroCamiseta + "\n"
			+ "Numero de goles: " + numGoles;
	return mensaje;
}



}
