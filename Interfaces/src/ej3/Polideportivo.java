package ej3;

public class Polideportivo implements InstalacionDeportiva, Edificio {
	String nombre="";
	double superficie=0;
	
	
	
	public Polideportivo() {
	
	}

	public Polideportivo(String nombre, double superficie) {
		this.nombre = nombre;
		this.superficie = superficie;
	}

	@Override
	public int getTipoDeInstalacion() {
		int tipo=0; 
	return tipo;
	}

	@Override
	public double getSuperficieEdificio() {	
	double superficie=0;
	return superficie;
	}

}
