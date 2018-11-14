package tableau_simple;

import java.util.Scanner;

public class Exercice_4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int taille, grand = 0, petit = 0;
		boolean croissant = true;
		
		System.out.println("saisir taille du tableau svp ! ");
		taille = sc.nextInt();
		int elements [] = new int [taille];
		for(int i = 0; i < elements.length; i++) {
			System.out.println("saisir un chiffre svp ! ");
			elements[i] = sc.nextInt();
			if(i==0) {
				grand = elements[i];
				petit = elements[i];
			}
			else { 
				if(elements[i]<elements[i-1]) {
					croissant = false;
				}
				if(elements[i]>grand) {
					grand = elements[i];
				}
				if(elements[i]<petit) {
					petit = elements[i];
				}
				
			}
		}
		if(croissant) {
			System.out.println("Le tableau est croissant.");
		}else {
			System.out.println("Le tableau n'est pas croissant.");
		}
		System.out.println("Le chiffre le plus petit du tableau est : " + petit);
		System.out.println("Le chiffre le plus grand du tableau est : " + grand);
		

	}

}
