package tableau_simple;

import java.util.Scanner;

public class Exercice_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir taille du tableau svp ! ");
		int taille = sc.nextInt();
		int elements [] = new int [taille];
		int elementsInverses [] = new int [taille];
		
		for(int i = 0; i < elements.length; i++) {
			System.out.println("saisir une valeur ");
			elements [i] =  sc.nextInt();
			elementsInverses [ taille - 1 - i] = elements [i];
		}
		System.out.println("tableau : ");
		for(int i = 0; i < elements.length; i++) {
			System.out.println( elements [i]);
			
		}
		System.out.println("tableau inverse:  ");
		for(int i = 0; i < elements.length; i++) {
			System.out.println( elementsInverses [i]);
		}
	}
}
