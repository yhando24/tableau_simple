package tableau_simple;

import java.util.Scanner;

public class Exercice_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Veuillez saisir la taille du tableau");
	int taille = Integer.parseInt(sc.nextLine());
	int tabs [] = new int [taille]; 
	int multiple = 0;
	for (int i = 0; i < taille; i++) {
		System.out.println("saisir une valeur svp ! ");
		tabs[i] = Integer.parseInt(sc.nextLine());
		 if(tabs[i]% 3 == 0) {
			 multiple += 1; 
		 }
	}
	 System.out.println("le nombre de variable multiple est de : " + multiple 
			 	+ " et celui de non multiple et de " + (taille - multiple));
	}
}