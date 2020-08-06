package classesAbstratas;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		
		/* a primeira instanciacao ira dar erro, pois a classe eh abstrata
		 * 
		Contas conta1 = new Contas(1001, "alex", 1000);
		
		 */
		
		Contas conta2 = new ContasBusiness(1002, "Bob", 1500, 600);
		Contas conta3 = new ContasPoupanca(1003, "Tony", 2000, 0.02);
		
		/*tambem é muito usado para criar listas*/
		
		List<Contas> contas = new ArrayList<>();
		
		contas.add(new ContasBusiness(1004, "lula", 9999999, 9999999));
		contas.add(new ContasPoupanca(1005, "bolsonaro", 10, 10.5));
		
		conta2.depositar(100);
		conta3.saque(200);
		
	}

}
