package enumeracoes3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedidos {
	
	private Date momento;
	private StatusPedido status;
	
	private List<ItemDePedido> itens = new ArrayList<>();
	private List<Produtos> produtos = new ArrayList<>();
	
	public void listarDados(int quantidadeItens) {

		String[] nomes = new String[quantidadeItens];
		Double[] precos = new Double[quantidadeItens];
		int[] quantidades = new int[quantidadeItens];
		Double[] subTotais = new Double[quantidadeItens];

		for (int i = 0; i < quantidadeItens; i++) {

			for (Produtos produto : produtos) {
				int contador = 0;
				nomes[contador] = produto.getNome();
				precos[contador] = produto.getPreco();
				contador++;
			}

			for (ItemDePedido item : itens) {
				int contador = 0;
				quantidades[contador] = item.getQuantidade();
				subTotais[contador] = item.subTotal();
				contador++;
			}

		}

		for (int j = 0; j < quantidadeItens; j++) {
			System.out.print(nomes[j] + ", ");
			System.out.print("R$" + precos[j] + ", ");
			System.out.print("Quantidade: " + quantidades[j] + ", ");
			System.out.println("Subtotal: " + subTotais[j]);

		}

	}
    
  
	
	public Pedidos(Date momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
	}
	
	public Pedidos(StatusPedido status) {
		this.status = status;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	
	public void adicionarItem (ItemDePedido ItemDePedido, Produtos produto) {
		itens.add(ItemDePedido);
		produtos.add(produto);
	}
	
	public void removerItem(ItemDePedido ItemDePedido, Produtos produto) {
		itens.remove(ItemDePedido);
		produtos.remove(produto);
	}
	
	public double valorTotal() {
		return 0;
		
	}
	
	
	
}
