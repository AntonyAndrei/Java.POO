package vetores2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		int tamanho = ler.nextInt();
		Produto[] vetor = new Produto[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			ler.nextLine();
			String nome = ler.nextLine();
			double preco = ler.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		
		
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}

		double precoMedio = soma/vetor.length;
		
		System.out.printf("A Media de preco dos seus produtos eh: %.2f" , precoMedio);
		
		ler.close();
	}

}
