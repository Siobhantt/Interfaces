package ej3;

import java.util.Arrays;

public class Situacion {

	public static void main(String[] args) {
		Polideportivo[] arrayPoli =  new Polideportivo[2];
		EdificioOficinas[] arrayEdf = new EdificioOficinas[2];
		
		Polideportivo a1 = new Polideportivo("J.Perez",100);
		Polideportivo a2 = new Polideportivo("S.Bolivar",500);
		
		EdificioOficinas e1 = new EdificioOficinas(300);
		EdificioOficinas e2 = new EdificioOficinas(500);
		
		arrayPoli[0] = a1;
		arrayPoli[1] = a2;
		arrayEdf[0] = e1;
		arrayEdf[1] = e2;
		
	for(Polideportivo a: arrayPoli) {
		System.out.println(a);
	}
	for(EdificioOficinas a: arrayEdf) {
		System.out.println(a);
	}
	}

}
