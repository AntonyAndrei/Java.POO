package polimorfismoExercicio;

public class PessoasFisicas extends Pessoas{

	private double gastosComSaude;
	
	public PessoasFisicas() {
		
	}
	
	public PessoasFisicas(String nome, double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double impostoDeRenda() {
		double taxa = 0;
		if (getRendaAnual() < 20000) {
			taxa = getRendaAnual() * 0.15;
		} else {
			taxa = getRendaAnual() * 0.25;
		}

		double desconto = 0;
		if (gastosComSaude <= 2000) {
			desconto = gastosComSaude * 0.5;
		}

		return taxa - desconto;
	}

}
