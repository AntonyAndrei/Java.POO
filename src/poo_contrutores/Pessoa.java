package poo_contrutores;

public class Pessoa {
	
	public String nome;
	public int idade;
	public int cpf;
	public int telefone;
	
	public Pessoa (String nome, int idade, int cpf, int telefone) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public String toString() {
		return nome
				+ " "
				+ "idade: "
				+ idade
				+ " "
				+ "CPF: "
				+ cpf
				+ " "
				+ "Telefone: "
				+ telefone;
	}
	

}
