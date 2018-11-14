package tableau_simple;

import java.util.Scanner;

public class Exercice_11 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir la taille du tableau");
		int taille = sc.nextInt();
		int tab [] = new int [taille]; 
		
		for (int i = 0; i < taille; i++) {
		System.out.println("saisir la note svp ! ");
		tab[i] = Integer.parseInt(sc.nextLine());
		tab[i]++;
		System.out.println(tab[i]);
		}
	}
}
