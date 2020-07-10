package matrizesExercicio;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int n = ler.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int m = ler.nextInt();
		int [][] matriz = new int[n][m];

		System.out.println("Digite a matriz abaixo: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ler.nextInt();
			}
		}
		
		System.out.print("Digite o numero para pesquisa: ");
		int x = ler.nextInt();
		
		for (int i = 0, jj = 0; i < matriz.length; i++, jj -= 4) {
			for (int j = 0; j < matriz[i].length; j++, jj++) {
				if (x == matriz[i][j]) {
					System.out.printf("Posicao: %d,%d%n" , i, jj);
					
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					
					if (j < matriz[i].length-1) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					
					if (i > 0) {
						System.out.println("Cima: " + matriz[i-1][j]);
					}
					
					if (i < matriz.length-1) {
						System.out.println("Baixo: " + matriz[i+1][j]);
					}
					
					
				}
			}
			
			
		}
		
	
		
		
		
		ler.close();
		
	}

}
