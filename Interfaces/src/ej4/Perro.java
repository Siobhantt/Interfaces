package ej4;

public class Perro extends AnimalDomestico {

	public Perro() {
	}
	
	public Perro(String nombre, String raza, double peso, String color) {
		super();
	}

	@Override
	public void hacerRuido() {
		super.hacerRuido();
		System.out.println("¡Guau!");
	}

	@Override
	public boolean hacerCaso() {
		return super.hacerCaso();
	}
	
	public void sacarPaseo() {
		
	}

	@Override
	public String toString() {
		return  super.toString();
	}
	
	
}
