package enumeracoes3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedidos {
	
	SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

	
	private Date momento;
	private StatusPedido status;
	
	private Clientes client;
	
	private List<ItemDePedido> itens = new ArrayList<>();
  
	public Pedidos() {	
	}
	
	public Pedidos(Date momento, StatusPedido status, Clientes client) {
		super();
		this.momento = momento;
		this.status = status;
		this.client = client;
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

	public Clientes getClient() {
		return client;
	}

	public void setClient(Clientes client) {
		this.client = client;
	}
	
	public void adicionarItem (ItemDePedido ItemDePedido) {
		itens.add(ItemDePedido);
	}
	
	public void removerItem(ItemDePedido ItemDePedido) {
		itens.remove(ItemDePedido);
	}
	
	public double valorTotal() {
		double soma = 0.0;
		for(ItemDePedido it : itens) {
			soma += it.subTotal();
		}
		return soma;
	}
	    
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(data.format(momento) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (ItemDePedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", valorTotal()));
		return sb.toString();
	}
	
}
