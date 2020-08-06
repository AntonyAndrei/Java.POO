package polimorfismoExercicio;

public class PessoasJuridicas extends Pessoas{

	private int numeroDeFuncionarios;
	
	public PessoasJuridicas() {
		
	}
	
	public PessoasJuridicas(String nome, double rendaAnual, int numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double impostoDeRenda() {
		double taxa = 0;
		if (numeroDeFuncionarios > 10) {
			taxa = getRendaAnual() * 0.14;
		} else {
			taxa = getRendaAnual() * 0.14;
		}

		return taxa;
	}

}
