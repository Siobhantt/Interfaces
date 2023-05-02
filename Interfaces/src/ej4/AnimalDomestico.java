package ej4;

public class AnimalDomestico implements Animal{
	String nombre;
	String raza;
	double peso;
	String color;
	
	//=========================================
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hacerRuido() {
		// TODO Auto-generated method stub
		
	}
	//==============================
	public void vacunar() {
		
	}
	
	public boolean hacerCaso() {
		boolean obedece=false;
		double aleatorio= Math.random();
		if(aleatorio>=0.1) {
			obedece = true;
		}
		return obedece;
	}
	
	public String toString() {
		return "Nombre: " + nombre + "\n"
	+"Raza: " + raza + "\n" 
	+"Peso: " + peso + "\n"
	+"color: " + color + "\n";
	}
}
