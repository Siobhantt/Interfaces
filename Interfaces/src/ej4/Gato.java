package ej4;

public class Gato extends AnimalDomestico {

	public Gato() {
	}
	
	public Gato(String nombre, String raza, double peso, String color) {
		super();
	}

	@Override
	public void hacerRuido() {
		super.hacerRuido();
		System.out.println("¡Miau!");
	}

	@Override
	public boolean hacerCaso() {
		boolean obedece = false;
		double aleatorio= Math.random();
		if(aleatorio<=0.5) {
			obedece = true;
		}
		return super.hacerCaso();
	}
	
	public void toserBolaPelo() {
		
	}
}
