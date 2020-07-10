package entidades;

import java.util.Scanner;

public class Produto {

	Scanner ler = new Scanner(System.in);
	public String nome;
	public double preco;
	public int quantidadeEmEstoque;
	
	public void cadastrarProduto() {
		System.out.println("Insira as informacoes do produto: ");
		System.out.print("Name: ");
		nome = ler.nextLine();
		System.out.print("Preco: ");
		preco = ler.nextDouble();
		System.out.print("Quantidade no estoque: ");
		quantidadeEmEstoque = ler.nextInt();
	}
	
	public void listarDados() {
		System.out.printf("Produto: %n"
				+ "Nome: %s%n"
				+ "Preco: %.2f%n"
				+ "Quantidade em estoque: %d%n"
				, this.nome, this.preco, this.quantidadeEmEstoque);
	}

	public double valorTotalEmEstoque() {
		return preco * quantidadeEmEstoque;
	}

	public void addProdutos() {
		System.out.print("Insira a quantidade de pecas que será adicionada: ");
		int quantidadeAdicionada = ler.nextInt();
		this.quantidadeEmEstoque += quantidadeAdicionada;
	}

	public void removerProdutos() {
		System.out.print("Ïnsira a quantidade de pecas que será removida: ");
		int quantidadeRemovida = ler.nextInt();
		this.quantidadeEmEstoque -= quantidadeRemovida;
	}

	public String toString() {
		return nome
				+ ", $"
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidadeEmEstoque
				+ " Unidades, Total: $ "
				+ String.format("%.2f", valorTotalEmEstoque());
	}

}
