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
				ying.vacunar();
				ying.toString();
				ying.sacarPaseo();
				ying.hacerRuido();
				instruccion();
				if(ying.hacerCaso()==false) {
					ignorando();
					}else {
						System.out.println("¡<3!");
						System.out.println(ying.nombre + " te obedece.");
					}
				
				break;
			case 2:
				Noa.vacunar();
				Noa.toString();
				Noa.toserBolaPelo();
				Noa.hacerRuido();
				instruccion();
				if(Noa.hacerCaso()==false) {
				ignorando();
				}else {
					System.out.println("¡<3!");
					System.out.println(Noa.nombre + " te obedece.");
				}
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
	public static void ignorando() {
		System.out.println("Ignorandote...zZz");
	}
}
