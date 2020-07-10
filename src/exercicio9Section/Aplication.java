package exercicio9Section;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Entre com o numero da conta: ");
		int numero = ler.nextInt();
		ler.nextLine();
		System.out.print("Entre com o nome do Titular da conta: ");
		String titular = ler.nextLine();
		System.out.println("Existirá um deposito inicial? (y/n) ");
		char x = ler.next().charAt(0);
		double depositoInicial = 0;
		
		if (x == 'y') {
			System.out.println("Entre com o deposito inicial: ");
			depositoInicial = ler.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		} else {
			conta = new Conta(numero, titular);
			conta.listarDados();
		}
		
		System.out.print("Entre com o valor de deposito: ");
		double deposito = ler.nextDouble();
		conta.deposito(deposito);
		
		System.out.print("Entre com o valor de saque: ");
		double saque = ler.nextDouble();
		conta.saque(saque);
		

		ler.close();
	}

}
