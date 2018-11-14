package tableau_simple;

import java.util.Scanner;

public class Exercice_9 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la taille du tableau");
		int taille = sc.nextInt();
		int tabs [] = new int [taille]; 
		int grande = 0;
		int position = 0;
		for (int i = 0; i < taille; i++) {
		System.out.println("saisir une valeur svp ! ");
		tabs[i] = sc.nextInt();
		}
		for (int i = 0; i < taille; i++) {
			if(i==0) {
				grande = tabs [i];
			}
			if(tabs[i]> grande) {
				grande = tabs [i];
				position = i +1;
			}
		
			}
		System.out.println("la valeur la plus grande est de :" + grande + " saisit en position " + position);

	}

}
