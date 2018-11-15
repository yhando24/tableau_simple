package tableau_simple;

import java.util.Scanner;

public class Exercice_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// on demande à l'utilisateur de saisir la taille du tableau
		
		System.out.println("saisir taille du tableau svp ! ");
		int taille = sc.nextInt();
		
		// on cree 2 tableau. Un qui possedera les elements et le deuxieme les element a l'envers.
		int elements [] = new int [taille];
		int elementsInverses [] = new int [taille];
		
		// on rempli les tableau en commencant par l'index 0 pour le tableau normal et par l'index qui correspond a 
		// la taille du tableau -1 (difference en taille qui commence par 1 et index qui commence par 0 )
		for(int i = 0; i < elements.length; i++) {
			System.out.println("saisir une valeur ");
			elements [i] =  sc.nextInt();
			elementsInverses [ taille - 1 - i] = elements [i];
		}
		
		// on affiche le tableau normal
		
		System.out.println("tableau : ");
		for(int i = 0; i < elements.length; i++) {
			System.out.println( elements [i]);
			
		}
		
		// on affiche le tableau inverse
		System.out.println("tableau inverse:  ");
		for(int i = 0; i < elements.length; i++) {
			System.out.println( elementsInverses [i]);
		}
	}
}
