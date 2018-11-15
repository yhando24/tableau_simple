package tableau_simple;

import java.util.Scanner;

public class Exercice_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// on demande à l'utilisateur de saisir la taille des tableaux

		System.out.println("Veuillez saisir la taille du tableau 1");
		
		int taille = sc.nextInt();
		System.out.println("Veuillez saisir la taille du tableau 2 ");
		int taille2 = sc.nextInt();
		int tab1 [] = new int [taille]; 
		int tab2 [] = new int [taille2];
		int joke = 0;
		
		
		
		
		// 2 boucle pour saisir les valeurs de chaque tableau
		for (int i = 0; i < taille; i++) {
			System.out.println("saisir la note "+ (i+1) + " du tab  1 svp ! ");
			tab1[i] = sc.nextInt();
			}
		for (int i = 0; i < taille2; i++) {
			System.out.println("saisir la note " + (i+1) + " du tab  2 svp ! ");
			tab2[i] = sc.nextInt();
			}
		
		// pour calculer le joke on parcours le premier tableau et chaque indice est multiplier par chaque indice de l'autre tableau,
		//2 boucle sont donc necesaire.
		for (int i = 0; i < taille; i++) {
				for (int j = 0; j < taille2; j++) {
			 joke = joke + (tab1[i] * tab2[j]);
			}
		}
		System.out.println("joke = "+  joke);
	}
}
