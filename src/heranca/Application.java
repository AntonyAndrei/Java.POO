package heranca;

public class Application {

	public static void main(String[] args) {

		ContasBusiness conta = new ContasBusiness(694422, "Antony Andrey", 3000, 5000);
		
		System.out.println(conta.toString());
		conta.saque(1000);
		System.out.println(conta.toString());
		conta.emprestimo(5000);
		System.out.println(conta.toString());
		conta.depositar(2000);
		System.out.println(conta.toString());
		conta.emprestimo(1000);
		System.out.println(conta.toString());
		conta.pagarEmprestimo(10000);
		System.out.println(conta.toString());
		conta.pagarEmprestimo(1000);
		System.out.println(conta.toString());
		conta.pagarEmprestimo(5000);
		System.out.println(conta.toString());
		conta.pagarEmprestimo(500);
		System.out.println(conta.toString());
		


	}

}
