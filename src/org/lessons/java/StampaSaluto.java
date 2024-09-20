package org.lessons.java;

import java.util.Scanner;

public class StampaSaluto {
	
	public static void main(String[] args) {
		
		System.out.println("Ciao! Come ti chiami?");
		
		Scanner scan = new Scanner(System.in);
		
		String nome = scan.nextLine();
		
		System.out.println("Ciao " + nome + "! Dimmi tre numeri da sommare.");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("La somma di " + a + ", " + b + " e " + c + " è " + (a + b + c));
		
		String name = "Alessia";
		String surname = "Sansalone";
		String birth = "19.02.1997";

		String dati_anagrafici = name + " " + surname + " " + birth;
		
		System.out.println(dati_anagrafici);
	};

}