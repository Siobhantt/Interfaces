package ej4;

public abstract class AnimalDomestico implements Animal{
	String nombre="";
	String raza="";
	double peso=0;
	String color="";
	
	public AnimalDomestico() {
		
	}
	
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}

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
	public abstract void hacerRuido();
	
	
	public void vacunar() {
		
	}
	
	public abstract boolean hacerCaso();
	
	public String toString() {
		return "Nombre: " + nombre + "\n"
	+"Raza: " + raza + "\n" 
	+"Peso: " + peso + "\n"
	+"color: " + color + "\n";
	}
}
