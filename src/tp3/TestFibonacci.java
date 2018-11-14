package tp3;



import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir un rang N");
		int n = sc.nextInt();
		
		System.out.println("Au rang " + n + " le nombre est de "+ rangN(n));
		
	}
	
	
	// Methode pour trouver le nombre dans une suite de Fibonacci grace a un rang
	public static int rangN (int n) {

		int tab [] = new int [n+2];
		tab[0]=0;
		tab[1]=1;
	
			for(int i=2; i<=n; i++) {
				tab[i]=tab[i-2]+tab[i-1];
			}
		return tab[n-1];
	}
}
