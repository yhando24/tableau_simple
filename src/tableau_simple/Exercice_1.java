package tableau_simple;

public class Exercice_1 {

	public static void main(String[] args) {
		
		// Remplissage d'un tableau d'une longeur de 10 et affichage des elements de ce tableau.
		
		int elements [] = new int [10];
		for(int i = 0; i < elements.length; i++) {
		elements[i] = i;
		System.out.print(elements[i] + " ") ;
		}

	}

}
