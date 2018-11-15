package tableau_simple;

import java.util.Scanner;

public class Exercice_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// on demande à l'utilisateur de saisir la taille des tableaux
		
		System.out.println("Veuillez saisir la taille du tableau");
		int taille = sc.nextInt();
		int tab1 [] = new int [taille]; 
		int tab2 [] = new int [taille]; 
		int tab3 [] = new int [taille]; 
		
		
		// on saisie les valeurs du 1er tableau
		
		for (int i = 0; i < taille; i++) {
			System.out.println("saisir la note "+ (i+1) + " du tab  1 svp ! ");
			tab1[i] = sc.nextInt();
			}
		
		// on saisie les valeurs du 1er tableau
		
		for (int i = 0; i < taille; i++) {
			System.out.println("saisir la note " + (i+1) + " du tab  2 svp ! ");
			tab2[i] = sc.nextInt();
			}
		
		// dans le tableau 3 on ajoute a l'indice i la valeurs du tableau 1 à l'indice i et  la valeur du tableau 2 à l'indice i
		
		for (int i = 0; i < taille; i++) {
			tab3[i] = tab1[i] + tab2[i];
			}
		
		// on affiche les tableaux
		
		for (int i = 0; i < taille; i++) {
			System.out.println("tableau 1  : " +  tab1[i]);
			System.out.println("tableau 2 : " +  tab2[i]);
			System.out.println("tableau 3  : " +  tab3[i]);
			}
		
		
	}
}
