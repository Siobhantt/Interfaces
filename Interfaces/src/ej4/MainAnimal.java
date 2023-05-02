package ej4;

import java.util.Arrays;
import java.util.Scanner;

public class MainAnimal {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		int opcion=0; 
		Perro ying = new Perro("Ying", "Poodle", 10.0,"Blanco");
		Gato Noa = new Gato("Noa", "Calle", 5.0,"Gris");
		
		do {
			menu();
			opcion = lee.nextInt();
			
			switch(opcion) {
			case 1:
				ying.toString();
				ying.hacerRuido();
				instruccion();
				System.out.println(ying.hacerCaso());
				
				break;
			case 2:
				Noa.toString();
				Noa.hacerRuido();
				instruccion();
				System.out.println(Noa.hacerCaso());
				break;
			}
			System.out.println();
		}while(opcion!=3); 
		

	
	
	}

	public static void menu() {
		System.out.println("Elija el animal con el que desea interactuar: ");
		System.out.println("1.Perro.");
		System.out.println("2.Gato.");
		System.out.println("3.Terminar con el programa.");
	}
	public static void instruccion() {
		String instruccion[] = {"Sientate","Da la pata","Hazte el muerto", "Salta", "Rueda"};
		int haz = (int) (Math.random() * instruccion.length);
		
		System.out.println(instruccion[haz]);
	}
}
