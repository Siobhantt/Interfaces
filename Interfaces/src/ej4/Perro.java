package ej4;

public class Perro extends AnimalDomestico {

	public Perro() {
	}
	
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza,peso,color);
	}

	@Override
	public void hacerRuido() {
		System.out.println("¡Guau!");
	}

	@Override
	public boolean hacerCaso() {
		boolean obedece = false;
		double aleatorio= Math.random();
		if(aleatorio<=0.9) {
			obedece = true;
		}
		return obedece;
	}
	
	public void sacarPaseo() {
		System.out.println("Paseando... (:");
	}

	@Override
	public String toString() {
		return  super.toString();
	}
	
	
}
