package exercicio3;

import java.util.Scanner;

public class Aluno {
	
	Scanner ler = new Scanner(System.in);
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void inserirAluno() {
		
		System.out.print("Qual a primeira nota do aluno? ");
		nota1 = ler.nextDouble();
		System.out.print("Qual a segunda nota do aluno? ");
		nota2 = ler.nextDouble();
		System.out.print("Qual a terceira nota do aluno? ");
		nota3 = ler.nextDouble();
		ler.nextLine();
		System.out.print("Qual o nome do aluno? ");
		nome = ler.nextLine();
	}
	
	public void calcularResultado() {
		double notaFaltando;
		double notaFinal = nota1 + nota2 + nota3;

		if (notaFinal > 60) {
			System.out.printf("%s's RESULTS: %n"
							+ "FINAL GRADE: %.2f%n"
							+ "PASS"
							, nome, notaFinal);

		} else {
			notaFaltando = 60 - notaFinal;
			System.out.printf("%s's RESULTS: %n"
							+ "FINAL GRADE: %.2f%n"
							+ "FAILED%n"
							+ "MISSING %.2f POINTS%n"
							, nome, notaFinal, notaFaltando);
		}
	}
	
	
}
