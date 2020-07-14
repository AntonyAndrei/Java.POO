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
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre Com os dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.nextLine();
		System.out.print("Insira a Data de Nascimento (DD/MM/YYYY): ");
		Date dataNasc = data.parse(ler.next());
		
		Clientes cliente = new Clientes(nome, email, dataNasc);
		
		System.out.println();
		
		ler.nextLine();
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		String status = ler.nextLine();
		Date momento = new Date();
			
		System.out.print("Quantos itens terao no pedido? ");
		int quantidadeItens = ler.nextInt();
		
		Pedidos pedido = new Pedidos(momento, StatusPedido.valueOf(status), cliente);
		
		for (int i = 0; i < quantidadeItens ; i++) {
			System.out.printf("Entre com os dados do #%d item: %n", i + 1);
			System.out.print("Nome do produto: ");
			ler.nextLine();
			String nomeproduto = ler.nextLine();
			System.out.print("Preco do produto: ");
			double precoproduto = ler.nextDouble();
			System.out.print("Quantidade do produto: ");
			int quantidade = ler.nextInt();
			
			Produtos produto = new Produtos(nomeproduto, precoproduto);
			ItemDePedido item = new ItemDePedido(quantidade, precoproduto, produto);
			
			pedido.adicionarItem(item);
			
		}
		
		
		
		System.out.println();
		System.out.println(pedido);
		
		ler.close();
		
	}

}
