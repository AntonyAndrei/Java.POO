package upcasting_downcasting;

import heranca.Contas;

public class ContasPoupancas extends Contas{

	private Double taxaDeJuros;
	
	public ContasPoupancas () {
		super();
	}

	public ContasPoupancas(int numero, String titular, double saldo, Double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	
	public void atualizarSaldo () {
		saldo += saldo * taxaDeJuros;
	}
	
	
}
