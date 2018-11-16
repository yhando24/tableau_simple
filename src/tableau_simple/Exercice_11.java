package tableau_simple;

import java.util.Scanner;

public class Exercice_11 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	
		System.out.println("Veuillez saisir la taille du tableau");
		System.out.println("Veuillez saisir la taille du tableau");
		int taille = sc.nextInt();
		int tab [] = new int [taille]; 
		
		
		// on fait une boucle pour la saisie des notes, on y ajoute 1 et enfin on affiche les notes.
		for (int i = 0; i < taille; i++) {
		System.out.println("saisir la note svp ! ");
		tab[i] = sc.nextInt();
		tab[i]++;
		System.out.println(tab[i]);
		}
	}
}
