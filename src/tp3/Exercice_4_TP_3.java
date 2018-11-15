package tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice_4_TP_3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Boolean menuOk=true;

		int [] tab0 = new int [0]; 
		
		System.out.println("Bienvenu dans le menu veuillez choisir une option ");
		while(menuOk) {
		
			System.out.println("Appuyer sur 1 pour ajouter un nombre au tableau");
			System.out.println("Appuyer sur 2 pour afficher le contenu du tableau");
			System.out.println("Appuyer sur 3 pour quitter");
			
		int choix = sc.nextInt();	
			
			if(choix == 1) {
				System.out.println("Veuillez saisir un numero");
				int [] tab1 = new int[tab0.length+1];
				
				// on rempli le nouveau tableau des valeurs de lancien
				for(int i = 0; i<tab0.length; i++) {
					tab1[i]=tab0[i];
				}
				
				// on modifie la taille de l'ancien tableau
				tab0 = new int[tab1.length];
				
				// on rempli l'ancien tableau des valeurs
				for(int i = 0; i<tab0.length; i++) {
					tab0[i]=tab1[i];
				}
				
				// on rajoute au tableau la nouvelle valeur
				tab0[tab0.length-1]=sc.nextInt();
		
			}if(choix == 2) {

				for(int i = 0; i<tab0.length; i++) {
					System.out.println(tab0[i]);
				}
			}if(choix == 3) {
				menuOk = false;
			}
	
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
