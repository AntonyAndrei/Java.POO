package exercicio9Section;

import java.util.Scanner;

public class Conta {
	
	Scanner ler = new Scanner(System.in);

	private int numero;
	private String titular;
	private double saldo;

	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void listarDados() {
		System.out.printf("Dados da conta: %n"
						+ "Conta %d, Titular %s, Saldo R$%.2f%n%n"
					    , numero, titular, saldo);
	}

	public void saque(double valor) {
		saldo -= (valor + 5);
		System.out.println("Os dados da conta foram atualizados!");
		listarDados();
	}
	
	public void deposito(double valor) {
		saldo += valor;
		System.out.println("Os dados da conta foram atualizados!");
		listarDados();
	}



}
