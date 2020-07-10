package application;

import java.util.Locale;

import membrosEstaticos.CurrencyConverter;
import membrosEstaticos.Moeda;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		/* Produto SSD = new Produto();
		SSD.cadastrarProduto();
		System.out.println(SSD);
		SSD.addProdutos();
		System.out.println(SSD);
		SSD.removerProdutos();
		System.out.println(SSD); */
				
		
		/*
		Aluno estudante = new Aluno();
		estudante.inserirAluno();
		estudante.calcularResultado();
		*/
		
		/*
		Funcionario trabalhador = new Funcionario();
		trabalhador.cadastrarFuncionario();
		trabalhador.listarDados();
		trabalhador.acrescentarSalario(20);
		trabalhador.listarDados();
		*/
		
		/*
		FiguraGeometrica figura = new FiguraGeometrica();
		figura.iniciarGeometrico();
		figura.listarDados();
		*/
		
		Moeda real = new Moeda();
		real.lerDolar();
		double valorFinal = CurrencyConverter.valorEmDolar(real.dolar);
		System.out.printf("Valor em Dólar é: %.2f" , valorFinal);
	}

}
