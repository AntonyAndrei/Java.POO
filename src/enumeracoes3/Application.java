package enumeracoes3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Entre Com os dados do Cliente: ");
		/* System.out.print("Insira a Data de Nascimento (DD/MM/YYYY): ");
		Date DataNasc = data.parse(ler.next()); */
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.nextLine();
		Clientes cliente = new Clientes(nome, email);
		System.out.println();
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		String status = ler.nextLine();
		Date momento = new Date();
		
		Pedidos pedido = new Pedidos(momento, StatusPedido.valueOf(status));
		
		System.out.print("Quantos itens terao no pedido? ");
		int quantidadeItens = ler.nextInt();
		
		for (int i = 0; i < quantidadeItens ; i++) {
			System.out.printf("Entre com os dados do #%d item: %n", i + 1);
			System.out.print("Nome do produto: ");
			String nomeproduto = ler.nextLine();
			ler.nextLine();
			System.out.print("Preco do produto: ");
			double precoproduto = ler.nextDouble();
			System.out.print("Quantidade do produto: ");
			int quantidade = ler.nextInt();
			Produtos produto = new Produtos(nomeproduto, precoproduto);
			ItemDePedido item = new ItemDePedido(quantidade, produto.getPreco());
			pedido.adicionarItem(item, produto);
			
		}
		
		System.out.println();
		System.out.println("Resumo do Pedido: ");
		System.out.println("Pedido Criado em: " + data.format(pedido.getMomento()));
		System.out.println("Status do Pedido: " + pedido.getStatus());
		System.out.println(cliente);
		System.out.println("Itens de Pedido: ");
		pedido.listarDados(quantidadeItens);
		
		ler.close();
		
	}

}
