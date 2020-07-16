package upcasting_downcasting;

import heranca.Contas;
import heranca.ContasBusiness;

public class Application {

	public static void main(String[] args) {

		Contas conta = new Contas(1001, "Antony", 0.0);
		ContasBusiness contaBss = new ContasBusiness(1002, "Tony Imports", 0.0, 500.0);
		
		// UPCASTING
		Contas conta2 = contaBss;
		Contas conta3 = new ContasBusiness(1003, "bob", 0, 0);
		Contas conta4 = new ContasPoupancas(1004, "anna", 0, 0.01);
		
		//DOWNCASTING
		ContasBusiness conta5 = (ContasBusiness)conta3;
		
		if (conta4 instanceof ContasBusiness) {
			ContasBusiness conta6 = (ContasBusiness)conta4;
			conta6.emprestimo(200);
			System.out.println("Emprestimo!");
		}
		
		if (conta4 instanceof ContasPoupancas) {
			ContasPoupancas conta6 = (ContasPoupancas)conta4;
			conta6.atualizarSaldo();
			System.out.println("Atualizado!");
		}
	}

}
