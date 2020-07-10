package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int tamanho = ler.nextInt();
		double [] vect = new double[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			vect[i] = ler.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < tamanho; i++) {
			soma += vect[i];
		}
		
		System.out.printf("A soma dos valores inseridos no vetor eh: %.2f" , soma);
		
		ler.close();
	}

}
