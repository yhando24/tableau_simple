package tableau_simple;

import java.util.Scanner;

public class Exercice_4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int taille, grand = Integer.MIN_VALUE, petit = Integer.MAX_VALUE;
		boolean croissant = true;
		
		
		// on demande à l'utilisateur de saisir la taille du tableau

		System.out.println("saisir taille du tableau svp ! ");
		taille = sc.nextInt();
		
		
		int elements [] = new int [taille];
		
		// on parcout le tableau
		for(int i = 0; i < elements.length; i++) {
			System.out.println("saisir un chiffre svp ! ");
			elements[i] = sc.nextInt();
			
		// a lindice 0 on attribue au variable grand et petit cette variable
			if(i==0) {
				grand = elements[i];
				petit = elements[i];
			}
			// quand on n'est pass a lindice 0 on peut comparer avec l'indice precedent et voir si 
			// le tableau est croissant
			else { 
				
				// si la nouvelle valeur est plus petit que l'ancienne le tableau n'est pas croissant
				// peut importe tout le reste, du coup on ne change plus la variable a true
				if(elements[i]<elements[i-1]) {
					croissant = false;
				}
				
				//si l'element a l'indice i est plus grand que grand on attribu a grand sa valeur
				if(elements[i]>grand) {
					grand = elements[i];
				}
				//si l'element a l'indice i est plus petit que petit on attribu a petit sa valeur

				if(elements[i]<petit) {
					petit = elements[i];
				}
				
			}
		}
		
		
	// en sortie de boucle, on affiche les resultats
		if(croissant) {
			System.out.println("Le tableau est croissant.");
		}else {
			System.out.println("Le tableau n'est pas croissant.");
		}
		System.out.println("Le chiffre le plus petit du tableau est : " + petit);
		System.out.println("Le chiffre le plus grand du tableau est : " + grand);
		

	}

}
