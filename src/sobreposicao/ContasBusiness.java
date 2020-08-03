package sobreposicao;

public class ContasBusiness extends Contas {

	private double limiteEmprestimo;
	private double emprestimoRealizado;
	
	public ContasBusiness() {
		
	}

	public ContasBusiness(int numero, String titular, double saldo, double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public double getEmprestimoRealizado() {
		return emprestimoRealizado;
	}

	public void setEmprestimoRealizado(double emprestimoRealizado) {
		this.emprestimoRealizado = emprestimoRealizado;
	}

	public void emprestimo(double valor) {
		if (valor <= limiteEmprestimo) {
			depositar(valor);
			limiteEmprestimo -= valor;
			emprestimoRealizado += valor;
		} else {
			System.out.println("Limite Atual abaixo do valor solicitado!");
		}
		
	}

	public void pagarEmprestimo(double valorAPagar) {
		if (emprestimoRealizado == 0) {
			System.out.println("Voce nao tem emprestimos para pagar!");
		} else {
			if (valorAPagar <= emprestimoRealizado && valorAPagar <= saldo) {
				limiteEmprestimo += valorAPagar;
				emprestimoRealizado -= valorAPagar;
				saldo -= valorAPagar;
			} else {
				if (valorAPagar > saldo) {
					System.out.println("Saldo insuficiente, Deposite primeiro o valor para pagar o emprestimo!");
				} else {
					if (valorAPagar > emprestimoRealizado) {
						double resto = valorAPagar - emprestimoRealizado;
						saldo -= valorAPagar;
						limiteEmprestimo += valorAPagar - resto;
						emprestimoRealizado -= valorAPagar - resto;
						depositar(resto);
					}
				}

			}
		}

	}
	
	@Override
	public void saque (double valor) {
		super.saque(valor);
		saldo -= 2;
	}

	@Override
	public String toString() {
		return "ContasBusiness [limiteEmprestimo = " 
	+ limiteEmprestimo 
	+ " numero = "
	+ numero
	+ ", titular = "
	+ titular 
	+ ", saldo = "
	+ saldo 
	+ "]";
	}
	
	

}
