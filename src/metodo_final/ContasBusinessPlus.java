package metodo_final;

public class ContasBusinessPlus extends ContasBusiness {

	@Override
	public void saque (double valor) {
		super.saque(valor);
		saldo -= 5;
	}
	
	/* Tambem ira acontecer de dar um erro, pois esse metodo criado na classe ContaBusiness esta
	 * declarado como "final". */
	
}
