package metodo_final;

import sobreposicao.Contas;

public final class ContasPoupanca extends Contas {

	private Double taxaDejuros;
	
	public ContasPoupanca () {
		
	}

	public ContasPoupanca(int numero, String titular, double saldo, Double taxaDejuros) {
		super(numero, titular, saldo);
		this.taxaDejuros = taxaDejuros;
	}

	public Double getTaxaDejuros() {
		return taxaDejuros;
	}

	public void setTaxaDejuros(Double taxaDejuros) {
		this.taxaDejuros = taxaDejuros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaDejuros;
	}
	
	@Override
	public void saque (double valor) {
		saldo -= valor;
	}
	

}
