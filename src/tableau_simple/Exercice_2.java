package tableau_simple;

import java.util.Scanner;

public class Exercice_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int somme = 0;
		 int moyenne = 0;
		 
		 
		 int tabs [] = new int [10]; 
		 
		 // on parcours le tableau  et on rempli la variable somme des chiffre de ce inscrit par l'utilisateur
		 for(int i = 0; i<10 ; i++ ) {
			System.out.println("saisir un chiffre svp ! ");
			tabs[i] = sc.nextInt();
			somme = somme + tabs[i]; 

		 }
		 
		 // on divise la somme par la longueur du tableau pour avoir la moyenne
		moyenne = somme/10;
		
		// et on affiche tout
		System.out.println("La somme est de " + somme);
		System.out.println("La moyenne est de " + (somme/10));

	}

}
