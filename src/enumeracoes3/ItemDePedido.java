package enumeracoes3;

public class ItemDePedido {

	private int quantidade;
	private double preco;
	
	private Produtos product;
	
	public ItemDePedido () {
		
	}

	public ItemDePedido(int quantidade, double preco, Produtos product) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.product = product;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produtos getProduct() {
		return product;
	}

	public void setProduct(Produtos product) {
		this.product = product;
	}
	
	public double subTotal() {
		return this.quantidade * this.preco;
	}

	@Override
	public String toString() {
		return getProduct().getNome()
				+ ", $"
				+ String.format("%.2f", preco)
				+ quantidade
				+", Subtotal: $"
				+ String.format("%.2f", subTotal());					
	}
	
	
	
}
