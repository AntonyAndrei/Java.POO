package exercicio2;

import java.util.Scanner;

public class Funcionario {

	Scanner ler = new Scanner(System.in);

	public String nome;
	public double salarioBruto;
	public double imposto = 1000;

	public void cadastrarFuncionario() {
		System.out.print("Qual o nome do funcionário? ");
		nome = ler.nextLine();
		System.out.print("Qual o salário do funcionário? ");
		salarioBruto = ler.nextInt();
	}

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void acrescentarSalario(double porcentagem) {
		salarioBruto += salarioBruto * (porcentagem / 100);
	}
	
	public void listarDados() {
		System.out.printf("%s tem %.2f de Salário Bruto, %.2f de Salário Líquido%n"
						  , nome, salarioBruto, salarioLiquido());
	}
	
}
