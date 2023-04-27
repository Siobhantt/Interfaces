package ej2;

import java.util.Arrays;

public class MainFutbolista {

	public static void main(String[] args) {
		Futbolista arrayJugadores[]=new Futbolista[5];
		Futbolista j1 = new Futbolista(20,"Kerr", 29, 110);
		Futbolista j2 = new Futbolista(11,"Putellas", 29, 179);
		Futbolista j3 = new Futbolista(22,"Arango", 42, 129);
		Futbolista j4 = new Futbolista(25,"Rondon", 33, 170);
		Futbolista j5 = new Futbolista(15,"Rapinoe", 37, 170);

		System.out.println(Arrays.toString(arrayJugadores));
		
		Arrays.sort(arrayJugadores);
		
		System.out.println();
		System.out.println(Arrays.toString(arrayJugadores));
	}

}
