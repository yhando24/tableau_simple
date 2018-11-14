package tableau_simple;

import java.util.Scanner;

public class Exercice_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Veuillez saisir la taille du tableau");
		int taille = Integer.parseInt(sc.nextLine());
		int tab1 [] = new int [taille]; 
		int tab2 [] = new int [taille]; 
		int tab3 [] = new int [taille]; 
		
		for (int i = 0; i < taille; i++) {
			System.out.println("saisir la note "+ (i+1) + " du tab  1 svp ! ");
			tab1[i] = Integer.parseInt(sc.nextLine());
			}
		for (int i = 0; i < taille; i++) {
			System.out.println("saisir la note " + (i+1) + " du tab  2 svp ! ");
			tab2[i] = Integer.parseInt(sc.nextLine());
			}
		for (int i = 0; i < taille; i++) {
			tab3[i] = tab1[i] + tab2[i];
			}
		for (int i = 0; i < taille; i++) {
			System.out.println("tableau 1  : " +  tab1[i]);
			System.out.println("tableau 2 : " +  tab2[i]);
			System.out.println("tableau 3  : " +  tab3[i]);
			}
		
		
	}
}
