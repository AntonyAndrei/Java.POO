package poo_encapsulamento;

import java.util.Scanner;

import poo_contrutores.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Qual é o seu nome? ");
		String nome = ler.nextLine();
		System.out.print("Qual é a sua idade? ");
		int idade = ler.nextInt();
		System.out.print("Qual o seu CPF? ");
		int cpf = ler.nextInt();
		System.out.print("Qual o seu telefone? ");
		int telefone = ler.nextInt();

		Pessoa Antony = new Pessoa(nome, idade, cpf, telefone);

		System.out.println(Antony);

		ler.close();
	}

}
