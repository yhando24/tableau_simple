package tableau_simple;

import java.util.Scanner;

public class Exercice_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// on demande à l'utilisateur de saisir la taille du tableau
		System.out.println("Veuillez saisir la taille du tableau");
		int taille = sc.nextInt();
		int notes [] = new int [taille]; 
		int moyenne = 0;
		int superieur =0;
		
		// on fait un boucle pour la saisie des notes et on fait la somme de toutes  les notes pour plus tard calculer la moyenne
		for (int i = 0; i < taille; i++) {
		System.out.println("saisir la note svp ! ");
		notes[i] = sc.nextInt();
		moyenne += notes[i];
		}
		
		// on divise la somme obtenu par la taille afin d'avoir la moyenne
		moyenne = moyenne / taille;
		
		
		// on parcours tout le tableau et on regarde si la note est superieur a la moyenne, on increment la variable superieur si c'est le cas
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
