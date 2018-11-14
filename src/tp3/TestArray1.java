package tp3;

public class TestArray1 {

	public static void main(String[] args) {
		
		int [] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
//		Affichage des elements du tableau
		
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
//		Affichage des elements du tableau dans l'ordre inverse
		
		for(int i = array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
		
//		Affichage des 3 du tableau
		
		for(int i = 0; i<array.length; i++) {
			if(array[i]>3) {
				System.out.println(array[i]);
			}
		}
		
//		Affichage des entiers pairs du tableau
		
		for(int i = 0; i<array.length; i++) {
			if(array[i]%2 == 0) {
				System.out.println(array[i]);
			}
		}
		
//		Affichage du plus grand element du tableau
		
		int plusGrand = Integer.MIN_VALUE;
		for(int i = 0; i<array.length; i++) {
			if(array[i]>plusGrand) {
				plusGrand = array[i];
			}
		}
		System.out.println("le plus grand element du tableau est :" + plusGrand);

//		Affichage du plus petit element du tableau
		
		int plusPetit = Integer.MAX_VALUE;
		for(int i = 0; i<array.length; i++) {
			if(array[i]<plusGrand) {
				plusPetit = array[i];
			}
		}
	System.out.println("le plus petit element du tableau est :" + plusPetit);
	}
}
