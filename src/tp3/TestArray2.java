package tp3;

public class TestArray2 {
	public static void main(String[] args) {
		int [] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
// 	Calcul de la moyenne
		
		float moyenne =0;
		for(int i =0; i<array.length; i++ ) {
			moyenne += array[i];
		}
		moyenne = moyenne/array.length;
		System.out.println("la moyenne est de " + moyenne);
		
//	 	Trouver index de l'entier 15	
		int index = 0;
		for(int i =0; i<array.length; i++ ) {
			if(array[i]==15) {
				index = i;
			}
		}
		System.out.println("l'entier 15 se trouve à l'index " + index);
		
//	 	Trouver le nombre de doublon
		int doublon =0;
		for(int i =0; i<array.length; i++ ) {
			for(int y = i+1; y<array.length; y++) {
				if(array[i]==array[y]) {
					doublon++;
				}
			}	
		}	
		System.out.println("le nombre de doublon est de " + doublon);
		}
}
