package enumeracoes;

import java.util.Date;

public class Application {

	public static void main(String[] args) {

		Order pedido = new Order (1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		
		
	}

}
