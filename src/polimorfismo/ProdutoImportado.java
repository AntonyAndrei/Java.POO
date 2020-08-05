package polimorfismo;

public class ProdutoImportado extends Produtos {

	private double taxaALfandegaria;

	public ProdutoImportado() {

	}

	public ProdutoImportado(String nome, double preco, double taxaALfandegaria) {
		super(nome, preco);
		this.taxaALfandegaria = taxaALfandegaria;
	}

	public double getTaxaALfandegaria() {
		return taxaALfandegaria;
	}

	@Override
	public String etiquetaDePreco() {
		return getNome() + " R$" + precoTotal() + " (Taxa Alfandegaria: R$" + taxaALfandegaria + ")";
	}

	public double precoTotal() {
		return getPreco() + taxaALfandegaria;
	}

}
