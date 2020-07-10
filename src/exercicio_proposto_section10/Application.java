package exercicio_proposto_section10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Quantas pessoas serao cadastradas? ");
		int numeroPessoas = ler.nextInt();
		
		for (int i = 0; i < numeroPessoas; i++) {
			System.out.println("Funcionario #" + (i+1) + ":");
			System.out.print("ID: ");
			int id = ler.nextInt();
			System.out.print("Nome: ");
			ler.nextLine();
			String nome = ler.nextLine();
			System.out.print("Salario: ");
			double salario = ler.nextDouble();
			Funcionario funcionario = new Funcionario(id, nome, salario);
			
			lista.add(funcionario);
		}
		
	
		ler.close();
	}
	


}
