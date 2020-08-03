package sobreposicao;

public class Application {

	public static void main(String[] args) {

		Contas conta = new Contas(1001, "Antony", 1000);
		conta.saque(200);
		System.out.println(conta.getSaldo());
		
		Contas conta2 = new ContasPoupanca(1002, "Andrey", 1000, 0.01);
		conta2.saque(200);
		System.out.println(conta2.getSaldo());
		
		Contas conta3 = new ContasBusiness(1003, "Fulano", 1000, 5000);
		conta3.saque(200);
		System.out.println(conta3.saldo);
	}

}
