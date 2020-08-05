package polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		Scanner ler = new Scanner(System.in);
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produtos> produtos = new ArrayList<>();
		
		System.out.print("Entre com o numero de produtos: ");
		int n = ler.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Dados do Produto #" + (i + 1) + ": ");
			System.out.print("Comum, usado ou importado? (c/u/i) ");
			char tipoProduto = ler.next().charAt(0);
			ler.nextLine();
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("Preco: ");
			int preco = ler.nextInt();

			if (tipoProduto == 'c') {
				Produtos produto = new Produtos(nome, preco);
				produtos.add(produto);
			} else if (tipoProduto == 'u') {
				System.out.print("Data de fabricacao: (DD/MM/AAAA) ");
				Date dataDeFabricacao = data.parse(ler.next());
				ProdutoUsado produto = new ProdutoUsado(nome, preco, dataDeFabricacao);
				produtos.add(produto);
			} else {
				System.out.print("Taxa Alfandegaria: ");
				double taxaALfandegaria = ler.nextDouble();
				ProdutoImportado produto = new ProdutoImportado(nome, preco, taxaALfandegaria);
				produtos.add(produto);
			}
		}
		
		
		System.out.println();
		System.out.println("Etiquetas de Preco: ");
		for (Produtos p : produtos) {
			System.out.println(p.etiquetaDePreco());
		}
		
		

		ler.close();

	}

}
