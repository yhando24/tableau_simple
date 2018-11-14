package tableau_simple;

import java.util.Scanner;

public class Exercice_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la taille du tableau");
		int taille = sc.nextInt();
		int notes [] = new int [taille]; 
		int moyenne = 0;
		int superieur =0;
		for (int i = 0; i < taille; i++) {
		System.out.println("saisir la note svp ! ");
		notes[i] = sc.nextInt();
		moyenne += notes[i];
		}
		moyenne = moyenne / taille;
		
		for (int i = 0; i < taille; i++) {
			if (notes[i] > moyenne) {
				superieur++;
			}
			
		}
		System.out.println("la moyenne est de : " + moyenne );
		System.out.println("le nombre de personne ayant obtenu "
				+ "une note superieur a la moyenne  est de : " + superieur );

	}

}
