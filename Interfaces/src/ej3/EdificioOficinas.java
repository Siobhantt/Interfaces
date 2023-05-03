package ej3;

public class EdificioOficinas implements Edificio{
int numOficinas=0;



	public EdificioOficinas() {

}

	public EdificioOficinas(int numOficinas) {
	this.numOficinas = numOficinas;
}

	@Override
	public double getSuperficieEdificio() {
		double superficie=0;
		return superficie;
	}

	@Override
	public String toString() {
		return "Edificio \n"+   
				"Numero de oficinas disponibles: " + numOficinas + "\n";
	}

}
