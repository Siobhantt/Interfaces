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
		System.out.println("Comiendo...");
		
	}

	@Override
	public void dormir() {
		System.out.println("ZzzzZz");
		
	}

	@Override
	public abstract void hacerRuido();
	
	
	public void vacunar() {
		System.out.println("Criatura vacunada");
	}
	
	public abstract boolean hacerCaso();
	
	public String toString() {
		return "Nombre: " + nombre + "\n"
	+"Raza: " + raza + "\n" 
	+"Peso: " + peso + "\n"
	+"color: " + color + "\n";
	}
}
