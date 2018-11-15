package tableau_simple;

import java.util.Scanner;

public class Exercice_9 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		// on demande à l'utilisateur de saisir la taille du tableau
		System.out.println("Veuillez saisir la taille du tableau");
		int taille = sc.nextInt();
		int tabs [] = new int [taille]; 
		int grande = Integer.MIN_VALUE;
		int position = 0;
		
		// on demande à l'utilisateur de saisir les valeurs du tableau par l'intermediaire d'une boucle
		for (int i = 0; i < taille; i++) {
		System.out.println("saisir une valeur svp ! ");
		tabs[i] = sc.nextInt();
		}
		for (int i = 0; i < taille; i++) {

		// si la valeur est plus grand que grand on stock sa valeur dans grande et sa position
			if(tabs[i]> grande) {
				grande = tabs [i];
				// je rajoute 1 a position a titre perso pour que la position est egale a l'element ecrit. Position 1 = element ecrit en 1er mais indice = 0;
				position = i +1;
			}
		
			}
		System.out.println("la valeur la plus grande est de :" + grande + " saisit en position " + position);

	}

}
