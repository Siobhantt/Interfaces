package ej1;

import java.util.Arrays;

public class MainSocio {

	public static void main(String[] args) {
		int res;
		Socio[] arraySocios = new Socio[4];
		Socio s1 = new Socio(1,"Alejandro",23); 
		Socio s2 = new Socio(2,"Siob",10);
		Socio s3 = new Socio(3,"manue",22);
		Socio s4 = new Socio(4,"marco",50);
		
		arraySocios[3] = s2;
		arraySocios[1] = s3;
		arraySocios[2] = s1;
		arraySocios[0] =s4;
		
	System.out.println(Arrays.toString(arraySocios));
	
		Arrays.sort(arraySocios);
		
		System.out.println();
		System.out.println(Arrays.toString(arraySocios));
	}

}
