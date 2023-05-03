package ej3;

import java.util.Arrays;

public class Situacion {

	public static void main(String[] args) {
		Polideportivo[] arrayPoli =  new Polideportivo[2];
		EdificioOficinas[] arrayEdf = new EdificioOficinas[2];
		
		Polideportivo a1 = new Polideportivo("Pista","J.Perez",100);
		Polideportivo a2 = new Polideportivo("Piscina","S.Bolivar",500);
		Polideportivo a3 = new Polideportivo("Sala","R.Nadal",1000);
		
		EdificioOficinas e1 = new EdificioOficinas(300,20);
		EdificioOficinas e2 = new EdificioOficinas(500,30);
		
		arrayPoli[0] = a1;
		arrayPoli[1] = a2;
		arrayEdf[0] = e1;
		arrayEdf[1] = e2;
	/*	
	for(Polideportivo a: arrayPoli) {
		System.out.println(a);
	}
	for(EdificioOficinas a: arrayEdf) {
		System.out.println(a);
	}
	*/
	tamaño(e1);
	tamaño(e2);
	
	tamaño(a1);
	pago(a1);
	tamaño(a2);
	pago(a2);
	tamaño(a3);
	pago(a3);
	

	}
	public static void tamaño(Edificio edf) {
		System.out.println(edf.toString()); 
		System.out.println("Superficie --> "+edf.getSuperficieEdificio());
		if(edf.getSuperficieEdificio()<500) {
			System.out.println("Un sitio pequeño.");
		}else {
			System.out.println("Mucha superficie, lugar extenso.");
		}
		System.out.println("===========================================================");
		System.out.println();
	}
	
	public static void pago(InstalacionDeportiva inst) {
		switch(inst.getTipoDeInstalacion()) {
		case 1: 
			System.out.println("Abierta");
			System.out.println();
			break;
		case 2:
			System.out.println("Publica");
			System.out.println();
			break;
		case 3:
			System.out.println("Privada");
			System.out.println();
			break;
		}
	}
}
