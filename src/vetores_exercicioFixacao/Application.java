package vetores_exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		Quartos[] quarto = new Quartos[10];

		System.out.printf("Bem vindos ao hostel, Temos 10 Quartos!%n"
				+ "Quantos estudantes irao alugar quartos? ");
		int quantidadeEstudantes = ler.nextInt();


		for (int i = 0, numeroAluguel = 1; i < quantidadeEstudantes; i++, numeroAluguel++) {
			ler.nextLine();
			System.out.printf("%nAluguel %d%n", numeroAluguel);
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.nextLine();
			System.out.print("Quarto: ");
			int quartoHospedado = ler.nextInt();
			quarto[quartoHospedado] = new Quartos(nome, email);
		}
		
		System.out.printf("%nQuartos alugados: %n");
		for (int i = 0; i < quarto.length; i++) {
			if (quarto[i] != null) {
				System.out.printf("Quarto #%d: %s, %s. %n", i, quarto[i].getNome(), quarto[i].getEmail());
			}
		}
		
		System.out.printf("%nQuartos vazios: %n");
		for (int i = 0; i < quarto.length; i++) {
			if (quarto[i] == null) {
				System.out.printf("Quarto #%d%n", i);
			}
		}
		
		ler.close();

	}

}
