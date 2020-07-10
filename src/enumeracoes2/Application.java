package enumeracoes2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	/*
	 * comentario
	 *  Ler os dados de um trabalhador com N contratos (N Fornecido pelo
	 * usuario). Depois, solicitar do usuario um mes e mostrar qual foi o salario do
	 * funcionario do mes.
	 */

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com o nome do departamento: ");
		String departamento = ler.nextLine();
		System.out.println("Entre com os dados do Trabalhador: ");
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Level: ");
		String nivel = ler.nextLine();
		System.out.print("Salario base: ");
		double salarioBase = ler.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nome, LevelTrabalhador.valueOf(nivel), salarioBase, new Departamento(departamento));

		System.out.println("Quantos contratos esse trabalhador tera? ");
		int numeroContratos = ler.nextInt();
		
		for (int i = 0; i < numeroContratos; i++) {
			System.out.printf("Entre com os dados Do Contrato #%d%n:" , i+1);
			System.out.print("Insira a Data (DD/MM/YYYY): ");
			Date dataContrato = data.parse(ler.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = ler.nextDouble();
			System.out.print("Duracao em Horas: ");
			int horas = ler.nextInt();
			Contrato contrato = new Contrato(dataContrato, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}
		
		ler.nextLine();
		System.out.println();
		System.out.print("Entre com o mes e ano para calcular os Ganhos do Trabalhador (MM/YYYY): ");
		String mesEano = ler.nextLine();
		int mes = Integer.parseInt(mesEano.substring(0,2));
		int ano = Integer.parseInt(mesEano.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.printf("Ganhos por %s: %.2f ", mesEano, trabalhador.Ganhos(ano, mes));
		
		ler.close();
	}

}
