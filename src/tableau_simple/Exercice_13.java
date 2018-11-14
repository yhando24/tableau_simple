package tableau_simple;

import java.util.Scanner;

public class Exercice_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Veuillez saisir la taille du tableau 1");
		
		int taille = Integer.parseInt(sc.nextLine());
		System.out.println("Veuillez saisir la taille du tableau 2 ");
		int taille2 = Integer.parseInt(sc.nextLine());
		int tab1 [] = new int [taille]; 
		int tab2 [] = new int [taille2];
		int joke = 0;
		
		
		for (int i = 0; i < taille; i++) {
			System.out.println("saisir la note "+ (i+1) + " du tab  1 svp ! ");
			tab1[i] = Integer.parseInt(sc.nextLine());
			}
		for (int i = 0; i < taille2; i++) {
			System.out.println("saisir la note " + (i+1) + " du tab  2 svp ! ");
			tab2[i] = Integer.parseInt(sc.nextLine());
			}
		for (int i = 0; i < taille; i++) {
				for (int j = 0; j < taille2; j++) {
			 joke = joke + (tab1[i] * tab2[j]);
			}
		}
		System.out.println("joke = "+  joke);
	}
}
