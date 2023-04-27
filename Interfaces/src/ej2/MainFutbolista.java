package ej2;

import java.util.Arrays;

public class MainFutbolista {
	static Futbolista arrayJugadores[]=new Futbolista[5];
	public static void main(String[] args) {
		
		Futbolista j1 = new Futbolista(20,"Alex", 29, 110);
		Futbolista j2 = new Futbolista(11,"Putellas", 29, 179);
		Futbolista j3 = new Futbolista(22,"Arango", 42, 129);
		Futbolista j4 = new Futbolista(20,"Abel", 33, 170);
		Futbolista j5 = new Futbolista(15,"Rapinoe", 37, 170);
		arrayJugadores[0] = j4;
		arrayJugadores[1] = j2;
		arrayJugadores[2] = j3;
		arrayJugadores[3] = j1;
		arrayJugadores[4] = j5;
		
		System.out.println("=============== Jugadores desordenados ===========");
		System.out.println();
		mostrar();
		
		Arrays.sort(arrayJugadores);
		System.out.println("=============== Jugadores ordenados por numero de camiseta ===========");
		System.out.println();
		mostrar();
	}
	public static void mostrar() {
		for(Futbolista player : arrayJugadores) {
			System.out.println(player);
			System.out.println();
		}
	}
}
