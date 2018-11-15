package tableau_simple;

import java.util.Scanner;

public class Exercice_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// on demande à l'utilisateur de saisir la taille du tableau
	System.out.println("Veuillez saisir la taille du tableau");
	

	int taille = Integer.parseInt(sc.nextLine());
	int tabs [] = new int [taille]; 
	int multiple = 0;
	for (int i = 0; i < taille; i++) {
		// on demande à l'utilisateur de saisir les valeurs du tableau
		System.out.println("saisir une valeur svp ! ");
		tabs[i] = Integer.parseInt(sc.nextLine());
		// on regarde si cette valeurs a lindice i  divise par 3 reste egale a 0? si c'est vrai on a un multiple de 3, on rajoute 1 a multiple
		 if(tabs[i]% 3 == 0) {
			 multiple += 1; 
		 }
	}
	 System.out.println("le nombre de variable multiple est de : " + multiple 
			 
			 
			 	+ " et celui de non multiple et de " + (taille - multiple));
	  // sachant qu'une valeur et soit multiple soit non multiple il est inutile de creer une autre variable.
	}
}