package polimorfismoExercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		List<Pessoas> contribuintes = new ArrayList<>();
		
		System.out.print("Entre com o numero de pagadores de taxa: ");
		int n = ler.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do #" + (i + 1) + " Pagador de Taxa: ");
			System.out.print("Pessoa Fisica, ou Juridica? (F/J)");
			char tipoPessoa = ler.next().charAt(0);
			System.out.print("Nome: ");
			ler.nextLine();
			String nome = ler.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = ler.nextDouble();
			if (tipoPessoa == 'F') {
				System.out.print("Gastos Com Saude: ");
				double gastosComSaude = ler.nextDouble();
				contribuintes.add(new PessoasFisicas(nome, rendaAnual, gastosComSaude));
			} else {
				System.out.print("Numero de empregados: ");
				int numeroDeFuncionarios = ler.nextInt();
				contribuintes.add(new PessoasJuridicas(nome, rendaAnual, numeroDeFuncionarios));
			}

		}
		
		System.out.printf("%nTaxas Pagas: %n");
		for (Pessoas pessoa : contribuintes) {
			System.out.println(pessoa.getNome() + ": " + pessoa.impostoDeRenda());
		}
		
		double taxaTotal = 0;
		System.out.printf("%nTaxas totais pagas: ");
		for (Pessoas pessoa : contribuintes) {
			taxaTotal += pessoa.impostoDeRenda();
		}
		
		System.out.println(taxaTotal);
		ler.close();
		
	}

}
