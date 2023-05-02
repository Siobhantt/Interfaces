package ej4;

public class Gato extends AnimalDomestico {

	public Gato() {
	}
	
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public void hacerRuido() {
		System.out.println("¡Miau!");
	}

	@Override
	public boolean hacerCaso() {
		boolean obedece = false;
		double aleatorio= Math.random();
		if(aleatorio>=0.95) {
			obedece = true;
		}
		return obedece;
	}
	
	public void toserBolaPelo() {
		System.out.println("PUUUUACK --> * ");
	}
	
	@Override
	public String toString() {
		return  super.toString();
	}
}
