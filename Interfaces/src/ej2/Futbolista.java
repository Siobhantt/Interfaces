package ej2;

public class Futbolista implements Comparable{
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
			+ "Numero de camiseta: " + numeroCamiseta + "\n"
			+ "Edad: " + edad + "\n"
			+ "Numero de goles: " + numGoles;
	return mensaje;
}

public boolean equals(Object obj) {
	boolean igual=false;
	Futbolista jugador = (Futbolista) obj; 
	if(this.numeroCamiseta == jugador.numeroCamiseta && this.nombre.equals(jugador.nombre)) {
		igual = true;
	}
	return igual;
}//fin del metodo equals

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
