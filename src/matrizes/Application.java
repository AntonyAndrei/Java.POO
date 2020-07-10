package matrizes;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt();
		int [][] matriz = new int [n] [n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = ler.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Numeros negativos: " + count);
		
		
		ler.close();
		
	}

}
